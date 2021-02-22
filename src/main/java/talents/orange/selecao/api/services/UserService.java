package talents.orange.selecao.api.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import talents.orange.selecao.api.dto.UserDTO;
import talents.orange.selecao.api.entities.User;
import talents.orange.selecao.api.mapper.UserMapper;
import talents.orange.selecao.api.repositories.UserRepository;

@Service
@AllArgsConstructor(onConstructor_={@Autowired})
public class UserService {

    private UserRepository repository;

    private final UserMapper userMapper = UserMapper.INSTANCE;

    public User insert(UserDTO userDTO){
        User userToSave = userMapper.toModel(userDTO);
        return repository.save(userToSave);
    }
}
