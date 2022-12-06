create database Empresa;
create table Cargo (
	CodCargo int not null primary key,
    Descricao varchar (40),
    Salario numeric(15,2)
);
create table Departamento (
	CodDepartamento int not null primary key,
    Descricao varchar (40),
    Ramaltel int
);
create table Funcionario (
	CodFuncionario int not null primary key,
	Departamento_CodDepartamento int,
    Cargo_CodCargo int,
    Nome varchar (45),
    DT_Admissao date,
    Sexo char(1),
    constraint FK_DepartamentoFuncionario Foreign Key
	(Departamento_CodDepartamento) references Departamento (CodDepartamento),
    constraint FK_Cargo_CodCargo Foreign Key
	(Cargo_CodCargo) references Cargo (CodCargo) 
);
create table Dependente (
	CodDependente int not null primary key,
    Funcionario_CodFuncionario int,
    Nome varchar (50),
    Idade int,
    constraint FK_FuncionarioDependente Foreign Key
	(Funcionario_CodFuncionario) references Funcionario (CodFuncionario)
);

Insert into Cargo values (1,'Auxiliar Vendas',550);
Insert into Cargo values (2,'Vigia',600);
Insert into Cargo values (3,'Vendedor',800);
Insert into Cargo values (4,'Cobrança',450);
Insert into Cargo values (5,'Gerente',1500);
Insert into Cargo values (6,'Contador',2500);
Insert into Cargo values (7,'Diretor',20000);
Insert into Cargo values (8,'Analista',5600);
Insert into Cargo values (9,'Tecnico TI',1300);

Insert into Departamento values (1,'Assistencia Auxiliar',2240);
Insert into Departamento values (2,'Estoque',2241);
Insert into Departamento values (3,'Administração',2242);
Insert into Departamento values (4,'Segurança',2243);
Insert into Departamento values (5,'Vendas',2244);
Insert into Departamento values (6,'Cobrança',2245);
Insert into Departamento values (7,'Diretória',2246);
Insert into Departamento values (8,'TI',2247);

Insert into Funcionario values (1,5,3,"Carlos",null,"M");
Insert into Funcionario values (2,5,3,"Joao",null,"M");
Insert into Funcionario values (3,5,3,"Bruno",null,"M");
Insert into Funcionario values (4,4,2,"Ricardo",null,"M");
Insert into Funcionario values (5,4,2,"Nathan",null,"M");
Insert into Funcionario values (6,6,4,"Sydney",null,"M");
Insert into Funcionario values (7,3,6,"Fernanda",null,"F");
Insert into Funcionario values (8,7,7,"Daniel",null,"M");
Insert into Funcionario values (9,1,1,"Heryka",null,"F");
Insert into Funcionario values (10,3,5,"Sara",null,"F");

Insert into Dependente values (1,1,"Marquim",12);
Insert into Dependente values (2,8,"Clebin",16);
Insert into Dependente values (3,3,"Celbit",19);
Insert into Dependente values (4,6,"Kaka",27);

update Cargo set salario = salario * 1.06 where CodCargo = 3;

update Departamento set ramaltel = 2214 where CodDepartamento = 7;

update Funcionario set DT_Admissao = "2011-05-02" where CodFuncionario = 5;

update Cargo set salario = salario + 300 where CodCargo = 6;

delete from Dependente where CodDependente = 2;