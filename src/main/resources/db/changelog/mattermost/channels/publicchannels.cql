CREATE TABLE publicchannels (
    id text PRIMARY KEY,
    deleteat bigint,
    teamid text,
    displayname text,
    name text,
    header text,
    purpose text
);
