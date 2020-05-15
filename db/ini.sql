/**
 *  データベース初期化
 *  ini.sq
 *  作成者: Shohei Yamamotol
 */

/* DB作成 */
DROP DATABASE IF EXISTS emp_sys_db;
CREATE DATABASE emp_sys_db;

/* ユーザの作成 */
DROP USER IF EXISTS testU;
CREATE USER testU IDENTIFIED BY 'testP';

/* 権限の付与 */
GRANT ALL PRIVILEGES ON emp_sys_db.* TO testU;

/* AUTOCOMMITモードを解除 */
SET AUTOCOMMIT=0;

/* DB選択 */
USE emp_sys_db;

/* ユーザマスタの作成 */
CREATE TABLE  m_user (
    user_id  VARCHAR(24)  PRIMARY KEY,  /* ユーザID */
    password  VARCHAR(32) NOT NULL,      /* パスワード */
    update_datetime TIMESTAMP  NOT NULL  /* 更新日時*/
);

/* ユーザマスタINSERT */
INSERT INTO m_user VALUES ("U0001", "password", "2020-05-15 18:00:00");

/* 部署マスタ作成 */
CREATE TABLE  m_seciton (
    section_code  CHAR(4)  PRIMARY KEY,   /* 部署コード */
    section_name  VARCHAR(24),                 /*  部署名 */
    update_datetime  TIMESTAMP               /* 更新日時 */
);
/* 部署マスタINSERT */

/* 従業員マスタ作成 */
CREATE TABLE m_employee (
    employee_code  CHAR(5)  PRIMARY KEY,  /* 従業員コード */
    last_name  VARCHAR(16)  NOT NULL,      /* 氏 */
    first_name VARCHAR(16)  NOT NULL,     /* 名 */
    last_kana_name VARCHAR(24),      /* 氏かな */
    first_kana_name VARCHAR(24),     /* 名かな */
    gender  TINYINT(1)  NOT NULL  DEFAULT 0 ,      /*  性別 */
    birth_day  DATE,       /* 生年月日 */
    section_code  NOT NULL  DEFALUT  'S000',        /* 部署コード */
    hire_date  DATE,     /* 入社日 */
    update_datetime  TIMESTAMP  DEFAULT CURRENT_TIMESTAMP    /* 更新日時 */
);

/* 従業員マスタINSERT */

/* 資格マスタ作成 */

/* 資格マスタINSERT */

/* 保有資格テーブル作成 */

/* 保有資格テーブルINSERT */

COMMIT;
