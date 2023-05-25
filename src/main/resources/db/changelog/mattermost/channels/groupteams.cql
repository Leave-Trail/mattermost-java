CREATE TABLE groupteams (
    groupid text,
    teamid text,
    autoadd boolean,
    schemeadmin boolean,
    createat bigint,
    deleteat bigint,
    updateat bigint,
    PRIMARY KEY (groupid, teamid)
);
