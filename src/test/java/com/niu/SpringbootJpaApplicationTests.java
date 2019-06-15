package com.niu;

import com.niu.dao.BookDao;
import com.niu.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJpaApplicationTests {

	@Autowired
	BookDao bookDao;

	@Test
	public void contextLoads() {
		List<Book> all = bookDao.findAll();
		System.out.println(all);
		List<Book> booksByIdAndName = bookDao.getBooksByIdAndName("三", 10L);
		System.out.println(booksByIdAndName);
	}

}
