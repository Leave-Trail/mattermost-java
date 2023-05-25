CREATE TABLE incomingwebhooks (
    id text PRIMARY KEY,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    userid text,
    channelid text,
    teamid text,
    displayname text,
    description text,
    username text,
    iconurl text,
    channellocked boolean
);
