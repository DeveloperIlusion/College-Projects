<?= $this->loadView("comuns/cabecalho") ?>
<?= $this->loadView("comuns/menu") ?>

<h2>
    Categoria
</h2>

<p>
    Controller: Categoria - Método: INDEX - BASE URL: <?= baseUrl(); ?>
</p>

<p>
    <?= var_dump($dados); ?>
</p>

<?= $this->loadView("comuns/rodape") ?>