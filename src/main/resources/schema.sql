-- noinspection SqlNoDataSourceInspectionForFile

create table if not exists hardware(
    code varchar(20) not null unique,
    name varchar(200) not null ,
    price double not null ,
    numberAvailable int not null,
    type varchar(20) not null,
    id identity
);

create table if not exists review(
    id identity ,
    title varchar (200),
    reviewText varchar (1000),
    rating varchar (10),
    hardwareId int not null,
    constraint fk_hardware foreign key (hardwareId) references hardware(id)
)
