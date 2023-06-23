<?php

    // Programado por Bruno Deluca Satil Cassiano | Período: 24 & 25 de Julho de 2022

    if (isset($_POST['nome'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=fasm20223p",
                "root",
                ""
            );

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            $data = $conn->prepare("INSERT INTO municipio 
                                    (nome, uf, codIBGE)
                                    VALUES ( ?, ?, ? )");
            
            $data->execute([$_POST['nome'], $_POST['uf'],$_POST['codIBGE']]);            

            if ($conn->lastInsertId() > 0) {
                header("Location: lista.php?msgSucesso=Município cadastrado com sucesso.");
            } else {
                header("Location: lista.php?msgError=Falha no cadastro do município.");
            }

        } catch (PDOException $pe) {
            echo "ERROR: " . $pe->getMessage();
            
            $conn=mysqli_connect('localhost','root','','fasm20223p');

            if(isset($_POST['nome']) and isset($_POST['uf']))
                $nome = $_POST['nome'];
                $uf = $_POST['uf'];
                $nomeDuplicado=mysqli_query($conn,"select * from municipio where nome='$nome'");
                $ufDuplicado=mysqli_query($conn,"select * from municipio where uf='$uf'");

            if (mysqli_num_rows($nomeDuplicado)>0) {
                header("Location: lista.php?msgError=Este nome de município já foi cadastrado.");
            } elseif (mysqli_num_rows($ufDuplicado)>0) {
                header("Location: lista.php?msgError=Esta Unidade Federativa já foi cadastrada.");
            }
        }

    } else {
        header("Location: form.php");
    }
