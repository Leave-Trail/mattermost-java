CREATE TABLE status (
    userid text PRIMARY KEY,
    status text,
    manual boolean,
    lastactivityat bigint,
    dndendtime bigint,
    prevstatus text
);
