package src.main.Controllers;

import com.google.gson.Gson;
import spark.Request;
import src.main.RepositorioUsuarios;

public class Controller {
  RepositorioUsuarios repositorioUsuarios = new RepositorioUsuarios();
  Gson gson = new Gson();

  protected Integer getIntegerParam(Request request, String paramName) {
    return Integer.parseInt(request.params(paramName));
  }
}
