package com.prokopovich.smapp.domain.model;

import com.prokopovich.smapp.domain.validator.ValidRange;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@ValidRange
public class Sensor {

    private int id;

    @NotEmpty(message = "Required field Name is not filled")
    @Size(max = 30, message = "Name must not exceed 30 characters")
    private String name;

    @NotEmpty(message = "Required field Model is not filled")
    @Size(max = 15, message = "Model must not exceed 15 characters")
    private String model;

    private int rangeFrom;

    private int rangeTo;

    private SensorType type;

    private Unit unit;

    @Size(max = 40, message = "Location must not exceed 40 characters")
    private String location;

    @Size(max = 200, message = "Description must not exceed 200 characters")
    private String description;
}
