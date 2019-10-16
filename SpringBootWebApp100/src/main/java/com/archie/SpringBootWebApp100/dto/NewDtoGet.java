package com.archie.SpringBootWebApp100.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewDtoGet {
    @JsonProperty("id_id")
    private String id;
    @JsonProperty("name_name")
    private String name;
    @JsonProperty("gos_number")
    private String gosNumber;
    @JsonProperty("car_brand")
    private String carBrand;
    @JsonProperty("position_p")
    private String position;
}
