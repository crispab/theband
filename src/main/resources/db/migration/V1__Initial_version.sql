create table album
(
  id char(36) primary key not null
);

create table artist
(
    id char(36) primary key not null,
    name varchar(150)  not null
);

create table band
(
    id char(36) primary key not null,
    name varchar(150) not null
);

create table song_recording
(
  id char(36) primary key not null,
  title varchar(159)  not null
);


