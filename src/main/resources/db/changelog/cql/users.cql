CREATE TYPE IF NOT EXISTS group (
  group_id UUID,
  is_admin BOOLEAN,  
  name TEXT,
);

CREATE TABLE users (
    id UUID PRIMARY KEY,
    username TEXT,
    email TEXT,
    password_hash TEXT,
    display_name TEXT,
    avatar_url TEXT,
    personal_group_id UUID,
    member_of LIST<FROZEN<group>>
    last_seen TIMESTAMP,
    created_at TIMESTAMP
);

