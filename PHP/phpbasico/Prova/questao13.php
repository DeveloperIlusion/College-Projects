<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano & Pedro Almeida Carvalho-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 13</title>
    </head>
    
    <body>
        <form method="get" id="formulario">
            <p>
                <label for="aula">Informe a quantidade de aulas dadas por mês</label>
                <input type="number" name="aula" id="aula" required autofocus>
            </p>
            <p>
                <label for="valor">Informe o valor recebido por aula</label>
                <input type="number" name="valor" id="valor" required>
            </p>
            <p>
                <button type="submit">Calcular</button>
            </p>
        </form>

        <?php            
            if (isset($_GET['aula'])) {
                $bruto = $_GET['aula'] * $_GET['valor'];
                $inss = $bruto * 0.08;
                if ($bruto <= 1245) {
                    $irrf = ($bruto - $inss) * 0.075;
                } elseif ($bruto <= 2289.60) {
                    $irrf = ($bruto - $inss) * 0.09;
                } elseif ($bruto <= 3334.40) {
                    $irrf = ($bruto - $inss) * 0.12;
                } elseif ($bruto <= 6301.06) {
                    $irrf = ($bruto - $inss) * 0.14;
                } else {
                    $irrf = ($bruto - $inss) * 0.14;
                }
                echo "Salário bruto " . $bruto . "<br />";
                echo "INSS " . $inss . "<br />";
                echo "IRRF " . $irrf . "<br />";
                echo "Salário líquido " . ($bruto-$inss-$irrf) . "<br />";
            }
        ?>
    </body>
</html>