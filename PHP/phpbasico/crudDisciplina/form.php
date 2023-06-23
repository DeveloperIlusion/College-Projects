<?php

$data = [
    "id" => 0,
    "descricao" => "",
    "detalhamento" => "",
    "statusRegistro" => 1
    
];

$subMenu = [
    "insert" => "Novo",
    "update" => "Alteração",
    "delete" => "Exclusão",
    "view"  => "Visualização"
];

if ($_GET['acao'] != "insert") {

    // buscar a categoria de produtos

    try {        
        $conn = new PDO(
            "mysql:host=localhost;port=3306;dbname=disciplina",
            "root",             // usuário
            ""                  // senha
        );

        $data = $conn->prepare("SELECT * FROM disciplina WHERE id = ?");
        $rsc = $data->execute([$_GET['id']]);
        $data = $data->fetch();

    } catch (PDOException $pe) {
        echo "ERROR: " . $pe->getMessage();
    }
}

?>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Formulário Categoria</title>

        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        
    </head>
    <body>

        <div class="container">

            <h2>Categoria de Disciplina - <?= $subMenu[$_GET['acao']] ?></h2>

            <form method="POST" action="<?= $_GET['acao'] ?>Disciplinas.php">

                <div class="row mt-5">
                    <div class="mb-3 col-8">
                        <label for="descricao" class="form-label">Descrição</label>
                        <input type="text" class="form-control" name="descricao"  id="descricao" placeholder="Descrição/nome da disciplina" value="<?= $data['descricao'] ?>">
                    </div>

                    <div class="mb-3 col-8">
                        <label for="descricao" class="form-label">Detalhamento</label>
                        <input type="text" class="form-control" name="detalhamento"  id="detalhamento" placeholder="Detalhamento da disciplina" value="<?= $data['detalhamento'] ?>">
                    </div>

                    <div class="mb-3 col-4">
                        <label for="statusRegistro" class="form-label">Status</label>
                        <select class="form-select" aria-label="Default select statusRegistro" name="statusRegistro" id="statusRegistro">
                            <option <?= ($data['statusRegistro'] == "" ? "selected" : "") ?>>...</option>
                            <option <?= ($data['statusRegistro'] == 1 ? "selected" : "") ?> value="1">Ativo</option>
                            <option <?= ($data['statusRegistro'] == 2 ? "selected" : "") ?> value="2">Inativo</option>
                        </select>                
                    </div>
                </div>

                <input type="hidden" name="id" id="id" value="<?= $data['id'] ?>">
                
                <div class="mt-3">

                    <div class="col-auto">
                        <a href="lista.php" class="btn btn-secondary btn-sm mb-3">Voltar</a>
                        
                        <?php
                        if ($_GET['acao'] != "view") {
                            ?>
                            <button type="submit" class="btn btn-primary btn-sm mb-3">Gravar</button>
                            <?php
                        }
                        ?>
                    </div>

                </div>
            
            </form>

        </div>

    </body>
</html>