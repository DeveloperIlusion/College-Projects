<?php
    // insertCategoriaProduto.php

    if (isset($_POST['descricao'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=phpbasico2022",
                "root",             // usuário
                ""                  // senha
            );

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            $data = $conn->prepare("INSERT INTO categoriaproduto 
                                    (descricao, statusRegistro)
                                    VALUES ( ?, ? )");
            
            $data->execute([$_POST['descricao'], $_POST['statusRegistro']]);

            if ($conn->lastInsertId() > 0) {
                header("Location: lista.php?msgSucesso=Categoria inserida com sucesso !");
            } else {
                header("Location: lista.php?msgError=Falha na gravação da nova categoria.");
            }

        } catch (PDOException $pe) {
            echo "ERROR: " . $pe->getMessage();
        }

    } else {
        header("Location: form.php");
    }