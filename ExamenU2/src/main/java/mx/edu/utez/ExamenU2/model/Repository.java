package mx.edu.utez.ExamenU2.model;

import mx.edu.utez.ExamenU2.utils.Response;
import java.util.List;

public interface Repository<T> {

    Response<List> findAll();
    Response<T>findOne(Long id);
    Response<T>save(T object);
    Response<T>update(T object);
    Response<T>delete(Long id);

}
