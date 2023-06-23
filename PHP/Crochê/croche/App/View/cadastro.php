<h1 class="title-contact mt-5">Seja Bem-vindo!</h1>
<div class="container  mx-auto mb-5">
    <div class="col-md-6 text-left mx-auto">
        <form>
            <p class="text-center texto-home">
                Ainda não tem uma conta?<br/>É rapidinho fazer uma! :)
            </p>
            <div class="mb-3">
                <label for="name" class="form-label">Nome</label>
                <input type="text" class="form-control" id="name" aria-describedby="name">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">E-mail</label>
                <input type="email" class="form-control" id="email" aria-describedby="email">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Senha</label>
                <input type="password" class="form-control" id="password" aria-describedby="password">
            </div>
            <div class="mb-3">
                <label for="passwordConfirmation" class="form-label">Repita a Senha</label>
                <input type="password" class="form-control" id="passwordConfirmation" aria-describedby="passwordConfirmation">
            </div>
            <button type="submit" class="btn btn-outline-danger">Cadastrar</button>
        </form>
    </div>
    <a href="<?= baseUrl() ?>home/login" class="mensagem-redirecionamento">
        <p>Já tem uma conta? Entre por aqui!</p>
    </a>
</div>