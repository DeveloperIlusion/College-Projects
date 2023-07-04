<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lista de Municípios</title>

        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        
        <!-- Programado por Bruno Deluca Satil Cassiano | Período: 24 & 25 de Julho de 2022 -->
    </head>
    <body>
        <div class="container"> 
            
            <h2>Lista de Municípios</h2>

            <p>
                <a href="form.php?acao=insert" class="btn btn-primary" title="Cadastrar município">Cadastrar</a>
            </p>

            <?php
                if (isset($_GET['msgSucesso'])) {
                    ?>
                    <div class="alert alert-success" role="alert">
                        <?= $_GET['msgSucesso'] ?>
                    </div>
                    <?php
                }

                if (isset($_GET['msgError'])) {
                    ?>
                    <div class="alert alert-danger" role="alert">
                        <?= $_GET['msgError'] ?>
                    </div>
                    <?php
                }
            ?>

            <table class="table table-responsive table-bordered table-striped table-sm">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Unidade Federativa</th>
                        <th>Código do IBGE</th>
                        <th>Opções</th>
                    </tr>
                </thead>

                <tbody>
                    <?php
                    try {        
                        $conn = new PDO(
                            "mysql:host=localhost;port=3306;dbname=fasm20223p",
                            "root",
                            ""
                        );

                        $data = $conn->query("SELECT * FROM municipio ORDER BY nome");

                        foreach ($data as $value) {
                            ?>
                            <tr>
                                <td><?= $value['id'] ?></td>
                                <td><?= $value['nome'] ?></td>
                                <td><?= $value['uf'] ?></td>
                                <td><?= $value['codIBGE'] ?></td>
                                <td>
                                    <a href="form.php?acao=view&id=<?= $value['id'] ?>" class="btn btn-success btn-sm" title="Visualização Registro">Visualizar</a>
                                    <a href="form.php?acao=update&id=<?= $value['id'] ?>" class="btn btn-warning btn-sm" title="Alteração Registro">Alterar</a>
                                    <a href="form.php?acao=delete&id=<?= $value['id'] ?>" class="btn btn-danger btn-sm" title="Exclusão Registro">Excluir</a>
                                </td>
                            </tr>
                            <?php
                        }

                    } catch (PDOException $pe) {
                        echo "ERROR: " . $pe->getMessage();
                    }
                    ?>
                </tbody>
            </table>
        </div>
    </body>
</html>