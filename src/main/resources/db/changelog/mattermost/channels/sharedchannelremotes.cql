CREATE TABLE sharedchannelremotes (
    id text PRIMARY KEY,
    channelid text,
    creatorid text,
    createat bigint,
    updateat bigint,
    isinviteaccepted boolean,
    isinviteconfirmed boolean,
    remoteid text,
    lastpostupdateat bigint,
    lastpostid text
);
