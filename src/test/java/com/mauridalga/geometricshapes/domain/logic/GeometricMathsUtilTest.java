package com.mauridalga.geometricshapes.domain.logic;

import com.mauridalga.geometricshapes.domain.logic.GeometricMathsUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeometricMathsUtilTest {

    @Test
    public void CalculateCircleDiameter_WhitNullRadius_ShouldReturnNull() {
        // Arrange
        Double circleRadius = null;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);

        //Assert
        assertNull(result);
    }

    @Test
    public void CalculateCircleDiameter_WhitPositiveRadius_ShouldReturnExpectedDiameter() {
        // Arrange
        Double circleRadius = 5.5;
        Double expectedDiameter = 11d;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);

        //Assert
        assertEquals(expectedDiameter, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateCircleDiameter_WhitNegativeRadius_ShouldThrowException() {
        // Arrange
        Double circleRadius = -3.3;

        // Act
        Double result = GeometricMathsUtil.calculateCircleDiameter(circleRadius);
    }

    @Test
    public void CalculateCircleArea_WhitNullRadius_ShouldReturnNull() {
        // Arrange
        Double circleRadius = null;

        // Act
        Double result = GeometricMathsUtil.calculateCircleArea(circleRadius);

        //Assert
        assertNull(result);
    }

    @Test
    public void CalculateCircleArea_WhitPositiveRadius_ShouldReturnExpectedArea() {
        // Arrange
        Double circleRadius = 3d;
        Double expectedArea = 28.274333882308138;

        // Act
        Double result = GeometricMathsUtil.calculateCircleArea(circleRadius);

        //Assert
        assertEquals(expectedArea, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateCircleArea_WhitNegativeRadius_ShouldThrowException() {
        // Arrange
        Double circleRadius = -3.3;

        // Act
        Double result = GeometricMathsUtil.calculateCircleArea(circleRadius);
    }
}
