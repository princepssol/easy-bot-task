create sequence if not exists computer_pub_seq increment by 1 start with 1000;
create sequence if not exists computer_seq increment by 1 start with 1;

create table if not exists computer
(
    id        bigint       not null primary key,
    public_id bigint       not null unique,
    item_id   bigint       not null unique references items (id),
    type      varchar(255) not null
);