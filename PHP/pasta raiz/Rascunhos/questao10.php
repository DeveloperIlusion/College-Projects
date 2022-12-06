<!DOCTYPE html>
<html lang="pt-br">
<head>
    <!--Programado por Bruno Deluca Satil Cassiano  -->
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Questão 10</title>
</head>
    <body>
        <form method="post" id="formulario">
            <p>
                <label for="nome">Informe seu nome</label>
                <input type="text" name="nome" id="nome" required autofocus>
            </p>
            <p>
                <label for="qtde">Informe seu email</label>
                <input type="email" name="email" id="email">
            </p>
            <p>
                <label for="qtde">Informe sua data de nascimento</label>
                <input type="date" name="data" id="data">
            </p>
            <p>
                <label for="bandeiraCartao">Selecione a bandeira do seu cartão</label>
                <select class="form-select" name="bandeiraCartao" id="bandeiraCartao">
                    <option selected>MasterCard</option>
                    <option>Visa</option>
                    <option>American Express</option>
                    <option>Elo</option>
                    <option>Discover Network</option>
                </select>
            </p>
            <p>
                <button type="submit">Enviar</button>
            </p>
        </form>

        <?php
            $mostrarForm = true;
            if (isset($_POST['nome'])) {
                $mostrarForm = false;
                ?>
                <style type="text/css">
                    #formulario{
                        display:none;
                    }
                </style>
                <?php
                echo "Nome: " . (isset($_POST['nome']) ? $_POST['nome'] : "");
                echo "<br />Email: " . (isset($_POST['email']) ? $_POST['email'] : "");
                echo "<br />Data de nascimento: " . (isset($_POST['data']) ? $_POST['data'] : "");
                echo "<br />Bandeira do cartão: " . (isset($_POST['bandeiraCartao']) ? $_POST['bandeiraCartao'] : "");
            }
        ?>
    </body>
</html>
