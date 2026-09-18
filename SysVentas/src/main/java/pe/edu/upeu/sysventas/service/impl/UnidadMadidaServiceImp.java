package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.service.IUnidadMediaService;
@RequiredArgsConstructor
public class UnidadMadidaServiceImp extends CrudGenericoServiceImp<UnidMedida, Long> implements IUnidadMediaService {



    @Override
    protected ICrudGenericoRepository<UnidMedida, Long> getRepo() {
        return null;
    }
}
