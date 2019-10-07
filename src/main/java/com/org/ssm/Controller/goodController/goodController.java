package com.org.ssm.Controller.goodController;

import com.org.ssm.Pojo.goods;
import com.org.ssm.Service.goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/goods")
public class goodController {
    @Autowired
    goodsService goodsService;
    @RequestMapping("/addGoods")
    public String addGoods(Model model, @RequestParam("gName") String gName,
                           @RequestParam("gPrice") Double gPrice,
                           @RequestParam("gStore") String gStore,
                           @RequestParam("gPageView") int gPageView,
                           @RequestParam("gImage") MultipartFile gImage, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        goods g1=new goods();
        g1.setgName(gName);
        g1.setgPrice(gPrice);
        g1.setgStore(gStore);
        g1.setgPageView(gPageView);
        String path=request.getServletContext().getRealPath("/")+"goodsImage\\";
        String uuid= UUID.randomUUID().toString();
        uuid=uuid.replace("-","");
        String goodsImageName=gImage.getOriginalFilename();
        goodsImageName=uuid+goodsImageName;
        String savePath=request.getScheme()+"://"
                +request.getServerName()+":"
                +request.getServerPort()+request.getContextPath()+"/goodsImage/"+goodsImageName;
        g1.setgImage(savePath);
        File target=new File(path,goodsImageName);
        gImage.transferTo(target);
        if(goodsService.addGoods(g1))
        {
            return "redirect:/goods/showAllGoods";
        }
        else {
            model.addAttribute("meg","添加失败!");
            return "goods/addGoods";
        }



    }
    @RequestMapping("/showAllGoods")
    public String showAllGoods(Model model)
    {
        List<goods> list=goodsService.showAllGoods();
        model.addAttribute("list",list);
        return "goods/showAllGoods";

    }
    @RequestMapping("/delGoods")
    public String delGoods(Model model,HttpServletRequest request)
    {
        int gId=Integer.parseInt(request.getParameter("gId"));
        goodsService.delGoodById(gId);
        return "redirect:/goods/showAllGoods";
    }
    @RequestMapping("/showOneGoodsById")
            public String showOneGoodsById(HttpServletRequest request,Model model)
    {
        int gId=Integer.parseInt(request.getParameter("gId"));
        goods goods=goodsService.showOneGoodsById(gId);
        request.getSession().setAttribute("good",goods);
        model.addAttribute("good",goods);
        return "goods/updateGoods";
    }
    @RequestMapping("/updateGoods")
    public String updateGoods(Model model, @RequestParam("gName") String gName,
                              @RequestParam("gPrice") Double gPrice,
                              @RequestParam("gStore") String gStore,
                              @RequestParam("gPageView") int gPageView,
                              @RequestParam("gImage") MultipartFile gImage, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        goods g1=(goods)request.getSession().getAttribute("good");
        g1.setgName(gName);
        g1.setgPrice(gPrice);
        g1.setgStore(gStore);
        g1.setgPageView(gPageView);
        String path=request.getServletContext().getRealPath("/")+"goodsImage\\";
        String uuid= UUID.randomUUID().toString();
        uuid=uuid.replace("-","");
        String goodsImageName=gImage.getOriginalFilename();
        goodsImageName=uuid+goodsImageName;
        String savePath=request.getScheme()+"://"
                +request.getServerName()+":"
                +request.getServerPort()+request.getContextPath()+"/goodsImage/"+goodsImageName;
        g1.setgImage(savePath);
        File target=new File(path,goodsImageName);
        gImage.transferTo(target);
        if(goodsService.updateGoodsById(g1))
        {
            return "redirect:/goods/showAllGoods";
        }
        else {
            model.addAttribute("meg1","修改失败!");
            return "goods/updateGoods";
        }
    }
    @RequestMapping("/selectOneBygId")
    public String selectOneBygId(Model model,@RequestParam("gId")int gId,HttpServletRequest request)
    {
        goods goods=goodsService.showOneGoodsById(gId);
        request.getSession().setAttribute("g2",goods);
        return "redirect:/goods/dianJi";

    }
    @RequestMapping("/dianJi")
    public String dianJi(Model model,HttpServletRequest request)
    {
        goods g3=(goods)request.getSession().getAttribute("g2");
        int num=g3.getgPageView()+1;
        g3.setgPageView(num);
        goodsService.updateGoodsById(g3);
        goods goods=goodsService.showOneGoodsById(g3.getgId());
        model.addAttribute("goods",goods);
        return "goods/dianJi";

    }
}
