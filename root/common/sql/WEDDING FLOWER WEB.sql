-- Project Name : WEDDING FLOWER WEB
-- Date/Time    : 2023/11/02 22:22:25
-- Author       : khanh
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- 決済
-- * RestoreFromTempTable
create table PAYMENT (
  PAYMENT_ID serial
  , PAYMENT_METHOD character varying(20)
  , CUSTOMERS_ID serial not null
  , CUSTOMER_CARD_ID integer
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint PAYMENT_PKC primary key (PAYMENT_ID)
) ;

-- 在庫
-- * RestoreFromTempTable
create table STOCK (
  FLOWER_ID serial
  , STOCK_QUANTITY integer
  , STOCK_STATUS character varying(20)
  , COST_PRICE integer
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint STOCK_PKC primary key (FLOWER_ID)
) ;

-- 顧客カード
-- * RestoreFromTempTable
create table CUSTOMERS_CARD (
  CUSTOMERS_ID serial
  , CUSTOMER_CARD_ID varchar(10)
  , CARD_COMPANY_ID varchar(10)
  , CARD_NUMBER integer
  , EXPIRE_YEAR varchar(2)
  , EXPIRE_MONTH varchar(2)
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint CUSTOMERS_CARD_PKC primary key (CUSTOMERS_ID,CUSTOMER_CARD_ID)
) ;

-- コレクション
-- * RestoreFromTempTable
create table COLLECTION (
  COLLECTION_ID serial
  , COLLECTION_NAME character varying(50)
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint COLLECTION_PKC primary key (COLLECTION_ID)
) ;

-- 注文
-- * RestoreFromTempTable
create table ORDER_HEADER (
  ORDER_NO serial
  , ORDER_DATETIME date
  , CUSTOMER_ID varchar(10)
  , PAYMENT_METHOD char(2)
  , ORDER_ADDRESS character varying(200)
  , DELIVERY_DATE date
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint ORDER_HEADER_PKC primary key (ORDER_NO)
) ;

-- 顧客
-- * RestoreFromTempTable
create table CUSTOMERS (
  CUSTOMERS_ID serial
  , PASSWORD integer
  , LAST_NAME character varying(50)
  , FIRST_NAME character varying(50)
  , POST_CODE integer
  , ADDRESS character varying(50)
  , TEL_NO integer
  , MAIL_ADDRESS character varying(50)
  , REGIST_DATETIME date
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint CUSTOMERS_PKC primary key (CUSTOMERS_ID)
) ;

-- 注文詳細
-- * RestoreFromTempTable
create table ORDER_DETAIL (
  ORDER_DETAIL_NO serial
  , ORDER_NO serial
  , FLOWER_ID serial
  , FLOWER_NUM integer
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint ORDER_DETAIL_PKC primary key (ORDER_DETAIL_NO,ORDER_NO)
) ;

-- ブライダルフラワー
-- * RestoreFromTempTable
create table "WEDDING FLOWER" (
  FLOWER_ID serial
  , FLOWER_NAME character varying(50)
  , COLLECTION_ID integer
  , PRICE integer
  , COLOR character varying(50)
  , created_at timestamp(6) without time zone
  , update_at timestamp(6) without time zone
  , constraint "WEDDING FLOWER_PKC" primary key (FLOWER_ID)
) ;

comment on table PAYMENT is '決済';
comment on column PAYMENT.PAYMENT_ID is '決済ID';
comment on column PAYMENT.PAYMENT_METHOD is '決済方法';
comment on column PAYMENT.CUSTOMERS_ID is '顧客ID';
comment on column PAYMENT.CUSTOMER_CARD_ID is '顧客クレジットカードID';
comment on column PAYMENT.created_at is 'created_at';
comment on column PAYMENT.update_at is 'update_at';

comment on table STOCK is '在庫';
comment on column STOCK.FLOWER_ID is 'フラワーID';
comment on column STOCK.STOCK_QUANTITY is '在庫数';
comment on column STOCK.STOCK_STATUS is 'ステータス';
comment on column STOCK.COST_PRICE is '原価';
comment on column STOCK.created_at is 'created_at';
comment on column STOCK.update_at is 'update_at';

comment on table CUSTOMERS_CARD is '顧客カード';
comment on column CUSTOMERS_CARD.CUSTOMERS_ID is '顧客ID';
comment on column CUSTOMERS_CARD.CUSTOMER_CARD_ID is '顧客カードID';
comment on column CUSTOMERS_CARD.CARD_COMPANY_ID is 'カード会社ID';
comment on column CUSTOMERS_CARD.CARD_NUMBER is 'カード番号';
comment on column CUSTOMERS_CARD.EXPIRE_YEAR is '有効期限年';
comment on column CUSTOMERS_CARD.EXPIRE_MONTH is '有効期限月';
comment on column CUSTOMERS_CARD.created_at is 'created_at';
comment on column CUSTOMERS_CARD.update_at is 'update_at';

comment on table COLLECTION is 'コレクション';
comment on column COLLECTION.COLLECTION_ID is 'コレクションID';
comment on column COLLECTION.COLLECTION_NAME is 'コレクション名';
comment on column COLLECTION.created_at is 'created_at';
comment on column COLLECTION.update_at is 'update_at';

comment on table ORDER_HEADER is '注文';
comment on column ORDER_HEADER.ORDER_NO is '注文番号';
comment on column ORDER_HEADER.ORDER_DATETIME is '注文日時';
comment on column ORDER_HEADER.CUSTOMER_ID is '顧客ID';
comment on column ORDER_HEADER.PAYMENT_METHOD is '決済方法';
comment on column ORDER_HEADER.ORDER_ADDRESS is 'オーダーアドレス';
comment on column ORDER_HEADER.DELIVERY_DATE is 'お届け日';
comment on column ORDER_HEADER.created_at is 'created_at';
comment on column ORDER_HEADER.update_at is 'update_at';

comment on table CUSTOMERS is '顧客';
comment on column CUSTOMERS.CUSTOMERS_ID is '顧客ID';
comment on column CUSTOMERS.PASSWORD is 'パスワード';
comment on column CUSTOMERS.LAST_NAME is '氏';
comment on column CUSTOMERS.FIRST_NAME is '名';
comment on column CUSTOMERS.POST_CODE is '郵便番号';
comment on column CUSTOMERS.ADDRESS is 'アドレス';
comment on column CUSTOMERS.TEL_NO is '電話番号';
comment on column CUSTOMERS.MAIL_ADDRESS is 'メールアドレス';
comment on column CUSTOMERS.REGIST_DATETIME is '登録日時';
comment on column CUSTOMERS.created_at is 'created_at';
comment on column CUSTOMERS.update_at is 'update_at';

comment on table ORDER_DETAIL is '注文詳細';
comment on column ORDER_DETAIL.ORDER_DETAIL_NO is '注文詳細番号';
comment on column ORDER_DETAIL.ORDER_NO is '注文番号';
comment on column ORDER_DETAIL.FLOWER_ID is 'フラワーID';
comment on column ORDER_DETAIL.FLOWER_NUM is 'フラワー数';
comment on column ORDER_DETAIL.created_at is 'created_at';
comment on column ORDER_DETAIL.update_at is 'update_at';

comment on table "WEDDING FLOWER" is 'ブライダルフラワー';
comment on column "WEDDING FLOWER".FLOWER_ID is 'ブライダルフラワーID';
comment on column "WEDDING FLOWER".FLOWER_NAME is 'ブライダルフラワー名';
comment on column "WEDDING FLOWER".COLLECTION_ID is 'コレクションID';
comment on column "WEDDING FLOWER".PRICE is '単価';
comment on column "WEDDING FLOWER".COLOR is 'カラー';
comment on column "WEDDING FLOWER".created_at is 'created_at';
comment on column "WEDDING FLOWER".update_at is 'update_at';

