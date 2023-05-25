CREATE TABLE licenses (
    id text PRIMARY KEY,
    createat bigint,
    bytes text -- character varying(10000) maps to text in Cassandra
);
