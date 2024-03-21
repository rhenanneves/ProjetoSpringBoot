package ulapp.demo.springbootadmin.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ulapp.demo.springbootadmin.Model.AdminUser;


public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {

}
