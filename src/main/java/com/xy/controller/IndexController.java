package com.xy.controller;

import com.blade.mvc.WebContext;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PathParam;
import com.blade.mvc.ui.ModelAndView;

@Path
public class IndexController {


    @GetRoute(value = ":name")
    public void indexName(@PathParam String name) {
        ModelAndView modelAndView = new ModelAndView("index.html");
        modelAndView.add("name", name);
        WebContext.response().render(modelAndView);
    }

    @GetRoute
    public void index() {
        WebContext.response().render("index.html");
    }

}
