package pl.opole.uni.springWebApp.repositories;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.opole.uni.springWebApp.models.Student;

@Repository
public class JdbcStudentRepository implements StudentRepository {
	
	private JdbcTemplate jdbcTemplate;

	
	@Autowired
	public JdbcStudentRepository(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
//	@Override
	//public List<Student> findAll() {
		// TODO Auto-generated method stub
		//String sql="SELECT * FROM student";
		
		//return jdbcTemplate.query(sql, new StudentRowMapper());
//	}
	@Override
	public List<Student> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Student> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllInBatch(Iterable<Student> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Student getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<Student> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Student> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Student> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public <S extends Student> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Student> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Student> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public <S extends Student, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
