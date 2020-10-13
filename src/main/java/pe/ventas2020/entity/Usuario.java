package pe.ventas2020.entity;

public class Usuario {
private int idpersona;
private String nomuser;
private String clave;
private String estado;
private int idrol;
public Usuario() {

}
public Usuario(int idpersona, String nomuser, String clave, String estado, int idrol) {
	this.idpersona = idpersona;
	this.nomuser = nomuser;
	this.clave = clave;
	this.estado = estado;
	this.idrol = idrol;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
public String getNomuser() {
	return nomuser;
}
public void setNomuser(String nomuser) {
	this.nomuser = nomuser;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}

}
