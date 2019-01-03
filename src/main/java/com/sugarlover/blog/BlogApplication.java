package com.sugarlover.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description:
 * @author: SGL
 * @date: 14:25 2019/1/3
 *
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}

