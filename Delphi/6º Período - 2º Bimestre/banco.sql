create database cascavel;

create table orcamento (
	codigo int primary key not null auto_increment,
    nome varchar(200) not null,
    data datetime not null,
    observacao varchar(250) not null
);

create table item_orcamento (
	codigo int primary key not null auto_increment,
    nome varchar(200) not null,
    posicao int not null,
    observacao varchar(250) not null,
    quantidade int not null,
    valor double not null,
    cod_orcamento int not null,
	KEY `FK_cod_orcamento` (`cod_orcamento`),
	CONSTRAINT `FK_cod_orcamento` FOREIGN KEY (`cod_orcamento`) REFERENCES `orcamento` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
);