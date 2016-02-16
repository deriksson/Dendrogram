INSERT INTO event_type (name) VALUES ('Birth');
INSERT INTO event_type (name) VALUES ('Death');

-- 01
INSERT INTO person (name,title,father,mother) VALUES ('Muhammed ibn Abdullah',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (1,1,'570-01-01');
INSERT INTO event (person,type,date) VALUES (1,2,'632-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Khadidja bint Khuwailid','Prinsessa av Quraish',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (2,1,'565-01-01');
INSERT INTO event (person,type,date) VALUES (2,2,'620-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Ruqayyah bint Muhammad',NULL,1,2);
INSERT INTO event (person,type,date) VALUES (3,1,'600-01-01');
INSERT INTO event (person,type,date) VALUES (3,2,'624-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Uthman ibn Affan Banu Rashidun','Kalif',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (4,1,'580-01-01');
INSERT INTO event (person,type,date) VALUES (4,2,'656-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Aisha bint Uthman ibn Affan',NULL,4,3);
INSERT INTO event (person,type,date) VALUES (5,1,'617-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Marwan I ibn al-Hakam Banu Umayyad','Kalif',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (6,1,'623-01-01');
INSERT INTO event (person,type,date) VALUES (6,2,'685-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Amina bint Marwan ibn al-Hakam',NULL,6,5);
INSERT INTO event (person,type,date) VALUES (7,1,'659-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Musa ibn Nuseir el-Bekir al-Makkiyya',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (8,1,'660-01-01');
INSERT INTO event (person,type,date) VALUES (8,2,'718-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Abd al-Aziz ibn Musa al-Makkiyya','Emir av Spanien',8,7);
INSERT INTO event (person,type,date) VALUES (9,1,'680-01-01');
INSERT INTO event (person,type,date) VALUES (9,2,'717-01-01');

-- 10
INSERT INTO person (name,title,father,mother) VALUES ('Aisha bint Abd al-Aziz ibn Musa ben Nuseir el-Bekir',NULL,9,NULL);
INSERT INTO event (person,type,date) VALUES (10,1,'710-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Fortun Banu Qasi','Ståthållare av Saragossa',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (11,1,'725-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Musa I ibn Fortun Banu Qasi','Ståthållare av Saragossa',11,10);
INSERT INTO event (person,type,date) VALUES (12,1,'740-01-01');
INSERT INTO event (person,type,date) VALUES (12,2,'788-01-01');

INSERT INTO person (name,title,father,mother) VALUES (NULL,NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (13,1,'755-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Musa II al-Qawasi ibn Musa Banu Qasi','Ståthållare av Saragossa',12,13);
INSERT INTO event (person,type,date) VALUES (14,1,'775-01-01');
INSERT INTO event (person,type,date) VALUES (14,2,'862-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Lope ibn Musa Banu Qasi','Ståthållare av Saragossa',14,NULL);
INSERT INTO event (person,type,date) VALUES (15,1,'800-01-01');
INSERT INTO event (person,type,date) VALUES (15,2,'875-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Aurea bint Lope ibn Musa Banu Qasi',NULL,15,NULL);
INSERT INTO event (person,type,date) VALUES (16,1,'825-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Fortun Garces den enögde','Kung av Pamplona',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (17,1,'825-01-01');
INSERT INTO event (person,type,date) VALUES (17,2,'905-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Oneca Fortunez',NULL,17,16);

INSERT INTO person (name,title,father,mother) VALUES ('Abdullah ibn Muhammad al-Umawi','Emir av Cordova',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (19,1,'844-01-01');
INSERT INTO event (person,type,date) VALUES (19,2,'912-01-01');

INSERT INTO person (name,title,father,mother) VALUES (NULL,NULL,19,18);
INSERT INTO event (person,type,date) VALUES (20,1,'870-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Zahad',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (21,1,'853-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Zahadon ibn Zahad',NULL,21,20);
INSERT INTO event (person,type,date) VALUES (22,1,'883-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Aragunte Fromariques',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Ortega Zara',NULL,22,23);
INSERT INTO event (person,type,date) VALUES (24,1,'913-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Lovesendo Ramirez','Cide de Leon',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (25,1,'918-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Abu-Nazir Lovesendiz','Cide de Leon',25,24);

INSERT INTO person (name,title,father,mother) VALUES ('Unisco Godinez des Asturias',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Hermigio Alboazar',NULL,26,27);

INSERT INTO person (name,title,father,mother) VALUES ('Toda Hermiguez Alboazar',NULL,28,NULL);

-- 30
INSERT INTO person (name,title,father,mother) VALUES ('Egas Moniz Ogasco',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Hermigo Venegas Ogasco',NULL,30,29);

INSERT INTO person (name,title,father,mother) VALUES ('Moninho Herminguez Ogasco',NULL,31,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Men Moniz de Riba-Duero',NULL,32,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Oroana de Sousa',NULL,NULL,NULL);

-- 35
INSERT INTO person (name,title,father,mother) VALUES ('Elvira de Riba-Duero',NULL,33,34);

INSERT INTO person (name,title,father,mother) VALUES ('Nuno Perez de Bragancon',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Urraca Nunez de Bragancon Ribera',NULL,36,35);

INSERT INTO person (name,title,father,mother) VALUES ('Payo Miniz de Ribera',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Maria Paes de Ribera',NULL,38,37);

-- 40
INSERT INTO person (name,title,father,mother) VALUES ('Juan Fernandez de Lima',NULL,NULL,NULL);

INSERT INTO person (name,title,father,mother) VALUES ('Maria Anez de Lima',NULL,40,39);

INSERT INTO person (name,title,father,mother) VALUES ('Alonso Tellez de Meneses',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (42,2,'1252-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Mayor Alonso de Meneses',NULL,42,41);
INSERT INTO event (person,type,date) VALUES (43,2,'1265-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Alfons av Molina',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (44,1,'1203-01-01');
INSERT INTO event (person,type,date) VALUES (44,2,'1272-01-01');

-- 45
INSERT INTO person (name,title,father,mother) VALUES ('Maria av Molina','Drottning av Kastilien och Leon',44,43);
INSERT INTO event (person,type,date) VALUES (45,1,'1265-01-01');
INSERT INTO event (person,type,date) VALUES (45,2,'1321-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Sancho IV den djärve','Kung av Kastilien och Leon',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (46,1,'1257-01-01');
INSERT INTO event (person,type,date) VALUES (46,2,'1295-04-25');

INSERT INTO person (name,title,father,mother) VALUES ('Ferdinand IV den tilltalade','Kung av Kastilien och Leon',46,45);
INSERT INTO event (person,type,date) VALUES (47,1,'1285-01-01');
INSERT INTO event (person,type,date) VALUES (47,2,'1312-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Constantia av Portugal',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (48,1,'1290-01-01');
INSERT INTO event (person,type,date) VALUES (48,2,'1313-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Alfons XI den rättrådige','Kung av Kastilien och Leon',47,48);
INSERT INTO event (person,type,date) VALUES (49,1,'1285-01-01');
INSERT INTO event (person,type,date) VALUES (49,2,'1312-01-01');

-- 50
INSERT INTO person (name,title,father,mother) VALUES ('Maria av Portugal',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (50,1,'1313-01-01');
INSERT INTO event (person,type,date) VALUES (50,2,'1357-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Peter den grymme','Kung av Kastilien och Leon',49,50);
INSERT INTO event (person,type,date) VALUES (51,1,'1334-01-01');
INSERT INTO event (person,type,date) VALUES (51,2,'1369-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Maria av Padilla',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (52,1,'1334-01-01');
INSERT INTO event (person,type,date) VALUES (52,2,'1361-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Isabella av Kastilien',NULL,51,52);
INSERT INTO event (person,type,date) VALUES (53,1,'1355-01-01');
INSERT INTO event (person,type,date) VALUES (53,2,'1392-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Edmund av Langley','Hertig av York',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (54,1,'1314-01-01');
INSERT INTO event (person,type,date) VALUES (54,2,'1402-01-01');

-- 55
INSERT INTO person (name,title,father,mother) VALUES ('Rikard av Conisburgh','Greve av Cambridge',54,53);
INSERT INTO event (person,type,date) VALUES (55,1,'1375-01-01');
INSERT INTO event (person,type,date) VALUES (55,2,'1415-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Anne Mortimer',NULL,NULL,NULL);
INSERT INTO event (person,type,date) VALUES (56,1,'1390-01-01');
INSERT INTO event (person,type,date) VALUES (56,2,'1411-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Rikard','Hertig av York',55,56);
INSERT INTO event (person,type,date) VALUES (57,1,'1411-01-01');
INSERT INTO event (person,type,date) VALUES (57,2,'1460-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Cecily Neville','Hertiginna av York',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (58,1,'1414-01-01');
INSERT INTO event (person,type,date) VALUES (58,2,'1495-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Edvard IV','Kung av England',57,58);
INSERT INTO event (person,type,date) VALUES (59,1,'1461-01-01');
INSERT INTO event (person,type,date) VALUES (59,2,'1483-01-01');

-- 60
INSERT INTO person (name,title,father,mother) VALUES ('Elizabeth Woodville','Drottning av England',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (60,1,'1437-01-01');
INSERT INTO event (person,type,date) VALUES (60,2,'1492-06-07');

INSERT INTO person (name,title,father,mother) VALUES ('Elisabet av York','Drottning av England',59,60);
INSERT INTO event (person,type,date) VALUES (61,1,'1465-01-01');
INSERT INTO event (person,type,date) VALUES (61,2,'1503-01-01');

INSERT INTO person (name,title,father,mother) VALUES ('Henrik VII','Kung av England',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (62,1,'1457-01-01');
INSERT INTO event (person,type,date) VALUES (62,2,'1509-06-07');

INSERT INTO person (name,title,father,mother) VALUES ('Margareta Tudor',NULL,62,61);
INSERT INTO event (person,type,date) VALUES (63,1,'1489-01-01');
INSERT INTO event (person,type,date) VALUES (63,2,'1541-06-07');

INSERT INTO person (name,title,father,mother) VALUES ('Jakob IV','Kung av Skottland',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (64,1,'1473-03-17');
INSERT INTO event (person,type,date) VALUES (64,2,'1513-09-09');

INSERT INTO person (name,title,father,mother) VALUES ('Jakob V','Kung av Skottland',64,63);
INSERT INTO event (person,type,date) VALUES (65,1,'1512-04-10');
INSERT INTO event (person,type,date) VALUES (65,2,'1542-12-14');

INSERT INTO person (name,title,father,mother) VALUES ('Maria av Guise','Drottning av Skottland',NULL,NULL);
INSERT INTO event (person,type,date) VALUES (66,1,'1515-11-22');
INSERT INTO event (person,type,date) VALUES (66,2,'1560-06-11');

INSERT INTO person (name,title,father,mother) VALUES ('Maria Stuart','Regerande drottning av Skottland',65,66);
INSERT INTO event (person,type,date) VALUES (67,1,'1542-12-08');
INSERT INTO event (person,type,date) VALUES (67,2,'1587-02-08');

