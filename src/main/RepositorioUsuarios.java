package src.main;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  List<Usuario> usuarios = new ArrayList<>();

  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }

  public void agregarUsuario(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  public Usuario getUsuarioById(int id) {
    return this.usuarios.stream().filter(x -> x.tieneId(id)).findFirst().orElse(null);
  }
}
