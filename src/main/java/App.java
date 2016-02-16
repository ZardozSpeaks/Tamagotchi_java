import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    String layout = "templates/layout.vtl";

    get("/", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/confirm", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      String inputtedName = request.queryParams("tname");
      request.session().attribute("name", inputtedName);

      model.put("name", inputtedName);
      model.put("template", "templates/confirm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/game", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
