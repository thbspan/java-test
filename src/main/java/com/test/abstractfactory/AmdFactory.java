package com.test.abstractfactory;

import com.test.factory.Cpu;
import com.test.factory.Mainboard;

public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return null;
    }

    @Override
    public Mainboard createMainboard() {
        return null;
    }
}
