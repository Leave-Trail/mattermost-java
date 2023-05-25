CREATE TYPE direct_chat_user (
    user_id UUID,
    name TEXT,
    avatar_url TEXT,
    joined_at TIMESTAMP,
);

CREATE TABLE direct_chats (
    user_id UUID,
    chat_id UUID ,
    name TEXT,
    chat_users LIST<FROZEN<direct_chat_user>>,
    created_at TIMESTAMP,
    PRIMARY KEY ((user_id), chat_id)
);