CREATE TABLE user_group_members (
    group_id UUID,
    user_id UUID,
    joined_at TIMESTAMP,
    is_admin BOOLEAN,
    PRIMARY KEY (group_id, user_id)
);
