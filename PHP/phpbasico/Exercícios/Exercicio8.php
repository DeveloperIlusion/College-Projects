<?php
    $primeiro = 11;
    $ultimo = 19;

    for ($x = $ultimo - 1; $x > $primeiro; --$x) {
        echo ($x != $ultimo  -1 ? "&nbsp;&nbsp;" : "") . $x;
    }