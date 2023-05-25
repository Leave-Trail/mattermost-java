CREATE TABLE outgoingwebhooks (
    id text PRIMARY KEY,
    token text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    creatorid text,
    channelid text,
    teamid text,
    triggerwords text,
    callbackurls text,
    displayname text,
    contenttype text,
    triggerwhen int,
    username text,
    iconurl text,
    description text
);
