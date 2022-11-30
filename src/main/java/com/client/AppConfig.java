package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.model.FixedAccount;
import com.service.BankService;
@Component
@ComponentScan("com")
@EnableAspectJAutoProxy

public class AppConfig {
	
	
}
