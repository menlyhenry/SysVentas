package pe.edu.upeu.sysventas.service.impl;

import lombok.RequiredArgsConstructor;
<<<<<<< HEAD
import pe.edu.upeu.sysventas.dto.ComboBoxOption;
import pe.edu.upeu.sysventas.enums.TipoProducto;
=======
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
import pe.edu.upeu.sysventas.model.Producto;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.ProductoRepository;
import pe.edu.upeu.sysventas.service.IProductoService;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class ProductoServiceImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService {
    private final ProductoRepository productoRepository;
=======
@RequiredArgsConstructor

public class ProductoServiceImp extends CrudGenericoServiceImp<Producto, Long> implements IProductoService {
    private final ProductoRepository productoRepository;

>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
    @Override
    protected ICrudGenericoRepository<Producto, Long> getRepo() {
        return productoRepository;
    }
<<<<<<< HEAD

    @Override
    public List<ComboBoxOption> listarTipoProducto() {
        List<ComboBoxOption> listar = new ArrayList<>();
        for (TipoProducto tp : TipoProducto.values()) {
            ComboBoxOption cb = new ComboBoxOption();
            cb.setKey(tp.name());
            cb.setValue(tp.getDescripcion());
            listar.add(cb);
        }
        return listar;
    }
}
=======
}
>>>>>>> 854bc0e56e563799c1dd606e81116e37ace6af33
