/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSP
 */
public class fsp_1 {
    private fsn_1 veS;
    private fsn_1 veT;
    private float[] bdU;

    public fsp_1(fsn_1 fsn_12, fsn_1 fsn_13, float f2, float f3, float f4, float f5) {
        this.veS = fsn_12;
        this.veT = fsn_13;
        this.bdU = new float[]{f2, f3, f4, f5};
    }

    public void k(fsn_1 fsn_12) {
        this.veS = fsn_12;
    }

    public void l(fsn_1 fsn_12) {
        this.veT = fsn_12;
    }

    public void q(float[] fArray) {
        this.bdU = fArray;
    }

    public fsn_1 gGu() {
        return this.veS;
    }

    public fsn_1 gGv() {
        return this.veT;
    }

    public float[] aXT() {
        return this.bdU;
    }
}

