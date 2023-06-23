CREATE SCHEMA IF NOT EXISTS `croche` DEFAULT CHARACTER SET utf8 ;
USE `croche` ;

CREATE TABLE IF NOT EXISTS `croche`.`Home` (
  `idHome` INT NOT NULL AUTO_INCREMENT,
  `Imagem-1` VARCHAR(255) NOT NULL,
  `Imagem-2` VARCHAR(255) NOT NULL,
  `Texto-1` LONGTEXT NOT NULL,
  `Texto-2` LONGTEXT NOT NULL,
  `Texto-3` LONGTEXT NOT NULL,
  `Titutlo-1` VARCHAR(255) NOT NULL,
  `Titutlo-2` VARCHAR(255) NOT NULL,
  `Titutlo-3` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idHome`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Carousel` (
  `idCarousel` INT NOT NULL AUTO_INCREMENT,
  `Imagem` VARCHAR(255) NOT NULL,
  `Home_idHome` INT NOT NULL,
  PRIMARY KEY (`idCarousel`, `Home_idHome`),
  INDEX `fk_Carousel_Home_idx` (`Home_idHome` ASC),
  CONSTRAINT `fk_Carousel_Home`
    FOREIGN KEY (`Home_idHome`)
    REFERENCES `croche`.`Home` (`idHome`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Produtos` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(255) NOT NULL,
  `Descricao` LONGTEXT NOT NULL,
  `Imagem` VARCHAR(255) NOT NULL,
  `Preco` DOUBLE NOT NULL,
  PRIMARY KEY (`idProduto`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Categoria-do-Produto` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `NomeCategoria` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Loja` (
  `idLoja` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(255) NULL,
  PRIMARY KEY (`idLoja`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`SobreNos` (
  `idSobreNos` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(255) NOT NULL,
  `Texto` LONGTEXT NOT NULL,
  `Visao` LONGTEXT NOT NULL,
  `Missao` LONGTEXT NOT NULL,
  `Valores` LONGTEXT NOT NULL,
  `Imagem` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idSobreNos`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Nome` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `Senha` VARCHAR(255) NOT NULL,
  `NivelDeAcesso` INT NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Carrinho` (
  `Usuario_idUsuario` INT NOT NULL,
  `Produtos_idProduto` INT NOT NULL,
  `Quantidade` INT NOT NULL,
  PRIMARY KEY (`Usuario_idUsuario`, `Produtos_idProduto`),
  INDEX `fk_Usuario_has_Produtos_Produtos1_idx` (`Produtos_idProduto` ASC),
  INDEX `fk_Usuario_has_Produtos_Usuario1_idx` (`Usuario_idUsuario` ASC),
  CONSTRAINT `fk_Usuario_has_Produtos_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `croche`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_has_Produtos_Produtos1`
    FOREIGN KEY (`Produtos_idProduto`)
    REFERENCES `croche`.`Produtos` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Blog` (
  `idBlog` INT NOT NULL AUTO_INCREMENT,
  `Video` VARCHAR(255) NOT NULL,
  `Titulo` VARCHAR(255) NOT NULL,
  `Texto` LONGTEXT NOT NULL,
  PRIMARY KEY (`idBlog`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`Passo-A-Passo` (
  `idPasso-A-Passo` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(255) NOT NULL,
  `Texto` LONGTEXT NOT NULL,
  `Blog_idBlog` INT NOT NULL,
  PRIMARY KEY (`idPasso-A-Passo`, `Blog_idBlog`),
  INDEX `fk_Passo-A-Passo_Blog1_idx` (`Blog_idBlog` ASC),
  CONSTRAINT `fk_Passo-A-Passo_Blog1`
    FOREIGN KEY (`Blog_idBlog`)
    REFERENCES `croche`.`Blog` (`idBlog`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `croche`.`FaleConosco` (
  `idFaleConosco` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(255) NOT NULL,
  `Imagem` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idFaleConosco`))
ENGINE = InnoDB;
