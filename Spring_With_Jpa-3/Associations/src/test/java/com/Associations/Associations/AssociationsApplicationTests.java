package com.Associations.Associations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.beans.Customizer;
import java.util.HashSet;

@SpringBootTest
class AssociationsApplicationTests {

	@Autowired
	AuthorRepository repository;

	@Test
	public void testCreateAuthor(){
	Author author = new Author();
	author.setName("Abhishek");
	author.setLocation("Dehradun");
	author.setState("Uttarakhand");
	author.setStreet_number("D-43");

	HashSet<books> book = new HashSet<books>();

	books book1 = new books();
	book1.setId(12345);
	book1.setType("home");
	book1.setName("Water bill collection");
	book1.setAuthor(author);
	book.add(book1);

	books book2 = new books();
	book2.setId(123456);
	book2.setType("work");
	book2.setName("WiFi bill collection");
	book2.setAuthor(author);
	book.add(book2);

	author.setBook(book);
	repository.save(author);
	}
}
