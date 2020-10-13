package pe.ventas2020.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.ventas2020.dao.VentaDao;
import pe.ventas2020.entity.Ventas;
import pe.ventas2020.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {
@Autowired
private VentaDao ventaDao;
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		return ventaDao.create(v);
	}
	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return ventaDao.update(v);
	}
	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return ventaDao.read(id);
	}

}
