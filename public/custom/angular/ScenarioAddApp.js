/**
 * Created by yuyilong on 16/04/14.
 */
var app = angular.module('UserScenarioAddApp', ['angular.filter']);
app.controller('ScenarioAddController', function ($scope, $http, $filter, $window) {
    $(".select2").select2();

    $http({
        method: 'GET',
        url: '/simplescenarios'
    }).then(function successCallback(response) {
        console.log(response.data);
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
        url: '/apiDoc/infos',
    }).then(function successCallback(response) {
        // this callback will be called asynchronously
        // when the response is available
        $scope.apiDocTitleVersions = response.data.resultData.data;

        // alert($scope.apiDocTitleVersions);

    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });

    $scope.addScenario = function (tagName, scenarioName) {
        // $.parseJSON();
        var postData = new Object();
        postData.tagName = tagName;
        postData.scenarioName = scenarioName;
        postData.title = $("#select_title option:selected").text();
        postData.version = $("#select_version option:selected").text();
        var flag = true;
        for (var simpleScenario in $scope.simpleScenarios) {
            if (tagName == $scope.simpleScenarios[simpleScenario].tagName && scenarioName == $scope.simpleScenarios[simpleScenario].scenarioName) {
                $scope.msg = "场景数据存在重复,请修改";
                flag = false;
            }
        }
        if (flag) {
            $http({
                method: 'POST',
                url: '/scenario',
                data: postData
            }).then(function successCallback(response) {
                $window.location = '/scenariosPage';
                // alert(JSON.stringify(response));
                // this callback will be called asynchronously
                // when the response is available
            }, function errorCallback(response) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });
        }
    }
});