package com.example.project.core.exception.constrain.impl;

import com.example.project.core.exception.constrain.annotation.NotNullConstrain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullConstrainValidator implements ConstraintValidator<NotNullConstrain, Object[]> {
    @Override
    public void initialize(NotNullConstrain constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Object[] objects, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
