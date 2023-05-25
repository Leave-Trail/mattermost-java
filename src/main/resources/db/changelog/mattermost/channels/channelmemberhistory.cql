CREATE TABLE channelmemberhistory (
    channelid text,
    userid text,
    jointime bigint,
    leavetime bigint,
    PRIMARY KEY (channelid, userid)
);
