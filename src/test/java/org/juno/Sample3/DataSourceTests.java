package org.juno.Sample3;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.juno.Sample3.Service.BoardService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class DataSourceTests {

	@Setter
	private DataSource dataSource;

	@Inject
	private BoardService service;
	
	@Test
	public void testConnection() {

		try (Connection conn = dataSource.getConnection()) {

			log.info(conn);

		} catch (Exception e) {

		}
	}
	
	@Test
	public void testList() {
		
		service.list();
		
	}

}
