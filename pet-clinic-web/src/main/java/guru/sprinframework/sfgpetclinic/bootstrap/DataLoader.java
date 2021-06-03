package guru.sprinframework.sfgpetclinic.bootstrap;

import guru.sprinframework.sfgpetclinic.model.Owner;
import guru.sprinframework.sfgpetclinic.model.Vet;
import guru.sprinframework.sfgpetclinic.services.OwnerService;
import guru.sprinframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;

@Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Evgeny");
        owner1.setLastName("Nikitchenko");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Irina");
        owner2.setLastName("Bondar");
        ownerService.save(owner2);

        System.out.println("Loaded owners");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Michal");
        vet1.setLastName("Shrum");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Blade");
        vet2.setLastName("Fukanko");

        vetService.save(vet2);

        System.out.println("Loaded vets");

    }
}
