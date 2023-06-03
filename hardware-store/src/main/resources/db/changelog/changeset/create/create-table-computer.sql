create sequence if not exists computer_pub_seq increment by 1 start with 1000;

create table if not exists computer
(
    public_id bigint       DEFAULT next value for computer_pub_seq,
    item_id   bigint       not null primary key references items (id),
    type      varchar(255) not null
);