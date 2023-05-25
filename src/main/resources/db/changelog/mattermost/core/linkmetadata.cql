CREATE TABLE linkmetadata (
    hash bigint,
    url text,
    timestamp bigint,
    type text,
    data text, -- Cassandra does not support JSON natively.
    PRIMARY KEY (hash, url)
);
