CREATE TABLE schemes (
    id text PRIMARY KEY,
    name text,
    displayname text,
    description text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    scope text,
    defaultteamadminrole text,
    defaultteamuserrole text,
    defaultchanneladminrole text,
    defaultchanneluserrole text,
    defaultteamguestrole text,
    defaultchannelguestrole text
);
