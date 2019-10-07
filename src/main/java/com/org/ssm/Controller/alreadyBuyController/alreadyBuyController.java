package com.org.ssm.Controller.alreadyBuyController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.org.ssm.Pojo.alreadyBuy;
import com.org.ssm.Pojo.appraise;
import com.org.ssm.Pojo.goods;
import com.org.ssm.Pojo.user;
import com.org.ssm.Service.alreadyBuyService;
import com.org.ssm.Service.goodsService;
import com.org.ssm.Service.userService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/alreadyBuy")
public class alreadyBuyController {
    @Autowired
    alreadyBuyService  alreadyBuyService;
    @Autowired
    goodsService goodsService;
    @Autowired
    userService userService;

    @RequestMapping("/showAllBuys")
    public String showAllBuys(Model model , @RequestParam(value = "page",defaultValue = "1") Integer page,@RequestParam(name = "size",defaultValue = "4") Integer size)
    {
        PageHelper.startPage(page,size);
        List<appraise> appraises=alreadyBuyService.showAllBuys();
        PageInfo<appraise> p=new PageInfo<>(appraises);
        model.addAttribute("pageInfo",p);
           return "liuYan/appraise";
    }
    @RequestMapping("/delBuysById")
    public String delBuysById(HttpServletRequest request,@RequestParam("id") List<Integer> aId)
    {
        for(int i=0;i<aId.size();i++)
        {
           int id=aId.get(i);
            alreadyBuyService.delBuysById(id);
        }

        return "redirect:/alreadyBuy/showAllBuys";
    }
    @RequestMapping("/search")
    public String search(Model model,HttpSession session,
                         @RequestParam(value = "page",defaultValue = "1") int page,
                         @RequestParam(name = "size",defaultValue = "4") int size,@RequestParam("uNiCheng") String uNiCheng,
                         @RequestParam("gName") String gName)
    {
           PageHelper.startPage(page,size);

          //System.out.println(uNiCheng+" "+gName);
          try
          {
              appraise appraise=new appraise();
              appraise.setuNiCheng(uNiCheng);
              appraise.setgName(gName);
              List<appraise> appraises=alreadyBuyService.search(appraise);
              System.out.println(appraises);
              PageInfo<appraise> list=new PageInfo<>(appraises);
              session.setAttribute("search",appraises);
              model.addAttribute("pageInfo",list);
              session.setAttribute("chazhao",appraises);
          }catch (Exception e)
          {
              e.printStackTrace();
          }
          return "liuYan/appraise";
    }

}
