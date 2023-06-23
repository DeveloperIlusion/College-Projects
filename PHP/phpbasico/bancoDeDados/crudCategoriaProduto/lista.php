<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lista Categoria</title>

        <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

    </head>
    <body>

        <h2>Lista Categoria de Produtos</h2>

        <p>
            <a href="#" class="btn btn-primary" title="Novo Registro">Novo</a>
        </p>
        
        <table class="table table-responsive table-bordered table-striped table-sm">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Descrição</th>
                    <th>Status</th>
                    <th>Opções</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>5</td>
                    <td>Blusa Masculina</td>
                    <td>Ativo</td>
                    <td>
                        <a href="#" class="btn btn-success btn-sm" title="Visualização Registro">Visualizar</a>
                        <a href="#" class="btn btn-info btn-sm" title="Alteração Registro">Alterar</a>
                        <a href="#" class="btn btn-danger btn-sm" title="Exclusão Registro">Excluir</a>
                    </td>
                </tr>    
            </tbody>
        </table>
    </body>
</html>