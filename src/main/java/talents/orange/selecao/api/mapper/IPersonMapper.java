package talents.orange.selecao.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import talents.orange.selecao.api.dto.PersonDTO;
import talents.orange.selecao.api.entities.Person;


@Mapper(componentModel = "spring")
public interface IPersonMapper {

    IPersonMapper INSTANCE = Mappers.getMapper(IPersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);
}
