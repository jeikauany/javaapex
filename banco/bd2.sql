CREATE TABLE marcas(
  codigo INT AUTO_INCREMENT PRIMARY KEY, 
  nome VARCHAR(30)
);
INSERT INTO marcas (nome) VALUES
("Sansung"),
("Apple"),
("Motorola");

SELECT * FROM marcas;

CREATE Table produtos (
codigo INT AUTO_INCREMENT PRIMARY KEY,
produto VARCHAR(50),
valor DOUBLE,
codigoMarca INT,
FOREIGN KEY (codigoMarca) REFERENCES marcas(codigo)
);
INSERT INTO produtos VALUES 
(null, "Galaxy S21", 8000, 1),
(null, "iphone 12", 7500, 2),
(null, "Galaxy Note", 4000, 1),
(null, "iphone 8",3500, 2);
--Primary key ou Chave- primária: Garante que não existirá informações repetidas.AUTO_INCREMENT
-- AUTO_INCREMENT- gera uma ordem de numeração
--Foreing Key ou Chave- estrangeira: Cria um vínculo com outra tabela
SELECT * FROM produtos;
SELECT 
produtos.codigo,
produtos.produto,
produtos.valor,
marcas.nome

FROM produtos
INNER JOIN marcas
ON produtos.codigoMarca = marcas.codigo;

TRUNCATE table produtos;

DELETE FROM produtos;

--inner join- vincula todos os produtos
--trunkate limpa a tabela e faz o auto ecremento valer 1

(SELECT AVG(valor) FROM produtos);

SELECT * FROM produtos
WHERE valor >= (SELECT AVG(valor)FROM produtos);

-- para saber quais os valor maiores ou iguais a determinado valor, usa-se DOUBLE select igual acima

