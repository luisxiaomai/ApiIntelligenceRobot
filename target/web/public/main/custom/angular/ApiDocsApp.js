/**
 * Created by yuyilong on 16/05/16.
 */
var app = angular.module('ApiDocsApp', []);
app.controller('ApiDocsContentController', function ($scope,$http) {
    $http({
        method: 'GET',
        url: '/apiDoc/infos',
    }).then(function successCallback(response) {
        // this callback will be called asynchronously
        // when the response is available
        $scope.apiDocTitleVersions =  response.data.resultData.data;

        // alert($scope.apiDocTitleVersions);

        // SwaggerParser.parse($scope.apiDoc.swagger)
        //     .then(function(api) {
        //         console.log("API name: %s, Version: %s", api.info.title, api.info.version,api.tags,api.paths);
        //     });

    }, function errorCallback(response) {
        // called asynchronously if an error occurs
        // or server returns response with an error status.
    });
    

    var url = window.location.search.match(/url=([^&]+)/);
    if (url && url.length > 1) {
        url = decodeURIComponent(url[1]);
    } else {
        url = "/apiDoc";
    }

    hljs.configure({
        highlightSizeThreshold: 5000
    });

    // Pre load translate...
    if(window.SwaggerTranslator) {
        window.SwaggerTranslator.translate();
    }

    window.swaggerUi = new SwaggerUi({
        url: url,
        dom_id: "swagger-ui-container",
        supportedSubmitMethods: ['get', 'post', 'put', 'delete', 'patch'],
        onComplete: function(swaggerApi, swaggerUi){
            if(typeof initOAuth == "function") {
                initOAuth({
                    clientId: "your-client-id",
                    clientSecret: "your-client-secret-if-required",
                    realm: "your-realms",
                    appName: "your-app-name",
                    scopeSeparator: ",",
                    additionalQueryStringParams: {}
                });
            }

            if(window.SwaggerTranslator) {
                window.SwaggerTranslator.translate();
            }
        },
        onFailure: function(data) {
            log("Unable to Load SwaggerUI");
        },
        docExpansion: "none",
        jsonEditor: false,
        defaultModelRendering: 'schema',
        showRequestHeaders: true
    });

    window.swaggerUi.load();

    function log() {
        if ('console' in window) {
            console.log.apply(console, arguments);
        }
    }


    $scope.selectApiDocByTitleAndVersion = function (title,version) {
        hljs.configure({
            highlightSizeThreshold: 5000
        });

        // Pre load translate...
        if(window.SwaggerTranslator) {
            window.SwaggerTranslator.translate();
        }

        window.swaggerUi = new SwaggerUi({
            url: "/apiDoc/"+title+"/"+version,
            dom_id: "swagger-ui-container",
            supportedSubmitMethods: ['get', 'post', 'put', 'delete', 'patch'],
            onComplete: function(swaggerApi, swaggerUi){
                if(typeof initOAuth == "function") {
                    initOAuth({
                        clientId: "your-client-id",
                        clientSecret: "your-client-secret-if-required",
                        realm: "your-realms",
                        appName: "your-app-name",
                        scopeSeparator: ",",
                        additionalQueryStringParams: {}
                    });
                }

                if(window.SwaggerTranslator) {
                    window.SwaggerTranslator.translate();
                }
            },
            onFailure: function(data) {
                log("Unable to Load SwaggerUI");
            },
            docExpansion: "none",
            jsonEditor: false,
            defaultModelRendering: 'schema',
            showRequestHeaders: false
        });

        window.swaggerUi.load();

        function log() {
            if ('console' in window) {
                console.log.apply(console, arguments);
            }
        }
    }


});