package mate.service;

import java.util.List;
import mate.exception.DataCreateUpdateException;

public interface GenericService<T> {
    T create(T element) throws DataCreateUpdateException;

    T get(Long id);

    List<T> getAll();

    T update(T element) throws DataCreateUpdateException;

    boolean delete(Long id);
}
