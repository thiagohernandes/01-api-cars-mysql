package com.devops.apicarsmysql.mapper;

import com.devops.apicarsmysql.dto.CarroDto;
import com.devops.apicarsmysql.entity.CarroEntity;

public class CarroMapper {

    public static CarroDto entityToDto(CarroEntity carroEntity) {
        return CarroDto.builder()
                .id(carroEntity.getId())
                .marca(carroEntity.getMarca())
                .modelo(carroEntity.getModelo()).build();
    }

}
