package org.juno.Sample3.DAO;

import java.util.List;

import org.juno.Sample3.Domain.BoardVO;

public interface BoardDAO {

//	insert
	void insert(BoardVO vo);
	
//	select
	List<BoardVO> list();

//	update
	void update(BoardVO vo);



}
