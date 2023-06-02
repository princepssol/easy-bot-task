create sequence if not exists laptop_pub_seq increment by 1 start with 1000;
create sequence if not exists laptop_seq increment by 1 start with 1;

create table if not exists laptop
(
    id        bigint     not null primary key,
    public_id bigint     not null unique,
    item_id   bigint     not null references items (id),
    size      varchar(2) not null
);