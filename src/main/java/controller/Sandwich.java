package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sandwich {
    @RequestMapping(value = "page1",method = RequestMethod.GET)
    public String sandwichPage1(){
        return "page1";

    }

//    @RequestMapping(value = "page1",method = RequestMethod.POST)
    @PostMapping("page1")
    public ModelAndView sandwichPage(@RequestParam(name = "sandwich")String [] sanwich){
        ModelAndView modelAndView = new ModelAndView("page2");
//        String resul ="";
//        for (String x:sanwich){
//            resul +=x;
//        }
        modelAndView.addObject("sandwich",sanwich);
        return modelAndView;
    }
}
