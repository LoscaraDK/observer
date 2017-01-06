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
	        	template: "<oc-widget title='{{title}}' options='options' dados='volumesPorProduto'></oc-widget>",
		        controller: "VolumeFinanceiroDiarioOpersFinalizadasCtrl",
		        resolve: VolumeFinanceiroDiarioOpersFinalizadasCtrl.resolve
	        },
	        operacoesPendentesLiquidacao:{        	
	        	template: "<oc-widget title='{{title}}' options='options' dados='volumesPorProduto'></oc-widget>",
		        controller: "VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl",
		        resolve: VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl.resolve
	        },
	        operacoesPendentesContraParte:{        	
	        	template: "<oc-widget title='{{title}}' options='options' dados='volumesPorProduto'></oc-widget>",
		        controller: "VolumeFinanceiroDiarioOpersPendCtrParte",
		        resolve: VolumeFinanceiroDiarioOpersPendCtrParte.resolve
	        }
	        
	        
        }
    })
    ;
}]);