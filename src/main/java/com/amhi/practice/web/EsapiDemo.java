package com.amhi.practice.web;

import com.amhi.practice.exception.EntityNotFoundException;
import com.amhi.practice.model.Users;
import org.owasp.esapi.ESAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

@RestController
@RequestMapping("/esapi")
public class EsapiDemo {
    @GetMapping
    public Object demo() throws EntityNotFoundException {
        Locale locale = new Locale("en", "EN");
        DateFormat format = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String context= "Date Validation";
        System.out.println(System.getProperty("org.owasp.esapi.resources"));
        boolean allowNull=false;
        System.out.println(ESAPI.validator().isValidDate(context,"12-31-2019",simpleDateFormat,false));
        return null;
    }
}
