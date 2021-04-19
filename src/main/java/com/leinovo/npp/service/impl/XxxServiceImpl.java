package com.leinovo.npp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leinovo.npp.mapper.XxxMapper;
import com.leinovo.npp.model.Xxx;
import com.leinovo.npp.service.IXxxService;
import org.springframework.stereotype.Service;

@Service
public class XxxServiceImpl extends ServiceImpl<XxxMapper, Xxx> implements IXxxService {

    @Override
    public void addXxx(Xxx xxx) {
        save(xxx);
    }
}
