package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardDAO {
	
	public void create(BoardDAO vo)throws Exception;
	public BoardDAO read(Integer bno)throws Exception;
	public void update(BoardDAO vo)throws Exception;
	public void delete(Integer bno)throws Exception;
	public List<BoardDAO> listAll()throws Exception;

}
