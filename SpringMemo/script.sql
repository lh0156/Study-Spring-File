-- SpringMemo > "script.sql"

drop table tblMemo;
drop sequence seqMemo;

-- 메모장
create table tblMemo (
    seq number primary key,                 --PK
    name varchar2(30) not null,             --이름
    memo varchar2(300) not null,            --내용
    regdate date default sysdate not null   --작성시간
);

create sequence seqMemo;

select * from tblMemo;

insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', '메모입니다.', default);
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '아무개', '스프링 설정 정리하기', default);
insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, '홍길동', 'STS 오류 잡고 세팅하기', default);

update tblMemo set name = '홍길동', memo = '메모입니다.' where seq = 1;

delete from tblMemo where seq = 1;

commit;














