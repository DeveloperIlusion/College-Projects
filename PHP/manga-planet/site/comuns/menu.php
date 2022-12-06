<header class="header_area">
    <div class="main_menu">
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container box_1620">
                <a class="navbar-brand logo_h" href="<?= SITEURL ?>">
                    <img src="assets/img/logo.png" class="img-fluid" id="logo_navbar" type="image/png">
                </a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav justify-content-end">
                        <li class="nav-item"><a class="nav-link" href="<?= SITEURL ?>">Home</a></li>
                        <li class="nav-item"><a class="nav-link" href="<?= SITEURL ?>mangas">Mangás</a></li>
                        <li class="nav-item"><a class="nav-link" href="<?= SITEURL ?>sobreNos">Sobre Nós</a>
                        <li class="nav-item"><a class="nav-link" href="<?= SITEURL ?>faleConosco">Fale Conosco</a></li>
                        <?php
                        if (1 == 2) {
                        ?>
                            <li class="nav-item"><a class="nav-link" href="#">Área restrita</a></li>
                        <?php
                        } else {
                        ?>

                            <li class="nav-item submenu dropdown">
                                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Bruno Deluca</a>
                                <ul class="dropdown-menu">
                                    <li class="nav-item"><a class="nav-link" href="#">Mangás Lidos</a></li>
                                    <li class="nav-item"><a class="nav-link" href="#">Trocar a Senha</a></li>
                                    <li class="nav-item"><a class="nav-link" href="#">Sair</a></li>
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