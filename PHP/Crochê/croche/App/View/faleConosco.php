<div class="container mb-5">
    <h1 class="title-contact mt-5">Alguma dúvida ou problema?<br>Conta pra gente!</h1>
    <div class="row mt-5">
        <div class="col-md-6 vertical-align pl-4 pr-4 text-left">
            <form>
                <div class="mb-3">
                    <label for="name" class="form-label">Nome</label>
                    <input type="text" class="form-control" id="name" aria-describedby="name">
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">E-mail</label>
                    <input type="email" class="form-control" id="email" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="message" class="form-label">Mensagem</label>
                    <textarea type="textarea" class="form-control" id="message">
                    </textarea>
                </div>
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Quero receber novidades sobre novos blogs, cupons de desconto etc...</label>
                </div>
                <button type="submit" class="btn btn-outline-danger">Enviar</button>
            </form>
        </div>
        <div class="col-md-6">
            <img class="rounded-circle img-fluid alignment image-contact" src="<?= baseUrl(); ?>uploads/crochetando.jpg" id="sobreNosImagem">
        </div>
    </div>
</div>