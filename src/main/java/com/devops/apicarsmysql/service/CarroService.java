package com.devops.apicarsmysql.service;

import com.devops.apicarsmysql.dto.CarroDto;
import com.devops.apicarsmysql.entity.CarroEntity;
import com.devops.apicarsmysql.mapper.CarroMapper;
import com.devops.apicarsmysql.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroDto saveCarro(CarroDto carroDto) {
        return CarroMapper.entityToDto(carroRepository.save(CarroEntity.builder()
                .marca(carroDto.getMarca())
                .modelo(carroDto.getModelo())
                .build()));
    }

    public CarroDto getCarroById(Long id) throws Exception {
        Optional<CarroEntity> carroEntity = Optional.of(carroRepository
                .findById(id).orElseThrow(Exception::new));
        return CarroMapper.entityToDto(carroEntity.get());
    }

}
