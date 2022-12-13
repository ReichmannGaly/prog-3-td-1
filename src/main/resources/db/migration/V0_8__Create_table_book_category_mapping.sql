create table book_category_mapping(
    book_id int
        constraint book_id_fk references book(id),
    category_id int
        constraint category_id_fk references category(category_id)
);