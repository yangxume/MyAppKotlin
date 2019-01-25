package com.kotlin.retrofit.bean;

import java.util.List;

/**
 * Copyright
 * <p>
 * Created by xuyang on 2018/12/31 15:36
 * <p>
 * email xuyangme@126.com
 * <p>
 * ${FILENAME}
 * <p>
 * Description
 * <p>
 * Update records:
 */
public class OperateBean {

    private List<Electricity> electricityList;

    public static class Electricity{

        private int month;
        private int electricity;

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getElectricity() {
            return electricity;
        }

        public void setElectricity(int electricity) {
            this.electricity = electricity;
        }
    }

    //空调用电
    private double electricityAirConditioner;
    //照明用电
    private double electricityLighting;
    //动力用电
    private double ElectricityPower;
    //特殊用电
    private double ElectricitySpecial;
    //备用
    private double ElectricityStandby;

    public List<Electricity> getElectricityList() {
        return electricityList;
    }

    public void setElectricityList(List<Electricity> electricityList) {
        this.electricityList = electricityList;
    }

    public double getElectricityAirConditioner() {
        return electricityAirConditioner;
    }

    public void setElectricityAirConditioner(double electricityAirConditioner) {
        this.electricityAirConditioner = electricityAirConditioner;
    }

    public double getElectricityLighting() {
        return electricityLighting;
    }

    public void setElectricityLighting(double electricityLighting) {
        this.electricityLighting = electricityLighting;
    }

    public double getElectricityPower() {
        return ElectricityPower;
    }

    public void setElectricityPower(double electricityPower) {
        ElectricityPower = electricityPower;
    }

    public double getElectricitySpecial() {
        return ElectricitySpecial;
    }

    public void setElectricitySpecial(double electricitySpecial) {
        ElectricitySpecial = electricitySpecial;
    }

    public double getElectricityStandby() {
        return ElectricityStandby;
    }

    public void setElectricityStandby(double electricityStandby) {
        ElectricityStandby = electricityStandby;
    }
}
