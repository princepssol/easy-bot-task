create sequence if not exists mem_pub_seq increment by 1 start with 1000;
create sequence if not exists mem_seq increment by 1 start with 1;

create table if not exists mem
(
    id        bigint primary key,
    public_id bigint not null unique,
    item_id   bigint not null references items (id),
    size      int2   not null
);