<?php

$num1 = 100;
$num2 = 50;
$num3 = 75;

$aVetor = array($num1, $num2, $num3);

echo "Exibindo o vetor na ordem natural";

for ($ind = 0; $ind < count($aVetor); $ind ++) {
    echo "<br>" . $aVetor[$ind];
}

echo "<br><br>";
echo "exibindo o vetor em ordem crescente";

asort($aVetor);

foreach ($aVetor as $value) {
    echo "<br>" . $value;
}

echo "<br><br>";

echo "exibindo o vetor em ordem decrescente";

arsort($aVetor);

foreach ($aVetor as $value) {
    echo "<br>" . $value;
}