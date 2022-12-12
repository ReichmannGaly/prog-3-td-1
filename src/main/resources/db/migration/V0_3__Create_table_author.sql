create table author
(
    id     serial,
    name varchar unique,
    particularity varchar,
    birth_date date,
    primary key (id)
);