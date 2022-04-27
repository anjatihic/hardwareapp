-- noinspection SqlNoDataSourceInspectionForFile

create table if not exists hardware(
    code varchar(20) primary key ,
    name varchar(200) not null ,
    price double not null ,
    numberAvailable int not null,
    type varchar(20) not null
);
