<?php
    require_once "config/config.php";
    require_once "lib/Database.php";
    require_once "lib/ModelBase.php";

    $pastaApp   = "site";
    $parametros = (isset($_GET['parametro']) ? $_GET['parametro'] : "home");
    $metodo     = "";
    $acao       = "";
    $id         = 0;

    if (substr_count($parametros, "/") > 0) {

        $aParam     = explode("/", $parametros);
        $controller = (file_exists("{$pastaApp}/{$aParam[0]}.php") ? $aParam[0] : "comuns/error");
        $metodo     = $aParam[1];

        if (isset($aParam[2])) {
            if (in_array($aParam[2], ['insert', 'update', 'delete', 'view'])) {
                $acao   = $aParam[2];
                $id     = (isset($aParam[3]) ? $aParam[3] : "");
            } else {
                $acao   = "";
                $id     = (isset($aParam[2]) ? $aParam[2] : 0);
            }
        }

    } else {
        $controller = (file_exists("{$pastaApp}/{$parametros}.php") ? $parametros : "comuns/error");
    }

    require_once $pastaApp . "/comuns/cabecalho.php";
    require_once $pastaApp . "/comuns/menu.php";
    require_once $pastaApp ."/{$controller}.php";
    require_once $pastaApp ."/comuns/rodape.php";
