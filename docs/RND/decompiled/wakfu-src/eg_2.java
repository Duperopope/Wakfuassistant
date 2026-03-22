/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from EG
 */
public class eg_2 {
    private float[] ayR;
    private float[] ayS;
    private float[] ayT;
    private eh_2[] ayC;

    public float[] aIZ() {
        return this.ayR;
    }

    public void j(float ... fArray) {
        this.ayR = (float[])fArray.clone();
    }

    public float[] aJa() {
        return this.ayS;
    }

    public void k(float ... fArray) {
        this.ayS = (float[])fArray.clone();
    }

    public float[] aJb() {
        return this.ayT;
    }

    public void l(float ... fArray) {
        this.ayT = (float[])fArray.clone();
    }

    public eh_2[] aIH() {
        return this.ayC;
    }

    public void a(eh_2 ... eh_2Array) {
        this.ayC = (eh_2[])eh_2Array.clone();
    }

    public void clear() {
        this.ayR = null;
        this.ayS = null;
        this.ayT = null;
        this.ayC = null;
    }
}

