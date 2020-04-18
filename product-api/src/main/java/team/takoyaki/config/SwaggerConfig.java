package team.takoyaki.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

//@Configuration
//@EnableSwagger2
//@EnableSwaggerBootstrapUI
public class SwaggerConfig {

	@Value(value = "${spring.profiles.active}")
	private String active;

	@Bean
	public Docket createRestApi() {

		ApiSelectorBuilder builder = new Docket(DocumentationType.SWAGGER_2).apiInfo(this.apiInfo()).enable(false)
				.select().paths(PathSelectors.any());

		if (!"prd".startsWith(active)) {
			builder = new Docket(DocumentationType.SWAGGER_2).apiInfo(this.apiInfo()).enable(true).select()
					.paths(PathSelectors.any());
			builder.apis(RequestHandlerSelectors.basePackage("team.takoyaki"));
		}

		return builder.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("粗乃丸章魚燒 API 規格書").description("Api 說明！！！").termsOfServiceUrl("")
				.license("Takoyaki").version("v1").build();
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
