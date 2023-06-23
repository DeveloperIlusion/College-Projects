<?php 

    try {

        $conn = new PDO("mysql:host=127.0.0.1; port=3306; dbname=phpbasico2022",
            "root",
            ""
        );

        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $data = $conn->prepare("INSERT INTO categoriaProduto (descricao, statusRegistro)
        VALUES(?,?)");

        $data->execute(array("Vestido", 2));

        if ($conn->lastInsertId() > 0 ){
            echo "Categoria inserida com sucesso!";
        } else {
            echo "Falha na gravação da nova categoria";
        }
          

    } catch (PDOException $pe) {
        echo "ERROR: " . $pe->getMessage();
    }
 