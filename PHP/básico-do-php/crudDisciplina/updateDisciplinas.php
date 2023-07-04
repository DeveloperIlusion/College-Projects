<?php
    // updateDisciplinas.php

    if (isset($_POST['id'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=disciplina",
                "root",
                ""
            );

            $dados = [
                $_POST['descricao'],
                $_POST['detalhamento'],
                $_POST['statusRegistro'],
                $_POST['id']
            ];        

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            var_dump($_POST);

            $data = $conn->prepare("UPDATE disciplina 
                                    SET descricao = ?,  detalhamento = ?, statusRegistro = ?
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