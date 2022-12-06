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
        <?php
            $mostrarForm = true;
            if (isset($_POST['login'])) {
                if ((($_POST['login']) == "fasm") && (($_POST['senha']) == "ads3p2022")) {
                    $mostrarForm = false;
                    echo "Logado com sucesso.";
                }
            }
            if ($mostrarForm == true) {
        ?> 
            <form method="post" id="formulario">
                <p>
                    <label for="login">Informe seu login</label>
                    <input type="text" name="login" id="login" required autofocus>
                </p>
                <p>
                    <label for="senha">Informe sua senha</label>
                    <input type="text" name="senha" id="senha" required>
                </p>
                <p>
                    <button type="submit">Enviar</button>
                </p>
            </form>
        <?php
        }  
        if (isset($_POST['login'])) {
            if (($_POST['login']) != "fasm") {
                echo "Login inválido.";
            } elseif ((($_POST['login']) == "fasm") && (($_POST['senha']) != "ads3p2022")) {
                echo "Senha inválida.";
            }
        }
        ?>
    </body>
</html>