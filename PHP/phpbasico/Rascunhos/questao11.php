<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano  -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 11</title>
    </head>
    
    <body>
        <form method="get" id="formulario">
            <p>
                <label for="usuario">Informe seu nome de usuário</label>
                <input type="text" name="usuario" id="usuario" required autofocus>
            </p>
            <p>
                <label for="senha">Informe sua senha</label>
                <input type="text" name="senha" id="senha">
            </p>
            <p>
                <button type="submit">Enviar</button>
            </p>
        </form>

        <?php
            $mostrarForm = false;
            if (isset($_GET['usuario'])) {
                if ((($_GET['usuario']) == "fasm") && (($_GET['senha']) == "ads3p2022")) {
                    $mostrarForm = true;
                    echo "Logado com sucesso.";
                    ?>
                    <style type="text/css">
                        #formulario{
                            display:none;
                        }
                    </style>
                    <?php
                } elseif (($_GET['usuario']) != "fasm") {
                    echo "Login inválido.";
                } elseif ((($_GET['usuario']) == "fasm") && (($_GET['senha']) != "ads3p2022")) {
                    echo "Senha inválida.";
                }
            }
        ?>
    </body>
</html>