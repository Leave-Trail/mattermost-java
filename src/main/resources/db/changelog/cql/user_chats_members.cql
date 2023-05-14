CREATE TABLE user_chats_members (
    user_chat_id UUID ,
    participant_id UUID,
    PRIMARY KEY ((user_chat_id), participant_id)
);
