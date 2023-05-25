CREATE TABLE user_groups (
    id UUID PRIMARY KEY,
    owner_id UUID,
    name TEXT,
    group_type TEXT,
    created_at TIMESTAMP,
);
