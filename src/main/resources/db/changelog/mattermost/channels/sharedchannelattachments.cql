CREATE TABLE sharedchannelattachments (
    id text PRIMARY KEY,
    fileid text,
    remoteid text,
    createat bigint,
    lastsyncat bigint
);
