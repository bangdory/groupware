create table email
(
    email_id      int auto_increment primary key, -- 메일 번호
    sender        bigint,                         -- 보낸 사람
    sender_mail   varchar(50),                    -- 보내는 사람 메일
    receiver      bigint,                         -- 받는 사람
    receiver_mail varchar(50),                    -- 받는 사람 메일
    subject       varchar(100),                   -- 제목
    content       varchar(2500),                  -- 내용
    sent_at       timestamp default now(),        -- 작성 시간
    FOREIGN KEY (sender) REFERENCES employee (emp_no),
    FOREIGN KEY (receiver) REFERENCES employee (emp_no),
    FOREIGN KEY (sender_mail) REFERENCES employee (emp_email),
    FOREIGN KEY (receiver_mail) REFERENCES employee (emp_email)
);