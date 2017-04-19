use hr;
set autocommit=0;
select @@autocommit;

create table order_item (
	order_no	int,
    item_no		varchar(50),
    amount		int,
    reg_date	timestamp default now()
);

desc order_item;

insert into order_item(order_no, item_no, amount)
values(1111, 'TV-001', 10);

select * from order_item;

# autocommit을 0으로 해놓고 Insert했기 때문에 여기서는 보이지만, 실제로 데이터는 insert되지 않았다.(commit해줘야 반영됨) ㅡ> 트랜잭션
commit;
## false로 해도 0으로 세팅됨
set autocommit=false;
select @@autocommit;

update order_item
set amount=500
where order_no=1111;

alter table order_item
add primary key(order_no);

# 다른 쪽에서 update하고 있어서 그 쪽에 락이 걸려있는데, 이게 락이 풀릴 때까지 대기상태가 됨 (autocommit이 아닐 경우)4
# commit을 하면 됨
commit;

select * from order_item;

# show engines; ㅡ> Engine ㅡ. 파일을 기록하는 스토리지에 대한 것
#			ㅡ> InnoDB ㅡ> 트랜잭션을 지원하고, row-level을 락킹하는 역할
# ProgramData ㅡ> mysql Server 폴더 ㅡ> Data폴더에 로그들이 남겨짐
# .err 파일을 열어보면 로그가 나온다.

# 트랜잭션
# Atomicity ㅡ> 한계좌에서 다른계좌로 입금하는 것, 계좌이체에 비유
# Consistency ㅡ> 인출 전 금액과 인출 후 금액이 같은 것을 말함
# isolation ㅡ> 인출하는 동안은 다른 작업들이 잔액을 변경하면 안 되는 것
# Durability ㅡ>한쪽에서 인출하고 다른 쪽에 입금 중 시스템이 다운되면, 로그를 남기는데
# 다시 켜지게 되면 로그를 확인하고 인출 중 다운된 기록이 남겨진 로그를 보고 인출을 취소하는 역할

##################### 매우 중요합니다
##################### Index (인덱스) ㅡ> 인덱스가 있고 없고가 쿼리의 성능을 결정함
# index ㅡ> 오버헤드가 있다. 있는 것은 도움이 되는데, 관리가 되기 위해 유지비용이 발생하는 개념

create table item(
	item_no 	varchar(50) primary key,
    item_name 	varchar(50),
    price		int
);
# order_item에 대해서 index가 뭐가 있는지?
show indexes from order_item;
show indexes from item;
# 1개가 있는데 Primary key를 부여하면 무조건 index가 1개 만들어진다.
# ↓ mysql에서 index가 만들어지는 것을 느끼는 과정
alter table order_item
add foreign key(item_no) references item(item_no);
# ↑ 외래키가 생성되면서 index가 1개 더 자동으로 생성됨

## 인덱스 강제로 생성 ㅡ> 인덱스이름 : 통상 테이블명/컬럼명/idx 로 많이 만듬
create index item_name_idx on item(item_name);

## auto_increment : Oracle의 시퀀스역할 (기본키의 자동증가)
## view : 테이블은 아니며, 복잡한 질의(쿼리문)을 숨기고 쿼리문장을 단순화해서 쓰고자할 때4
##		: 보안을 강화하기 위해 사용(테이블의 일정한 컬럼들을 숨길 수 있다.)
##			예를 들어 인사고과에서 직원에 대한 정보가 있는데, 인사고과 결과가 아무나 조회되면 곤란하니까
##			뷰로 만들어서 그 결과값들에 대한 컬럼은 뷰에 담아두지 않게 사용
##		EX) 쿼리를 뷰로 만든다.

    
    ## 뷰 생성과정
    CREATE VIEW LOC_DETAILS AS
	select region_id, country_id, location_id, region_name, country_name, street_address, postal_code, city, state_province
    from locations l
    join Countries using(country_id)
    join Regions using(region_id)
    order by regions_id asc;
    
    DROP VIEW LOC_DETAILS;
	
    select * from LOC_DETAILS;
    
set autocommit=1;
commit;
