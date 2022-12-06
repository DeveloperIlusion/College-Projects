CREATE DATABASE  IF NOT EXISTS luncheonette;
USE luncheonette;

DROP TABLE IF EXISTS cliente;


CREATE TABLE cliente (
  cliente_id int NOT NULL AUTO_INCREMENT,
  nome varchar(50) NOT NULL,
  telefone char(11) DEFAULT NULL,
  data_nascimento date DEFAULT NULL,
  PRIMARY KEY (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=7;


--
-- Dumping data for table cliente
--

INSERT INTO cliente VALUES (6,'José','32998986363','1990-10-01');

--
-- Table structure for table endereco
--

DROP TABLE IF EXISTS endereco;


CREATE TABLE endereco (
  endereco_id int NOT NULL AUTO_INCREMENT,
  logradouro varchar(100) NOT NULL,
  bairro varchar(30) NOT NULL,
  numero int DEFAULT NULL,
  complemento varchar(50) DEFAULT NULL,
  referencia varchar(200) DEFAULT NULL,
  cliente_id int NOT NULL,
  PRIMARY KEY (endereco_id),
  KEY fk_cliente_endereco_idx (cliente_id),
  CONSTRAINT fk_cliente_endereco FOREIGN KEY (cliente_id) REFERENCES cliente (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=5;


--
-- Dumping data for table endereco
--

INSERT INTO endereco VALUES (4,'Avenida JK','Centro',200,'Apto 502','Ao lado da loteria',6);


--
-- Table structure for table lanche
--

DROP TABLE IF EXISTS lanche;


CREATE TABLE lanche (
  lanche_id int NOT NULL AUTO_INCREMENT,
  nome varchar(30) NOT NULL,
  preco_venda decimal(10,2) NOT NULL,
  descricao varchar(500) DEFAULT NULL,
  PRIMARY KEY (lanche_id)
) ENGINE=InnoDB AUTO_INCREMENT=4;


--
-- Dumping data for table lanche
--

INSERT INTO lanche VALUES (2,'X-Egg-Salada-Burguer',11.99,'Feito pelo Ticibidi');

--
-- Table structure for table pedido
--

DROP TABLE IF EXISTS pedido;


CREATE TABLE pedido (
  pedido_id int NOT NULL AUTO_INCREMENT,
  cliente_id int NOT NULL,
  valor_total decimal(10,2) NOT NULL DEFAULT '0.00',
  data date NOT NULL,
  status enum('A','C','F') NOT NULL DEFAULT 'A',
  data_hora_entrega timestamp NULL DEFAULT NULL,
  PRIMARY KEY (pedido_id),
  KEY fk_cliente_pedido_idx (cliente_id),
  CONSTRAINT fk_cliente_pedido FOREIGN KEY (cliente_id) REFERENCES cliente (cliente_id)
) ENGINE=InnoDB;


--
-- Dumping data for table pedido
--


--
-- Table structure for table item_pedido
--

DROP TABLE IF EXISTS item_pedido;


CREATE TABLE item_pedido (
  item_pedido_id int NOT NULL AUTO_INCREMENT,
  pedido_id int NOT NULL,
  lanche_id int NOT NULL,
  quantidade int NOT NULL,
  valor_item decimal(10,2) NOT NULL,
  PRIMARY KEY (item_pedido_id),
  KEY fk_pedido_item_pedido_idx (pedido_id),
  KEY fk_lanche_item_pedido_idx (lanche_id),
  CONSTRAINT fk_lanche_item_pedido FOREIGN KEY (lanche_id) REFERENCES lanche (lanche_id),
  CONSTRAINT fk_pedido_item_pedido FOREIGN KEY (pedido_id) REFERENCES pedido (pedido_id)
) ENGINE=InnoDB;


--
-- Dumping data for table item_pedido
--
