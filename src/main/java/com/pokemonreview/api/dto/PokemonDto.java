package com.pokemonreview.api.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDto {
    private int id;
    private String name;
    private String type;

}
