<?php 

    if (isset($_POST['nome'])) {

        echo "NOME: " . $_POST["nome"];

        var_dump($_POST);

        for ($x = 1; $x <= $_POST['qtde']; $x++) {
            echo "<br />{$x}: " . $_POST['nome'];
        }
    } else{
        #echo "não é possível efetuar acesso direto ao programa";
        header("Location: formulario.php");
    }