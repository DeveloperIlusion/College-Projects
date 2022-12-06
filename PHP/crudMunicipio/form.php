<?php

    // Programado por Bruno Deluca Satil Cassiano | Período: 24 & 25 de Julho de 2022

    $data = [
        "id" => 0,
        "nome" => "",
        "uf" => "",
        "codIBGE" => ""
    ];

    $subMenu = [
        "insert" => "Cadastrar",
        "update" => "Alteração",
        "delete" => "Exclusão",
        "view"  => "Visualização"
    ];

    if ($_GET['acao'] != "insert") {

        try {        
            $conn = new PDO(
                "mysql:host=localhost;port=3306;dbname=fasm20223p",
                "root",
                ""
            );

            $data = $conn->prepare("SELECT * FROM municipio WHERE id = ?");
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

        <title>Formulário de Municípios</title>

        <link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">   
    </head>

    <body>
        <div class="container">

            <h2>Formulário de Municípios - <?= $subMenu[$_GET['acao']] ?></h2>

            <form method="POST" action="<?= $_GET['acao'] ?>Municipio.php">

                <div class="row mt-5">
                    <div class="mb-3 col-8">
                        <label for="nome" class="form-label">Nome</label>
                        <input type="text" class="form-control" maxlength="50" name="nome"  id="nome" placeholder="Nome do município" value="<?= $data['nome'] ?>" required>
                    </div>

                    <div class="mb-3 col-4">
                        <label for="uf" class="form-label">Unidade Federativa</label>
                        <select class="form-select" aria-label="Default select uf" maxlength="2" name="uf" id="uf" required>
                            <option hidden disabled selected value>Selecione a UF</option>
                            <option <?= ($data['uf'] == "AC" ? "selected" : "") ?> value="AC">Acre (AC)</option>
                            <option <?= ($data['uf'] == "AL" ? "selected" : "") ?> value="AL">Alagoas (AL)</option>
                            <option <?= ($data['uf'] == "AP" ? "selected" : "") ?> value="AP">Amapá (AP)</option>
                            <option <?= ($data['uf'] == "AM" ? "selected" : "") ?> value="AM">Amazonas (AM)</option>
                            <option <?= ($data['uf'] == "BA" ? "selected" : "") ?> value="BA">Bahia (BA)</option>
                            <option <?= ($data['uf'] == "CE" ? "selected" : "") ?> value="CE">Ceará (CE)</option>
                            <option <?= ($data['uf'] == "DF" ? "selected" : "") ?> value="DF">Distrito Federal (DF)</option>
                            <option <?= ($data['uf'] == "ES" ? "selected" : "") ?> value="ES">Espírito Santo (ES)</option>
                            <option <?= ($data['uf'] == "GO" ? "selected" : "") ?> value="GO">Goiás (GO)</option>
                            <option <?= ($data['uf'] == "MA" ? "selected" : "") ?> value="MA">Maranhão (MA)</option>
                            <option <?= ($data['uf'] == "MT" ? "selected" : "") ?> value="MT">Mato Grosso (MT)</option>
                            <option <?= ($data['uf'] == "MS" ? "selected" : "") ?> value="MS">Mato Grosso do Sul (MS)</option>
                            <option <?= ($data['uf'] == "MG" ? "selected" : "") ?> value="MG">Minas Gerais (MG)</option>
                            <option <?= ($data['uf'] == "PA" ? "selected" : "") ?> value="PA">Pará (PA)</option>
                            <option <?= ($data['uf'] == "PB" ? "selected" : "") ?> value="PB">Paraíba (PB)</option>
                            <option <?= ($data['uf'] == "PR" ? "selected" : "") ?> value="PR">Paraná (PR)</option>
                            <option <?= ($data['uf'] == "PE" ? "selected" : "") ?> value="PE">Pernambuco (PE)</option>
                            <option <?= ($data['uf'] == "PI" ? "selected" : "") ?> value="PI">Piauí (PI)</option>
                            <option <?= ($data['uf'] == "RJ" ? "selected" : "") ?> value="RJ">Rio de Janeiro (RJ)</option>
                            <option <?= ($data['uf'] == "RN" ? "selected" : "") ?> value="RN">Rio Grande do Norte (RN)</option>
                            <option <?= ($data['uf'] == "RS" ? "selected" : "") ?> value="RS">Rio Grande do Sul (RS)</option>
                            <option <?= ($data['uf'] == "RO" ? "selected" : "") ?> value="RO">Rondônia (RO)</option>
                            <option <?= ($data['uf'] == "RR" ? "selected" : "") ?> value="RR">Roraima (RR)</option>
                            <option <?= ($data['uf'] == "SC" ? "selected" : "") ?> value="SC">Santa Catarina (SC)</option>
                            <option <?= ($data['uf'] == "SP" ? "selected" : "") ?> value="SP">São Paulo (SP)</option>
                            <option <?= ($data['uf'] == "SE" ? "selected" : "") ?> value="SE">Sergipe (SE)</option>
                            <option <?= ($data['uf'] == "TO" ? "selected" : "") ?> value="TO">Tocantins (TO)</option>
                        </select>                
                    </div>

                    <div class="mb-3 col-8">
                        <label for="codIBGE" class="form-label">Código do IBGE</label>
                        <input type="text" class="form-control" maxlength="7" name="codIBGE"  id="codIBGE" placeholder="Código do munícipio dado pelo IBGE" value="<?= $data['codIBGE'] ?>" required>
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