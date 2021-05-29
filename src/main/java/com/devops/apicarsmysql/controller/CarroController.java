package com.devops.apicarsmysql.controller;

import com.devops.apicarsmysql.dto.CarroDto;
import com.devops.apicarsmysql.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/carros")
@AllArgsConstructor
public class CarroController {

    final CarroService carroService;

    @PostMapping
    public ResponseEntity<CarroDto> saveCarro(@RequestBody CarroDto carro) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(carroService.saveCarro(carro));
        } catch (Exception e) {
            throw new Exception("Ocorreu algum erro ao tentar salvar o carro! ", e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarroDto> findById(@PathVariable("id") Long id) throws Exception {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carroService.getCarroById(id));
        } catch (Exception e) {
            throw new Exception("Ocorreu algum erro ao tentar buscar o carro! ", e);
        }
    }

}
