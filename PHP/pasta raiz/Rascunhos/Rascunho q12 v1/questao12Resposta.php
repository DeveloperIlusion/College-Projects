<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano  -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/cssQuestao12.css">
        <link href="bootstrap/jsQuestao12.css" rel="stylesheet" type="text/css">
        <title>Questão 12</title>
    </head>
    <body>
        <?php
            echo "Marcos Paulo obteve " . $_GET['votosCandidato1'] . " votos!";
            echo "<br />Cleber Miguel obteve " . $_GET['votosCandidato2'] . " votos!";
            echo "<br />Gabriel Silveira obteve " . $_GET['votosCandidato3'] . " votos!";
        ?>
    </body>
</html>