package be.rubenmuanza.rkmpetclinic.services;

import be.rubenmuanza.rkmpetclinic.model.Owner;


public interface OnwnerService extends CrudService<Owner, Long>{

   Owner findByLastName(String lastName);



}
