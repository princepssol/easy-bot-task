create sequence if not exists mem_pub_seq increment by 1 start with 1000;

create table if not exists mem
(
    public_id bigint DEFAULT next value for mem_pub_seq,
    item_id   bigint not null primary key references items (id),
    size      int2   not null
);