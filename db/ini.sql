/**
 *  ini.sql
 *  データベースの初期化をするファイルです。
 *  DBviewerを使ってMySQLへ投入すると文字化けするので、
 * 　コマンドプロンプトで以下を実行してください
 *  >  source C:\java_web_project_workspace\WebApp_Project\db\ini.sql
 *  作成者: Shohei Yamamoto
 */

/* DB作成 */
DROP DATABASE IF EXISTS emp_sys_db;
CREATE DATABASE emp_sys_db DEFAULT CHARACTER SET utf8;

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
INSERT INTO m_user VALUES
('U0001', 'password', '2020-05-15 18:00:00');

/* 部署マスタ作成 */
CREATE TABLE  m_section (
    section_code  CHAR(4)  PRIMARY KEY,   /* 部署コード */
    section_name  VARCHAR(24),                 /*  部署名 */
    update_datetime  TIMESTAMP               /* 更新日時 */
);

/* 部署マスタINSERT */
INSERT INTO m_section VALUES
('S000', '所属部署未定', '2020-05-15 18:00:00'),
('S110', '総務部', '2020-05-15 18:00:00'),
('S130', '人事部', '2020-05-15 18:00:00'),
('S150', '経理部', '2020-05-15 18:00:00'),
('S210', '企画部', '2020-05-15 18:00:00'),
('S230', '営業部', '2020-05-15 18:00:00');

/* 従業員マスタ作成 */
CREATE TABLE m_employee (
    employee_code  CHAR(5)  PRIMARY KEY,  /* 従業員コード */
    last_name  VARCHAR(16)  NOT NULL,      /* 氏 */
    first_name VARCHAR(16)  NOT NULL,     /* 名 */
    last_kana_name VARCHAR(24),      /* 氏かな */
    first_kana_name VARCHAR(24),     /* 名かな */
    gender  TINYINT(1)  NOT NULL  DEFAULT 0 ,      /*  性別 */
    birth_day  DATE,       /* 生年月日 */
    section_code  CHAR(4) NOT NULL  DEFAULT  'S000',        /* 部署コード */
    hire_date  DATE,     /* 入社日 */
    update_datetime  TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP ,   /* 更新日時 */
    FOREIGN KEY (section_code)  REFERENCES  m_section(section_code)
);

/* 従業員マスタINSERT */
INSERT INTO m_employee VALUES
('E0001', '田中',  '一郎',    'タナカ',     'イチロウ', 1,  '1992-08-02', 'S110', '2012-04-01', '2019-12-01'),
('E0002', '山田',  '花子',    'ヤマダ',     'ハナコ',   2,  '1976-05-11', 'S230', '1998-04-01', '2017-09-21'),
('E0003', '鈴木',  '正雄',    'スズキ',    'マサオ',   1,  '1983-11-22', 'S150', '2003-04-01', '2018-04-01'),
('E0004', '高橋',  '和男',    'タカハシ',  'カズオ',   1,  '1969-12-07', 'S130', '1987-04-01', '2019-12-01'),
('E0005', '佐藤',  '愛',       'サトウ',     'アイ',      2,  '1972-02-18', 'S210', '1992-04-01', '2019-03-31'),
('E0006', '岡本',  '美智子', 'オカモト',   'ミチコ',    2,  '2000-06-20', 'S000', '2020-04-01', '2020-04-01'),
('E0007', '太田',  '豊',       'オオタ',     'ユタカ',    1,  '1992-07-30', 'S230', '2002-04-01', '2010-04-10'),
('E0008', '渡辺',  '浩志',    'ワタナベ',   'ヒロシ',    1,  '1988-10-20', 'S110', '2008-04-01', '2015-04-02');

/* 資格マスタ作成 */
CREATE TABLE m_license (
    license_code  CHAR(5)  NOT NULL PRIMARY KEY,  /* 資格コード */
    license_name  VARCHAR(100)  NOT NULL  UNIQUE  /* 資格名 */
);

/* 資格マスタINSERT */
INSERT INTO m_license VALUES
('L0001', 'ITパスポート'),
('L0101', '基本情報'),
('L0102', '応用情報'),
('L0301', 'Oracle Master Bronze'),
('L0302', 'Oracle Master Silver'),
('L0303', 'Oracle Master Gold');

/* 保有資格テーブル作成 */
CREATE TABLE t_get_license (
    license_code  CHAR(5),
    employee_code  CHAR(5),
    get_license_date DATE,
    PRIMARY KEY(license_code, employee_code),
    FOREIGN KEY(license_code) REFERENCES m_license(license_code),
    FOREIGN KEY(employee_code) REFERENCES m_employee(employee_code)
);

/* 保有資格テーブルINSERT */
INSERT INTO t_get_license VALUES
('L0101', 'E0003', '2000-05-20'),
('L0303', 'E0004', '2001-07-01'),
('L0301', 'E0005', '2003-04-12'),
('L0302', 'E0005', '2005-08-17'),
('L0102', 'E0003', '2006-11-23'),
('L0001', 'E0007', '2007-12-29'),
('L0001', 'E0002', '2010-02-07'),
('L0001', 'E0001', '2011-09-15'),
('L0101', 'E0007', '2013-07-12'),
('L0303', 'E0005', '2015-07-12');

COMMIT;

/* 確認 */
SELECT * FROM m_employee;
SELECT * FROM m_license;
SELECT * FROM m_section;
SELECT * FROM m_user;
SELECT * FROM t_get_license;