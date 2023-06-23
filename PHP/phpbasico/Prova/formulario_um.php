<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário Único</title>
</head>
<body>
    <h2>Formulário e processamento</h2>

    <form>
        <label for="qtde">Quantidade</label>
        <input type="number" name="qtde" id="qtde" min="1" max="10">
        <br />
        <button type="submit">Enviar</button>
    </form>

    

    <?php

    if (isset($_GET['qtde'])) {
        ?>
        <h3>Resposta</h3>

        <?php
        echo "QUANTIDADE INFORMADA: " . (isset($_GET['qtde']) ? $_GET['qtde'] : "");

    }

    ?>
    
</body>
</html>