import com.startup.controller.app.PersonBirthCertificateController;
import com.startup.controller.app.PersonController;
import com.startup.controller.app.PersonSkillController;
import com.startup.model.entity.Person;
import com.startup.model.entity.PersonSkill;
import com.startup.model.entity.enumeration.SkillLevelType;
import com.startup.model.service.PersonService;
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = PersonController.save("aaaaa", "bbbbb", "12345");
    }
}
