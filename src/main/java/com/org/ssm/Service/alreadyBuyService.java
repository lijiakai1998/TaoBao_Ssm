package com.org.ssm.Service;

import com.org.ssm.Pojo.alreadyBuy;
import com.org.ssm.Pojo.appraise;

import java.util.List;

public interface alreadyBuyService {

    public List<appraise> showAllBuys();
    public void delBuysById(int aId);
    public List<appraise> search(appraise appraise);
}
