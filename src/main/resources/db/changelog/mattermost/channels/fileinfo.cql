CREATE TABLE fileinfo (
    id text PRIMARY KEY,
    creatorid text,
    postid text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    path text,
    thumbnailpath text,
    previewpath text,
    name text,
    extension text,
    size bigint,
    mimetype text,
    width int,
    height int,
    haspreviewimage boolean,
    minipreview blob, -- bytea in PostgreSQL maps to blob in Cassandra
    content text,
    remoteid text
);
