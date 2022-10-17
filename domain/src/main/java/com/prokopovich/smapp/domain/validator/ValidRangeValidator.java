package com.prokopovich.smapp.domain.validator;

import com.prokopovich.smapp.domain.model.Sensor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validate range from and range to
 */
public class ValidRangeValidator  implements ConstraintValidator<ValidRange, Sensor> {

    public boolean isValid(Sensor object, ConstraintValidatorContext context) {

        int rangeFrom = object.getRangeFrom();
        int rangeTo = object.getRangeTo();

        return rangeFrom < rangeTo;
    }
}
