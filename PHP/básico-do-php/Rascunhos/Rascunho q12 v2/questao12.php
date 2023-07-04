<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano  -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 12</title>
    </head>
    
    <body>
        <form action=<?php if ((isset($_GET['count'])) > 6): "formulario_resposta.php"?><?php endif; ?> method="post">
            <p>
                <label for="numeroCandidato">Insira o número do candidato que quer votar:</label>
                <input type="text" name="numeroCandidato" id="numeroCandidato">
            </p>
            <p>
                <button type="submit">Enviar</button>
            </p>
        </form>

        <?php

        ?>
    </body>
</html>