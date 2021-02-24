package talents.orange.selecao.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String name;

    @NotEmpty
    private String email;

    @NotEmpty
    private String cpf;

    @NotEmpty
    private String birthDate;
}
