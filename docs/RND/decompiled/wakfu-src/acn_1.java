/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aCn
 */
public class acn_1 {
    private static final int[] dAI = new int[]{0, 0};
    private static final int[][] dAJ = new int[][]{{1, 0}, {0, 1}};
    private static final int[][] dAK = new int[][]{{-1, 0}, {0, -1}};
    private int dAL = 0;
    private int cxt = 0;
    private int dAM;

    public int[] bWT() {
        if (this.dAL == 0) {
            this.dAL = 1;
            this.dAM = 0;
            return dAI;
        }
        ++this.cxt;
        int[][] nArray = this.dAL % 2 == 0 ? dAK : dAJ;
        int[] nArray2 = nArray[this.dAM];
        if (this.cxt == this.dAL) {
            if (this.dAM == 0) {
                this.dAM = 1;
                this.cxt = 0;
            } else {
                this.dAM = 0;
                this.cxt = 0;
                ++this.dAL;
            }
        }
        return nArray2;
    }
}

