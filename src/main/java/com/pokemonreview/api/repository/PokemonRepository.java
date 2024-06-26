package com.pokemonreview.api.repository;

import com.pokemonreview.api.model.Pokemon;
import com.pokemonreview.api.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
//    Optional<Pokemon> findByType(String type);
List<Review> findByPokemonId(int pokemonId);
}

