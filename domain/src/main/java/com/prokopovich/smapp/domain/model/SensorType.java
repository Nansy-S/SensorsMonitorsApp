package com.prokopovich.smapp.domain.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class SensorType {

    private int id;

    private String typeName;
}
