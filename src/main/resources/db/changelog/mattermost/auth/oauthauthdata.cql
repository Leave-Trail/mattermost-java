CREATE TABLE oauthauthdata (
    clientid text,
    userid text,
    code text PRIMARY KEY,
    expiresin int,
    createat bigint,
    redirecturi text,
    state text,
    scope text
);
