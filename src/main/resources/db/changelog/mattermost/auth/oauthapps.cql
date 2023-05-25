CREATE TABLE oauthapps (
    id text PRIMARY KEY,
    creatorid text,
    createat bigint,
    updateat bigint,
    clientsecret text,
    name text,
    description text,
    callbackurls text,
    homepage text,
    istrusted boolean,
    iconurl text
);
