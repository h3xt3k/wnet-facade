package ContactRestController;

import contact.Contact;
import contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by test1 on 05.11.16.
 */

@RestController
@RequestMapping("/contact")
public class ContactRestController {

    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Contact> getAllContacts() {
        List<Contact> result = (List) contactRepository.findAll();
        return result;
    }
}
