-- we don't know how to generate root <with-no-name> (class Root) :(
create table CLIENT
(
    NAME VARCHAR not null,
    FAMILY_NAME VARCHAR not null,
    SECOND_NAME VARCHAR,
    ID INTEGER auto_increment
);

create unique index CLIENT_ID_UINDEX
    on CLIENT (ID);

alter table CLIENT
    add constraint CLIENT_PK
        primary key (ID);

create table ACCOUNT
(
    CURRENCY DECIMAL(19,4),
    ID INT auto_increment,
    ACCOUNT_NUMBER VARCHAR(20) not null,
    CLIENT_ID INT not null,
    constraint ACCOUNT_CLIENT_ID_FK
        foreign key (CLIENT_ID) references CLIENT (ID)
);

create unique index ACCOUNT_ID_UINDEX
    on ACCOUNT (ID);

alter table ACCOUNT
    add constraint ACCOUNT_PK
        primary key (ID);

create table CARD
(
    ID INT auto_increment,
    ACCOUNT_ID INT not null,
    CARD_NUMBER VARCHAR(16) not null,
    CARD_HOLDER VARCHAR,
    constraint CARD_ACCOUNT_ID_FK
        foreign key (ACCOUNT_ID) references ACCOUNT (ID)
);

create unique index CARD_CARD_NUMBER_UINDEX
    on CARD (CARD_NUMBER);

create unique index CARD_ID_UINDEX
    on CARD (ID);

alter table CARD
    add constraint CARD_PK
        primary key (ID);

INSERT INTO PUBLIC.CLIENT (NAME, FAMILY_NAME, SECOND_NAME, ID) VALUES ('Ivan', 'Ivanov', 'Ivanovich', 1);
INSERT INTO PUBLIC.CLIENT (NAME, FAMILY_NAME, SECOND_NAME, ID) VALUES ('Cider', 'Cidorov', 'Cidorovich', 2);
INSERT INTO PUBLIC.ACCOUNT (CURRENCY, ID, ACCOUNT_NUMBER, CLIENT_ID) VALUES (810.0000, 1, '12422313241242414', 1);
INSERT INTO PUBLIC.ACCOUNT (CURRENCY, ID, ACCOUNT_NUMBER, CLIENT_ID) VALUES (100.0000, 2, '32422324241242431', 2);
INSERT INTO PUBLIC.CARD (ID, ACCOUNT_ID, CARD_NUMBER, CARD_HOLDER) VALUES (6, 1, '1234567890123456', 'IVANOV STEPAN');
INSERT INTO PUBLIC.CARD (ID, ACCOUNT_ID, CARD_NUMBER, CARD_HOLDER) VALUES (7, 1, '1234567934629144', 'IVANOV STEPAN');create sequence hibernate_sequence start with 1 increment by 1
create table account (id integer not null, account_number varchar(255), client_id integer not null, currency decimal(19,2), primary key (id))
create table card (id integer not null, account_id integer not null, card_holder varchar(255), card_number varchar(255), primary key (id))
create table client (id integer not null, family_name varchar(255), name varchar(255), second_name varchar(255), primary key (id))
create sequence hibernate_sequence start with 1 increment by 1
create table account (id integer not null, account_number varchar(255), client_id integer not null, currency decimal(19,2), primary key (id))
create table card (id integer not null, account_id integer not null, card_holder varchar(255), card_number varchar(255), primary key (id))
create table client (id integer not null, family_name varchar(255), name varchar(255), second_name varchar(255), primary key (id))
create sequence hibernate_sequence start with 1 increment by 1
create table account (id integer not null, account_number varchar(255), client_id integer not null, currency decimal(19,2), primary key (id))
create table card (id integer not null, account_id integer not null, card_holder varchar(255), card_number varchar(255), primary key (id))
create table client (id integer not null, family_name varchar(255), name varchar(255), second_name varchar(255), primary key (id))
create sequence hibernate_sequence start with 1 increment by 1
create table account (id integer not null, account_number varchar(255), client_id integer not null, currency decimal(19,2), primary key (id))
create table card (id integer not null, account_id integer not null, card_holder varchar(255), card_number varchar(255), primary key (id))
create table client (id integer not null, family_name varchar(255), name varchar(255), second_name varchar(255), primary key (id))
