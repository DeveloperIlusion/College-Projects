<?php 

    try {

        $conn = new PDO("mysql:host=127.0.0.1; port=3306; dbname=phpbasico2022",
            "root",
            ""
        );

        $dados = [
            "Calças Masculinas", //descrição
            1,  //status
            3 //id
        ];

        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

        $data = $conn->prepare("UPDATE categoriaProduto 
                                SET descricao = ?, statusRegistro = ?  
                                WHERE id = ?");

        $data->execute($dados);

        if ($data->rowCount() > 0 ){
            echo "Categoria alterada com sucesso!";
        } else {
            echo "Falha na alteração da categoria";
        }
          

    } catch (PDOException $pe) {
        echo "ERROR: " . $pe->getMessage();
    }
 