<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Formulário exemplo - 1</h2>

    <form method="post" action="formulario_resposta.php">
        <p>
            <label for="nome">Informe seu nome</label>
            <input type="text" name="nome" id="nome" required autofocus>
        </p>
        <p>
            <label for="qtde">Informe uma quantidade</label>
            <input type="number" name="qtde" id="qtde" min="1" max="100" value="5">
        </p>
        <p>
            <button type="submit">Enviar</button>
        </p>
    </form>
</body>
</html>