<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <!--Programado por Bruno Deluca Satil Cassiano  -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/cssQuestao12.css">
        <link href="bootstrap/jsQuestao12.css" rel="stylesheet" type="text/css">
        <title>Questão 12</title>
    </head>
    <body>
        <?php
            $candidato1 = 0;
            $candidato2 = 0;
            $candidato3 = 0;
            $votosCandidato1 = 0;
            $votosCandidato2 = 0;
            $votosCandidato3 = 0;
            $votar = false;
        ?>
        
        <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
            <div class="btn-group me-2" role="group" aria-label="First group" class="candidatos" id="candidato1">   
                <button type="button" class="btn btn-primary"><img src="imagens/a.png"></button>
            </div>
            <div class="btn-group me-2" role="group" aria-label="Second group" class="candidatos" id="candidato2">
                <button type="button" class="btn btn-info"><img src="imagens/b.png"></button>
            </div>
            <div class="btn-group" role="group" aria-label="Third group" class="candidatos" id="candidato3">
                <button type="button" class="btn btn-secondary"><img src="imagens/c.png"></button>
            </div>
        </div>

        <Form action="questao12Resposta.php">
            <button>Votar</button>
            <button type="submit">Apurar votação</button>
        </Form>
        <?php
            if ($votar == true) {
                if ($candidato1 == true) {
                    $votosCandidato1 += 1;
                } else if ($candidato2 == true) {
                    $votosCandidato2 += 1;
                } else if ($candidato3 == true) {
                    $votosCandidato3 += 1;
                }
            }
        ?>
    </body>
</html>