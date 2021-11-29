package org.framework.rodolfo.freire.git.library.repository;

import org.framework.rodolfo.freire.git.library.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
