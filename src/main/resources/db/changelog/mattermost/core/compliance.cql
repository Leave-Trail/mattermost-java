CREATE TABLE compliances (
    id text PRIMARY KEY,
    createat bigint,
    userid text,
    status text,
    count int,
    desc text,
    type text,
    startat bigint,
    endat bigint,
    keywords text,
    emails text
);
