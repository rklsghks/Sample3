package org.juno.Sample3.Service;

import java.util.List;

import org.juno.Sample3.Domain.BoardVO;

public interface BoardService {

//	insert
	void insert(BoardVO vo);
	
//	select
	List<BoardVO> list();

	BoardVO read(int boardNo);
	
	List<BoardVO> search(BoardVO vo);
	
//	update
	void update(BoardVO vo);

//	delete
	void delete(int boardNo);





}
