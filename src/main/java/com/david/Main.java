package com.david;

import com.david.customer.Customer;
import com.david.customer.CustomerController;
import com.david.customer.CustomerDataAccessService;
import com.david.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main     {
	public static void main(String[] args) {
		/*
		CustomerService customerService = new CustomerService(new CustomerDataAccessService());
		CustomerController customerController = new CustomerController(customerService);
		 */
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(Main.class, args);

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}

}
