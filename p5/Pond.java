package p5;

public class Pond {
    private final int[][] river;

    public Pond() {
        this.river = new int[10][10];
        this.river[0] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.river[1] = new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        this.river[2] = new int[] {0, 0, 0, 1, 1, 1, 0, 0, 0, 0};
        this.river[3] = new int[] {0, 1, 1, 1, 1, 1, 1, 0, 0, 0};
        this.river[4] = new int[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        this.river[5] = new int[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        this.river[6] = new int[] {0, 0, 1, 1, 1, 1, 1, 1, 0, 0};
        this.river[7] = new int[] {0, 0, 0, 1, 1, 1, 1, 0, 0, 0};
        this.river[8] = new int[] {0, 0, 0, 0, 1, 0, 0, 0, 0, 0};
        this.river[9] = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    private void calculate() {
        for (int i = 1; i < river.length - 1; i++) {
            for (int j = 1; j < river[i].length - 1; j++) {
                int pivot = Math.min(
                        Math.min(i, river.length - 1 - i),
                        Math.min(j, river.length - 1 - j)
                );

                for (int k = 1; k <= pivot; k++) {
                    if (river[i - k][j] >= 1
                            && river[i + k][j] >= 1
                            && river[i][j - k] >= 1
                            && river[i][j + k] >= 1
                    ) {
                        river[i][j]++;
                    }
                }
            }
        }
    }

    public void show() {
        this.calculate();
        for (int[] i : river) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }
}
