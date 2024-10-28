package vn.iostar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.iostar.entity.Category;
import vn.iostar.reponsitory.CategoryRepository;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository categoryRespostory;

	public CategoryServiceImpl(CategoryRepository categoryRespostory) {
		this.categoryRespostory = categoryRespostory;
	}

	@Override
	public Optional<Category> findByCategoryname(String categoryname) {
		return categoryRespostory.findByCategoryname(categoryname);
	}

	@Override
	public Page<Category> findByNameContaining(String categoryname, Pageable pageable) {
		return categoryRespostory.findByNameContaining(categoryname, pageable);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRespostory.save(entity);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRespostory.findAll(sort);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRespostory.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryRespostory.findAll();
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRespostory.findById(id);
	}

	@Override
	public long count() {
		return categoryRespostory.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryRespostory.deleteById(id);
	}
	
		
	
}
