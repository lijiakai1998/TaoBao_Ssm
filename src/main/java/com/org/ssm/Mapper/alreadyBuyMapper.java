package com.org.ssm.Mapper;

import com.org.ssm.Pojo.alreadyBuy;
import com.org.ssm.Pojo.appraise;

import java.util.List;

public interface alreadyBuyMapper {

public List<appraise> showAllBuys();
public void delBuysById(int aId);
public List<appraise> search(appraise appraise);
}
