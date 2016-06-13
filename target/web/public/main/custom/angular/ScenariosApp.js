/**
 * Created by yuyilong on 16/04/14.
 */
var app = angular.module('UserScenariosApp', ['ng.jsoneditor','angular.filter']);
app.controller('ScenarioViewController', function ($scope, $http, $window) {
    $(".select2").select2();
    
    var url = $window.location.toString();
    var scenarioCurrentId = url.split("/")[4]

    $http({
        method: 'GET',
        url: '/simplescenarios'
    }).then(function successCallback(response) {
        // console.log(response.data);
        $scope.simpleScenarios = response.data.resultData.data;
        // $scope.scenarioTag = $scope.scenarioTagNames[0];
        // $window.location='/scenarioDoc/'+tagName+'/'+scenarioName;
        // alert(JSON.stringify($scope.simpleScenarios));
        // this callback will be called asynchronously
        // when the response is available
    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    

    $http({
        method: 'GET',
        url: '/scenario/'+scenarioCurrentId
    }).then(function successCallback(response) {
        // console.log(response.data);
        $scope.scenarioDocInit = response.data.resultData.data;
        $scope.dependsOnLength = JSON.stringify($scope.scenarioDocInit.dependsOn).length;
        if($scope.dependsOnLength != 2){
            $scope.myScheme = $scope.scenarioDocInit.swagger.schemes[0];
        }

        // $window.location='/scenarioDoc/'+tagName+'/'+scenarioName;
        // this callback will be called asynchronously
        // when the response is available
        $scope.scenarioDocDependsOn = $scope.scenarioDocInit.dependsOn;
        $scope.parameters_tree = {options: {mode: 'tree'}};
        if(!(JSON.stringify(response.data.resultData.data.dependsOn).length == 2)){
            SwaggerParser.dereference($scope.scenarioDocInit.swagger, {
                $refs: {
                    internal: true
                }
            }, function (err, api) {
                if (err) {
                    console.error(err);
                }
                else {
                    $scope.scenarioSwaggerDoc = api;
                }
            });
        }

    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    $scope.getParams = function (elementId, params) {
        $(elementId).find("tbody tr").each(function (i) {
            if (i > 0) {
                var param = new Object();
                param.name = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(0)").text();
                param.value = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(1) input[type='text']").val();
                param.in = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(2)").text();
                params.splice(0, 0, param);
            }
        });
    }


    $scope.getChecks = function (elementId, checks) {
        $(elementId).find("tbody tr").each(function (i) {
            if (i > 0) {
                var check = new Object();
                check.field = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(0) input[type='text']").val();
                check.checkMethod = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(1) option:selected").text();
                check.targetField = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(2) input[type='text']").val();
                check.expect = $(elementId).find("tbody tr:eq(" + i + ")").find("td:eq(3) input[type='text']").val();
                checks.splice(checks.length, 0, check);
            }
        });

    }

    $scope.SendRequest = function (scenarioId, orderNum) {
        var dependsOnInfo = new Object();

        var checks = [];
        var params = [];
        this.getChecks("#myChecks_" + orderNum, checks);
        this.getParams("#myParams_" + orderNum, params);

        dependsOnInfo.orderNum = orderNum;
        dependsOnInfo.scheme = $("#myScheme_" + orderNum + " option:selected").text();
        dependsOnInfo.host = $("#myHost_" + orderNum).val();
        dependsOnInfo.urlPath = $("#myPath_" + orderNum).val();

        dependsOnInfo.headers = $.parseJSON($("#myHeader_" + orderNum).val());
        dependsOnInfo.checks = checks;
        dependsOnInfo.params = params;
        
        alert(JSON.stringify(params));
        
        $http({
            method: 'PUT',
            url: '/scenario/'+scenarioId+'/dependon',
            data:dependsOnInfo
        }).then(function successCallback(response) {
            // alert(JSON.stringify(response.data.resultData.data));

            $scope.requestAll = response.data.resultData.data;

            // this callback will be called asynchronously
            // when the response is available
            // $scope.responseData =  JSON.stringify(response);
            // alert(JSON.stringify(response));
            // var arrayObj = response.data.data;
            // var resultInfo = JSON.stringify(arrayObj[orderNum]);
            // var options = {
            //     dom: "#jsonFormate"+"_"+orderNum
            // };
            //
            // var jf = new JsonFormater(options);
            // jf.doFormat(resultInfo);
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }

    $scope.APIInfos_in = [];
    $scope.APIInfos_out = [];

    $scope.getApis = function (idScenario) {
        $http({
            method: 'GET',
            url: '/scenario/' + idScenario + "/apis"
        }).then(function successCallback(response) {
            // console.log(JSON.stringify(response.data.resultData.data));
            $scope.APIInfos_in = response.data.resultData.data.in;
            $scope.APIInfos_out = response.data.resultData.data.out;
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });


        $http({
            method: 'GET',
            url: '/apiDoc/infos',
        }).then(function successCallback(response) {
            $scope.apiDocTitleVersions = response.data.resultData.data;
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }

    $scope.addApi = function (apiInfo_out, APIInfos_in, APIInfos_out) {
        $scope.APIInfos_in = APIInfos_in;
        $scope.APIInfos_out = APIInfos_out;
        for (var i in APIInfos_out) {
            if (APIInfos_out[i].apiDocId == apiInfo_out.apiDocId && APIInfos_out[i].summary == apiInfo_out.summary && APIInfos_out[i].basePath == apiInfo_out.basePath && APIInfos_out[i].version == apiInfo_out.version && APIInfos_out[i].urlPath == apiInfo_out.urlPath && APIInfos_out[i].httpMethod == apiInfo_out.httpMethod) {
                APIInfos_in.splice(APIInfos_in.length, 0, APIInfos_out[i]);
                APIInfos_out.splice(i, 1);
                APIInfos_out.splice(APIInfos_out.length,0, APIInfos_in[APIInfos_in.length-1]);
                break;
            }
        }
    }

    $scope.delApi = function (apiInfo_in, APIInfos_in, APIInfos_out) {
        $scope.APIInfos_in = APIInfos_in;
        $scope.APIInfos_out = APIInfos_out;
        for (var i in APIInfos_in) {
            if (APIInfos_in[i].apiDocId == apiInfo_in.apiDocId && APIInfos_in[i].summary == apiInfo_in.summary && APIInfos_in[i].basePath == apiInfo_in.basePath && APIInfos_in[i].version == apiInfo_in.version && APIInfos_in[i].urlPath == apiInfo_in.urlPath && APIInfos_in[i].httpMethod == apiInfo_in.httpMethod) {
                // APIInfos_out.splice(0, 0, APIInfos_in[i]);
                APIInfos_in.splice(i, 1);
                break;
            }
        }

    }

    $scope.addScenarioApi = function (scenarioDocId, APIInfos_in) {
        var object = new Object();
        object.apiListInfos = APIInfos_in;
        // alert("object:   " + JSON.stringify(object));
        var jsonData = JSON.parse(JSON.stringify(object));

        $http({
            method: 'PUT',
            url: '/scenario/' + scenarioDocId + '/apis',
            data: jsonData
        }).then(function successCallback(response) {
            $window.location = '/scenarioViewPage/'+scenarioDocId;
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });

    }

    $scope.addChecks = function (orderNum) {
        $("#myChecks_" + orderNum).append("<tr><td class=\"col-md-3\"><input type=\"text\" class=\"form-control\"></td><td class=\"col-md-3\"><select id=\"CheckMethodSelect\" class=\"form-control select2\" style=\"width: 100%;\" ng-model=\"SchemeSelect\"><option ng-selected=\"true\">Save</option><option>Equal</option><option>Contain</option><option>IsNull</option><option>IsNotContain</option><option>HasItem</option><option>DoNotHasItem</option></select></td><td class=\"col-md-3\"><input type=\"text\" class=\"form-control\"></td><td class=\"col-md-3\"><input type=\"text\" class=\"form-control\" value=\"expect msg\"></td></tr>");

    }


    $scope.sendRequestAll = function (scenarioId) {
        $http({
            method: 'GET',
            url: '/scenario/' + scenarioId+'/sendrequest'
        }).then(function successCallback(response) {
            $scope.requestAll = response.data.resultData.data;
            // console.log(response.data);
            // alert(JSON.stringify(response.data.resultData.data));
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }
    
    $scope.getResultFromResponse = function (checks) {
        var str = JSON.stringify(checks);
        if(str.indexOf('"status":"KO"')>0){
            return 'KO';
        }else{
            return 'OK';
        }
    }

    $scope.parseURL = function (url) {
        var a = document.createElement('a');
        a.href = url;
        return {
            source: url,
            protocol: a.protocol.replace(':', ''),
            host: a.hostname,
            port: a.port,
            query: a.search,
            params: (function () {
                var ret = {},
                    seg = a.search.replace(/^\?/, '').split('&'),
                    len = seg.length, i = 0, s;
                for (; i < len; i++) {
                    if (!seg[i]) {
                        continue;
                    }
                    s = seg[i].split('=');
                    ret[s[0]] = s[1];
                }
                return ret;
            })(),
            file: (a.pathname.match(/\/([^\/?#]+)$/i) || [, ''])[1],
            hash: a.hash.replace('#', ''),
            path: a.pathname.replace(/^([^\/])/, '/$1'),
            relative: (a.href.match(/tps?:\/\/[^\/]+(.+)/) || [, ''])[1],
            segments: a.pathname.replace(/^\//, '').split('/')
        };

    }



    // $scope.viewTasks = function () {
    //     $http({
    //         method: 'GET',
    //         url: '/tasksToJson'
    //     }).then(function successCallback(response) {
    //         console.log(JSON.stringify(response.data));
    //         $scope.TaskInfos = response.data;
    //         // this callback will be called asynchronously
    //         // when the response is available
    //     }, function errorCallback(response) {
    //         // called asynchronously if an error occurs
    //         // or server returns response with an error status.
    //     });
    // }

    // $scope.viewResult = function (scenarioId) {
    //     $window.location = '/scenarioResult/' + scenarioId;
    //
    // }

    // $scope.deleteRepeatOption = function () {
    //     $("select option").each(function () {
    //         var text = $(this).text();
    //         if ($("select option:contains(" + text + ")").length > 1)
    //             $("select option:contains(" + text + "):gt(0)").remove();
    //     });
    // }

    // $scope.AddCheck = function (requestInfo) {
    //     console.log(JSON.stringify(requestInfo));
    //     console.log($scope.responseData);
    //     console.log(JSON.parse($scope.responseData));
    //
    // }

    // $scope.setParams = function (scenarioApi) {
    //     alert(scenarioApi);
    //     $scope.scenarioApi_Params = scenarioApi;
    //
    // }

    // $http.get("/api_manage/ApiManageInitServlet?result=all")
    //     .success(function (response) {
    //         //consoe.log(response);
    //         $scope.apiInfos = response;
    //     }).
    // error(function (response) {
    //     alert("getInfo_error" + response);
    // });
    //
    // $scope.EditApiInfo = function () {
    //     //console.log(JSON.stringify($scope.editApiInfo));
    //     $scope.apiInfoEdit.paramIn=angular.fromJson($scope.apiParamInEdit);
    //     $scope.apiInfoEdit.assertInfo=angular.fromJson($scope.apiAssertInfoEdit);
    //
    //     //$http({method : 'POST',params : $scope.editApiInfo, url : '/autoPlatform/operateDeviceServlet?result=editDevice'})
    //     //    .success(function(response, status, headers, config){
    //     //        //do anything what you want;
    //     //        console.log("insert success");
    //     //    })
    //     //    .error(function(response, status, headers, config){
    //     //        //do  anything what you want;
    //     //        console.log("insert error");
    //     //    });
    //     //console.log(JSON.stringify($scope.devices));
    // }
    //

});

app.controller('ScenariosController', function ($scope, $http, $window) {
    $http({
        method: 'GET',
        url: '/scenarios/infos'
    }).then(function successCallback(response) {
        // console.log(response.data);
        $scope.scenarioTagNames = response.data.resultData.data;
        // $window.location='/scenarioDoc/'+tagName+'/'+scenarioName;
        // alert(JSON.stringify(response));
        // this callback will be called asynchronously
        // when the response is available
    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });


    $scope.addScenario = function (tagName, scenarioName) {

        var postData = {"tagName": tagName, "scenarioName": scenarioName};

        $http({
            method: 'POST',
            url: '/scenario',
            data: JSON.parse(JSON.stringify(postData))
        }).then(function successCallback(response) {
            // console.log(response.data);
            $window.location = '/scenarioDoc/' + tagName + '/' + scenarioName;
            // alert(JSON.stringify(response));
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }


});

// app.controller('ScenarioResultController', function ($scope) {
//     $scope.Check = function (scenarioAPI, orderNum) {
//         var resultInfo = JSON.stringify(scenarioAPI);
//         var options = {
//             dom: "#jsonFormate" + "_" + orderNum
//         };
//         // alert("#jsonFormate_start");
//
//         var jf = new JsonFormater(options);
//         jf.doFormat(resultInfo);
//         // alert("doFormat_finish");
//
//     }
//
// });

// app.controller('runTargetCodeController', function ($scope) {
//     $scope.selectedParams = [
//         {
//             "Name": "targetAppVersion",
//             "Description":"APP目标版本",
//             "Options": ["1.0", "2.0", "3.0"]
//         },
//         {
//             "Name": "testAppVersion",
//             "Description":"测试代码版本",
//             "Options": ["1.0", "2.0", "3.0"]
//         },
//         {
//             "Name": "testTemplate",
//             "Description":"测试用例模板",
//             "Options": ["Android 功能", "IOS 功能", "Android 稳定性", "IOS 稳定性"]
//         },
//         {
//             "Name": "concurrencyTest",
//             "Description":"是否并行测试",
//             "Options": ["是", "否"]
//         },
//         {
//             "Name": "testsGroup",
//             "Description":"测试用例分组",
//             "Options": ["P0", "P1", "P2", "P3"]
//         }
//
//     ];
// });
//
// app.controller('runStatusController', function ($scope) {
//     $scope.SelectDevicesNum = function(items) {
//         var num = 0;
//         angular.forEach(items, function() {
//             num++;
//         });
//         return num;
//     }
//     $scope.androidRunStatusEnsure = function () {
//         alert("发送请求");
//     }
// });
//
// app.controller('autoTestController', function ($scope, $http) {
//     $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
//     $scope.currentURL = function (currentPage) {
//         switch (currentPage) {
//             case 'Home':
//                 $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
//                 break;
//             case 'Android':
//                 $scope.includeURL = "webPage/pages/androidPages/androidPage.jsp";
//                 break;
//             case 'IOS':
//                 $scope.includeURL = "webPage/pages/iosPages/iosPage.jsp";
//                 break;
//             case 'WEB':
//                 $scope.includeURL = "webPage/pages/webPages/webPage.jsp";
//                 break;
//             default:
//                 $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
//                 break;
//         }
//     }
// });
//
// app.controller('HomePageController', function ($scope, $http) {
//     $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
//     $scope.homeCurrentURL = function (currentPage) {
//         switch (currentPage) {
//             case 'functions':
//                 $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
//                 break;
//             case 'qualities':
//                 $scope.homeIncludeURL = "webPage/pages/homePages/qualitiesPage.jsp";
//                 break;
//             case 'help':
//                 $scope.homeIncludeURL = "webPage/pages/homePages/helpPage.jsp";
//                 break;
//             case 'about':
//                 $scope.homeIncludeURL = "webPage/pages/homePages/aboutPage.jsp";
//                 break;
//             case 'personalInfo':
//                 $scope.homeIncludeURL = "webPage/pages/homePages/infoPage.jsp";
//                 break;
//             default:
//                 $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
//                 break;
//         }
//     }
// });
//
// app.controller('AndroidPageController', function ($scope) {
//     $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
//     $scope.androidTestType = {}; //1 monkey  2 能能测试  3 兼容测试
//     $scope.jsonUDIDEnd = {};
//     $scope.jsonParamNameEnd = {};
//     $scope.jsonParamDescriptionEnd = {};
//     $scope.androidCurrentURL = function (currentPage) {
//         switch (currentPage) {
//             case 'functions':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
//                 break;
//             case 'schedules':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/schedulesPage.jsp";
//                 break;
//             case 'devices':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/devicesPage.jsp";
//                 break;
//             case 'caseTemplate':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/caseTemplatePage.jsp";
//                 break;
//             case 'runStatus':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/runStatusPage.jsp";
//                 break;
//             case 'testTools':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/testToolsPage.jsp";
//                 break;
//             case 'anyMore':
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/anyMorePage.jsp";
//                 break;
//             default:
//                 $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
//                 break;
//         }
//     }
//     $scope.androidFunctionSelect = function (testType) {
//         $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/runTargetCodeVersion.jsp";
//         $scope.androidTestType['testType'] = testType;
//     }
//     $scope.androidDeviceSelect = function (jsonUDID) {
//         $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/runStatus.jsp";
//         angular.forEach(jsonUDID, function(value, key) {
//             //console.log(value.toString()=="noSelected");
//             if (value.toString()!="noSelected") {
//                 $scope.jsonUDIDEnd [key] = value;
//             }
//         });
//     }
//     $scope.androidCodeTargetSelect = function (selectedParams) {
//         $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/devicesSelect.jsp";
//         $scope.jsonParamNameEnd = selectedParams;
//     }
//
//     $scope.deleteRepeatOption = function () {
//         $("select option").each(function() {
//             var text = $(this).text();
//             if($("select option:contains("+text+")").length > 1)
//                 $("select option:contains("+text+"):gt(0)").remove();
//         });
//     }
//
//     $scope.editAddDeviceAlertCloseBtn = function () {
//         $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
//         $scope.androidIncludeURL = "webPage/pages/androidPages/devicesPage.jsp";
//     }
// });
//
// app.controller('DeviceSelectController', function ($scope, $http) {
//     $scope.jsonUDID = {};
//     $http.get("/autoPlatform/operateDeviceServlet?result=selectDevices")
//         .success(function (response) {
//             $scope.devices = response;
//         }).
//     error(function (response) {
//         alert("getDevices_error" + response);
//     });
// });

// window.client = new SwaggerClient({
//     url: "http://petstore.swagger.io/v2/swagger.json",
//     success: function() {
//         alert(2);
//
//         $scope.api2 = client.apis;
//         alert($scope.api2);
//
//
//         // upon connect, fetch a pet and set contents to element "mydata"
//         // client.pet.getPetById({petId:1},{responseContentType: 'application/json'}, function(data) {
//         //     // document.getElementById("mydata").innerHTML = JSON.stringify(data.obj);
//         //     alert(JSON.stringify(data.obj));
//         // });
//     }
// });

// SwaggerParser.resolve($scope.scenarioDocInit.swagger,function($refs) {
//         // Get the paths of ALL files in the API
//         $refs.paths();
//         alert("paths"+$refs.paths());
//
//         // Get the paths of local files only
//         alert("pathfs"+$refs.paths("fs"));
//
//         // Get all URLs
//         alert("pathshttp"+$refs.paths("http", "https"));
//     });