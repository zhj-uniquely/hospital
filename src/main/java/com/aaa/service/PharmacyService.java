package com.aaa.service;

import com.aaa.entity.Baoque;
import com.aaa.entity.Ypharmacy;

import java.util.List;

public interface PharmacyService {
    //查询药房药品
    List<Ypharmacy> selpharmacy(Ypharmacy ypharmacy);
    //添加药品到报缺表
    int addbaoque(Baoque baoque);
    //查询报缺表药品名称是否已存在
    int selbaoqueName(Baoque baoque);
    int upbaoquenum(Baoque baoque);
}