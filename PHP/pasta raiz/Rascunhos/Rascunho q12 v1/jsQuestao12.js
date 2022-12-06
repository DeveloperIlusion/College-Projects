$(document).ready( function(){

    $( ".candidatos" ).click(function(){
        var votar = true;
        if ($( "#candidato1" ).click(function(){})){
			var candidatoUm = true;
            var candidatoDois = false;
            var candidatoTres = false;
		} else if ($( "#candidato2" ).click(function(){})){
            var candidatoUm = false;
            var candidatoDois = true;
            var candidatoTres = false;
		} else if ($( "#candidato3" ).click(function(){})){
            var candidatoUm = false;
            var candidatoDois = false;
            var candidatoTres = true;
		}
    } );
} );