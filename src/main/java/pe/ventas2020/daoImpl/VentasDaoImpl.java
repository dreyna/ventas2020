package pe.ventas2020.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.ventas2020.dao.VentaDao;
import pe.ventas2020.entity.Ventas;


@Repository
public class VentasDaoImpl implements VentaDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Ventas v) {
		String SQL = "insert into ventas (fecha, tipodoc, numdoc, idpersona, idcliente) values(?,?,?,?,?)";
		return jdbcTemplate.update(SQL,v.getFecha(), v.getTipodoc(), v.getNumdoc(), v.getIdpersona(),v.getIdcliente());
	}
	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		String SQL = "update ventas set fecha=?, tipodoc=?, numdoc=? where idventas=?";
		return jdbcTemplate.update(SQL,v.getFecha(), v.getTipodoc(), v.getNumdoc(),v.getIdventas());
	}
	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select *from ventas where idventas=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {id}, new BeanPropertyRowMapper<Ventas>(Ventas.class));
	}
}
