package org.grace.pokedex.data;

import java.util.List;
import java.util.Map;

public class PokemonType {

    private String name;
    private Map<String, List<String>> damageRelations;
    private List<Pokemon> pokemons;

    public PokemonType(String name, Map<String, List<String>> damageRelations, List<Pokemon> pokemons) {
        this.name = name;
        this.damageRelations = damageRelations;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<String>> getDamageRelations() {
        return damageRelations;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String damageRelationText(String originalText) {
        switch (originalText) {
            case "double_damage_from":
                return "RECIBE DOBLE DAÑO";
            case "double_damage_to":
                return "HACE DOBLE DAÑO";
            case "half_damage_from":
                return "RECIBE MENOR DAÑO";
            case "half_damage_to":
                return "HACE MENOR DAÑO";
            case "no_damage_from":
                return "NO RECIBE DAÑO";
            case "no_damage_to":
                return "NO HACE DAÑO";
            default:
                return "";
        }
    }
}