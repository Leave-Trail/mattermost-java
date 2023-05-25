CREATE TABLE sharedchannelusers (
    id text PRIMARY KEY,
    userid text,
    remoteid text,
    createat bigint,
    lastsyncat bigint,
    channelid text
);
