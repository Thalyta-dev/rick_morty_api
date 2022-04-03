package br.com.poc.rick.morty.rickmortyapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RickMortyClient",url = "https://rickandmortyapi.com/api")
public interface RickMortyClient {
    @GetMapping("/episode")
    EpisodeResponseAPI buscarEpisodio();

    @GetMapping("/character/{id}")
    CharacterResponse buscarPersonagem(@PathVariable Long id);
}
