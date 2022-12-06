
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário Eleicao</title>
</head>
<body>
    <?php
        echo "Candidato 1 recebeu " . $_POST['candidato1'] . " votos de um total de " . $_POST['votos'] . " totalizando " . ((float)$_POST['candidato1'] / (float)$_POST['votos'] * 100) . "%";
        echo "<br />";
        echo "Candidato 2 recebeu " . $_POST['candidato2'] . " votos de um total de " . $_POST['votos'] . " totalizando " . ((float)$_POST['candidato2'] / (float)$_POST['votos'] * 100) . "%";
        echo "<br />";
        echo "Candidato 3 recebeu " . $_POST['candidato3'] . " votos de um total de " . $_POST['votos'] . " totalizando " . ((float)$_POST['candidato3'] / (float)$_POST['votos'] * 100) . "%";
        echo "<br />";


    ?>
</body>
</html>