package bt.edu.gcit.shopemeapp.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.edu.gcit.shopemeapp.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }
    
}
