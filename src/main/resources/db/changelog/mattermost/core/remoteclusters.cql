CREATE TABLE remoteclusters (
    remoteid text PRIMARY KEY,
    remoteteamid text,
    name text,
    displayname text,
    siteurl text,
    createat bigint,
    lastpingat bigint,
    token text,
    remotetoken text,
    topics text,
    creatorid text
);
