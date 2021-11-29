package org.framework.rodolfo.freire.git.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.framework.rodolfo.freire.git.library.model.BookCategory;

import java.util.List;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {

    private long id;
    private String name;
    private List<AuthorDto> authors;
    private BookCategory bookCategory;
    private String edition;
    private PublishingCompanyDto publishingCompany;
    private int quantity;
    private boolean status;

}
