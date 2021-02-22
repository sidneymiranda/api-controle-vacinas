package talents.orange.selecao.api.resources;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import talents.orange.selecao.api.dto.UserDTO;
import talents.orange.selecao.api.entities.User;
import talents.orange.selecao.api.services.UserService;

@RestController
@RequestMapping(path = "/api/v1/users")
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class UserResource {

    private UserService service;

    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> insert(@RequestBody UserDTO userDTO){
        User newUser = service.insert(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
