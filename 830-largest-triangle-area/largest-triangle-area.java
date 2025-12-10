class Solution {
    public double largestTriangleArea(int[][] points) {
        int n = points.length;
        double maxArea = 0.0;

        // Try all combinations of 3 points: O(n^3), which is fine for constraints
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];

                for (int k = j + 1; k < n; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    // Area of triangle using vector cross product:
                    // area = 0.5 * |(x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1)|
                    double area = Math.abs(
                        (x2 - x1) * (double)(y3 - y1) - 
                        (x3 - x1) * (double)(y2 - y1)
                    ) / 2.0;

                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }
}
