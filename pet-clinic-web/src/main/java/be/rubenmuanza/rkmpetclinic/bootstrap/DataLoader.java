package be.rubenmuanza.rkmpetclinic.bootstrap;

import be.rubenmuanza.rkmpetclinic.model.Owner;
import be.rubenmuanza.rkmpetclinic.model.PetType;
import be.rubenmuanza.rkmpetclinic.model.Vet;
import be.rubenmuanza.rkmpetclinic.services.OwnerService;
import be.rubenmuanza.rkmpetclinic.services.PetTypeService;
import be.rubenmuanza.rkmpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;



    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    //methode
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        System.out.println("*** Owner2 ***");

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glename");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");


        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
