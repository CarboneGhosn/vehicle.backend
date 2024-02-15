package com.daniel.crud.backend.repositories;

import com.daniel.crud.backend.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
