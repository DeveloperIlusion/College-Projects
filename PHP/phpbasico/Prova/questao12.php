<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano & Pedro Almeida Carvalho-->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Questão 12</title>
    </head>
    
    <body>
        <?php
            $candidato1 = 0;
            $candidato2 = 0;
            $candidato3 = 0;
            $voto_branco = 0;
            $voto_nulo = 0;
            if (isset($_POST['votos'])) {
                $votos = (int)$_POST['votos'];
                $votos += 1;
            } else {
                $votos = 0;
            }
            
            if (isset($_POST['candidatos'])) {
                $candidato1 = (int)$_POST['candidato1'];
                $candidato2 = (int)$_POST['candidato2'];
                $candidato3 = (int)$_POST['candidato3'];
                $voto_branco = (int)$_POST['voto_branco'];
                $voto_nulo = (int)$_POST['voto_nulo'];
                switch ($_POST['candidatos']) {
                    case 1:
                        $candidato1 = (int)$_POST['candidato1'] + 1;                     
                        break;
                    case 2:
                        $candidato2 = (int)$_POST['candidato2'] + 1;                        
                        break;
                    case 3:
                        $candidato3 = (int)$_POST['candidato3'] + 1;                       
                        break;
                    case 4:
                        $voto_branco = (int)$_POST['voto_branco'] + 1;                          
                        break;  
                    case 5:
                        $voto_nulo = (int)$_POST['voto_nulo'] + 1;                        
                        break;
                }
            }
        ?>

        <h2>Eleição</h2>

        <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
            <input type="hidden" name="votos" id="votos" value="<?php echo $votos ?>">
            <input type="hidden" name="candidato1" id="candidato1" value="<?php echo $candidato1 ?>">
            <input type="hidden" name="candidato2" id="candidato2" value="<?php echo $candidato2 ?>">
            <input type="hidden" name="candidato3" id="candidato3" value="<?php echo $candidato3 ?>">
            <input type="hidden" name="voto_branco" id="voto_branco" value="<?php echo $voto_branco ?>">
            <input type="hidden" name="voto_nulo" id="voto_nulo" value="<?php echo $voto_nulo ?>">
            <label for="candidato1">Candidato 1</label>
            <input type="radio" name="candidatos" id="candidato1" value="1">
            <br />
            <label for="candidato2">Candidato 2</label>
            <input type="radio" name="candidatos" id="candidato2" value="2">
            <br />
            <label for="candidato3">Candidato 3</label>
            <input type="radio" name="candidatos" id="candidato3" value="3">
            <br />
            <label for="candidato3">Voto em Branco</label>
            <input type="radio" name="candidatos" id="voto_branco" value="4">
            <br />
            <label for="candidato3">Voto Nulo</label>
            <input type="radio" name="candidatos" id="voto_nulo" value="5">
            <br />
            <button type="submit" <?php if ($votos >= 10){ ?> disabled <?php   } ?>>Votar</button>        
        </form>
        
        <form method="post" action="questao12_resposta.php">
            <input type="hidden" name="votos" id="votos" value="<?php echo $votos ?>">    
            <input type="hidden" name="candidato1" id="candidato1" value="<?php echo $candidato1 ?>">
            <input type="hidden" name="candidato2" id="candidato2" value="<?php echo $candidato2 ?>">
            <input type="hidden" name="candidato3" id="candidato3" value="<?php echo $candidato3 ?>">
            <input type="hidden" name="voto_branco" id="voto_branco" value="<?php echo $voto_branco ?>">
            <input type="hidden" name="voto_nulo" id="voto_nulo" value="<?php echo $voto_nulo ?>">
            <button type="submit" <?php if ($votos < 6){ ?> disabled <?php   } ?>>Encerrar votação</button>
        </form>
    </body>
</html>