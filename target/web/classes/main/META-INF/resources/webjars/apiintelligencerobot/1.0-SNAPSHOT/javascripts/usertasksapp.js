/**
 * Created by yuyilong on 16/04/14.
 */
var app = angular.module('UserTasksApp', []);
app.controller('ParamInfoController', function ($scope, $http) {
    //$scope.downloadExcelBtnHide = true;
    $scope.DepartmentSelect = '';
    $scope.CategorySelect = '';
    $scope.EditApiInfoBtn = function (apiInfo) {
        $scope.apiInfoEdit = apiInfo;
        $scope.apiParamInEdit=JSON.stringify(apiInfo.paramIn);
        $scope.apiAssertInfoEdit=JSON.stringify(apiInfo.assertInfo);
    }

    $http.get("/api_manage/ApiManageInitServlet?result=all")
        .success(function (response) {
            //consoe.log(response);
            $scope.apiInfos = response;
        }).
    error(function (response) {
        alert("getInfo_error" + response);
    });

    $scope.EditApiInfo = function () {
        //console.log(JSON.stringify($scope.editApiInfo));
        $scope.apiInfoEdit.paramIn=angular.fromJson($scope.apiParamInEdit);
        $scope.apiInfoEdit.assertInfo=angular.fromJson($scope.apiAssertInfoEdit);

        //$http({method : 'POST',params : $scope.editApiInfo, url : '/autoPlatform/operateDeviceServlet?result=editDevice'})
        //    .success(function(response, status, headers, config){
        //        //do anything what you want;
        //        console.log("insert success");
        //    })
        //    .error(function(response, status, headers, config){
        //        //do  anything what you want;
        //        console.log("insert error");
        //    });
        //console.log(JSON.stringify($scope.devices));
    }

    $scope.deleteRepeatOption = function () {
        $("select option").each(function() {
            var text = $(this).text();
            if($("select option:contains("+text+")").length > 1)
                $("select option:contains("+text+"):gt(0)").remove();
        });
    }
});

app.controller('runTargetCodeController', function ($scope) {
    $scope.selectedParams = [
        {
            "Name": "targetAppVersion",
            "Description":"APP目标版本",
            "Options": ["1.0", "2.0", "3.0"]
        },
        {
            "Name": "testAppVersion",
            "Description":"测试代码版本",
            "Options": ["1.0", "2.0", "3.0"]
        },
        {
            "Name": "testTemplate",
            "Description":"测试用例模板",
            "Options": ["Android 功能", "IOS 功能", "Android 稳定性", "IOS 稳定性"]
        },
        {
            "Name": "concurrencyTest",
            "Description":"是否并行测试",
            "Options": ["是", "否"]
        },
        {
            "Name": "testsGroup",
            "Description":"测试用例分组",
            "Options": ["P0", "P1", "P2", "P3"]
        }

    ];
});

app.controller('runStatusController', function ($scope) {
    $scope.SelectDevicesNum = function(items) {
        var num = 0;
        angular.forEach(items, function() {
            num++;
        });
        return num;
    }
    $scope.androidRunStatusEnsure = function () {
        alert("发送请求");
    }
});

app.controller('autoTestController', function ($scope, $http) {
    $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
    $scope.currentURL = function (currentPage) {
        switch (currentPage) {
            case 'Home':
                $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
                break;
            case 'Android':
                $scope.includeURL = "webPage/pages/androidPages/androidPage.jsp";
                break;
            case 'IOS':
                $scope.includeURL = "webPage/pages/iosPages/iosPage.jsp";
                break;
            case 'WEB':
                $scope.includeURL = "webPage/pages/webPages/webPage.jsp";
                break;
            default:
                $scope.includeURL = "webPage/pages/homePages/homePage.jsp";
                break;
        }
    }
});

app.controller('HomePageController', function ($scope, $http) {
    $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
    $scope.homeCurrentURL = function (currentPage) {
        switch (currentPage) {
            case 'functions':
                $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
                break;
            case 'qualities':
                $scope.homeIncludeURL = "webPage/pages/homePages/qualitiesPage.jsp";
                break;
            case 'help':
                $scope.homeIncludeURL = "webPage/pages/homePages/helpPage.jsp";
                break;
            case 'about':
                $scope.homeIncludeURL = "webPage/pages/homePages/aboutPage.jsp";
                break;
            case 'personalInfo':
                $scope.homeIncludeURL = "webPage/pages/homePages/infoPage.jsp";
                break;
            default:
                $scope.homeIncludeURL = "webPage/pages/homePages/functionsPage.jsp";
                break;
        }
    }
});

app.controller('AndroidPageController', function ($scope) {
    $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
    $scope.androidTestType = {}; //1 monkey  2 能能测试  3 兼容测试
    $scope.jsonUDIDEnd = {};
    $scope.jsonParamNameEnd = {};
    $scope.jsonParamDescriptionEnd = {};
    $scope.androidCurrentURL = function (currentPage) {
        switch (currentPage) {
            case 'functions':
                $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
                break;
            case 'schedules':
                $scope.androidIncludeURL = "webPage/pages/androidPages/schedulesPage.jsp";
                break;
            case 'devices':
                $scope.androidIncludeURL = "webPage/pages/androidPages/devicesPage.jsp";
                break;
            case 'caseTemplate':
                $scope.androidIncludeURL = "webPage/pages/androidPages/caseTemplatePage.jsp";
                break;
            case 'runStatus':
                $scope.androidIncludeURL = "webPage/pages/androidPages/runStatusPage.jsp";
                break;
            case 'testTools':
                $scope.androidIncludeURL = "webPage/pages/androidPages/testToolsPage.jsp";
                break;
            case 'anyMore':
                $scope.androidIncludeURL = "webPage/pages/androidPages/anyMorePage.jsp";
                break;
            default:
                $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
                break;
        }
    }
    $scope.androidFunctionSelect = function (testType) {
        $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/runTargetCodeVersion.jsp";
        $scope.androidTestType['testType'] = testType;
    }
    $scope.androidDeviceSelect = function (jsonUDID) {
        $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/runStatus.jsp";
        angular.forEach(jsonUDID, function(value, key) {
            //console.log(value.toString()=="noSelected");
            if (value.toString()!="noSelected") {
                $scope.jsonUDIDEnd [key] = value;
            }
        });
    }
    $scope.androidCodeTargetSelect = function (selectedParams) {
        $scope.androidIncludeURL = "webPage/pages/androidPages/schedule/devicesSelect.jsp";
        $scope.jsonParamNameEnd = selectedParams;
    }

    $scope.deleteRepeatOption = function () {
        $("select option").each(function() {
            var text = $(this).text();
            if($("select option:contains("+text+")").length > 1)
                $("select option:contains("+text+"):gt(0)").remove();
        });
    }

    $scope.editAddDeviceAlertCloseBtn = function () {
        $scope.androidIncludeURL = "webPage/pages/androidPages/functionsPage.jsp";
        $scope.androidIncludeURL = "webPage/pages/androidPages/devicesPage.jsp";
    }
});

app.controller('DeviceSelectController', function ($scope, $http) {
    $scope.jsonUDID = {};
    $http.get("/autoPlatform/operateDeviceServlet?result=selectDevices")
        .success(function (response) {
            $scope.devices = response;
        }).
    error(function (response) {
        alert("getDevices_error" + response);
    });
});