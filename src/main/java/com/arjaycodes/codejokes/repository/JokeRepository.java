package com.arjaycodes.codejokes.repository;

import com.arjaycodes.codejokes.entity.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Long> {
}
