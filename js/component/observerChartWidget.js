function ObserverChartWidgetCtrl($scope){
	var ctrl = this;
	
	ctrl.$onInit = function(){
		ctrl.volume = [{
		    key: "Observer Chart Widget",
		    values: ctrl.dados
		}];
	};
};


angular.module("observerChartWidget",["nvd3"]).component("ocWidget",{
	template:   '<div class="container">' + 
					'<div class="panel panel-default">' + 
						'<div class="panel-heading">{{$ctrl.title}}</div>' + 
						'<div class="panel-body">' + 
							'<nvd3 options=$ctrl.options data=$ctrl.volume></nvd3>' + 
						'</div>'+
					'</div>'+
				'</div>',
	bindings: {
		title: '@',
		options: "=",
		dados: '='	
	},
	controller: ObserverChartWidgetCtrl

});