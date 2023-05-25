CREATE TABLE reactions (
    userid text,
    postid text,
    emojiname text,
    createat bigint,
    updateat bigint,
    deleteat bigint,
    remoteid text,
    PRIMARY KEY (userid, postid, emojiname)
);
