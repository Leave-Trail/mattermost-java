CREATE TABLE group_chat_room_users (
    group_id UUID,
    chat_room_id UUID,
    user_id UUID,
    joined_at TIMESTAMP,
    is_admin BOOLEAN,
    PRIMARY KEY ((group_id,chat_room_id), user_id)
);

