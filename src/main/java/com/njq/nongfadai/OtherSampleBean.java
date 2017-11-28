package com.njq.nongfadai;

import java.util.Date;

/**
 * Copyright 2017/11/28 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: com.njq.nongfadai
 * @author: Jerrik
 * @date: 2017/11/28 13:46
 */
public class OtherSampleBean {
    private String value;

    private Integer id;

    private Date age;

    private SampleBean childBean;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public SampleBean getChildBean() {
        return childBean;
    }

    public void setChildBean(SampleBean childBean) {
        this.childBean = childBean;
    }
}
