-- noinspection SqlNoDataSourceInspectionForFile

delete from hardware;

insert into hardware (code, name, price, numberAvailable, type)
    values ('001CPU', 'Intel Core i7-12700K Desktop Processor 12', 374, 10, 'CPU'),
           ('001GPU', 'Nvidia GeForce GTX 1080 8GB', 800, 4, 'GPU'),
           ('001MBO', 'ASUS Prime Z590-A LGA 1200', 249.99, 23, 'MBO'),
           ('001RAM', 'Corsair Vengeance LPX 16GB', 277.99, 16, 'RAM'),
           ('001STO', 'Seagate 16TB HDD', 539, 3, 'Storage'),
           ('001OTH', 'Noctua High Performance Cooling Fan', 14.21, 20, 'Other');
