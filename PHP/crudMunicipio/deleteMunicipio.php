<?php

    // Programado por Bruno Deluca Satil Cassiano | Período: 24 & 25 de Julho de 2022

    if (isset($_POST['id'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=fasm20223p",
                "root",
                ""
            );

            $id = 4;

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            $data = $conn->prepare("DELETE FROM municipio 
                                    WHERE id = ?");
            
            $data->execute([$_POST['id']]);

            if ($data->rowCount() > 0) {
                header("Location: lista.php?msgSucesso=Município removido do banco de dados com sucesso.");
            } else {
                header("Location: lista.php?msgError=Falha na remoção do município do banco de dados.");
            }

        } catch (PDOException $pe) {
            echo "ERROR: " . $pe->getMessage();
        }

    } else {
        header("Location: lista.php");
    }