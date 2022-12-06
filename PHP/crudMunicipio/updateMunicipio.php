<?php

    // Programado por Bruno Deluca Satil Cassiano | Período: 24 & 25 de Julho de 2022

    if (isset($_POST['id'])) {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=fasm20223p",
                "root",
                ""
            );

            $dados = [
                $_POST['nome'],
                $_POST['uf'],
                $_POST['codIBGE'],
                $_POST['id']
            ];        

            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);

            var_dump($_POST);

            $data = $conn->prepare("UPDATE municipio 
                                    SET nome = ?,  uf = ?, codIBGE = ?
                                    WHERE id = ?");
            
            $data->execute($dados);

            if ($data->rowCount() > 0) {
                header("Location: lista.php?msgSucesso=Dados do município alterado com sucesso.");
            } else {
                header("Location: lista.php?msgError=Falha na alteração dos dados do município.");
            }

        } catch (PDOException $pe) {
            echo "ERROR: " . $pe->getMessage();

            $conn=mysqli_connect('localhost','root','','fasm20223p');
            
            if(isset($_POST['nome']) and isset($_POST['uf']))
                $nome = $_POST['nome'];
                $uf = $_POST['uf'];
                $nomeDuplicado=mysqli_query($conn,"select * from municipio where nome='$nome'");
                $ufDuplicado=mysqli_query($conn,"select * from municipio where uf='$uf'");

            if (mysqli_num_rows($nomeDuplicado)>0 or mysqli_num_rows($ufDuplicado)>0) {
                header("Location: lista.php?msgError=Sua alteração falhou pois o nome do município ou a unidade federativa inseridos já estão cadastrados.");
            }
        }

    } else {
        header("Location: lista.php");
    }