package be.rubenmuanza.rkmpetclinic.services;

import be.rubenmuanza.rkmpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

   Vet findById(Long id);

   Vet save(Vet vet);

   Set<Vet> findall();

}
