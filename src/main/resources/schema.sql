CREATE TABLE IF NOT EXISTS TRANSFERMARKET_ISSUE(
     id                INTEGER  NOT NULL PRIMARY KEY
    ,issue_type        VARCHAR(38) NOT NULL
    ,issue_description VARCHAR(79) NOT NULL
    );

CREATE TABLE IF NOT EXISTS PLAYER_ISSUE(
     id                INTEGER  NOT NULL PRIMARY KEY
    ,issue_type        VARCHAR(31) NOT NULL
    ,issue_description VARCHAR(79) NOT NULL
);

CREATE TABLE IF NOT EXISTS TEAM_ISSUE(
        id                INTEGER  NOT NULL PRIMARY KEY
    ,issue_type        VARCHAR(36) NOT NULL
    ,issue_description VARCHAR(75) NOT NULL
    );