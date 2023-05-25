CREATE TABLE pluginkeyvaluestore (
    pluginid text,
    pkey text,
    pvalue blob,
    expireat bigint,
    PRIMARY KEY (pluginid, pkey)
);
