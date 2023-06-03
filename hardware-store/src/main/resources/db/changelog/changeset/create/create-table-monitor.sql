create sequence if not exists monitor_pub_seq increment by 1 start with 1000;

create table if not exists monitor
(
    public_id bigint not null unique,
    item_id   bigint not null primary key references items (id),
    size      int2   not null
);