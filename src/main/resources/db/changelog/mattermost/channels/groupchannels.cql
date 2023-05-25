CREATE TABLE groupchannels (
    groupid text,
    channelid text,
    autoadd boolean,
    schemeadmin boolean,
    createat bigint,
    deleteat bigint,
    updateat bigint,
    PRIMARY KEY (groupid, channelid)
);
