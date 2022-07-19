package com.example.project.core.exception.constrain.annotation;
import com.example.project.core.exception.constrain.impl.NotNullConstrainValidator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = NotNullConstrainValidator.class)
@Target({ METHOD, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
public @interface NotNullConstrain {

}
