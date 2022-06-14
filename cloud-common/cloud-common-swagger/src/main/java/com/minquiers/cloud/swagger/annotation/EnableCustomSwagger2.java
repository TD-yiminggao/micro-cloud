package com.minquiers.cloud.swagger.annotation;

import com.minquiers.cloud.swagger.config.SwaggerAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerAutoConfiguration.class, DelegatingWebMvcConfiguration.class})
public @interface EnableCustomSwagger2 {

}
