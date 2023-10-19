package com.lnp.chatgpt.service;

import java.util.List;

import com.lnp.chatgpt.domain.Character;

public interface CharacterService {

    List<Character> findAllCharacters();

    Character findCharacterById(Long id);

    List<Character> findCharactersByName(String name);

    Character saveCharacter(Character Character);

    Character updateCharacter(Long id, Character Character);

    void deleteCharacterById(Long id);

    void deleteCharacter(Character Character);

}
