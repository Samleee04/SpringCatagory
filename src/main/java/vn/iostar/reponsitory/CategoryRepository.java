package vn.iostar.reponsitory;

import java.util.Optional;
import vn.iostar.entity.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	Optional<Category> findByCategoryname(String categoryname);
	Page<Category> findByNameContaining(String categoryname, Pageable pageable);
}
