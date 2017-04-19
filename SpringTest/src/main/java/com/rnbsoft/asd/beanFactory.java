package com.rnbsoft.asd;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class beanFactory {
	public static void main(String[] args) throws InterruptedException {
//		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("bean.xml"));
//		Thread.sleep(2000);
		TestBean t=(TestBean)bf.getBean("testBean");
		Thread.sleep(2000);
		t.print();
//		Thread.sleep(2000);
		TestBean t2=(TestBean)bf.getBean("testBean");
		t2.print();
		
	}
}
