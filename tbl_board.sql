CREATE TABLE tbl_board (
	boardNo	INT				NOT NULL PRIMARY KEY,
	name		VARCHAR2(100)	NOT NULL,
	pw			VARCHAR2(100),
	title		VARCHAR2(100)	NOT NULL,
	content		VARCHAR2(1000)	NOT NULL,
	regDate	DATE			DEFAULT SYSDATE,
	updateDate	DATE			DEFAULT SYSDATE,
	recommend	INT				DEFAULT 0,
	fileName	VARCHAR2(100)
)

CREATE SEQUENCE seq_board START WITH 1 MINVALUE 1

SELECT * FROM tbl_board

INSERT INTO tbl_board (
	boardNo, name, pw, title, content
) VALUES (
	seq_board.NEXTVAL, 'name01', 'pw01', 'title01', 'content01'
)


DROP TABLE tbl_board

DROP SEQUENCE seq_board