<?php 

    try {

        $conn = new PDO("mysql:host=127.0.0.1; port=3306; dbname=phpbasico2022",
            "root",
            ""
        );

        $id = 11;

        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $data = $conn->prepare("DELETE FROM categoriaProduto WHERE id = ?");

        $data->execute([$id]);

        if ($data->rowCount() > 0 ){
            echo "Categoria excluída com sucesso!";
        } else {
            echo "Falha na exclusão da categoria";
        }
          

    } catch (PDOException $pe) {
        echo "ERROR: " . $pe->getMessage();
    }
 