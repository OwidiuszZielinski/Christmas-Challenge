public class StarByInCodeWorld {

    public static void main(String[] args) {
        int size = 22;

        drawStar(size);
        // simpler version

    }

    private static void drawStar(int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < height * 2; x++) {
                if (isInsideTopTriangle(height, x, y) || isInsideBottomUpsideDownTriangle(height, x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isInsideTopTriangle(int height, int x, int y) {
        int triangleHeight = height * 2 / 3;
        return y <= triangleHeight && y >= triangleHeight - x && y >= x - triangleHeight;
    }

    private static boolean isInsideBottomUpsideDownTriangle(int height, int x, int y) {
        int offsetY = height / 3;
        int triangleHeight = height * 2 / 3;
        return y >= offsetY && (y < x + height - triangleHeight && y < -x + height + triangleHeight);
    }


}


