package talents.orange.selecao.api.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import talents.orange.selecao.api.dto.PersonDTO;
import talents.orange.selecao.api.entities.Person;
import talents.orange.selecao.api.mapper.IPersonMapper;
import talents.orange.selecao.api.repositories.PersonRepository;

@Service
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class PersonService {

    private final PersonRepository repository;

    private final IPersonMapper userMapper = IPersonMapper.INSTANCE;

    public Person insert(PersonDTO personDTO){
        Person personToSave = userMapper.toModel(personDTO);
        return repository.save(personToSave);
    }
}
