package be.rubenmuanza.rkmpetclinic.bootstrap;

import be.rubenmuanza.rkmpetclinic.model.Owner;
import be.rubenmuanza.rkmpetclinic.model.Vet;
import be.rubenmuanza.rkmpetclinic.services.OwnerService;
import be.rubenmuanza.rkmpetclinic.services.VetService;
import be.rubenmuanza.rkmpetclinic.services.map.OwnerServiceMap;
import be.rubenmuanza.rkmpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    //methode
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Michael");
        owner1.setFirstName("Weston");

        ownerService.save(owner1);

        System.out.println("*** Owner2 ***");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setFirstName("Glename");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setLastName("Sam");
        vet1.setFirstName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setLastName("Jessie");
        vet2.setFirstName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
