package com.example.incorrect;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@RestController
@RequestMapping(produces = {APPLICATION_JSON_VALUE})
public @interface JsonRestController {

  @AliasFor(annotation = RequestMapping.class, attribute = "value")
  String[] value() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "params")
  String[] params() default {};

  @AliasFor(annotation = RequestMapping.class, attribute = "headers")
  String[] headers() default {};
}
