package com.archie.SpringBootWebApp100;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MyDto { //то что сюда впишк то и  будет запрашиваться
    private List<MyCriteria> criterias;


}
