package com.nmerris.formeasywaydemo.controllers;

import com.nmerris.formeasywaydemo.models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllerTwo {


    @RequestMapping(value = "/songform", method = RequestMethod.GET)
//    @RequestMapping("/songform")
    public String loadFormPage(Model model) {
        model.addAttribute("song", new Song());
        return "songform";
    }


    @RequestMapping(value = "/songform", method = RequestMethod.POST)
//    @RequestMapping("/songform")
    public String loadFromThePageTwo(@ModelAttribute Song song) {

        // confirmsong will have song available to it
        return "confirmsong";
    }


}
