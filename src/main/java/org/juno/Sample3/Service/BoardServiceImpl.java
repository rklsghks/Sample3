package org.juno.Sample3.Service;

import java.util.List;

import org.juno.Sample3.DAO.BoardDAO;
import org.juno.Sample3.Domain.BoardVO;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

	private BoardDAO dao;
	
//	insert
	@Override
	public void insert(BoardVO vo) {
		
		dao.insert(vo);
	}
	
//	select
	@Override
	public List<BoardVO> list() {
		 
		return dao.list();
	}
	
	@Override
	public BoardVO read(int boardNo) {
		 
		return dao.read(boardNo);
	}
	
	@Override
	public List<BoardVO> search(BoardVO vo) {
		 
		return dao.search(vo);
	}
	
//	update
	@Override
	public void update(BoardVO vo) {
		 
		dao.update(vo);
	}

//	delete
	@Override
	public void delete(int boardNo) {
		
		dao.delete(boardNo);
	}






}
