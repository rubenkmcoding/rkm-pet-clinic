package be.rubenmuanza.rkmpetclinic.services.map;

import be.rubenmuanza.rkmpetclinic.model.PetType;
import be.rubenmuanza.rkmpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;


// services
@Service
public class PetTypeServiceMapService extends AbstractMapService<PetType, Long>implements PetTypeService {


    @Override
    public Set<PetType> findAll(){
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }


    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }






}
