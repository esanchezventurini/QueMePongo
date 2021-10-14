package src.main.Controllers;

import spark.Spark;

public class Main {
  public static void main(String[] args) {
    Spark.port(61154);

    PrendaController prendaController = new PrendaController();

    Spark.get("/usuarios/:id_usuario/prendas", prendaController::getPrendas);
    Spark.get("/usuarios/:id_usuario/prendas/:id_prenda", prendaController::getPrenda);
    Spark.delete("/usuarios/:id_usuario/prendas/:id_prenda", prendaController::deletePrenda);
    Spark.post("/usuarios/:id_usuario/prendas/:id_prenda", prendaController::createPrenda);
    Spark.put("/usuarios/:id_usuario/prendas/:id_prenda", prendaController::updatePrenda);
  }
}