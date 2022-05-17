-- noinspection SqlNoDataSourceInspectionForFile

delete from hardware;
delete from review;
delete from authority;
delete from user_info;
delete from user_authority;

insert into hardware (code, name, price, number_available, type, id)
    values ('001CPU', 'Intel Core i7-12700K Desktop Processor 12', 374, 10, 'CPU', 1),
           ('001GPU', 'Nvidia GeForce GTX 1080 8GB', 800, 4, 'GPU', 2),
           ('001MBO', 'ASUS Prime Z590-A LGA 1200', 249.99, 23, 'MBO', 3),
           ('001RAM', 'Corsair Vengeance LPX 16GB', 277.99, 16, 'RAM', 4),
           ('001STO', 'Seagate 16TB HDD', 539, 3, 'STORAGE', 5),
           ('001OTH', 'Noctua High Performance Cooling Fan', 14.21, 20, 'OTHER', 6);

insert into review(id, title, review_text, rating, hardware_id)
    values (1, 'Just what I needed', 'I needed a good processor to handle my amazing gaming abilities, and this one is perfect', 'FIVE', 1),
           (2, 'I have no words', 'They are just sooo loud and obnoxious', 'ONE', 6),
           (3, 'Its OK', 'I think it works fine', 'THREE', 3),
           (4, 'So much storage!', 'Finally I dont have to worry about storage space', 'FIVE', 5),
           (5, 'Finally its here', 'Im satisfied but I was waiting for this product for forever', 'TWO', 2),
           (6, 'Works ok', 'I like it', 'FOUR', 4);


insert into authority(id, authority_name)
    values (1, 'ROLE_ADMIN'),
           (2, 'ROLE_USER');

insert into user_info(id, username, password)
    values (1, 'user', '$2a$12$h0HcS2QDb/7zPASbLa2GoOTSRP6CWK0oX7pCK.dPjkM6L5N4pNovi'), --password = user
           (2, 'admin', '$2a$12$INo0nbj40sQrTB7b28KJput/bNltGmFyCfRsUhvy73qcXo5/XdsTG'); ---password = admin

insert into user_authority(user_id, authority_id)
    values (1, 2),
           (2, 1);