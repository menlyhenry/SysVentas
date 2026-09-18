package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.Categoria;
<<<<<<< HEAD
import pe.edu.upeu.sysventas.model.Marca;
=======
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33

public class CategoriaRepository extends AbstractJpaRepository<Categoria, Long>{
    private long sequence=1;

    @Override
    protected Long getId(Categoria entity) {
        return entity.getIdCategoria();
    }

    @Override
    protected void setId(Categoria entity, Long id) {
        entity.setIdCategoria(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
<<<<<<< HEAD

    public void seedData() {
        if (findAll().isEmpty()) {
            save(new Categoria(generateId(), "Bebidas"));
            save(new Categoria(generateId(),"Artefactos"));
            save(new Categoria(generateId(),"Ropas"));
        }
    }

=======
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
}
