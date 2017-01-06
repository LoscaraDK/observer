angular.module('operacao').factory("operacaoAPI",function ($http) {
    var _getOperacoes = function (data,indice) {
        return $http.get("/observer/rest/operacao/" + data + "/" + indice).then(function (response) {
              return response.data;
        });
    };

    return{
        getOperacoes: _getOperacoes
    };
})