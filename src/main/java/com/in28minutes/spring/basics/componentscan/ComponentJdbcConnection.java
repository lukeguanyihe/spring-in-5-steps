package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component

// new request, create a new JDBC connection
// dependency is a prototype. The bean PersonDAO using it is not a prototype, use proxy
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {
	
	@Autowired
	public ComponentJdbcConnection() {
		System.out.println("JDBC connection");
	}
}
