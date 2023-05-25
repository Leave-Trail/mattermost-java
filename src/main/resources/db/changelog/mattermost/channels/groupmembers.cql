CREATE TABLE groupmembers (
    groupid text,
    userid text,
    createat bigint,
    deleteat bigint,
    PRIMARY KEY (groupid, userid)
);
