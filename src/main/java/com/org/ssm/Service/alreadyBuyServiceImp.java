package com.org.ssm.Service;

import com.org.ssm.Mapper.alreadyBuyMapper;
import com.org.ssm.Pojo.alreadyBuy;
import com.org.ssm.Pojo.appraise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alreadyBuyService")
public class alreadyBuyServiceImp implements alreadyBuyService {

@Autowired
    alreadyBuyMapper alreadyBuyMapper;
    @Override
    public List<appraise> showAllBuys() {
        return alreadyBuyMapper.showAllBuys();
    }

    @Override
    public void delBuysById(int aId) {
        alreadyBuyMapper.delBuysById(aId);
    }

    @Override
    public List<appraise> search(appraise appraise) {
        return alreadyBuyMapper.search(appraise);
    }
}
