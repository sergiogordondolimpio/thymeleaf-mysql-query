package com.gordon.thymeleafmysqlquery.controller;

import com.gordon.thymeleafmysqlquery.model.Children;
import com.gordon.thymeleafmysqlquery.service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/children")
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;



    /**
     * Show the list of children in the website
     * @param model
     * @return
     */
    @RequestMapping("/Children")
    public String getAll(Model model){
        List<Children> childrenList = childrenService.getAll();
        model.addAttribute("childrenList", childrenList);
        return "children";
    }

    /*
    Test of the getAll
     */
    @RequestMapping("/all")
    public List<Children> getAll(){
        return childrenService.getAll();
    }


    /*
    Test of the getOne, using getOne?id=7
     */
    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Children> getOne(Integer id){
        return childrenService.getOne(id);
    }


    @RequestMapping("/getOne/{id}")
    @ResponseBody
    public String getOne(@PathVariable Integer id, Model model){
        model.addAttribute("childrenList", childrenService.getOne(id));
        return "children";
    }


    @RequestMapping("/byName/{name}")
    public List<Children> byName (@PathVariable (value = "name") String name){
        return childrenService.byName(name);
    }

    /*
    In this case search name and order by date of inscription
    There is another examples in the document of JPA Spring
    https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
     */
    @RequestMapping("/allOrder/{name}")
    public List<Children> orderByName(@PathVariable (value = "name") String name){
        return childrenService.orderByName(name);
    }

    /*
    @RequestMapping("/countChildren")
    public Integer countChildren(String name, String regular){
        return childrenService.countChildren(name, regular);
    }

     */

    @PostMapping("/addNew")
    public String addNew(Children children){
        childrenService.addAndUpdate(children);
        return "redirect:/children/Children";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Children children){
        childrenService.addAndUpdate(children);
        return "redirect:/children/Children";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Children children){
        childrenService.delete(children);
        return "redirect:/children/Children";
    }

    /*
     * test search with string all the name or surname that start with
     * that string
     * @param name
     * @return
     */
   /* @RequestMapping("/byNameAndSurname")
    @ResponseBody
    public List<Children> byNameAndSurname(String name){
        String surname = name;
        return childrenService.findAName(name);
    } */

    /**
     * Search a name or surname that start with the string name
     * and make a list in the same page
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/Children")
    public String byNameAndSurname (@RequestParam(defaultValue = "") String name, Model model){
        List<Children> childrenList = childrenService.findAName(name);
        model.addAttribute("childrenList", childrenList);
        return "children";
    }


}
