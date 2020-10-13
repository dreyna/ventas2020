package pe.ventas2020.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.ventas2020.dao.UsuarioDao;
import pe.ventas2020.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public Usuario read(String nomuser) {
		String SQL = "select *from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
