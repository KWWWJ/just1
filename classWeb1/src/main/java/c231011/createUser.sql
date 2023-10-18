create table users (
	id number generated as  primary key,
	name varchar2(20),
	user_id varchar2(50) not null,
	password varchar2(64) not null,
	
)