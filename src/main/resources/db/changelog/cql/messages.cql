CREATE TABLE messages (
    id UUID PRIMARY KEY,
    chat_room_id UUID,
    user_id UUID,
    content TEXT,
    timestamp TIMESTAMP
);
