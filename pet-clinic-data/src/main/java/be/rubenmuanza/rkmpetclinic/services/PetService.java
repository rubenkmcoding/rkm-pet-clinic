package be.rubenmuanza.rkmpetclinic.services;

import be.rubenmuanza.rkmpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findall();
}
