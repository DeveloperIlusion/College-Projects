<?php

use App\Library\ControllerMain;

class Admin extends ControllerMain
{
    /**
     * Controller das áreas de acesso restrito
     *
     * @return void
     */
    
    public function crudProdutos()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('admin/crudProdutos');
        $this->loadView('comuns/rodape');
    }

    public function crudCategorias()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('admin/crudCategorias');
        $this->loadView('comuns/rodape');
    }

    public function crudBlogs()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('admin/crudBlogs');
        $this->loadView('comuns/rodape');
    }

    public function crudBlogPassoAPasso()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('admin/crudBlogPassoAPasso');
        $this->loadView('comuns/rodape');
    }

    public function crudUsuarios()
    {
        $this->loadView('comuns/cabecalho');
        $this->loadView('comuns/menu');
        $this->loadView('admin/crudUsuarios');
        $this->loadView('comuns/rodape');
    }
}