package br.com.bb.seguranca.apirestbdmultiple.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import br.com.bb.seguranca.apirestbdmultiple.repository.auth.UsuarioRepository;

@Configuration
@EnableJpaRepositories(
		basePackageClasses = UsuarioRepository.class,
		entityManagerFactoryRef = "authEntityManager")
public class AuthDbConfig {
	
	@Bean
	@ConfigurationProperties(prefix = "auth.datasource")
	public DataSource authDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean authEntityManager(
			EntityManagerFactoryBuilder builder, 
			@Qualifier("authDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource)
				.packages("br.com.bb.seguranca.apirestbdmultiple.model.auth")
				.build();
	}
}
