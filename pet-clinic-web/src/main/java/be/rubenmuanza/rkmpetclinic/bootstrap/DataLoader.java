package be.rubenmuanza.rkmpetclinic.bootstrap;

import be.rubenmuanza.rkmpetclinic.model.Owner;
import be.rubenmuanza.rkmpetclinic.model.Pet;
import be.rubenmuanza.rkmpetclinic.model.PetType;
import be.rubenmuanza.rkmpetclinic.model.Vet;
import be.rubenmuanza.rkmpetclinic.services.OwnerService;
import be.rubenmuanza.rkmpetclinic.services.PetTypeService;
import be.rubenmuanza.rkmpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Van tetterodestraat 10");
        owner1.setCity("Tilburg");
        owner1.setTelephone(")048744949493");

        Pet mikesPet = new Pet();
        mikesPet.setName("Zaire");
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setPetType(savedDogPetType);



        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        System.out.println("*** Owner2 ***");

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glename");
        owner2.setAddress("Peter Benoitstraat 7");
        owner2.setCity("Turnhout");
        owner2.setTelephone("09898884894");

        Pet fionasCat = new Pet();
        fionasCat.setName("Juka");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
