package com.mauridalga.geometricshapes.domain.logic;

final class GeometricMathsUtil {
    private GeometricMathsUtil() {
    }

    public static Double calculateCircleDiameter(Double circleRadius) {
        if (circleRadius == null) {
            return null;
        }

        if (circleRadius < 0) {
            throw new IllegalArgumentException("Circle radius cannot be negative");
        }

        return circleRadius * 2;
    }

    public static Double calculateCircleArea(Double circleRadius) {
        if (circleRadius == null) {
            return null;
        }

        if (circleRadius < 0) {
            throw new IllegalArgumentException("Circle radius cannot be negative");
        }

        return Math.pow(circleRadius, 2) * Math.PI;
    }

    /**
     * Calculate the height of a triangle respect of 'b' side for any type of triangle
     *
     * @param b this parameter is considered base of triangle.
     * @param c another side of triangle.
     * @param a another side of triangle.
     * @return the height of triangle of the base perspective, return null if some side value is null. Throw IllegalArgumentException
     * if some value is minor or equal to zero. In that case these values don't correspond to a triangle.
     */
    public static Double calculateTriangleHeight(Double b, Double c, Double a) {
        if (b == null || c == null || a == null) {
            return null;
        }

        validateTriangleValues(b, c, a);

        double cosAlpha = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double alphaAngle = Math.acos(cosAlpha);
        return c * Math.sin(alphaAngle);
    }

    public static Double calculateTriangleArea(Double b, Double c, Double a) {
        if (b == null || c == null || a == null) {
            return null;
        }

        validateTriangleValues(b, c, a);

        Double height = calculateTriangleHeight(b, c, a);
        return (b * height) / 2;
    }

    public static Double calculateSquareArea(Double base) {
        if (base == null) {
            return null;
        }

        if (base <= 0) {
            throw new IllegalArgumentException("Square base cannot be negative or zero");
        }

        return base * base;
    }

    //Package private method for testing purposes
    static void validateTriangleValues(Double b, Double c, Double a) {
        if (b <= 0 || c <= 0 || a <= 0) {
            throw new IllegalArgumentException("Triangle sides cannot be negative or zero values");
        }
    }
}
