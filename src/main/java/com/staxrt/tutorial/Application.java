package com.staxrt.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * The type Application.
 *
 * @author Givantha Kalansuriya
 */
@SpringBootApplication
public class Application {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override

	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

	      return builder.sources(Application.class);

	  }

}
