package pe.ventas2020.dao;

import pe.ventas2020.entity.Ventas;

public interface VentaDao {
int create(Ventas v);
int update(Ventas v);
Ventas read(int id);
}
