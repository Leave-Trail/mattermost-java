CREATE TABLE sessions (
    id text PRIMARY KEY,
    token text,
    createat bigint,
    expiresat bigint,
    lastactivityat bigint,
    userid text,
    deviceid text,
    roles text,
    isoauth boolean,
    props text, -- Cassandra does not support JSON natively.
    expirednotify boolean
);
