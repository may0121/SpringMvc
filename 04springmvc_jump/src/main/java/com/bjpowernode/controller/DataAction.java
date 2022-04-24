package com.bjpowernode.controller;

import com.bjpowernode.controller.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author may
 * @date 2022/4/18 12:56
 */
@Controller
public class DataAction {

    @RequestMapping("/data")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap){
        Users u = new Users("张三",22);
        request.setAttribute("requestUsers",u);
        session.setAttribute("sessionUsers",u);
        model.addAttribute("modelUsers",u);
        map.put("mapUsers",u);
        modelMap.addAttribute("modelMapUsers",u);
        return "redirect:/admin/main.jsp";
    }
}
