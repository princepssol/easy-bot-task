create sequence if not exists laptop_pub_seq increment by 1 start with 1000;

create table if not exists laptop
(
    public_id bigint     not null unique,
    item_id   bigint     not null primary key references items (id),
    size      varchar(3) not null
);