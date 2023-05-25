CREATE TABLE sharedchannels (
    channelid text PRIMARY KEY,
    teamid text,
    home boolean,
    readonly boolean,
    sharename text,
    sharedisplayname text,
    sharepurpose text,
    shareheader text,
    creatorid text,
    createat bigint,
    updateat bigint,
    remoteid text
);
