package be.rubenmuanza.rkmpetclinic.services;

import be.rubenmuanza.rkmpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

   Owner findByLastName(String lastName);



}
