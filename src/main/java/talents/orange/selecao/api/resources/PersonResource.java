package talents.orange.selecao.api.resources;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import talents.orange.selecao.api.dto.PersonDTO;
import talents.orange.selecao.api.dto.resource.MessageResponseDTO;
import talents.orange.selecao.api.entities.Person;
import talents.orange.selecao.api.services.PersonService;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/v1/users")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class PersonResource {

    private final PersonService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO insert(@RequestBody @Valid PersonDTO personDTO){
        Person newPerson = service.insert(personDTO);

        return MessageResponseDTO
                .builder()
                .message("Successful registration")
                .build();
    }
}
