package com.graphhopper.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class TurnCostConfig {
    private double leftCost = 3;
    private double rightCost = 0.5;
    private double straightCost = 0;
    private double minLeftAngle = 17, maxLeftAngle = 180;
    private double minRightAngle = -17, maxRightAngle = -180;

    public TurnCostConfig() {
    }

    public TurnCostConfig(TurnCostConfig copy) {
        leftCost = copy.leftCost;
        rightCost = copy.rightCost;
        straightCost = copy.straightCost;
        minLeftAngle = copy.minLeftAngle;
        maxLeftAngle = copy.maxLeftAngle;
        minRightAngle = copy.minRightAngle;
        maxRightAngle = copy.maxRightAngle;
    }

    public void setLeftCost(double leftCost) {
        this.leftCost = leftCost;
    }

    public double getLeftCost() {
        return leftCost;
    }

    public void setRightCost(double rightCost) {
        this.rightCost = rightCost;
    }

    public double getRightCost() {
        return rightCost;
    }

    public void setMinLeftAngle(double minLeftAngle) {
        this.minLeftAngle = minLeftAngle;
    }

    public double getMinLeftAngle() {
        return minLeftAngle;
    }

    public void setMaxLeftAngle(double maxLeftAngle) {
        this.maxLeftAngle = maxLeftAngle;
    }

    public double getMaxLeftAngle() {
        return maxLeftAngle;
    }

    public void setMinRightAngle(double minRightAngle) {
        this.minRightAngle = minRightAngle;
    }

    public double getMinRightAngle() {
        return minRightAngle;
    }

    public void setMaxRightAngle(double maxRightAngle) {
        this.maxRightAngle = maxRightAngle;
    }

    public double getMaxRightAngle() {
        return maxRightAngle;
    }

    public void setStraightCost(double straightCost) {
        this.straightCost = straightCost;
    }

    public double getStraightCost() {
        return straightCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TurnCostConfig that = (TurnCostConfig) o;
        return Double.compare(that.leftCost, leftCost) == 0 && Double.compare(that.rightCost, rightCost) == 0
                && Double.compare(that.straightCost, straightCost) == 0 && Double.compare(that.minLeftAngle, minLeftAngle) == 0
                && Double.compare(that.maxLeftAngle, maxLeftAngle) == 0 && Double.compare(that.minRightAngle, minRightAngle) == 0
                && Double.compare(that.maxRightAngle, maxRightAngle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftCost, rightCost, straightCost, minLeftAngle, maxLeftAngle, minRightAngle, maxRightAngle);
    }

    @Override
    public String toString() {
        return "leftCost=" + leftCost + ", rightCost=" + rightCost + ", straightCost=" + straightCost
                + ", minLeftAngle=" + minLeftAngle + ", maxLeftAngle=" + maxLeftAngle
                + ", minRightAngle=" + minRightAngle + ", maxRightAngle=" + maxRightAngle;
    }
}
