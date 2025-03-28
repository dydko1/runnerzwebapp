insert into post(id, title, content, created) values (1, 'Post 1', 'Content 1', TIMESTAMP '2011-01-01 11:00:00');
insert into post(id, title, content, created) values (2, 'Post 2', 'Content 2', TIMESTAMP '2012-01-01 12:00:00');
insert into post(id, title, content, created) values (3, 'Post 3', 'Content 3', TIMESTAMP '2013-01-01 13:00:00');
insert into post(id, title, content, created) values (4, 'Post 4', 'Content 4', TIMESTAMP '2014-01-01 14:00:00');
insert into post(id, title, content, created) values (5, 'Post 5', 'Content 5', TIMESTAMP '2015-01-01 15:00:00');

insert into comment(id, post_id, content, created) values (1, 1, 'Content 11', TIMESTAMP '2010-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (2, 1, 'Content 12', TIMESTAMP '2011-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (3, 2, 'Content 21', TIMESTAMP '2012-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (4, 2, 'Content 22', TIMESTAMP '2013-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (5, 3, 'Content 31', TIMESTAMP '2014-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (6, 3, 'Content 32', TIMESTAMP '2015-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (7, 4, 'Content 41', TIMESTAMP '2016-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (8, 4, 'Content 41', TIMESTAMP '2017-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (9, 5, 'Content 51', TIMESTAMP '2018-01-01 11:00:00');
insert into comment(id, post_id, content, created) values (10, 5, 'Content 51', TIMESTAMP '2019-01-01 11:00:00');
