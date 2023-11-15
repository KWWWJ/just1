create table users(
	"id" number generated as identity primary key,
	"name" varchar2(30) not null,
	"user_id" varchar2(50)not null,
	"password" varchar2(64) not null,
	"created_at" timestamp default sysdate
);