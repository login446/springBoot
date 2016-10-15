package com.alex.springBoot.controller;

import com.alex.springBoot.test.ParsingString;
import com.alex.springBoot.test.Word;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by alex on 16.10.2016.
 */
@Controller
public class WebController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }

    @RequestMapping(value = "/parsing", method = RequestMethod.POST)
    public String parsing(@RequestParam("text") String text, Model model) {
        ArrayList<Word> arrayList = ParsingString.parsing(text);
        String temp = "";
        for (Word word : arrayList)
            temp += "<p>" + word.getName() + " - " + word.getCount() + "</p>";
        model.addAttribute("popularWords", temp);
        return "PopularWords";
    }
}
