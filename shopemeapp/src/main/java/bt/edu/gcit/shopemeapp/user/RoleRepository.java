package bt.edu.gcit.shopemeapp.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.edu.gcit.shopemeapp.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
    
}
