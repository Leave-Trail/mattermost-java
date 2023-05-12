CREATE TABLE group_chat_rooms (
    id UUID PRIMARY KEY,
    group_id UUID,
    name TEXT,
    created_at TIMESTAMP
);
