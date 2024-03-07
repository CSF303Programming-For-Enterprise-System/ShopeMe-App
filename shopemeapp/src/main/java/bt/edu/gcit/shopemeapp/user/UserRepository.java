package bt.edu.gcit.shopemeapp.user;

import org.springframework.data.repository.CrudRepository;

import bt.edu.gcit.shopemeapp.entity.User;

public interface UserRepository  extends CrudRepository<User, Integer>{
    
}
