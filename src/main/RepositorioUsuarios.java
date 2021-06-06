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
}
