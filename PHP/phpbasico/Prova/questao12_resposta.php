<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano & Pedro Almeida Carvalho-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 12</title>
    </head>
    
    <body>
        <?php
            echo "Candidato 1 recebeu " . $_POST['candidato1'] . " votos  totalizando " . ((float)$_POST['candidato1'] / (float)$_POST['votos'] * 100) . "%";
            echo "<br />";
            echo "Candidato 2 recebeu " . $_POST['candidato2'] . " votos  totalizando " . ((float)$_POST['candidato2'] / (float)$_POST['votos'] * 100) . "%";
            echo "<br />";
            echo "Candidato 3 recebeu " . $_POST['candidato3'] . " votos  totalizando " . ((float)$_POST['candidato3'] / (float)$_POST['votos'] * 100) . "%";
            echo "<br />";
            echo "Votos em branco foram " . $_POST['voto_branco'] . " totalizando " . ((float)$_POST['voto_branco'] / (float)$_POST['votos'] * 100) . "%";
            echo "<br />";
            echo "Votos nulos foram " . $_POST['voto_nulo'] . " totalizando " . ((float)$_POST['voto_nulo'] / (float)$_POST['votos'] * 100) . "%";
            echo "<br />";
            echo "Votos totais foram iguais a " . $_POST['votos'];
        ?>
    </body>
</html>