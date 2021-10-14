package src.main.Controllers;

import spark.Request;

public class Controller {
  protected Integer getIntegerParam(Request request, String paramName) {
    return Integer.parseInt(request.params(paramName));
  }
}
