
INSERT INTO place (id, name, img_url) VALUES (1, 'Valladolid','https://jesusantaroca.files.wordpress.com/2012/06/el-cuchillejo.jpg');
INSERT INTO place (id, name, img_url) VALUES (2, 'Murcia','https://upload.wikimedia.org/wikipedia/commons/thumb/2/25/Salzillos_-_Burlas.jpg/1200px-Salzillos_-_Burlas.jpg');
INSERT INTO place (id, name,img_url) VALUES (3, 'Sevilla', 'https://a.cdn-hotels.com/gdcs/production72/d128/7da38149-dbcb-4273-922a-fd240e3b9f71.jpg?impolicy=fcrop&w=800&h=533&q=medium');
INSERT INTO place (id, name,img_url) VALUES (4, 'Tokio','https://www.gotokyo.org/es/plan/tokyo-outline/images/main.jpg');
INSERT INTO place (id, name,img_url) VALUES (5, 'Madrid','https://upload.wikimedia.org/wikipedia/commons/4/44/Plaza_Mayor_de_Madrid_06.jpg');

INSERT INTO trip (company, origin_id, destination_id, luggage_allowance, date_time, price)
VALUES
('Ryanair',1,2,true,'2022-01-01 21:00:00',15)
,('MurciaPlanes',1,4,false,'2022-02-01 21:00:00',25)
,('GatoLines',2,3,true,'2022-03-01 21:00:00',45)
,('JapanAirlines',4,3,false,'2022-04-01 21:00:00',25)
,('Emirates',5,1,true,'2022-05-01 21:00:00',55)
,('Iberia',3,2,false,'2022-06-01 21:00:00',45)
,('Vueling',5,2,false,'2022-07-01 21:00:00',15)
,('MurciaPlanes',4,3,true,'2022-08-01 21:00:00',115)
,('Ryanair',3,4,false,'2022-09-01T21:00:00',175)
,('MurciaPlanes',2,1,false,'2022-10-01 21:00:00',25)
,('GatoLines',1,3,true,'2022-11-01 21:00:00',55)
,('JapanAirlines',4,2,true,'2022-12-01 21:00:00',25)
,('Emirates',1,2,true,'2022-01-02 21:00:00',15)
,('Iberia',1,2,true,'2022-01-03 21:00:00',150)
,('Vueling',2,5,true,'2022-01-04 21:00:00',105)
,('MurciaPlanes',5,2,true,'2022-01-05 21:00:00',185);

