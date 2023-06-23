<header class="header_area">
    <div class="main_menu">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container box_1620">
                <a class="navbar-brand logo_h" href="<?= baseUrl() ?>">
                    <img src="<?= baseUrl() ?>uploads/logo_crochê2" class="img-fluid" id="logo_navbar" type="image/png">
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav justify-content-end">
                        <li class="nav-item" id="nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>">Home</a></li>
                        <li class="nav-item" id="nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>home/loja">Loja</a></li>
                        <li class="nav-item" id="nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>home/sobreNos">Sobre Nós</a>
                        <li class="nav-item" id="nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>home/blogs">Dicas</a>
                        <li class="nav-item" id="nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>home/faleConosco">Fale Conosco</a></li>
                        <?php
                        if (1 == 2) {
                        ?>
                            <li class="nav-item"><a class="nav-link" href="#">Área restrita</a></li>
                        <?php
                        } else {
                        ?>

                            <li class="nav-item submenu dropdown">
                                <a href="<?= baseUrl() ?>home/login" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" id="nav-item">Bruno Deluca</a>
                                <ul class="dropdown-menu">
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>admin/crudUsuarios">Menu de Usuários</a></li>
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>admin/crudProdutos">Menu de Produtos</a></li>
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>admin/crudCategorias">Menu de Categorias</a></li>
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation"href="<?= baseUrl() ?>admin/crudBlogs">Menu de Blogs</a></li>
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation"href="<?= baseUrl() ?>admin/crudBlogPassoAPasso">Menu de Passo à Passo dos Blogs</a></li>
                                    <li class="nav-item submenu-nav-item"><a class="nav-link nav-animation" href="<?= baseUrl() ?>home/login">Sair</a></li>
                                </ul>
                            </li>
                        <?php
                        }
                        ?>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</header>
<main>