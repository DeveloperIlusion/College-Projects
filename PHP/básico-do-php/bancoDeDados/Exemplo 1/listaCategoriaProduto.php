<?php 

    try {

        $conn = new PDO("mysql:host=127.0.0.1; port=3306; dbname=phpbasico2022",
            "root",
            ""
        );
        
        $data = $conn->query("SELECT *FROM categoriaproduto");

        foreach ($data as $value) {
            echo "<br>ID: " .$value['id'] . " - Descrição: <b>" .
            $value['descricao'] . "</b> -  Status: " . 
            ($value['statusRegistro'] == 1 ? "Ativo" : "Inativo");
        }
    } catch (PDOException $pe) {
        echo "ERROR: " . $pe->getMessage();
    }
 