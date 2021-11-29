package org.framework.rodolfo.freire.git.library.repository;

import org.framework.rodolfo.freire.git.library.model.LegalPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalPersonRepository extends JpaRepository<LegalPerson, Long> {
}
