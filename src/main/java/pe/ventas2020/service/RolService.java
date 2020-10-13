package pe.ventas2020.service;

import java.util.List;
import java.util.Map;

import pe.ventas2020.entity.Rol;

public interface RolService {
	int create(Rol r);
	int update(Rol r);
	int delete(int id);
	Rol read(int id);
	List<Map<String, Object>> readAll();
}
