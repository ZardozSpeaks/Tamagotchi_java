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
      Tamagotchi myTamagotchi = new Tamagotchi();
      request.session().attribute("tamagotchi", myTamagotchi);

      model.put("name", inputtedName);
      model.put("template", "templates/confirm.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/game", (request,response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myTamagotchi = request.session().attribute("tamagotchi");
      model.put("myTamagotchi", myTamagotchi);

      String name = request.session().attribute("name");
      model.put("name", name);

      model.put("template", "templates/game.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/play", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myTamagotchi = request.session().attribute("tamagotchi");
      String name = request.session().attribute("name");
      model.put("name", name);
      model.put("myTamagotchi", myTamagotchi);

      myTamagotchi.playTime();

      request.session().attribute("tamagotchi", myTamagotchi);

      model.put("template", "templates/play.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/feed", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myTamagotchi = request.session().attribute("tamagotchi");
      String name = request.session().attribute("name");
      model.put("name", name);
      model.put("myTamagotchi", myTamagotchi);

      myTamagotchi.feedMe();

      request.session().attribute("tamagotchi", myTamagotchi);

      model.put("template", "templates/feed.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/nap", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myTamagotchi = request.session().attribute("tamagotchi");
      String name = request.session().attribute("name");
      model.put("name", name);
      model.put("myTamagotchi", myTamagotchi);

      myTamagotchi.napTime();

      request.session().attribute("tamagotchi", myTamagotchi);

      model.put("template", "templates/nap.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
