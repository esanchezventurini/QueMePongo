package src.main.Jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import src.main.GeneradorSugerencias;
import src.main.RepositorioUsuarios;
import src.main.Usuario;

import java.util.List;

public class SugerenciasDiariasJob implements Job {
  RepositorioUsuarios repositorioUsuarios;
  GeneradorSugerencias generadorSugerencias;

  public SugerenciasDiariasJob(RepositorioUsuarios repositorioUsuarios, GeneradorSugerencias generadorSugerencias){
    this.generadorSugerencias = generadorSugerencias;
  }

  @Override
  public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
    List<Usuario> usuarios = repositorioUsuarios.getUsuarios();
    generadorSugerencias.generarSugerencias(usuarios);
  }
}
