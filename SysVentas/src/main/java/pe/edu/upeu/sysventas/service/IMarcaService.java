package pe.edu.upeu.sysventas.service;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.model.Marca;

import java.util.List;

public interface IMarcaService extends ICrudGenericoService<Marca, Long>{

    @Override
    default Marca save(Marca entity) {
        return null;
    }

    @Override
    default Marca update(Long aLong, Marca entity) {
        return null;
    }

    @Override
    default List<Marca> findAll() {
        return List.of();
    }

    @Override
    default Marca findById(Long aLong) {
        return null;
    }

    @Override
    default void delete(Long aLong) {

    }
}
