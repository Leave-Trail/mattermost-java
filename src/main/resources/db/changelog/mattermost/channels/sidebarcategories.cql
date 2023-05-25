CREATE TABLE sidebarcategories (
    id text PRIMARY KEY,
    userid text,
    teamid text,
    sortorder bigint,
    sorting text,
    type text,
    displayname text,
    muted boolean,
    collapsed boolean
);
