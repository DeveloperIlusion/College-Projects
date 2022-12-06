<?php
    $count = 0;
    $votosCandidato1 = 0;
    $votosCandidato2 = 0;
    $votosCandidato3 = 0;
        
    if (isset($_POST['numeroCandidato']) == "33221") {
        $votosCandidato1++;
        $count++;
        echo $count;
    } elseif (isset($_POST['numeroCandidato']) == "66554") {
        $votosCandidato2++;
        $count++;
    } elseif (isset($_POST['numeroCandidato']) == "99887") {
        $votosCandidato3++;
        $count++;
    }

?>
