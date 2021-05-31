package guru.sprinframework.sfgpetclinic.services;
import guru.sprinframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastname (String lastName);


}
