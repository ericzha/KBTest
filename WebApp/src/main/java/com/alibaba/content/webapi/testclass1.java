package com.alibaba.content.webapi;

import com.alibaba.content.dataservice.*;

import com.alibaba.content.searchengine.*;

public class testclass1 {
    private daotest1 d1;
    private enginetest1 e1;
    public testclass1()
    {
        d1 = new daotest1();
        e1 = new enginetest1();
    }
    public String getTestMessage()
    {
        return "DAO:" + d1.getDaoName() + ", Engine: " + e1.getEngineName();
    }
}
