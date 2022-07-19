package com.example.project.core.exception.constrain.annotation;

import com.example.project.core.exception.constrain.impl.EmailConstrainValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = EmailConstrainValidator.class)
@Target({ FIELD})
@Retention(RUNTIME)
@Documented
public @interface EmailConstrain {
    String message() default
            "End date must be after begin date and both must be in the future";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

