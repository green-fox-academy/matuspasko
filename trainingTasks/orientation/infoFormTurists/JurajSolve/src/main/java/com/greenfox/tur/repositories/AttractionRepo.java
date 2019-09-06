package com.greenfox.tur.repositories;

import com.greenfox.tur.models.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepo extends CrudRepository<Attraction,Long> {
}
