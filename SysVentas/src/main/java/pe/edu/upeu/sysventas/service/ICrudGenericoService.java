package pe.edu.upeu.sysventas.service;

import java.util.List;

<<<<<<< HEAD
public interface ICrudGenericoService<T, ID> {
=======
public interface ICrudGenericoService<T,ID> {

>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
    T save(T entity);
    T update(ID id, T entity);
    List<T> findAll();
    T findById(ID id);
    void delete(ID id);
<<<<<<< HEAD
=======


>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
}
