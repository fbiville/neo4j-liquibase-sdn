package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MovieCli implements CommandLineRunner {

	final MovieRepository movieRepository;

	public MovieCli(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public void run(String... args) {
		System.out.println(movieRepository.findByTitle("My Life"));
		System.exit(0);
	}
}
