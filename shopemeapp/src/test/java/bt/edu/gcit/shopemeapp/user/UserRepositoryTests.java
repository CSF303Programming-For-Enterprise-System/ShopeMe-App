package bt.edu.gcit.shopemeapp.user;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import bt.edu.gcit.shopemeapp.entity.Role;
import bt.edu.gcit.shopemeapp.entity.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateNewUserWithOneRole(){
       Role roleAdmin =  entityManager.find(Role.class, 1);
        User sonam = new User("sonam.iscoding@gmail.com","pass123","Sonam","Wangmo");
        sonam.addRole(roleAdmin);

        User savedUser = repo.save(sonam);
        Integer savedUserId = savedUser.getId();
        assertThat(savedUserId, greaterThan(0));
      

    }

    @Test
    public void testCreateNewUserWithTwoRoles(){
        User nima = new User("nima.iscoding@gmail.com","pass123","Nima","Dema");
        Role roleEditor  = new Role(3);
        Role roleAssistant = new Role(5);

        nima.addRole(roleEditor);
        nima.addRole(roleAssistant);

        User saveduser = repo.save(nima);
        Integer savedUserId = saveduser.getId();
        assertThat(savedUserId, greaterThan(0));

      

    }

    @Test
    public void testListAllUsers(){
        Iterable<User> listUsers = repo.findAll();
        listUsers.forEach(user -> System.out.println(user));

       
    }

    @Test
    public void testGetUserById(){
        User sonam = repo.findById(1).get();
        System.out.println(sonam);
        // assertThat(sonam).isNotNull();
        assertThat(sonam, notNullValue());
    }

    @Test
    public void testUpdateUserDetails(){
        User sonam = repo.findById(1).get();
        sonam.setEnabled(true);
        sonam.setEmail("fullstack2024@gmail.com");

        repo.save(sonam);
    }

    @Test
    public void testUpdateUserRoles(){
        User nima = repo.findById(2).get();
        Role roleEditor = new Role(3);
        Role roleSalesperson = new Role(2);

        nima.getRoles().remove(roleEditor);
        nima.addRole(roleSalesperson);

        repo.save(nima);
    }
    
    @Test
    public void testDeleteUser(){
        Integer userId = 2;
        repo.deleteById(userId);

        //repo.findById(userId);
    }
}
