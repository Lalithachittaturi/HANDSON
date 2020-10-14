package org.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfig {
	@Bean(name="o")
	public Owner setDetails() {
		Owner o=new Owner();
		o.setName("Adithya");
		o.setPassword("adhitya@1234");
		o.setMobileNumber("1236542583");		
		return o;
		
	}

}
