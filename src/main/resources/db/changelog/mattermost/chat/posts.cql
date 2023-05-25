CREATE TABLE posts (
    id text PRIMARY KEY,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    userid text,
    channelid text,
    rootid text,
    originalid text,
    message text,
    type text,
    props text, -- Cassandra does not support JSON natively.
    hashtags text,
    filenames text,
    fileids text,
    hasreactions boolean,
    editat bigint,
    ispinned boolean,
    remoteid text
);
