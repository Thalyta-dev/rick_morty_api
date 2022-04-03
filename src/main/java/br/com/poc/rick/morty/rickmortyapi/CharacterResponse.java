package br.com.poc.rick.morty.rickmortyapi;

import java.time.LocalDateTime;

public class CharacterResponse {
    private Long id;

    private String name;
    private String status;
    private String species;
    private String type;
    private LocalDateTime created;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
