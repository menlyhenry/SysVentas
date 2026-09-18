package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.exception.ModelNotFoundException;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.ICrudGenericoService;

import java.util.List;

<<<<<<< HEAD
public abstract class CrudGenericoServiceImp<T,ID> implements ICrudGenericoService<T, ID> {
    protected abstract ICrudGenericoRepository<T,ID> getRepo();
=======
public abstract class CrudGenericoServiceImp <T, ID> implements ICrudGenericoService<T, ID> {

    protected  abstract ICrudGenericoRepository<T,ID> getRepo();

>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33

    @Override
    public T save(T entity) {
        return getRepo().save(entity);
    }

    @Override
    public T update(ID id, T entity) {
<<<<<<< HEAD
        if(!getRepo().existsById(id)){
=======
        if (!getRepo().existsById(id)){
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
            throw new ModelNotFoundException("ID no existe:"+id);
        }
        return getRepo().update(entity);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(()->new ModelNotFoundException("ID no existe:"+id));
    }

    @Override
    public void delete(ID id) {
<<<<<<< HEAD
        if(!getRepo().existsById(id)){
            throw new ModelNotFoundException("ID no existe:"+id);
        }
        getRepo().deleteById(id);
=======
        if (!getRepo().existsById(id)){
            throw new ModelNotFoundException("ID no existe:"+id);
        }

>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
    }
}
