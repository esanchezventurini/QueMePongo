package src.main.Controllers;

import spark.Request;
import spark.Response;
import src.main.*;

public class PrendaController extends Controller {

  //Response code: 200 si encuentra al usuario, 404 si no lo encuentra
  public String getPrendas(Request request, Response response) {
    int usuarioId = Integer.parseInt(request.params(":id_usuario"));
    Usuario usuario = repositorioUsuarios.getUsuarioById(usuarioId);
    return gson.toJson(usuario.getPrendasTotales());
  }

  //Response code: 200 si encuentra la prenda, 404 si no lo encuentra
  public String getPrenda(Request request, Response response) {
    int usuarioId = this.getIntegerParam(request,":id_usuario");
    int prendaId = this.getIntegerParam(request,"id_prenda");
    Usuario usuario = repositorioUsuarios.getUsuarioById(usuarioId);
    Prenda prenda = usuario.getPrendaById(prendaId);
    return gson.toJson(prenda);
  }

  //Response code: 200 si lo encuentra y lo puede borrar, 404 si no lo encuentra
  public String deletePrenda(Request request, Response response) {
    int usuarioId = this.getIntegerParam(request,":id_usuario");
    int prendaId = this.getIntegerParam(request,"id_prenda");
    Usuario usuario = repositorioUsuarios.getUsuarioById(usuarioId);
    usuario.removerPrenda(prendaId);

    return null;
  }

  //Response code: 200 si la pudo crear, 500 si hubo algún error en la creación
  public Void createPrenda(Request request, Response response) {
    //Crear prenda
    return null;
  }

  //Response code: 200 si la pudo actualizar, 500 si hubo algún error en la actualización
  public Void updatePrenda(Request request, Response response) {
    //Actualizar prenda
    return null;
  }
}
