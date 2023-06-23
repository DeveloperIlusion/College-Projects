<?= $this->loadView('comuns/cabecalho') ?>
<?= $this->loadView('comuns/menu') ?>

<div class="texto-erro erro404" role="alert">
    <?php
        if (isset($dados['msgError'])) {
            echo $dados['msgError'];
        } else {
            echo 'Página não localizada...';
        }
    ?>    
</div>

<?= $this->loadView('comuns/rodape') ?>