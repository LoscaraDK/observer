angular.module('operacao').config(['$stateProvider','$urlRouterProvider', function ($stateProvider,$urlRouterProvider) {
    $urlRouterProvider.otherwise("");

    $stateProvider

	.state("home",{
	        url: "",
	        templateUrl: "partials/home.html"
    })

    .state("list",{
        url: "/list",
        templateUrl: "partials/observer-operacao-list.html",
        controller: "OperacaoCtrl",
        resolve: OperacaoCtrl.resolve
    })
    
    .state("volumefinanceirodiario",{
        url: "/volumefinanceirodiario/:data",
        
        views:{
	        operacoesFinalizadas:{        	
	        	template: "<oc-widget title={{ctrl.title}} options=ctrl.options dados=ctrl.volumes></oc-widget>" ,
		        controller: "VolumeFinanceiroDiarioOpersFinalizadasCtrl as ctrl",
		        resolve: VolumeFinanceiroDiarioOpersFinalizadasCtrl.resolve
	        },
	        operacoesPendentesLiquidacao:{        	
	        	template: "<oc-widget title={{ctrl.title}} options=ctrl.options dados=ctrl.volumes></oc-widget>",
		        controller: "VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl as ctrl",
		        resolve: VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl.resolve
	        },
	        operacoesPendentesContraParte:{        	
	        	template: "<oc-widget title={{ctrl.title}} options=ctrl.options dados=ctrl.volumes></oc-widget>",
		        controller: "VolumeFinanceiroDiarioOpersPendCtrParte as ctrl",
		        resolve: VolumeFinanceiroDiarioOpersPendCtrParte.resolve
	        }
        }
    })
    
    .state("dashboard",{
        url: "/dashboard/:data",
        templateUrl: "js/gridster/dashboard.html",
        controller: "dashboardCtrl"
    })
    
    ;
}]);