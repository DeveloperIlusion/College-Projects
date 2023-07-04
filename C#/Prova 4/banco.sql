create table jogadores (
	Id int primary key not null,
    Nome varchar(255) not null,
    Cpf varchar(30) not null,
    Posicao varchar(30) not null,
    Sexo varchar(30) not null,
    Idade int not null,
    Peso decimal(5, 2) not null,
    Clube varchar(50) not null
)