package org.framework.rodolfo.freire.git.library.repository;

import org.framework.rodolfo.freire.git.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
