package com.example.project.core.exception.constrain.impl;

import com.example.project.core.exception.constrain.annotation.EmailConstrain;
import com.example.project.core.exception.MahmudException;
import lombok.SneakyThrows;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class EmailConstrainValidator implements ConstraintValidator<EmailConstrain, String> {

    @Override
    public void initialize(EmailConstrain constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    @SneakyThrows(MahmudException.class)
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.isNull(s) || !s.contains("@cybernet.az") || !s.contains("."))
            throw new MahmudException("Yalnız cybernet.az domaini keçərlidir!");
        return true;
    }
}
