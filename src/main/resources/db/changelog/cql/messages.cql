CREATE TABLE messages (
    id UUID DEFAULT uuid_generate_v4(),
    chat_room_id UUID,
    user_id UUID,
    content TEXT,
    page_timestamp DATE,
    timestamp TIMESTAMP
    PRIMARY KEY ((chat_room_id, page_timestamp), id)
);

