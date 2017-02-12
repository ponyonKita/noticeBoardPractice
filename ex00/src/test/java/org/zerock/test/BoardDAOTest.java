package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardDAOTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("���ο� ���� �ֽ��ϴ�. ");
		board.setContent("���ο� ���� �ֽ��ϴ�. ");
		board.setWritter("user00");
		//dao.create(vo);
		
	}
	
	@Test
	public void testRead() throws Exception{
		//logger.info(dao.read(1).toString())
	}
	
	@Test
	public void testUpdate() throws Exception{
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("������ ���Դϴ�.");
		board.setContent("���� �׽�Ʈ");
		//dao.update(vo);
	}
	
	
	@Test
	public void testDelete() throws Exception{
		dao.delete(1);
	}
}
