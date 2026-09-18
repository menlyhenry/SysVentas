package pe.edu.upeu.sysventas.service;

<<<<<<< HEAD
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
=======
import lombok.RequiredArgsConstructor;
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
import pe.edu.upeu.sysventas.model.Marca;

import java.util.List;

public interface IMarcaService extends ICrudGenericoService<Marca, Long>{
<<<<<<< HEAD
    List<ComboBoxOption> listarCombobox();
=======

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
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
}
