SQL Codigo:

create database gimnasio;

use gimnasio;
    create table registroCliente (
    id int not null auto_increment,
    Nombre varchar(50) not null,
    Edad varchar(50) not null,
    Direccion varchar(50) null,
    telefono varchar(50) null,
    Correo varchar(50) null,
    Contraseña varchar(10) null,
    Cedula varchar(10) null,
    primary key (id)
);

use gimnasio;
    create table registroInstructor (
    id int not null auto_increment,
    Nombre varchar(50) not null,
    Edad varchar(50) not null,
    Direccion varchar(50) null,
    telefono varchar(50) null,
    Correo varchar(50) null,
    Contraseña varchar(10) null,
    Cedula varchar(10) null,
    especialidad varchar(50) null,
    UsuarioIntru varchar(50) null,
    primary key (id)
);

use gimnasio;
    create table taller (
    idclase int not null auto_increment,
    nombreTaller varchar(50) not null,
    nombreInstructor varchar(50) not null,
    horarioTaller varchar(50) null,
    duracion varchar(50) null,
    zona varchar(50) null,
    nivel varchar(10) null,
    descripcion varchar(280) null,
    primary key (id)
);

select * from registroCliente;
select * from registroInstructor;
select * from taller;

