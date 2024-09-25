create table announcement
(
    announcement_id int auto_increment primary key, -- 공지사항 번호
    sender          bigint,                         -- 보낸 사람
    receiver_group  varchar(10),                    -- 받는 그룹
    subject         varchar(100),                   -- 제목
    content         varchar(2500),                  -- 내용
    sent_at         timestamp default now()         -- 작성 시간
);
