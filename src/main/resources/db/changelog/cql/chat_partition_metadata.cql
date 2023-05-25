CREATE TABLE IF NOT EXISTS chat_partition_metadata (
    chat_room_id UUID,
    page_timestamp DATE,
    hot_storage BOOLEAN,
    cold_storage BOOLEAN,
    PRIMARY KEY ((chat_room_id), page_timestamp)

);

