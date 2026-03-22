/*
 * Decompiled with CFR 0.152.
 */
public class bLc
extends fpY<bmv_2> {
    private final int krx;
    private final fsi_0 kry;
    private final float[] krz;
    private final float krA;

    public bLc(int n, byte by, fsi_0 fsi_02, float[] fArray, float f2) {
        super(by);
        this.krx = n;
        this.kry = fsi_02;
        this.krz = fArray;
        this.krA = f2;
    }

    public int cuJ() {
        return this.krx;
    }

    public fsi_0 ecq() {
        return this.kry;
    }

    public float[] ecr() {
        return this.krz;
    }

    public float ecs() {
        return this.krA;
    }

    public boolean ect() {
        return this.krz != null;
    }
}

