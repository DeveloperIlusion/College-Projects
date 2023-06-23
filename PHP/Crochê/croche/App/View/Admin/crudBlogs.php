<div class="container mt-5 mb-5">
    <h2 class="crudLogin-title text-left mb-4">CRUD de Blogs</h2>
    <div class="row mx-auto my-auto text-left mt-5 justify-content-center">
        <div class="col-md-1">
            <label for="id" class="form-label">Id</label>
            <input type="number" class="form-control" id="id" aria-describedby="id">
        </div>
        <div class="col-md-4">
            <label for="video" class="form-label">Vídeo</label>
            <input type="text" class="form-control" id="video" aria-describedby="video">
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
                <th class="col-2">Vídeo</th>
                <th class="col-2">Titulo</th>
                <th class="col-4">Descrição</th>
                <th class="col-4">Controles</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>videoz</td>
                <td>Coração Multi-Camadas</td>
                <td class="text-justify">
                    Um coração de crochê delicado e encantador para enfeitar suas criações. Perfeito para adicionar 
                    um toque de amor e afeto a projetos de decoração, acessórios ou presentes personalizados. 
                    Deixe sua criatividade fluir com esse adorável símbolo de carinho feito à mão.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>videoy</td>
                <td>Toca Com Sininho</td>
                <td class="text-justify">Uma toca de crochê aconchegante e estilosa para manter sua cabeça quente nos dias frios. 
                    Feita com fios macios e com um design único, essa toca é perfeita para adicionar um 
                    toque de moda e conforto ao seu visual. Seja único e elegante com essa peça feita à mão.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>videox</td>
                <td>Luva Zebrada</td>
                <td class="text-justify">Luvas zebradas de crochê, um acessório divertido e estiloso para aquecer suas mãos com personalidade. 
                    Com seu padrão de zebra exclusivo e fios macios, essas luvas adicionam um toque de moda selvagem aos 
                    seus looks de inverno. Seja ousado e destaque-se com essas luvas únicas feitas à mão.
                </td>
                <td>
                    <button class="btn btn-outline-danger">Excluir</button>
                    <button class="btn btn-outline-danger">Editar</button>
                    <button class="btn btn-outline-danger">Visualizar</button>
                </td>
            </tr>
            <tr>
                <td>videow</td>
                <td>Sapatinhos de Bebê</td>
                <td class="text-justify">Sapatinho de bebê de crochê, um mimo delicado e confortável para os pezinhos mais adoráveis. Feito à mão 
                    com fios suaves e detalhes encantadores, esses sapatinhos adicionam um toque de doçura e estilo aos 
                    pequeninos. Presenteie seu bebê com esse acessório feito com carinho e amor.
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