//Programado por Bruno Deluca Satil Cassiano no dia 22/09/2021

$(document).ready(function(){

    $("#btn-calcular").click(function(){

        if ($("#Valor").val() === ""){
            $("#mensagem").html("O campo 'Valor' é obrigatório!");
            return;
        }

        if ($("#Juros").val() === ""){
            $("#mensagem").html("O campo 'Taxa de Juros | Taxa de Desconto' é obrigatório!");
            return;
        }

        var Valor = parseFloat( $("#Valor").val().replace(",","."));
        var Juros = parseFloat( $("#Juros").val().replace(",","."));

        var jurosCalcular = Juros / 100;
        var acrescimo = Valor * jurosCalcular;
        var total = acrescimo + Valor;

        $("#mensagem").html("R$" + $("#Valor").val() + " foi o valor originalmente informado. " + 
        $("#Juros").val() + "% foi a taxa de juros informada (se o valor for negativo, é desconto). " + 
        "Após os cálculos, o valor do acréscimo encontrado é de R$" + acrescimo.toFixed(2) + (" (novamente, se estiver negativo, é desconto). ")
        + "O valor final é de R$" + total.toFixed(2));       
    });
});