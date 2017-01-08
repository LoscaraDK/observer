function VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl($scope,
									$stateParams,
									_volumesPorProduto) {
	
	var ctrl = this;
	
	var title = "Volume financeiro de operações pendentes de liquidação";
	var options = {
		    chart: {
		        type: 'discreteBarChart',
		        height: 350,
		        margin : {
		            top: 20,
		            right: 20,
		            bottom: 60,
		            left: 150
		        },
		        x: function(d){ return d.codTipoIF; },
		        y: function(d){ return d.volFinanceiro; },
		        showValues: true,
		        valueFormat: function(d){
		            return d3.format(',.4f')(d);
		        },
		        transitionDuration: 500,
		        xAxis: {
		            axisLabel: 'Tipos de IF'
		        },
		        yAxis: {
		            axisLabel: 'Volume financeiro',
		            axisLabelDistance: 80
		        }
		    }
		};
		//pattern para expor os valores privados para publicos, poderia também setar direto no ctrl
		angular.extend(ctrl, {
		  volumes: _volumesPorProduto,
		  title: title,
		  options: options
	    });
};

VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl.$inject = ["$scope",
					                                     "$stateParams",
					                                     "_volumesPorProduto"];

VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl.resolve = {
    _volumesPorProduto: ["volumeFinanceiroAPI","$stateParams", function (volumeFinanceiroAPI,$stateParams) {
    	return volumeFinanceiroAPI.getVolumeFinanceiroDiario().query({data:$stateParams.data,codigoSituacaoOperacao:23});
    }]
};

angular.module('operacao').controller('VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl',VolumeFinanceiroDiarioOpersPendLiquidacaoCtrl);