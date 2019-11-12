package com.amhi.practice.customvalidator;

import org.owasp.esapi.ESAPI;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator implements ConstraintValidator<DateValidatorConstraint, Date> {
    @Override
    public void initialize(DateValidatorConstraint constraintAnnotation) {

    }
    @Override
    public boolean isValid(Date date, ConstraintValidatorContext constraintValidatorContext) {
        try {
            String pattern = "MM-dd-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String context= "Date Validation";
            String dateStr = simpleDateFormat.format(date);
            return ESAPI.validator().isValidDate(context,dateStr,simpleDateFormat,false);
        } catch (Exception e){
          return false;
        }

    }
}
