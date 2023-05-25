CREATE TABLE sidebarchannels (
    channelid text,
    userid text,
    categoryid text,
    sortorder bigint,
    PRIMARY KEY ((channelid, userid), sortorder)
);
