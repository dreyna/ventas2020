package pe.ventas2020.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.ventas2020.dao.RolDao;
import pe.ventas2020.entity.Rol;
import pe.ventas2020.service.RolService;


@Service
public class RolServiceImpl implements RolService{
@Autowired
private RolDao rolDao;
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.create(r);
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rolDao.delete(id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
