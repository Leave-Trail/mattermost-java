CREATE TABLE roles (
    id text PRIMARY KEY,
    name text,
    displayname text,
    description text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    permissions text,
    schememanaged boolean,
    builtin boolean
);
