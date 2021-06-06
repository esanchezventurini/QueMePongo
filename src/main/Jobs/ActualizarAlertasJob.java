package src.main.Jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import src.main.IProveedorClima;

public class ActualizarAlertasJob implements Job {
  IProveedorClima proveedorClima;

  public ActualizarAlertasJob(IProveedorClima proveedorClima){
    this.proveedorClima = proveedorClima;
  }

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    proveedorClima.actualizarAlertasMeteorologicasBuenosAires();
  }
}
