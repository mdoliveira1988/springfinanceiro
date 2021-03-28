package br.com.stark.starkfinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.stark.starkfinanceiro.property.StarkFinanceiroApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(StarkFinanceiroApiProperty.class)
public class StarkfinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarkfinanceiroApplication.class, args);
	}

}
