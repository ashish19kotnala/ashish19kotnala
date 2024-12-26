package com.ash.karo.devparadise.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.TYPE_USE })
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidEmail {
 String message() default "{email.invalid}";

 Class<?>[] groups() default {};

 Class<? extends Payload>[] payload() default {};
}
