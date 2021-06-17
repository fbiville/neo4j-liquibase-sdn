package com.example.demo;

import org.springframework.data.repository.Repository;

public interface MovieRepository extends Repository<Movie, Long> {

	Movie findByTitle(String title);
}
