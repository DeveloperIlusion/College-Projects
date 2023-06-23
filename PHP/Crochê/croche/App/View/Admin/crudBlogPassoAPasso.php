<div class="container mt-5 mb-5">
    <h2 class="crudLogin-title text-left mb-4">CRUD de Passo à Passo dos Blogs</h2>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-1">
            <label for="id" class="form-label">Id</label>
            <input type="number" class="form-control" id="id" aria-describedby="id">
        </div>
        <div class="col-md-2">
            <label for="blog" class="form-label">Id do Blog</label>
            <input type="number" class="form-control" id="blog" aria-describedby="blog">
        </div>
        <div class="col-md-3">
            <label for="title" class="form-label">Título</label>
            <input type="text" class="form-control" id="title" aria-describedby="title">
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
                <th class="col-2">Id do Blog</th>
                <th class="col-2">Titulo</th>
                <th class="col-4">Descrição</th>
                <th class="col-4">Controles</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>Passo 1</td>
                <td class="text-justify">
                    Faça uma corrente de base com um número de pontos que corresponda à largura do sapatinho. 
                    Normalmente, cerca de 10 a 12 pontos é um bom ponto de partida.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>Passo 2</td>
                <td class="text-justify">
                    Trabalhe em pontos baixos nas próximas carreiras para formar a sola do sapatinho. 
                    Continue fazendo carreiras de pontos baixos até que a peça tenha o comprimento 
                    desejado para a sola do sapatinho.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>Passo 3</td>
                <td class="text-justify">
                    Ao chegar ao final da sola, comece a trabalhar nas laterais. Faça pontos baixos nas 
                    laterais da sola para criar as paredes do sapatinho. Continue fazendo carreiras de 
                    pontos baixos nas laterais até atingir a altura desejada para o sapatinho.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>2</td>
                <td>Passo 1</td>
                <td class="text-justify">
                    Comece fazendo uma corrente de base com um número de pontos que corresponda à circunferência 
                    da cabeça para a qual a touca está sendo feita. Normalmente, cerca de 80 a 90 pontos é um 
                    bom ponto de partida para um tamanho adulto médio.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
        </tbody>
    </table>
</div>