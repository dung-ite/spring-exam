-- Project Name : WEDDING FLOWER WEB
-- Date/Time    : 2023/09/24 22:07:13
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

-- CUSTOMERS_CARD
-- * RestoreFromTempTable
create table NEW_ENTITY5 (
  CUSTOMERS_ID 
  , CUSTOMER_CARD_ID 
  , CARD_COMPANY_ID 
  , CARD_NUMBER 
  , EXPIRE_YEAR 
  , EXPIRE_MONTH 
) ;

-- CATEGORY
-- * RestoreFromTempTable
create table NEW_ENTITY4 (
  CATEGORY_ID 
  , CATEGORY_NAME 
) ;

-- ORDER_HEADER
-- * RestoreFromTempTable
create table NEW_ENTITY3 (
  ORDER_NO 
  , ORDER_DATETIME 
  , MEMBER_ID 
  , PAYMENT_TYPE 
  , ORDER_ADDRESS 
  , DELIVERY_DATE 
) ;

-- CUSTOMERS
-- * RestoreFromTempTable
create table NEW_ENTITY2 (
  CUSTOMERS_ID 
  , PASSWORD 
  , LAST_NAME 
  , FIRST_NAME 
  , POST_CODE 
  , ADDRESS 
  , TEL_NO 
  , MAIL_ADDRESS 
  , REGIST_DATETIME 
) ;

-- ORDER_DETAIL
-- * RestoreFromTempTable
create table NEW_ENTITY1 (
  ORDER_NO 
  , FLOWER_ID 
  , FLOWER_NUM 
) ;

-- WEDDING FLOWER
-- * RestoreFromTempTable
create table "WEDDING FLOWER" (
  FLOWER_ID 1
  , FLOWER_NAME HAPPY
  , CATEGORY_ID B1
  , PRICE 5000
  , COLOR WHITE
) ;

comment on table NEW_ENTITY5 is 'CUSTOMERS_CARD';
comment on column NEW_ENTITY5.CUSTOMERS_ID is 'CUSTOMERS_ID';
comment on column NEW_ENTITY5.CUSTOMER_CARD_ID is 'CUSTOMER_CARD_ID';
comment on column NEW_ENTITY5.CARD_COMPANY_ID is 'CARD_COMPANY_ID';
comment on column NEW_ENTITY5.CARD_NUMBER is 'CARD_NUMBER';
comment on column NEW_ENTITY5.EXPIRE_YEAR is 'EXPIRE_YEAR';
comment on column NEW_ENTITY5.EXPIRE_MONTH is 'EXPIRE_MONTH';

comment on table NEW_ENTITY4 is 'CATEGORY';
comment on column NEW_ENTITY4.CATEGORY_ID is 'CATEGORY_ID';
comment on column NEW_ENTITY4.CATEGORY_NAME is 'CATEGORY_NAME';

comment on table NEW_ENTITY3 is 'ORDER_HEADER';
comment on column NEW_ENTITY3.ORDER_NO is 'ORDER_NO';
comment on column NEW_ENTITY3.ORDER_DATETIME is 'ORDER_DATETIME';
comment on column NEW_ENTITY3.MEMBER_ID is 'MEMBER_ID';
comment on column NEW_ENTITY3.PAYMENT_TYPE is 'PAYMENT_TYPE';
comment on column NEW_ENTITY3.ORDER_ADDRESS is 'ORDER_ADDRESS';
comment on column NEW_ENTITY3.DELIVERY_DATE is 'DELIVERY_DATE';

comment on table NEW_ENTITY2 is 'CUSTOMERS';
comment on column NEW_ENTITY2.CUSTOMERS_ID is 'CUSTOMERS_ID';
comment on column NEW_ENTITY2.PASSWORD is 'PASSWORD';
comment on column NEW_ENTITY2.LAST_NAME is 'LAST_NAME';
comment on column NEW_ENTITY2.FIRST_NAME is 'FIRST_NAME';
comment on column NEW_ENTITY2.POST_CODE is 'POST_CODE';
comment on column NEW_ENTITY2.ADDRESS is 'ADDRESS';
comment on column NEW_ENTITY2.TEL_NO is 'TEL_NO';
comment on column NEW_ENTITY2.MAIL_ADDRESS is 'MAIL_ADDRESS';
comment on column NEW_ENTITY2.REGIST_DATETIME is 'REGIST_DATETIME';

comment on table NEW_ENTITY1 is 'ORDER_DETAIL';
comment on column NEW_ENTITY1.ORDER_NO is 'ORDER_NO';
comment on column NEW_ENTITY1.FLOWER_ID is 'FLOWER_ID';
comment on column NEW_ENTITY1.FLOWER_NUM is 'FLOWER_NUM';

comment on table "WEDDING FLOWER" is 'WEDDING FLOWER';
comment on column "WEDDING FLOWER".FLOWER_ID is 'FLOWER_ID';
comment on column "WEDDING FLOWER".FLOWER_NAME is 'FLOWER_NAME';
comment on column "WEDDING FLOWER".CATEGORY_ID is 'CATEGORY_ID';
comment on column "WEDDING FLOWER".PRICE is 'PRICE';
comment on column "WEDDING FLOWER".COLOR is 'COLOR';

