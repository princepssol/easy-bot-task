create sequence if not exists item_seq increment by 1 start with 5;

create table if not exists items
(
    id           bigint         not null primary key,
    name         varchar(255)   not null,
    serial_num   varchar(255)   not null,
    manufacturer varchar(255)   not null,
    price        numeric(15, 2) not null,
    count        int            not null
);