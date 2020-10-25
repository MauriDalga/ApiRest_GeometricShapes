package com.mauridalga.geometricshapes.domain.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeometricMathsUtilTest {
    private static final double DELTA = 1e-14;

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
        assertEquals(expectedDiameter, result, DELTA);
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
        assertEquals(expectedArea, result, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateCircleArea_WhitNegativeRadius_ShouldThrowException() {
        // Arrange
        Double circleRadius = -3.3;

        // Act
        Double result = GeometricMathsUtil.calculateCircleArea(circleRadius);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidateTriangleValues_WhitNegativeBase_ShouldThrowException() {
        // Arrange
        Double baseNegative = -2d;

        // Act
        GeometricMathsUtil.validateTriangleValues(baseNegative, 5d, 8d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidateTriangleValues_WhitASideNegative_ShouldThrowException() {
        // Arrange
        Double aNegative = -2d;

        // Act
        GeometricMathsUtil.validateTriangleValues(9d, 5d, aNegative);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidateTriangleValues_WhitCSideNegative_ShouldThrowException() {
        // Arrange
        Double cNegative = -2d;

        // Act
        GeometricMathsUtil.validateTriangleValues(9d, cNegative, 5d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidateTriangleValues_WhitZeroBase_ShouldThrowException() {
        // Arrange
        Double baseZero = 0d;

        // Act
       GeometricMathsUtil.validateTriangleValues(baseZero, 5d, 8d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CalculateTriangleHeight_WhitZeroASide_ShouldThrowException() {
        // Arrange
        Double aZero = 0d;

        // Act
        GeometricMathsUtil.validateTriangleValues(9d, 5d, aZero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidateTriangleValues_WhitZeroCSide_ShouldThrowException() {
        // Arrange
        Double cZero = 0d;

        // Act
        GeometricMathsUtil.validateTriangleValues(9d, cZero, 5d);
    }

    @Test
    public void CalculateTriangleHeight_WhitNullSidesValues_ShouldReturnNull() {
        // Arrange
        Double base = null;
        Double a = null;
        Double c = null;

        // Act
        Double resultBaseNull = GeometricMathsUtil.calculateTriangleHeight(base, 5d, 8d);
        Double resultASideNull = GeometricMathsUtil.calculateTriangleHeight(3d, 5d, a);
        Double resultCSideNull = GeometricMathsUtil.calculateTriangleHeight(7d, c, 8d);

        //Assert
        assertNull(resultBaseNull);
        assertNull(resultASideNull);
        assertNull(resultCSideNull);
    }

    @Test
    public void CalculateTriangleHeight_WhitValidSides_ShouldReturnExpectedHeight() {
        // Arrange
        Double base = 10d;
        Double a = 8d;
        Double c = 6d;
        Double expectedHeight = 4.8d;

        // Act
        Double resultHeight = GeometricMathsUtil.calculateTriangleHeight(base, c, a);

        //Assert
        assertEquals(expectedHeight, resultHeight, DELTA);
    }

    @Test
    public void CalculateTriangleArea_WhitNullSidesValues_ShouldReturnNull() {
        // Arrange
        Double base = null;
        Double a = null;
        Double c = null;

        // Act
        Double resultBaseNull = GeometricMathsUtil.calculateTriangleArea(base, 5d, 8d);
        Double resultASideNull = GeometricMathsUtil.calculateTriangleArea(3d, 5d, a);
        Double resultCSideNull = GeometricMathsUtil.calculateTriangleArea(7d, c, 8d);

        //Assert
        assertNull(resultBaseNull);
        assertNull(resultASideNull);
        assertNull(resultCSideNull);
    }

    @Test
    public void CalculateTriangleArea_WhitValidSides_ShouldReturnExpectedHeight() {
        // Arrange
        Double base = 10d;
        Double a = 8d;
        Double c = 6d;
        Double expectedArea = 24d;

        // Act
        Double resultArea = GeometricMathsUtil.calculateTriangleArea(base, c, a);

        //Assert
        assertEquals(expectedArea, resultArea, DELTA);
    }
}
