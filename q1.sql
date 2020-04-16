--1
select name from member where id = (select member_id from checkout_item where book_id = (select id from book where title = "The Hobbit"));
--2
select ((select count(*) from member)-(select count(distinct (member_id)) from checkout_item));
--3
select title from book left join checkout_item on book.id=checkout_item.book_id where book_id is null

union 

select title from movie left join checkout_item on movie.id=checkout_item.movie_id where book_id is null;
--4
insert into book values (11,"The Pargmatic Programmer");

insert into member values (43,"liteng");

insert into checkout_item values(43,11,null);

select name from member where id = (select member_id from checkout_item where book_id = (select id from book where title = "The Pargmatic Programmer"));

--5

select name from member left join (select member_id,count(member_id) as c from checkout_item group by member_id) on member.id=member_id where c > 1;

