package pe.ventas2020.service;

import pe.ventas2020.entity.Ventas;

public interface VentaService {
   int create(Ventas v);
   int update(Ventas v);
   Ventas read(int id);
}
