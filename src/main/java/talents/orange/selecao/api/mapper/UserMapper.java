package talents.orange.selecao.api.mapper;

import talents.orange.selecao.api.dto.UserDTO;
import talents.orange.selecao.api.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")

    User toModel(UserDTO userDTO);

    UserDTO toDto(User user);
}
