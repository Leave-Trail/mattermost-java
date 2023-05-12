CREATE TABLE users (
    id UUID PRIMARY KEY,
    username TEXT,
    email TEXT,
    password_hash TEXT,
    display_name TEXT,
    avatar_url TEXT,
    last_seen TIMESTAMP,
    created_at TIMESTAMP
);
