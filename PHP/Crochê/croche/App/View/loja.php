<div class="container mt-5 mb-5">
    <div class="row mb-4">
        <div class="col-md-4">
            <p class="text-left titulo-produtos">
                Produtos:
            </p>
        </div>
        <div class="col-md-8 justify-content-end my-auto">
            <form>
                <div class="row">
                    <div class="col-md-3">
                        <select type="text" class="form-control" id="category" aria-describedby="category">
                            <option>Selecione...</option>
                            <option>Linha</option>  
                            <option>Agulha</option>
                            <option>Kit</option>  
                            <option>Barbante</option>        
                        </select>
                    </div>
                    <div class="col-md-7">
                        <input type="search" class="form-control" id="search" aria-describedby="search">
                    </div>
                    <div class="col-md-2">
                        <button type="submit" class="btn btn-outline-danger">Pesquisar</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <hr class="mb-5">
    <div class="row row-cols-md-3 g-4">
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-1.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Kit de Novelos 1000m - Cléa</h5>
                    <p class="card-text">
                        O fio Cléa 1000 é ideal para todos os pontos de crochê. Produto com ótimo rendimento, alta qualidade 
                        e toque super macio, dando um resultado incrível ao seu trabalho. Cléa tem espessura delicada, 
                        ideal para trabalhos graciosos e com leveza.
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-2.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Novelo 400g - Barroco</h5>
                    <p class="card-text">
                        O fio barroco maxcolor é um barbante reconhecido no mercado por sua qualidade. 
                        Ideal para você que deseja trazer mais personalidade às suas confecções e produzir peças bem estruturadas.
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-3.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Novelo 500m - Anne</h5>
                    <p class="card-text">
                        A Linha Anne é um produto 100% algodão mercerizado que proporciona acabamento cintilante e toque macio à sua confecção.
                        Possui espessura ideal para confecções vazadas para o verão e, quando trabalhado com pontos mais fechados para meia estação e inverno, não deixa a sua peça pesada.
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-4.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Novelo 100g - Alvorada</h5>
                    <p class="card-text">
                        Linhas resistentes, macias e brilhantes. Alvorada trás os novelos de linha com maior versatilidade
                        de todo o mercado!
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-5.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Agulha de Crochê Soft - LANMAX</h5>
                    <p class="card-text">
                        Agulhas de Crochê Soft, além de lindas e coloridas, possuem uma maior comodidade por terem o cabo 
                        emborrachado e a ponta de alumínio, o que proporciona um ajuste a mão confortável e um melhor manuseio.
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
        <div class="col-md-4 p-3">
            <div class="card h-100">
                <img src="<?= baseUrl(); ?>uploads/produto-6.jpg" class="card-img-top card-img" alt="...">
                <div class="card-body">
                    <h5 class="card-title card-title-products">Agulha de Croche Bambu - Kasmaq</h5>
                    <p class="card-text">
                        Agulha de bambu eco é leve e com uma superfície perfeitamente lisa, 
                        proporcionando mais conforto e agilidade para seu trabalho. 
                        Resistente, extremamente leve e confortável. Qualidade e acabamento garantido!
                    </p>
                </div>
                <div class="card-footer">
                    <a href="<?= baseUrl(); ?>home/produto" class="card-product-footer">
                        <small class="text-muted card-product-footer">Comprar <i class="fa fa-shopping-cart"></i></small>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>