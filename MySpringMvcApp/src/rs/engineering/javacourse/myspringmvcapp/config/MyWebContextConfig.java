package rs.engineering.javacourse.myspringmvcapp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.format.FormatterRegistry;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import rs.engineering.javacourse.myspringmvcapp.formatter.CityDtoFormatter;


//konfigurisanje bean-ova koje koristi dispatcher servlet
//za obradu zahteva
@EnableWebMvc //autormatsko definisanje MapperHandler-a koji na osnovu URL-a poziva odgovarajuci kontroller
@ComponentScan(basePackages = {
		"rs.engineering.javacourse.myspringmvcapp.controller",
		"rs.engineering.javacourse.myspringmvcapp.service",
		"rs.engineering.javacourse.myspringmvcapp.repository"
})
@Configuration
@Import(MyDatabaseConfig.class)
@EnableTransactionManagement
public class MyWebContextConfig implements WebMvcConfigurer{
	public MyWebContextConfig() {
		System.out.println("=================================================================");
		System.out.println("==================== MyWebContextConfig =========================");
		System.out.println("=================================================================");
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		//city home
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
	registry.addFormatter(cityDtoFormatter());
	}
	
	@Bean
	public CityDtoFormatter  cityDtoFormatter() {
		return new CityDtoFormatter();
	}	
	
}
