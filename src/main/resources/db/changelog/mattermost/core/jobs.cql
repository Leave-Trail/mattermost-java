CREATE TABLE jobs (
    id text PRIMARY KEY,
    type text,
    priority bigint,
    createat bigint,
    startat bigint,
    lastactivityat bigint,
    status text,
    progress bigint,
    data text -- Cassandra does not support JSON natively.
);
