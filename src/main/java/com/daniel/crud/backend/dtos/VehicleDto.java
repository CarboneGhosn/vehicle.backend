package com.daniel.crud.backend.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;



@NoArgsConstructor
@Builder
@Data
@Getter
@Setter

public class VehicleDto {

    private Long id;
    @NotNull
    private String brand;
    @NotNull
    private String model;
    @NotNull
    private String color;
    private int year;

    public VehicleDto(Long id, String brand, String model, String color, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }




        public Long getId() {
            return id;
        }
}
