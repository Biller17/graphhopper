package com.graphhopper.routing.ev;

import com.graphhopper.util.Helper;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Stores temporary so-called conditional restrictions from access:conditional and other conditional
 * tags affecting cars and motor vehicles.
 */
public class CarConditionalRestriction {

    public static final Collection<String> CONDITIONALS = new HashSet<>(Arrays.asList("access:conditional",
            "vehicle:conditional", "motor_vehicle:conditional", "motorcar:conditional"));
    public static final String KEY = "car_conditional_restriction";

    public static BooleanEncodedValue create() {
        return new SimpleBooleanEncodedValue(KEY, true);
    }

    @Override
    public String toString() {
        return Helper.toLowerCase(super.toString());
    }
}
