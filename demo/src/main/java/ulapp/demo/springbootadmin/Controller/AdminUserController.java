package ulapp.demo.springbootadmin.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ulapp.demo.springbootadmin.Model.AdminUser;
import org.springframework.ui.Model;
import ulapp.demo.springbootadmin.Repository.AdminUserRepository;

public class AdminUserController {
     private AdminUserRepository adminUserRepository;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("adminUser", new AdminUser());
        return "Index";
    }
}
