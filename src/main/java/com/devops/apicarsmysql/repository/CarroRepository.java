package com.devops.apicarsmysql.repository;

import com.devops.apicarsmysql.entity.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroEntity,Long> {
}
