CREATE TABLE direct_chat_messages (
    id UUID DEFAULT uuid_generate_v4(),
    direct_chat_id UUID,
    user_id UUID,
    content TEXT,
    page_timestamp DATE,
    timestamp TIMESTAMP,
    PRIMARY KEY ((direct_chat_id, page_timestamp), id)
);