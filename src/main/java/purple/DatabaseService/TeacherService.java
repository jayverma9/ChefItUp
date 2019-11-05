package purple.DatabaseService;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import purple.POJOS.Teacher;

import java.util.List;
import java.util.Optional;

//This class will be responsible for the database operations for the teacher
public class TeacherService implements MongoRepository<Teacher, Integer> {
    @Override
    public <S extends Teacher> S save(S s) {
        return null;
    }

    @Override
    public <S extends Teacher> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Teacher> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public Iterable<Teacher> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Teacher teacher) {

    }

    @Override
    public void deleteAll(Iterable<? extends Teacher> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Teacher> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Teacher> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Teacher> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Teacher> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Teacher> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Teacher> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Teacher> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Teacher> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Teacher> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Teacher> boolean exists(Example<S> example) {
        return false;
    }
}
