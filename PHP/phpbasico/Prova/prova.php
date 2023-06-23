<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Prova de PHP">
        <meta name="author" content="Bruno Deluca Satil Cassiano">
        
        <title>Carrinho de compras</title>
        
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
        <script src="js/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="js/jqueryMask.js" type="text/javascript"></script>
        
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        
    </head>
    <body>
        
        <header class="container-fluid">
            <h1>Carrinho de compras</h1>
        </header>
        
        <hr>
        
        <main class="container row">
                
            <?php
                $produtos = [
                    "1" => "GTX 1060 - R$2500,00",
                    "2" => "GTX 1070 - R$3000,00",
                    "3" => "GTX 1080 - R$3500,00",
                    "4" => "GTX 1090 - R$4000,00"
                ];
            ?>
            <form method="POST" action="recebeProva.php">

                <div class="mb-3 row">
                    <label for="produtoSelecionado" class="col-sm-2 col-form-label">Produtos</label>
                    <div class="col-sm-10">
                        <select class="form-select" name="produtoSelecionado" id="produtoSelecionado" required>
                            <option selected>Selecione um produto</option>
                            <?php foreach ($produtos as $key => $value): ?>
                                    <option value="<?= $key ?>"><?= $value ?></option>
                            <?php endforeach; ?>
                        </select>            
                    </div>
                </div>

                <div class="mb-3 row">
                    <label for="quantidade" class="col-sm-2 col-form-label">Quantidade</label>
                        <div class="col-sm-10">
                        <input type="number" class="form-control" id="quantidade" name="quantidade" required>
                    </div>
                </div>

                <button type="submit" class="btn btn-secondary btn-lg">Enviar</button>                
            </form>
        </main>
    </body>
</html>
