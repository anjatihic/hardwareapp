-- noinspection SqlNoDataSourceInspectionForFile

create table if not exists hardware(
    code varchar(20) primary key ,
    name varchar(200) not null ,
    price double not null ,
    numberAvailable int not null,
    type varchar(20) not null
);

create table if not exists review(
    id identity ,
    title varchar (200),
    reviewText varchar (1000),
    rating varchar (10),
    hardwareCode varchar (20),
    constraint fk_hardware foreign key (hardwareCode) references hardware(code)
)
