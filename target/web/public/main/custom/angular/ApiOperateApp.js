/**
 * Created by yuyilong on 16/04/14.
 */
var app = angular.module('ApiOperateApp', ['ng.jsoneditor']);
app.controller('ApiDesignController', function ($scope, $http, $window) {
    // var json = {"/api/path":{"get":{"tags":["account-resource"],"summary":"getAccount","operationId":"getAccountUsingGET","consumes":["application/json"],"produces":["application/json"],"responses":{"200":{"description":"OK","schema":{"$ref":"#/definitions/UserDTO"}},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}}},"post":{"tags":["account-resource"],"summary":"saveAccount","operationId":"saveAccountUsingPOST","consumes":["application/json"],"produces":["application/json"],"parameters":[{"in":"body","name":"userDTO","description":"userDTO","required":true,"schema":{"$ref":"#/definitions/UserDTO"}}],"responses":{"200":{"description":"OK","schema":{"type":"string"}},"201":{"description":"Created"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}}}}};
    var json_swagger = {
        "swagger": "2.0",
        "info": {"version": "0.0.0", "title": "<enter your title>"},
        "paths": {
            "/persons": {
                "get": {
                    "description": "Gets `Person` objects.Optional query param of **size** determines size of returned array",
                    "parameters": [{
                        "name": "size",
                        "in": "query",
                        "description": "Size of array",
                        "required": true,
                        "type": "number",
                        "format": "double"
                    }],
                    "responses": {
                        "200": {
                            "description": "Successful response",
                            "schema": {
                                "title": "ArrayOfPersons",
                                "type": "array",
                                "items": {
                                    "title": "Person",
                                    "type": "object",
                                    "properties": {"name": {"type": "string"}, "single": {"type": "boolean"}}
                                }
                            }
                        }
                    }
                }
            }
        }
    };
    $scope.editor_code = {data: json_swagger, options: {mode: 'code'}};

    $scope.editor_tree = {data: json_swagger, options: {mode: 'tree'}};

    $scope.onLoad = function (instance) {
        // instance.expandAll();
        // $scope.editor_tree.data = $scope.editor_code.data;
    };

    $scope.changeOptions = function () {
        $scope.editor_code.options.mode = $scope.editor_code.options.mode == 'tree' ? 'code' : 'tree';
    };

    //other
    $scope.pretty = function (obj) {
        return angular.toJson(obj, true);
    }

    $scope.newApiDoc = function () {
        $scope.editor_code.data = json_swagger;
    }

    //
    // $scope.addApiPath = function (info,urlPath,tagInfo) {
    //     var dataGuide={};
    //     var apiData={"get":{"tags":[tagInfo],"summary":"getAccount","operationId":"getAccountUsingGET","consumes":["application/json"],"produces":["application/json"],"responses":{"200":{"description":"OK","schema":{"$ref":"#/definitions/UserDTO"}},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}}},"post":{"tags":["account-resource"],"summary":"saveAccount","operationId":"saveAccountUsingPOST","consumes":["application/json"],"produces":["application/json"],"parameters":[{"in":"body","name":"userDTO","description":"userDTO","required":true,"schema":{"$ref":"#/definitions/UserDTO"}}],"responses":{"200":{"description":"OK","schema":{"type":"string"}},"201":{"description":"Created"},"401":{"description":"Unauthorized"},"403":{"description":"Forbidden"},"404":{"description":"Not Found"}}}};        dataGuide[urlPath]=apiData;
    //     $scope.editor_code.data = dataGuide;
    //     alert(JSON.stringify($scope.editor_code.data));
    //     $("#addGuide").hide();
    // }

    $scope.apiSave = function () {
        $http({
            method: 'GET',
            url: '/apiDoc/'+$scope.editor_code.data.info.title +'/'+$scope.editor_code.data.info.version
        }).then(function successCallback(response) {
            if (response.data == 'null') {
                SwaggerParser.validate($scope.editor_code.data, {
                    $refs: {
                        internal: true
                    }
                }, function (err, api) {
                    if (err) {

                        $scope.msg = "文档格式有误";
                    }
                    else {
                        $scope.swagger = {"swagger":$scope.editor_code.data};
                        $http({
                            method: 'POST',
                            url: '/apiDoc',
                            data: $scope.swagger
                        }).then(function successCallback(response) {
                            if(response.data.resultData.data){
                                $window.location = '/apiDocPage';
                            }else{
                                $scope.msg = "录入失败";
                            }
                            // this callback will be called asynchronously
                            // when the response is available
                        }, function errorCallback(response) {
                            // called asynchronously if an error occurs
                            // or server returns response with an error status.
                        });
                    }
                });
            } else {
                $scope.msg = "项目录入重复,请检查info中'title'与'version'属性";
            }
            // this callback will be called asynchronously
            // when the response is available
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });
    }


});