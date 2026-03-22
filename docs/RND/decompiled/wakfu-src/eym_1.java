/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eYm
 */
public final class eym_1
extends ff_1 {
    private final exz_1 rJt;
    private final fi_1[] rJu;
    private final eyi_1 rJv;
    private final eyg_1 rJw;
    private final eye_1 rJx;
    private final eyj_1 rJy;
    private final eyn_1 rJz;
    private final eyd_1 rJA;
    private final eyh_1 rJB;
    private final eyf_1 rJC;

    public eym_1(exz_1 exz_12) {
        this.rJt = exz_12;
        this.rJv = new eyi_1(exz_12);
        this.rJw = new eyg_1(exz_12);
        this.rJx = new eye_1(exz_12);
        this.rJy = new eyj_1(exz_12);
        this.rJz = new eyn_1(exz_12);
        this.rJB = new eyh_1(exz_12);
        this.rJA = new eyd_1(exz_12);
        this.rJC = new eyf_1(exz_12);
        this.rJu = new fi_1[]{this.rJv, this.rJw, this.rJx, this.rJy, this.rJz, this.rJB, this.rJA, this.rJC};
    }

    public byte[] apI() {
        return this.a(this.zj());
    }

    public exz_1 eJ(byte[] byArray) {
        this.as(byArray);
        return this.rJt;
    }

    @Override
    public fi_1[] zj() {
        return this.rJu;
    }

    public byte[] fPv() {
        return this.a(new fi_1[]{this.rJx});
    }

    public byte[] fPw() {
        return this.a(new fi_1[]{this.rJw});
    }

    public byte[] fPx() {
        return this.a(this.rJy, this.rJC);
    }

    public byte[] fPy() {
        return this.a(new fi_1[]{this.rJz});
    }

    public byte[] fPz() {
        return this.a(new fi_1[]{this.rJB});
    }

    public byte[] fPA() {
        return this.a(new fi_1[]{this.rJA});
    }

    public eyl_1 fPB() {
        return this.rJB;
    }

    public byte[] fPC() {
        return this.a(this.rJv, this.rJw, this.rJx, this.rJy, this.rJz, this.rJC);
    }

    public byte[] fPD() {
        return this.a(this.rJv, this.rJw, this.rJx, this.rJy, this.rJA);
    }
}

