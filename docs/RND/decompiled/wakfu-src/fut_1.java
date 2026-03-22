/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUt
 */
class fut_1 {
    static final int vjP = 63;
    static final int vjQ = 16;
    static final int vjR = 31;
    int vjS;
    int[] vjT = new int[31];
    int[] vjU = new int[16];
    int[] vjV = new int[16];
    int[] vjW = new int[16];
    int[][] vjX = new int[16][];
    int vjY;
    int[] vjZ = new int[65];
    float vka;
    float vkb;
    float vkc;
    int vkd;
    int vke;
    int vkf;
    float vkg;
    int vkh;
    int vki;
    int viQ;
    final /* synthetic */ fur_2 vkj;

    fut_1(fur_2 fur_22) {
        this.vkj = fur_22;
        for (int i = 0; i < this.vjX.length; ++i) {
            this.vjX[i] = new int[8];
        }
    }

    void gHW() {
        this.vjT = null;
        this.vjU = null;
        this.vjV = null;
        this.vjW = null;
        this.vjX = null;
        this.vjZ = null;
    }

    Object gHX() {
        fut_1 fut_12 = this;
        fut_1 fut_13 = new fut_1(this.vkj);
        fut_13.vjS = fut_12.vjS;
        System.arraycopy(fut_12.vjT, 0, fut_13.vjT, 0, 31);
        System.arraycopy(fut_12.vjU, 0, fut_13.vjU, 0, 16);
        System.arraycopy(fut_12.vjV, 0, fut_13.vjV, 0, 16);
        System.arraycopy(fut_12.vjW, 0, fut_13.vjW, 0, 16);
        for (int i = 0; i < 16; ++i) {
            System.arraycopy(fut_12.vjX[i], 0, fut_13.vjX[i], 0, 8);
        }
        fut_13.vjY = fut_12.vjY;
        System.arraycopy(fut_12.vjZ, 0, fut_13.vjZ, 0, 65);
        fut_13.vka = fut_12.vka;
        fut_13.vkb = fut_12.vkb;
        fut_13.vkc = fut_12.vkc;
        fut_13.vkd = fut_12.vkd;
        fut_13.vke = fut_12.vke;
        fut_13.vkf = fut_12.vkf;
        fut_13.vkg = fut_12.vkg;
        fut_13.vkh = fut_12.vkh;
        fut_13.vki = fut_12.vki;
        fut_13.viQ = fut_12.viQ;
        return fut_13;
    }
}

