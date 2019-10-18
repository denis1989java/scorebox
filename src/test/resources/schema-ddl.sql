DROP SCHEMA IF EXISTS SCORE_BOX;

CREATE SCHEMA SCORE_BOX;

SET SCHEMA SCORE_BOX;

CREATE TABLE ORGANIZATION (
  ID            VARCHAR(32) PRIMARY KEY,
  NAME          NVARCHAR
);

CREATE TABLE LEAGUE (
  ID            VARCHAR(32) PRIMARY KEY,
  NAME          NVARCHAR,
  ORGANIZATION_ID VARCHAR(32)
);

CREATE TABLE TEAM (
  ID            VARCHAR(32) PRIMARY KEY,
  NAME          NVARCHAR,
  LEAGUE_ID VARCHAR(32)
);

CREATE TABLE USER (
  ID            VARCHAR(32) PRIMARY KEY,
  NAME          NVARCHAR,
);

CREATE TABLE TEAM_USER (
    ID            VARCHAR(32) PRIMARY KEY,
    TEAM_ID       VARCHAR(32),
    USER_ID       VARCHAR(32)
);