package br.com.poc.rick.morty.service;

import br.com.poc.rick.morty.rickmortyapi.EpisodeResponseAPI;
import br.com.poc.rick.morty.rickmortyapi.RickMortyClient;
import org.springframework.stereotype.Service;

@Service
public class EpisodeManagerService {
    private RickMortyClient client;

    public EpisodeManagerService(RickMortyClient client) {
        this.client = client;
    }

    public void consumir(){
        EpisodeResponseAPI episodeReponse = client.buscarEpisodio();
        System.out.println(episodeReponse);
        //episodeReponse.getResult().forEach(System.out::println);
    }
}
