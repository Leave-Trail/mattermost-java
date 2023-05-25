CREATE TABLE commandwebhooks (
    id text PRIMARY KEY,
    createat bigint,
    commandid text,
    userid text,
    channelid text,
    rootid text,
    usecount int
);
