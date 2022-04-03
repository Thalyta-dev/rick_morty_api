package br.com.poc.rick.morty.rickmortyapi;

import java.util.List;

public class EpisodeResponseAPI{
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
