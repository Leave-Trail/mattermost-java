CREATE TABLE bots (
    userid text PRIMARY KEY,
    description text,
    ownerid text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    lasticonupdate bigint
);
