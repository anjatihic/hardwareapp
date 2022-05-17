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
);

create table if not exists authority (
    id identity,
    authority_name varchar(100) not null unique
);

create table if not exists user_info(
    id identity,
    username varchar(100) not null unique,
    password varchar(1000) not null
);

create table if not exists user_authority(
    user_id bigint not null,
    authority_id bigint not null,
    constraint fk_user foreign key (user_id) references user_info(id),
    constraint fk_authority foreign key (authority_id) references authority(id)
);

