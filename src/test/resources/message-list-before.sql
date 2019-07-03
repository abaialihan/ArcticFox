delete from message;

insert into(id, text, tag, user_id)
values
(1, 'first', 'tag', 1),
(2, 'second', 'tagq', 1),
(3, '333', 'tage', 1),
(4, 'fourth', 'tagr', 1);

alter sequence hibernate_sequence restart with 10;