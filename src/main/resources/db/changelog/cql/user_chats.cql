CREATE TABLE user_chats (
    user_chat_id UUID,
    user_id UUID,
    participant_id UUID,
    created_at TIMESTAMP,
    PRIMARY KEY (user_chat_id, user_id, participant_id)
);
