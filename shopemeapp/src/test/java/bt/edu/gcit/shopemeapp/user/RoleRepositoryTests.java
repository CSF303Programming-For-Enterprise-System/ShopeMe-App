package bt.edu.gcit.shopemeapp.user;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import bt.edu.gcit.shopemeapp.entity.Role;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RoleRepositoryTests {

    @Autowired
    private RoleRepository repo;

    @Test
    public void testCreateFirstRole(){
        Role roleAdmin = new Role("Admin", "Manage Everthing");
        Role savedRole = repo.save(roleAdmin);

        Integer savedRoleId = savedRole.getId();
        assertThat(savedRoleId, greaterThan(0));
    }


    @Test
    public void testCreateRestRole(){
        Role roleSalesperson = new Role("Salesperson", "Manage product price, "
        + "customers, shipping, orders and sales report");
        Role roleEditor = new Role("Editor", "Manage categories, brands, "
        + "products, articles and menus");
        Role roleShipper = new Role("Shipper", "View products, view orders "
        + "and update order status");
        Role roleAssistant = new Role("Assistant", "Manage questions and reviews");
       repo.saveAll(List.of(roleSalesperson, roleEditor, roleShipper, roleAssistant));

      
    }
    
}
