-- noinspection SqlNoDataSourceInspectionForFile

delete from hardware;
delete from review;

insert into hardware (code, name, price, numberAvailable, type)
    values ('001CPU', 'Intel Core i7-12700K Desktop Processor 12', 374, 10, 'CPU'),
           ('001GPU', 'Nvidia GeForce GTX 1080 8GB', 800, 4, 'GPU'),
           ('001MBO', 'ASUS Prime Z590-A LGA 1200', 249.99, 23, 'MBO'),
           ('001RAM', 'Corsair Vengeance LPX 16GB', 277.99, 16, 'RAM'),
           ('001STO', 'Seagate 16TB HDD', 539, 3, 'Storage'),
           ('001OTH', 'Noctua High Performance Cooling Fan', 14.21, 20, 'Other');

insert into review(id, title, reviewText, rating, hCode)
    values (1, 'Just what I needed', 'I needed a good processor to handle my amazing gaming abilities, and this one is perfect', 'FIVE', '001CPU'),
           (2, 'I have no words', 'They are just sooo loud and obnoxious', 'ONE', '001OTH'),
           (3, 'Its OK', 'I think it works fine', 'THREE', '001MBO'),
           (4, 'So much storage!', 'Finally I dont have to worry about storage space', 'FIVE', '001STO'),
           (5, 'Finally its here', 'Im satisfied but I was waiting for this product for forever', 'TWO', '001GPU'),
           (6, 'Works ok', 'I like it', 'FOUR', '001RAM');