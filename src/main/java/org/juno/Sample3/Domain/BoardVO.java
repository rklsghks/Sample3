package org.juno.Sample3.Domain;

import java.util.Date;
import lombok.Data;

@Data
public class BoardVO {

//	DB에 저장된 형식
//	board_no	INT				NOT NULL PRIMARY KEY,
//	name		VARCHAR2(100)	NOT NULL,
//	pw			VARCHAR2(100),
//	title		VARCHAR2(100)	NOT NULL,
//	content		VARCHAR2(1000)	NOT NULL,
//	reg_date	DATE			DEFAULT SYSDATE,
//	update_date	DATE			DEFAULT SYSDATE,
//	recommend	INT				DEFAULT 0,
//	file_name	VARCHAR2(100)

	private int boardNo;
	private String name;
	private String pw;
	private String title;
	private String content;
//	LocalDateTime을 사용하니 mapUnderscoreToCamelCase와 충돌하는듯, 에러 발생
//	private LocalDateTime regDate;
//	private LocalDateTime updateDate;
	private Date regDate;
	private Date updateDate;
	private int views;
	private String fileName;
	
}
