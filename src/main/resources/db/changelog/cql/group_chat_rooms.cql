CREATE TABLE group_chat_rooms (
    id UUID DEFAULT uuid_generate_v4(),
    group_id UUID,
    name TEXT,
    created_at TIMESTAMP,
    PRIMARY KEY ((group_id), id)
);

