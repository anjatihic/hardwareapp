-- noinspection SqlNoDataSourceInspectionForFile

create table if not exists hardware(
    code varchar(20) not null unique,
    name varchar(200) not null ,
    price double not null ,
    number_available int not null,
    type varchar(20) not null,
    id identity
);

create table if not exists review(
    id identity ,
    title varchar (200),
    review_text varchar (1000),
    rating varchar (10),
    hardware_id int not null,
    constraint fk_hardware foreign key (hardware_id) references hardware(id)
)
