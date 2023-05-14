CREATE TABLE user_chats (
    user_chat_id UUID default uuid_generate_v4(),
    user_id UUID,
    participant_id UUID,
    name VARCHAR,
    created_at TIMESTAMP,
    PRIMARY KEY ((user_id),user_chat_id)
);
