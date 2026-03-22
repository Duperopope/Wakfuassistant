/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from daS
 */
public class das_0
extends dae_0 {
    private bmv_1 ocI;
    private dat_0 ocX;

    public das_0(bmv_1 bmv_12) {
        this.ocI = bmv_12;
        this.ocX = dat_0.ocY;
    }

    public das_0(dat_0 dat_02) {
        this.ocX = dat_02;
    }

    @Override
    public int d() {
        return 19273;
    }

    public bmv_1 fah() {
        return this.ocI;
    }

    public dat_0 fao() {
        return this.ocX;
    }

    public void a(dat_0 dat_02) {
        this.ocX = dat_02;
    }
}

