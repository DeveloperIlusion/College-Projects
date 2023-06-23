<?php
    // updateCategoriaProduto.php

    if (isset($_POST['id'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=phpbasico2022",
                "root",             // usuário
                ""                  // senha
            );

            $dados = [
                $_POST['descricao'],            // descrição
                $_POST['statusRegistro'],       // Status
                $_POST['id']                    // id
            ];        

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            $data = $conn->prepare("UPDATE categoriaproduto 
                                    SET descricao = ?, statusRegistro = ?
                                    WHERE id = ?");
            
            $data->execute($dados);

            if ($data->rowCount() > 0) {
                header("Location: lista.php?msgSucesso=Categoria alterada com sucesso !");
            } else {
                header("Location: lista.php?msgError=Falha na alteração da categoria");
            }

        } catch (PDOException $pe) {
            echo "ERROR: " . $pe->getMessage();
        }

    } else {
        header("Location: lista.php");
    }