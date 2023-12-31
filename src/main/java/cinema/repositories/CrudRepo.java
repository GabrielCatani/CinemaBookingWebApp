package cinema.repositories;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CrudRepo<T> {
    Optional<T> findById(Long id);
    List<T> findAll() throws SQLException;
    void save(T entity);
    void update(T entity);
    void delete(Long id);
}
