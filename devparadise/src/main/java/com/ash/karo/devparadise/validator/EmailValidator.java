package com.ash.karo.devparadise.validator;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidator;

import jakarta.validation.ConstraintValidatorContext;


public class EmailValidator implements HibernateConstraintValidator<ValidEmail, String> {
	 private String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	 + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	 @Override
	 public boolean isValid(String email, ConstraintValidatorContext context) {
	 if (StringUtils.isBlank(email))
	 return true;

	 Pattern pat = Pattern.compile(regex);
	 return pat.matcher(email).matches();
	 }

	}