package org.yiva.zbxj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.yiva.zbxj.dao.TestDao;

@Controller
@RequestMapping(value = "")
public class IndexController {

    @Autowired
    @Qualifier(value = "testDao")
    private TestDao testDao;

    @GetMapping(value = "")
    public ModelAndView showMainPage(){

        ModelAndView mv = new ModelAndView("index");
        int cnt = testDao.validDB();
        if (1== cnt){
            mv.addObject("res", "hello world");
        }else {
            mv.addObject("res", "error");
        }
        return mv;
    }

}
