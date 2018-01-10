
import models.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            ArrayList<CD> cds = CD.getAll();
            model.put("cds", cds);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cds/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            String title = request.queryParams("title");
            String year = request.queryParams("year");
            CD cd = new CD(title, year);

            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/cdCollection", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            ArrayList<CD> cds = CD.getAll();
            model.put("cds", cds);

            return new ModelAndView(model, "cdCollection.hbs");
        }, new HandlebarsTemplateEngine());

    }
}
