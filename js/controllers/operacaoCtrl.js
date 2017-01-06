function OperacaoCtrl($scope,
                      _operacoes) {
	//console.log('daniel entrou aqui!!');
	//console.log('id >> '+ _operacoes[0].numIdOperacao)
    $scope.operacoes = _operacoes;

};

OperacaoCtrl.$inject = ["$scope",
                        "_operacoes"];

OperacaoCtrl.resolve = {
    _operacoes: ["operacaoAPI", function (operacaoAPI) {
        return operacaoAPI.getOperacoes('2016-11-25','4');
    }]
};

angular.module('operacao').controller('OperacaoCtrl',OperacaoCtrl);