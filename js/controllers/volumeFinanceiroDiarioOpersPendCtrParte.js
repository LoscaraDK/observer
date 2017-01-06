function VolumeFinanceiroDiarioOpersPendCtrParte($scope,
									$stateParams,
									_volumesPorProduto) {
	$scope.volumesPorProduto = _volumesPorProduto;
	$scope.title = "Volume financeiro de operações pendentes contraparte";
	$scope.options = {
		    chart: {
		        type: 'discreteBarChart',
		        height: 350,
		        width:550,
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
};

VolumeFinanceiroDiarioOpersPendCtrParte.$inject = ["$scope",
                                      "$stateParams",
                                      "_volumesPorProduto"];

VolumeFinanceiroDiarioOpersPendCtrParte.resolve = {
    _volumesPorProduto: ["volumeFinanceiroAPI","$stateParams", function (volumeFinanceiroAPI,$stateParams) {
    	return volumeFinanceiroAPI.getVolumeFinanceiroDiario().query({data:$stateParams.data,codigoSituacaoOperacao:128});
    }]
};

angular.module('operacao').controller('VolumeFinanceiroDiarioOpersPendCtrParte',VolumeFinanceiroDiarioOpersPendCtrParte);