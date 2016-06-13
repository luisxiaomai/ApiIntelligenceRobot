var app = angular.module('UserApp', []);
app.controller('UserLoginController', function ($scope,$http,$window) {
    $scope.msg = "Sign in to start your session";

    $scope.userLogin = function () {
        var email = $("#emailUser").val();
        var pwd = $("#pwdUser").val();

        if(email.length==0){
            $scope.msg = "邮箱不能为空";
        }

        if(pwd.length==0){
            $scope.msg = "密码不能为空";
        }

        $http({
            method: 'GET',
            url: '/user/'+email+'/'+pwd,
        }).then(function successCallback(response) {
            if(response.data.resultCode=='11000'){
                $scope.msg = response.data.resultMsg;
            }else{
                $window.location='/apiDocPage';
            }
        }, function errorCallback(response) {
            $scope.msg = "服务器链接出现问题,请与管理员联系";
        });
    }

});

app.controller('UserRegisterController', function ($scope,$http,$window) {
    $scope.msg = "Register a new membership";
    $scope.userRegister = function () {
        var emailUser = $("#emailUser").val();
        var pwdUser = $("#pwdUser").val();
        var nameZhUser =$("#nameZhUser").val();
        var phoneUser = $("#phoneUser").val();
        var telUser = $("#telUser").val();

        var UserInfo = new Object();
        UserInfo.nameZhUser = nameZhUser;
        UserInfo.emailUser = emailUser;
        UserInfo.pwdUser = pwdUser;
        UserInfo.phoneUser = phoneUser;
        UserInfo.telUser = telUser;


        if(emailUser.length==0){
            $scope.msg = "邮箱不能为空";
        }

        if(pwdUser.length==0){
            $scope.msg = "密码不能为空";
        }

        $http({
            method: 'POST',
            url: '/user',
            data: UserInfo
        }).then(function successCallback(response) {
            if(response.data.resultCode=='11000'){
                $scope.msg = response.data.resultMsg;
            }else{
                $window.location='/apiDocPage';
            }
        }, function errorCallback(response) {
            $scope.msg = "服务器链接出现问题,请与管理员联系";
        });
    }
});