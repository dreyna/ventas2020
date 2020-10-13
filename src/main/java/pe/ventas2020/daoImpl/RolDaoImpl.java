package pe.ventas2020.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.ventas2020.dao.RolDao;
import pe.ventas2020.entity.Rol;

@Repository
public class RolDaoImpl implements RolDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Rol r) {
		return jdbcTemplate.update("call sp_rol_create(?)",r.getNomrol());
	}
	@Override
	public int update(Rol r) {
		return jdbcTemplate.update("call sp_rol_update(?, ?)", r.getNomrol(),r.getIdrol());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from rol where idrol=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from rol where idrol=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Rol>(Rol.class));
}

	@Override
	public List<Map<String, Object>> readAll() {
		return jdbcTemplate.queryForList("select *from rol");
	}

}
