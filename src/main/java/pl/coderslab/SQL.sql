CREATE DATABASE workshop2
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci
;

CREATE TABLE workshop2.users
(
    id       int(11) NOT NULL AUTO_INCREMENT,
    email    varchar(255) UNIQUE DEFAULT NULL,
    username varchar(255)        DEFAULT NULL,
    password varchar(60)         DEFAULT NULL,
    PRIMARY KEY (id)
);