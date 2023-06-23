<div class="container mt-5 mb-5">
    <h2 class="crudLogin-title text-left mb-4">CRUD de Categorias de Produtos</h2>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-1">
            <label for="id" class="form-label">Id</label>
            <input type="number" class="form-control" id="id" aria-describedby="id">
        </div>
        <div class="col-md-5">
            <label for="name" class="form-label">Nome da Categoria</label>
            <input type="text" class="form-control" id="name" aria-describedby="name">
        </div>
    </div>
    <br/>
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
                <th class="col-md-9">Nome das Categorias de Produtos</th>
                <th class="col-md-6">Controles das Ações Realizadas Pelo CRUD</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Linha</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Agulha</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Barbante</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Kit</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
        </tbody>
    </table>
</div>