delete from user_role;
delete from usr;

insert into usr(id, active, password, username)
values (1, true, '$2a$08$jzbCahwxdI1LJkXDj./sjO9fGqNzWW7.ALVZUk2VUp9usgc5sERJ.', 'admin'),
       (2, true, '$2a$08$jzbCahwxdI1LJkXDj./sjO9fGqNzWW7.ALVZUk2VUp9usgc5sERJ.', 'mike');

insert into user_role(user_id, roles)
values (1, 'USER'), (1, 'ADMIN'),
        (2, 'USER');