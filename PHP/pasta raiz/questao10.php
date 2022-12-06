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
        <?php
            if (isset($_POST['nome']) == "") {
                ?>
                <form method="post" id="formulario">
            <p>
                <label for="nome">Informe seu nome</label>
                <input type="text" name="nome" id="nome" required autofocus>
            </p>
            <p>
                <label for="email">Informe seu email</label>
                <input type="email" name="email" id="email" required>
            </p>
            <p>
                <label for="dataNascimento">Informe sua data de nascimento</label>
                <input type="date" name="dataNascimento" id="dataNascimento" required>
            </p>
            <p>
                <label for="bandeiraCartao">Selecione a bandeira do seu cartão</label>
                <select class="form-select" name="bandeiraCartao" id="bandeiraCartao" required>
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
                } else{
                echo "Nome: " . (isset($_POST['nome']) ? $_POST['nome'] : "");
                echo "<br />Email: " . (isset($_POST['email']) ? $_POST['email'] : "");
                echo "<br />Data de nascimento: " . (date("d/m/Y", strtotime($_POST['dataNascimento'])));
                echo "<br />Bandeira do cartão: " . (isset($_POST['bandeiraCartao']) ? $_POST['bandeiraCartao'] : "");
            }
        ?>
    </body>
</html>
