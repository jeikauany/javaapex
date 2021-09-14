create table uzuarios(
   codigo INTEGER,
    nome VARCHAR(20),
    sobrenome VARCHAR(50),
    idade INT
);
Alter Table uzuarios Rename to usuarios;
alter table usuarios ADD COLUMN email VARCHAR(40);

Alter table usuarios drop column sobrenome;
insert into usuarios values (1, "Vanessa", 16, "vanessa.rosa@gmail.com");
insert into usuarios values  (2, "Adailton", 22, "adailton.maas@yahoo.com.br");
insert into usuarios values  (3, "Andressa", 36, "dessa.simas@uol.com.br");
insert into usuarios  values (4, "Mayra", 24, "mayra.antunes@gmail.com");
insert into usuarios  values (5, "Cristiane", 14, "criss.maya@gmail.com");
insert into usuarios values (6, "Leonardo", 15, "leo.kopff@terra.com.br");
insert into usuarios values  (7, "Carina", 27, "carina.almeida@gmail.com");
insert into usuarios values  (8, "Clóvis", 29, "clovis.simao@hotmail.com");
insert into usuarios values  (9, "Gabriela", 23, "gabriela.braga@live.com");
insert into usuarios values (10, "Cibele", null, "cibele.lins@uol.com.br");



