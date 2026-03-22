/*
 * Decompiled with CFR 0.152.
 */
public class aKt
extends aad_0 {
    private static final aKt eeq = new aKt();
    private static final String eer = "debugDisplayer";

    public static aKt ciM() {
        return eeq;
    }

    private aKt() {
        super(eer, aid_0.dUT);
    }

    public void a(int n, int[][] nArray) {
        this.bqC();
        for (int i = 0; i < n; ++i) {
            int[] nArray2 = nArray[i];
            this.E(nArray2[0], nArray2[1], (short)nArray2[2]);
        }
    }
}

