CREATE TABLE oauthaccessdata (
    token text PRIMARY KEY,
    refreshtoken text,
    redirecturi text,
    clientid text,
    userid text,
    expiresat bigint,
    scope text
);
