<section>
  <div id="titulo_faleConosco">
    <H1><u>_ Alguma dúvida ou problema? Conta pra gente! _</u></H1>
  </div>
  <div class="container" id="formulario">
    <form class="row">
      <div class="form-group col-md-6">
        <label class="form-label" for="nome">Nome</label>
        <input type="text" class="form-control" id="nome" placeholder="Informe seu nome">

        <label class="form-label" for="email">E-mail</label>
        <div class="input-group">
          <div class="input-group-text">@</div>
          <input type="email" class="form-control" id="email" placeholder="Informe seu e-mail">
        </div>

        <label class="form-label" for="mensagem">Mensagem</label>
        <textarea class="form-control" id="mensagem" placeholder="Insira sua mensagem aqui..."></textarea>

        <div class="form-check">
          <input class="form-check-input" type="checkbox" id="receberInformacoes">
          <label class="form-check-label" for="receberInformacoes">
            Quero receber notícias sobre lançamentos e afins.
          </label>
        </div>
        <button type="submit" id="btnEnviarFaleConosco" class="btn btn-outline-secondary">Enviar</button>
      </div>
      <div class="form-group col-md-6" id="fachada">
        <img src="assets/img/faleConosco/escrevendo.gif" class="img-fluid" id="faleConosco_fachada">
      </div>
    </form>
  </div>
</section>