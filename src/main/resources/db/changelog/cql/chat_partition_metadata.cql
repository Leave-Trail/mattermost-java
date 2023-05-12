CREATE TABLE IF NOT EXISTS chat_partition_metadata (
    chat_id UUID,
    date DATE,
    PRIMARY KEY (chat_id, date)
);
