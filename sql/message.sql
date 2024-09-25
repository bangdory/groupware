CREATE TABLE message
(
    message_id int AUTO_INCREMENT PRIMARY KEY,
    sender     bigint NOT NULL,
    receiver   bigint NOT NULL,
    content    TEXT   NOT NULL,
    sent_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_read    BOOLEAN   DEFAULT FALSE,
    FOREIGN KEY (sender) REFERENCES employee (emp_no),
    FOREIGN KEY (receiver) REFERENCES employee (emp_no)
);