CREATE TABLE preferences (
    userid text,
    category text,
    name text,
    value text,
    PRIMARY KEY (userid, category, name)
);
