CREATE TABLE chat_room_users (
    chat_room_id UUID,
    user_id UUID,
    joined_at TIMESTAMP,
    is_admin BOOLEAN,
    PRIMARY KEY ((chat_room_id), user_id)
);
