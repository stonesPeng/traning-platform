package me.stone.training.platform.spring4all.circular.dependencies.object.case4;

import lombok.extern.slf4j.Slf4j;

/**
 * @author honorStone
 * @version 1.0
 * @email honor_stone@163.com
 * @desc description
 * @since 2021/5/14 16:47
 */
//@Component
@Slf4j
public class TestBeanB {

    private TestBeanA testBeanA;

    public TestBeanB() {
        log.info("TestBeanB construct");
    }

    public void setTestBeanA(TestBeanA testBeanA) {
        log.info("setTestBeanA");
        this.testBeanA = testBeanA;
    }

    public void doSomething() {
        log.info("doSomething");
    }

}
