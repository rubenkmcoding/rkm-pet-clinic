package be.rubenmuanza.rkmpetclinic.services;

import be.rubenmuanza.rkmpetclinic.model.Owner;

import java.util.Set;

public interface OnwnerService {

   Owner findByLastName(String lastName);

   Owner findById(Long id);

   Owner save(Owner owner);

   Set<Owner> findall();

}
