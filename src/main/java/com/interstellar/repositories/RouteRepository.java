package com.interstellar.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.interstellar.domain.PlanetRoute;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends CrudRepository<PlanetRoute, Long> {
}
