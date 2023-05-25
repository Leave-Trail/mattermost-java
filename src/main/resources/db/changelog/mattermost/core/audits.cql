CREATE TABLE audits (
    id text PRIMARY KEY,
    createat bigint,
    userid text,
    action text,
    extrainfo text,
    ipaddress text,
    sessionid text
);
