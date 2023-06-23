<?php

use App\Library\ControllerMain;

class Erros extends ControllerMain
{
    /**
     * controllerNotFound
     *
     * @return void
     */
    public function controllerNotFound()
    {
        $this->loadView('comuns/erros', [
            'msgError' => "Controller não Localizado."
        ]);
    }

    /**
     * methodNotFound
     *
     * @return void
     */
    public function methodNotFound()
    {
        $this->loadView('comuns/erros', [
            'msgError' => "Método não localizado no controller"
        ]);
    }
}