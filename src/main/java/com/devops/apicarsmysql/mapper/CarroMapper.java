package com.devops.apicarsmysql.mapper;

import com.devops.apicarsmysql.dto.CarroDto;
import com.devops.apicarsmysql.entity.CarroEntity;

import java.util.Objects;

public class CarroMapper {

    public static CarroEntity dtoToEntity(CarroDto carroDto) {
        return CarroEntity.builder()
                .id(!Objects.isNull(carroDto.getId()) ? carroDto.getId() : 0)
                .marca(carroDto.getMarca())
                .modelo(carroDto.getModelo()).build();
    }

    public static CarroDto entityToDto(CarroEntity carroEntity) {
        return CarroDto.builder()
                .id(carroEntity.getId())
                .marca(carroEntity.getMarca())
                .modelo(carroEntity.getModelo()).build();
    }

}
