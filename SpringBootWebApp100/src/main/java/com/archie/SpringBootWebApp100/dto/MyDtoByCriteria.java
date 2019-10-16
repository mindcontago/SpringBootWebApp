package com.archie.SpringBootWebApp100.dto;

import com.archie.SpringBootWebApp100.MyCriteria;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class MyDtoByCriteria { //то что сюда впишк то и  будет запрашиваться
    private List<MyCriteria> criterias;

//        @JsonProperty("id_id")
//        private String id;
//        @JsonProperty("name_name")
//        private String name;
//        @JsonProperty("gos_number")
//        private String gosNumber;
//        @JsonProperty("car_brand")
//        private String carBrand;
//        @JsonProperty("position_p")
//        private String position;
}

