package org.zerock.test;

import java.sql.Connection;

import javax.activation.DataSource;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/wepapp/WEB-INF/spring/**/*.xml"})

public class DataSourceTest {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		
//		try(Connection con = ds.getConnection()){
//			
//			System.out.println(con);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
		
	}
	

}
