CREATE DATABASE todo;
USE todo;
CREATE TABLE users (
	id int auto_increment primary key,
    name varchar(30) not null,
    age smallint,
    gender enum('F', 'M')
);

CREATE TABLE tasks (
id int auto_increment primary key,
contents varchar (200) not null
);

CREATE TABLE list (
user_id int,
    task_id int,
    foreign key (user_id) references users(id),
    foreign key (task_id) references tasks(id),
    status enum('Todo', 'Doing', 'Review', 'Done')
);

SHOW TABLES;

INSERT INTO USERS (NAME, AGE, GENDER) VALUES ('KSENIA', 27, 'F'),
												('TOLYA', 29, 'M'),
												('SIMON', 19, 'M');
                                                
ALTER TABLE tasks change contents content varchar (200) not null;

INSERT INTO TASKS (CONTENT) VALUES ('do the dishes'),
									('do grocery shopping'),
									('go to the swimming pool'),
                                    ('study'),
                                    ('do morning exercise'),
                                    ('go for a run'),
                                    ('read a book on Clean Code'),
                                    ('make dinner'),
                                    ('have lunch');
ALTER TABLE list ADD time timestamp first;
INSERT INTO list VALUES (Now(), 1 , 2,'TODO'),
						(Now(), 1 , 8,'TODO'),
                        (Now(), 1 , 1,'TODO');
UPDATE list  SET status = 'DONE' WHERE task_id = 8; 
UPDATE list SET time = Now() WHERE status ='DONE';
set sql_safe_updates = 0;

SELECT * FROM list ORDER BY status asc;
SELECT COUNT(*) FROM list WHERE status = 'DONE';

SELECT NAME, CONTENT FROM
((SELECT * FROM LIST L JOIN TASKS T ON
L.TASK_ID = T.ID ORDER BY TIME DESC) AS X JOIN USERS U ON X.USER_ID = U.ID) WHERE STATUS <> 'DONE';

DELETE FROM list WHERE status = 'DONE';

 SELECT NAME, COUNT(*) FROM
(SELECT * FROM LIST L JOIN TASKS T ON
L.TASK_ID = T.ID ORDER BY TIME DESC) AS X JOIN USERS U ON X.USER_ID = U.ID where U.ID = 1;



                        


                                    



