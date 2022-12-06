<?php

    $valor = 5;
    $prod = 1;

    echo "<h3>Resolução simples</h3>";
    
    for ($x = 1; $x <= $valor; $x++) {
        echo "<br />" . $x;
        $prod = $prod * $x;
    } 

    echo "<br /> PRODUTO de {$prod}: " . $prod;

    echo "<h3>Resolução com array</h3>";

    $a = array();

    for ($x = 1; $x <= $valor; $x++) {
        echo "<br />" . $x;
        $a[] = $x;
    }
    
    echo "<br /> PRODUTO DE {$valor} em um array é: " .array_product($a);

    var_dump($a);