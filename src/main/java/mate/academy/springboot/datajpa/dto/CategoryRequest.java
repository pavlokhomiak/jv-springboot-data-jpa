package mate.academy.springboot.datajpa.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CategoryRequest {

    @NotBlank
    private String name;
}
