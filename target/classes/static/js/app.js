var app = angular.module('mainApp', []);

app.controller('MainCtrl', function($scope,$http) {
	 $scope.records ={};
  $http.get('http://localhost:7000/task/getAll').then(function(data){
	  $scope.records = data.data;
  })
});
