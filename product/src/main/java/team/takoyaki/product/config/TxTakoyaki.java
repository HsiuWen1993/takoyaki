package team.takoyaki.product.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "transactionManager", basePackages = {
// "team.takoyaki.product.dao" })
public class TxTakoyaki {
	// @Primary
	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	// @Primary
	// @Bean(name = "entityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
//			@Qualifier("dataSource") DataSource dataSource) {
//		return builder.dataSource(dataSource).packages("team.takoyaki.product.dao").persistenceUnit("member").build();
//	}

	// @Primary
	// @Bean(name = "transactionManager")
//	public PlatformTransactionManager transactionManager(
//			@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory) {
//		return new JpaTransactionManager(entityManagerFactory);
//	}
}
