package br.com.poc.rick.morty.rickmortyapi;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EpisodeResponseAPI{
    @JsonProperty
    List<EpisodeReponse> results;


    public List<EpisodeReponse> getResult() {
        return results;
    }

    @Override
    public String toString() {
        return "EpisodeResponseAPI{" +
                "results=" + results +
                '}';
    }
}
