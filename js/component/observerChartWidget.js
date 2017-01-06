function ObserverChartWidgetCtrl($scope){
	var ctrl = this;
	console.log('entrei no componente');

	
	ctrl.$onInit = function(){
		console.log(ctrl.dados);
		console.log(ctrl.options);
		console.log(ctrl.volume);
		
		ctrl.volume = [{
		    key: "Teste",
		    values: ctrl.dados
		}];
	}
	
	console.log(ctrl.volume);
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