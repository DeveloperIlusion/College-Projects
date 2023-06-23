<div class="container mt-5 mb-5">
    <h2 class="crudLogin-title text-left mb-4">CRUD de Usuários</h2>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-1">
            <label for="id" class="form-label">Id</label>
            <input type="number" class="form-control" id="id" aria-describedby="id">
        </div>
        <div class="col-md-5">
            <label for="name" class="form-label">Nome</label>
            <input type="text" class="form-control" id="name" aria-describedby="name">
        </div>
        <div class="col-md-4">
            <label for="email" class="form-label">E-mail</label>
            <input type="email" class="form-control" id="email" aria-describedby="email">
        </div>
        <div class="col-md-2">
            <label for="password" class="form-label">Senha</label>
            <input type="password" class="form-control" id="password" aria-describedby="password">
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
                <th class="col-3">Nome de Usuário</th>
                <th class="col-4">E-mail</th>
                <th class="col-1">Senha</th>
                <th class="col-4">Controles</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>João</td>
                <td>jaozin@gmai.com</td>
                <td>jaojaojhones</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Maria</td>
                <td>mariquinha@gmai.com</td>
                <td>maricolicola</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Carlos</td>
                <td>calinmarcos@gmai.com</td>
                <td>carlos4959</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>Zeca</td>
                <td>zecaskilolant@gmai.com</td>
                <td>zekaka9890</td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
        </tbody>
    </table>
</div>