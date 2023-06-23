<div class="col-md-8 mx-auto card-product m-5 p-3">
    <div class="row">
        <div class="col-md-5">
            <img src="<?= baseUrl(); ?>uploads/produto-1.jpg" class="img-fluid card-product-image" alt="...">
        </div>
        <div class="col-md-7 my-auto">
            <div class="card-body">
                <h5 class="card-produtc-title mb-3">Kit de Novelos - Cléa</h5>
                <p class="card-text mb-5 text-justify">
                    O fio Cléa 1000 é ideal para todos os pontos de crochê. Produto com ótimo rendimento, 
                    alta qualidade e toque super macio, dando um resultado incrível ao seu trabalho. 
                    Cléa tem espessura delicada, ideal para trabalhos graciosos e com leveza.
                </p>
                <div class="row">
                    <div class="col-md-6">
                        <label for="quantity" class="form-label">Quantidade:</label>
                        <input type="number" class="form-control" id="quantity" aria-describedby="quantity">
                    </div>
                    <div class="col-md-6 justify-content-end my-auto">   
                        <h3 class="product-value">R$ 40,00</h3>
                    </div>
                </div>
                <a href="<?= baseUrl(); ?>home/carrinho" class="btn btn-outline-danger mt-4">Adicionar ao Carrinho <i class="fa fa-cart-plus"></i></a>
            </div>
        </div>
    </div>
</div>