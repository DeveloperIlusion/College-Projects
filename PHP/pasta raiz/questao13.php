<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano  -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 13</title>
    </head>
    
    <body>
        <form method="get" id="formulario">
            <p>
                <label for="aula">Informe a quantidade de aulas dadas por mes</label>
                <input type="number" name="aula" id="aula" required autofocus>
            </p>
            <p>
                <label for="valor">Informe o valor por aula</label>
                <input type="number" name="valor" id="valor">
            </p>
            <p>
                <button type="submit">Enviar</button>
            </p>
        </form>

        <?php            
            if (isset($_GET['aula'])) {
                $bruto = $_GET['aula'] * $_GET['valor'];
                $inss = $bruto * 0.08;
                if($bruto < 1245){
                    $irrf = $bruto * 0.075;
                }elseif($bruto < 2289.60){
                    $irrf = $bruto * 0.09;
                }if($bruto < 3334.40){
                    $irrf = $bruto * 0.12;
                }if($bruto < 6301.06){
                    $irrf = $bruto * 0.14;
                }else{
                    $irrf = $bruto * 0.14;
                }
                echo "Salario bruto " . $bruto . "<br />";
                echo "INSS " . $inss . "<br />";
                echo "IRRF " . $irrf . "<br />";
                echo "Salario liquido " . ($bruto-$inss-$irrf) . "<br />";
            }
        ?>
    </body>
</html>