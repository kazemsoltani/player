CREATE TABLE player(
    ID INT AUTO_INCREMENT,
    FIRST_NAME VARCHAR(255),
    LAST_NAME VARCHAR(255),
    AGE INT,
    IS_ASSIGNED BOOLEAN,
    CLIENT VARCHAR (255)
);

INSERT INTO player ( ID, FIRST_NAME, LAST_NAME, AGE, IS_ASSIGNED, CLIENT )
VALUES 
(1, 'Levent',	'Divilioglu',	36,	FALSE,	NULL), 
(2, 'Altug',	'Timuroglu',	41,	TRUE,	'Altinorda IT'), 
(3, 'Bugra',	'Cengizoglu',	37,	TRUE,	'KizilTug TECH');