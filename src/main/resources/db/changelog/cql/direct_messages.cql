CREATE TABLE direct_messages (
    id UUID DEFAULT uuid_generate_v4(),
    direct_chat_room_id UUID,
    user_id UUID,
    content TEXT,
    page_timestamp DATE,
    timestamp TIMESTAMP
    PRIMARY KEY ((direct_message_id, page_timestamp), id)
);
