<?php

use App\Library\ControllerMain;

class Croche extends ControllerMain
{
    /**
     * index
     *
     * @return void
     */
    public function index()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('croche');
        $this->loadView('comuns/rodape');
    }
}