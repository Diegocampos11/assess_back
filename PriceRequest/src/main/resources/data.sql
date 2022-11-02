
INSERT INTO place (id, name) VALUES (1, 'Valladolid');
INSERT INTO place (id, name) VALUES (2, 'Murcia');
INSERT INTO place (id, name) VALUES (3, 'Sevilla');
INSERT INTO place (id, name) VALUES (4, 'Tokio');
INSERT INTO place (id, name) VALUES (5, 'Madrid');

INSERT INTO trip (company, origin_id, destination_id, luggage, date, price)
VALUES
('Ryanair',1,2,true,'2022-01-01',15)
,('MurciaPlanes',1,4,false,'2022-02-01',25)
,('GatoLines',2,3,true,'2022-03-01',45)
,('JapanAirlines',4,3,false,'2022-04-01',25)
,('Emirates',5,1,true,'2022-05-01',55)
,('Iberia',3,2,false,'2022-06-01',45)
,('Vueling',5,2,false,'2022-07-01',15)
,('MurciaPlanes',4,3,true,'2022-08-01',115)
,('Ryanair',3,4,false,'2022-09-01',175)
,('MurciaPlanes',2,1,false,'2022-10-01',25)
,('GatoLines',1,3,true,'2022-11-01',55)
,('JapanAirlines',4,2,true,'2022-12-01',25)
,('Emirates',1,2,true,'2022-01-02',15)
,('Iberia',1,2,true,'2022-01-03',150)
,('Vueling',2,5,true,'2022-01-04',105)
,('MurciaPlanes',5,2,true,'2022-01-05',185);

