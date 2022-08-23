create table tb_mybatis_test (id int primary key auto_increment, name varchar(255));
insert into tb_mybatis_test (name) values ('name1');
insert into tb_mybatis_test (name) values ('name2');
insert into tb_mybatis_test (name) values ('name3');
insert into tb_mybatis_test (name) values ('name4');
insert into tb_mybatis_test (name) values ('name5');


create table tb_org(id int primary key auto_increment, org_name varchar(50), horg_id int);
insert into tb_org(org_name, horg_id) values ('1st ORG', NULL);
insert into tb_org(org_name, horg_id) values ('2nd ORG', 1);
insert into tb_org(org_name, horg_id) values ('3rd ORG', 1);
insert into tb_org(org_name, horg_id) values ('4th ORG', 2);
insert into tb_org(org_name, horg_id) values ('5th ORG', 4);


create table tb_user(id int primary key auto_increment, name varchar(20), org_id int);
insert into tb_user(name, org_id) values ('kim', 1);
insert into tb_user(name, org_id) values ('lee', 1);
insert into tb_user(name, org_id) values ('park', 2);
insert into tb_user(name, org_id) values ('cho', 3);
insert into tb_user(name, org_id) values ('choi', 4);
insert into tb_user(name, org_id) values ('moon', 2);
insert into tb_user(name, org_id) values ('lim', 3);
insert into tb_user(name, org_id) values ('im', 3);
insert into tb_user(name, org_id) values ('jaegal', 4);