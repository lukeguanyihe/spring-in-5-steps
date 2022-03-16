package com.in28minutes.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component

// new request, create a new JDBC connection
// dependency is a prototype. The bean PersonDAO using it is not a prototype, use proxy
public class XmlJdbcConnection {
	
	public XmlJdbcConnection() {
		System.out.println("JDBC connection");
	}
}
