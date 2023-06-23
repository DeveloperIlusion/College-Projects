<?php

use App\Library\ControllerMain;

class Home extends ControllerMain
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
        $this->loadView('home');
        $this->loadView('comuns/rodape');
    }

    public function contato()
    {
        $this->loadView('contato');
    }

    public function loja()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('loja');
        $this->loadView('comuns/rodape');
    }

    public function produto()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('produto');
        $this->loadView('comuns/rodape');
    }

    public function carrinho()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('carrinho');
        $this->loadView('comuns/rodape');
    }

    public function sobreNos()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('sobreNos');
        $this->loadView('comuns/rodape');
    }

    public function blogs()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('blogs');
        $this->loadView('comuns/rodape');
    }

    public function blog()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('blog');
        $this->loadView('comuns/rodape');
    }

    public function faleConosco()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('faleConosco');
        $this->loadView('comuns/rodape');
    }

    public function login()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('login');
        $this->loadView('comuns/rodape');
    }

    public function cadastro()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('cadastro');
        $this->loadView('comuns/rodape');
    }
}