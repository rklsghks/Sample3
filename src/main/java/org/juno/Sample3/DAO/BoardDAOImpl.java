package org.juno.Sample3.DAO;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.juno.Sample3.Domain.BoardVO;
import org.springframework.stereotype.Repository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class BoardDAOImpl implements BoardDAO {

	private SqlSession sqlSession;
	
	private final String nameSpace = "org.juno.Sample3.Mappers.BoardMapper";
	
//	insert
	@Override
	public void insert(BoardVO vo) {
		 
		sqlSession.insert(nameSpace + ".insert", vo);
	}
	
//	select
	@Override
	public List<BoardVO> list() {
		 	
		return sqlSession.selectList(nameSpace + ".list");
	}
	
	@Override
	public BoardVO read(int boardNo) {
		
		return sqlSession.selectOne(nameSpace + ".read", boardNo);
	}
	
	@Override
	public List<BoardVO> search(BoardVO vo) {
		
		
		 
		return sqlSession.selectList(nameSpace + ".search", vo);
	}

//	update
	@Override
	public void update(BoardVO vo) {
		 
		sqlSession.update(nameSpace + ".update", vo);
	}

//	delete
	@Override
	public void delete(int boardNo) {
		
		sqlSession.delete(nameSpace + ".delete", boardNo);
	}






}
