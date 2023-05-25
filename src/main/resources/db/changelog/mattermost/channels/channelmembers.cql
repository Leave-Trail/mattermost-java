CREATE TABLE channelmembers (
    channelid text,
    userid text,
    roles text,
    lastviewedat bigint,
    msgcount bigint,
    mentioncount bigint,
    notifyprops text, -- Cassandra does not support JSON natively.
    lastupdateat bigint,
    schemeuser boolean,
    schemeadmin boolean,
    schemeguest boolean,
    mentioncountroot bigint,
    msgcountroot bigint,
    PRIMARY KEY (channelid, userid)
);
