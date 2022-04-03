package br.com.poc.rick.morty.rickmortyapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CharacterResponseAPI {
    @JsonProperty
    private List<CharacterResponse> results;

    public List<CharacterResponse> getResults() {
        return results;
    }
}
