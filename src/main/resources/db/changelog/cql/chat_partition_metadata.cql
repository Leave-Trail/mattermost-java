CREATE TABLE IF NOT EXISTS chat_partition_metadata (
    chat_id UUID,
    page_timestamp DATE,
    hot_storage BOOLEAN,
    cold_storage BOOLEAN,
    PRIMARY KEY ((chat_id), page_timestamp)

);
