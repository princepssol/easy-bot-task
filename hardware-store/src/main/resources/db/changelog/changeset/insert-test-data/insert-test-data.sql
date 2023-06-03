insert into items(id, name, serial_num, manufacturer, price, count)
    values (1, 'кампуктер', '5768ybinjn  7', 'яблоко', 11.50, 1);
insert into computer(public_id, item_id, type)
    values (next value for computer_pub_seq, 1, 'DESKTOP');

insert into items(id, name, serial_num, manufacturer, price, count)
    values (2, 'макбук', '5768ybin', 'яблоко', 11.50, 50);
insert into laptop(public_id, item_id, size)
    values (next value for laptop_pub_seq, 2, '13');

insert into items(id, name, serial_num, manufacturer, price, count)
    values (3, 'моник', '5768ybiфуn', 'эйсер', 11.50, 5);
insert into monitor(public_id, item_id, size)
    values (next value for monitor_pub_seq, 3, 128);

insert into items(id, name, serial_num, manufacturer, price, count)
    values (4, 'моник', '5768ybiфуn', 'леново', 11.50, 15);
insert into mem(public_id, item_id, size)
    values (next value for mem_pub_seq, 4, 24);

