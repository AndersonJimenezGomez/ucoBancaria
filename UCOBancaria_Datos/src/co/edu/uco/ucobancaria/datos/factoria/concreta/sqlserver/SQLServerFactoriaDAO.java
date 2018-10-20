package co.edu.uco.ucobancaria.datos.factoria.concreta.sqlserver;

import co.edu.uco.ucobancaria.datos.dao.interfaces.IClienteDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ICuentaDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.IMovimientoDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ITipoCuentaDAO;
import co.edu.uco.ucobancaria.datos.dao.interfaces.ITipoMovimiento;
import co.edu.uco.ucobancaria.datos.factoria.abstracta.FactoriaDAO;

public final class SQLServerFactoriaDAO extends FactoriaDAO{

	@Override
	protected void abrirConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void iniciarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void confirmarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void cancelarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void cerrarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IClienteDAO obtenerClienteDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICuentaDAO obtenerCuentaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMovimientoDAO obtenerMovimientoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITipoCuentaDAO obtenerTipoCuentaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITipoMovimiento obtenerTipoMovimientoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
