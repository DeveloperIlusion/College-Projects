<div class="container mt-5 mb-5">
    <h2 class="crudLogin-title text-left mb-4">CRUD de Produtos</h2>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-1">
            <label for="id" class="form-label">Id</label>
            <input type="number" class="form-control" id="id" aria-describedby="id">
        </div>
        <div class="col-md-4">
            <label for="name" class="form-label">Nome do Produto</label>
            <input type="text" class="form-control" id="name" aria-describedby="name">
        </div>
        <div class="col-md-2">
            <label for="price" class="form-label">Preço</label>
            <input type="text" class="form-control" id="price" aria-describedby="price">
        </div>
        <div class="col-md-2">
            <label for="category" class="form-label">Categoria</label>
            <select type="text" class="form-control" id="category" aria-describedby="category">
                <option>Selecione...</option>
                <option>Linha</option>  
                <option>Agulha</option>
                <option>Kit</option>  
                <option>Barbante</option>        
            </select>
        </div>
        <div class="col-md-3">
            <label for="image" class="form-label">Imagem</label>
            <input type="text" class="form-control" id="image" aria-describedby="image">
        </div>
    </div>
    <br/>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-5">
            <label for="description" class="form-label">Descrição</label>
            <textarea type="textarea" class="form-control" id="description" aria-describedby="description">
            </textarea>
        </div>
    </div>
    <div class="row mx-auto text-center justify-content-center m-4">
        <div class="col-md-1">
            <button class="btn btn-outline-danger">Excluir</button>
        </div>
        <div class="col-md-1">
            <button class="btn btn-outline-danger">Editar</button>
        </div>
        <div class="col-md-1">
        <button class="btn btn-outline-danger">Visualizar</button>
        </div>
    </div>
    <hr class="mt-4">
    <table class="table table-dark table-striped table-hover table-borderless crudLogin-table mt-4 table-responsive">
        <thead>
            <tr>
                <th class="col-2">Nome do Produto</th>
                <th class="col-1">Preço</th>
                <th class="col-3">Descrição</th>
                <th class="col-1">Categoria</th>
                <th class="col-1">Imagem</th>
                <th class="col-4">Controles</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Agulha - Tekin</td>
                <td>R$ 25,00</td>
                <td class="text-justify">
                    Kit Agulha Barbante Pacote com 8 Unidades Agulhas do 2.0 mm ao 5.5 mm Completo para 
                    seus trabalhos e customização de roupas e acessórios.
                </td>
                <td>Kit</td>
                <td>imagemX</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Novelo - Cisne</td>
                <td>R$ 20,00</td>
                <td class="text-justify">
                    Ideal Para Tricotar Uma Roupa, Fazer Uma Manta, Uma Peça De Decoração Em Crochê Ou Para Qualquer Projeto De 
                    Artesanato Como Cabelos De Boneca, Por Exemplo. D`Primera É O Produto Perfeito Para Artesanato, Além De 
                    Ser Pedido Em Algumas Listas Escolares Com Uma Gama De Cores Vasta E Equilibrada.
                </td>
                <td>Novelo</td>
                <td>imagemX</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Linha Ecológica - Passione</td>
                <td>R$ 30,00</td>
                <td class="text-justify">
                    A Linha Euroroma Passione É Mais Uma Opção Para Quem Não Abre Mão De Criar Peças De Vestuário Sustentáveis. 
                    Em Uma Época Em Que Produtos Artesanais Elaborados a Partir De Matéria-Prima Reciclada 
                    São Cada Vez Mais Valorizados, Esta Coleção É Uma Oport.
                </td>
                <td>Novelo</td>
                <td>imagemX</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Barbante - Piratininga</td>
                <td>R$ 15,00</td>
                <td class="text-justify">
                    Barbante cru utilizado para junção de peças de custura ou crochê, além
                    de poder ser cozido para aumentar sua resistência e peso, tornando a junção mais firme.
                </td>
                <td>Barbante</td>
                <td>imagemX</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
        </tbody>
    </table>
</div>