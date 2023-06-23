<?php 
    $produtoSelecionado = $_POST["produtoSelecionado"];
    $quantidade = $_POST["quantidade"];
?> 

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
            <div class="mb-3 row">
                <label class="col-sm-2 col-form-label">Valor total</label>
                <div class="col-sm-10">
                    <?php
                        switch ($produtoSelecionado) {
                            case 1:
                                $total = $quantidade * 2500;
                                echo "Você selecionou " . $_POST['quantidade'] .  " GTX 1060 e o total da compra ficou R$" . $total . ",00.";
                                break;
                            case 2:
                                $total = $quantidade * 3000;
                                echo "Você selecionou " . $_POST['quantidade'] .  " GTX 1070 e o total da compra ficou R$" . $total . ",00.";
                                break;
                            case 3:
                                $total = $quantidade * 3500;
                                echo "Você selecionou " . $_POST['quantidade'] .  " GTX 1080 e o total da compra ficou R$" . $total . ",00.";
                                break;
                            case 4:
                                $total = $quantidade * 4000;
                                echo "Você selecionou " . $_POST['quantidade'] .  " GTX 1090 e o total da compra ficou R$" . $total . ",00.";
                                break;
                        }
                    ?>
                </div>
            </div>

            <div class="mb-3 row">
                    <label for="pagamento" class="col-sm-2 col-form-label">Pagamento</label>
                    <div class="col-sm-10">
                        <select class="form-select" name="pagamento" id="pagamento" required>
                            <option selected>Selecione uma forma de pagamento</option>
                            <option>Cartão</option>
                            <option>Boleto</option>
                        </select>            
                    </div>
                </div>

            <div class="mb-3 row">
                <div class="col-sm-10">
                    <a href="prova.php" class="btn btn-secondary btn-sm">Voltar</a>
                    <button class="btn btn-secondary btn-sm">Pagar</button>
                </div>
            </div>           
        </main>
    </body>    
</html>