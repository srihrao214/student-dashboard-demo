INSERT INTO teacher (id, name, subject) VALUES (1, 'Dr. Smith', 'Math');
INSERT INTO teacher (id, name, subject) VALUES (2, 'Prof. Müller', 'Science');
INSERT INTO teacher (id, name, subject) VALUES (3, 'Ms. Schneider', 'English');
INSERT INTO teacher (id, name, subject) VALUES (4, 'Mr. Brown', 'History');
INSERT INTO teacher (id, name, subject) VALUES (5, 'Dr. Taylor', 'Physics');

ALTER TABLE teacher ALTER COLUMN id RESTART WITH 6;

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (1, 'MONDAY', '09:00', '10:00', 'Math', 1);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (2, 'TUESDAY', '10:00', '11:00', 'Science', 2);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (3, 'WEDNESDAY', '11:00', '12:00', 'English', 3);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (4, 'THURSDAY', '08:00', '09:00', 'History', 4);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (5, 'FRIDAY', '13:00', '14:00', 'Physics', 5);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (6, 'MONDAY', '14:00', '15:00', 'Science', 2);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (7, 'TUESDAY', '09:00', '10:00', 'Math', 1);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (8, 'WEDNESDAY', '15:00', '16:00', 'English', 3);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (9, 'THURSDAY', '10:00', '11:00', 'Physics', 5);

INSERT INTO lecture (id, day_of_week, start_time, end_time, subject, teacher_id)
VALUES (10, 'FRIDAY', '11:00', '12:00', 'History', 4);

ALTER TABLE lecture ALTER COLUMN id RESTART WITH 11;

INSERT INTO student (name, email) VALUES ('John', 'john@test.com');
INSERT INTO student (name, email) VALUES ('Anna', 'anna@test.com');
INSERT INTO student (name, email) VALUES ('David', 'david@test.com');
INSERT INTO student (name, email) VALUES ('Lisa', 'lisa@test.com');
INSERT INTO student (name, email) VALUES ('Michael', 'michael@test.com');
INSERT INTO student (name, email) VALUES ('Sophia', 'sophia@test.com');
INSERT INTO student (name, email) VALUES ('Daniel', 'daniel@test.com');
INSERT INTO student (name, email) VALUES ('Emma', 'emma@test.com');
INSERT INTO student (name, email) VALUES ('Chris', 'chris@test.com');
INSERT INTO student (name, email) VALUES ('Olivia', 'olivia@test.com');
ALTER TABLE student ALTER COLUMN id RESTART WITH 11;


INSERT INTO exam (id, subject, date, result, student_id)
VALUES (1, 'Math', '2026-06-10', 'PASS', 1);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (2, 'Science', '2026-06-12', 'FAIL', 2);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (3, 'English', '2026-06-15', 'PASS', 3);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (4, 'Physics', '2026-06-18', 'PENDING', 4);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (5, 'History', '2026-06-20', 'PASS', 5);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (6, 'Math', '2026-06-22', 'PASS', 6);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (7, 'Science', '2026-06-25', 'FAIL', 7);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (8, 'English', '2026-06-27', 'PASS', 8);

INSERT INTO exam (id, subject, date, result, student_id)
VALUES (9, 'Physics', '2026-06-28', 'PENDING', 9);

INSERT INTO exam (id, subject, date, result, student_id)

VALUES (10, 'History', '2026-06-30', 'PASS', 10);
ALTER TABLE exam ALTER COLUMN id RESTART WITH 11;
