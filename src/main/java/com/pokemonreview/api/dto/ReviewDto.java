package com.pokemonreview.api.dto;

import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ReviewDto {

    private int id;
    private String content;
    private String title;
    private int stars;

}
