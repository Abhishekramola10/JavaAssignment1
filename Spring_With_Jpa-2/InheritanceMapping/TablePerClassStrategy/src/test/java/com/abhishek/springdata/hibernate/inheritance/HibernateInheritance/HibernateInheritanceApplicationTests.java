package com.abhishek.springdata.hibernate.inheritance.HibernateInheritance;

import com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.entities.Check;
import com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.entities.CreditCard;
import com.abhishek.springdata.hibernate.inheritance.HibernateInheritance.repos.PaymentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HibernateInheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(00232);
		cc.setAmount(100);
		cc.setCardnumber("123456678");
		repository.save(cc);
	}

	@Test
	public void createCheckPayment() {
		Check ch = new Check();
		ch.setId(12344);
		ch.setAmount(1000);
		ch.setChecknumber("1234566789");
		repository.save(ch);
	}
}
