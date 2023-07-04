create database ads;

create table cliente (
	CodCliente int primary key not null auto_increment,
    Nome varchar(60) not null,
    CPF varchar(11) not null, 
    Identidade varchar(25) not null
)
