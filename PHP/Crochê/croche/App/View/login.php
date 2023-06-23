<h1 class="title-contact mt-5">Seja Bem-vindo!</h1>
<div class="container mb-5">
    <div class="col-md-6 text-left mx-auto">
        <form>
            <p class="justify-content-center text-justify texto-home">
                º Não compartilhe sua senha com ninguém!<br/>
                º Entre em sua conta somente usando dispositivos cofiaveís!<br/>
                º Lembre-se de anotar sua senha em algum lugar que só você tenha acesso!
            </p>
            <div class="mb-3">
                <label for="email" class="form-label">E-mail</label>
                <input type="email" class="form-control" id="email" aria-describedby="email">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Senha</label>
                <input type="password" class="form-control" id="password" aria-describedby="password">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Salvar Dados de Login?</label>
            </div>
            <button type="submit" class="btn btn-outline-danger">Entrar</button>
        </form>
    </div>
    <a href="<?= baseUrl() ?>home/cadastro" class="mensagem-redirecionamento">
        <p>Ainda não tem uma conta? Crie uma aqui!</p>
    </a>
</div>