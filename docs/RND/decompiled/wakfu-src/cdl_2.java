/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDl
 */
class cdl_2
implements aeh_2 {
    private bjc_1 mTa;
    private final arx_1 mTb;
    public static final String mTc = "currentColor";
    public static final String mTd = "red";
    public static final String mTe = "green";
    public static final String mTf = "blue";
    public static final String mTg = "red255";
    public static final String mTh = "green255";
    public static final String mTi = "blue255";
    public static final String mTj = "name";
    public static final String mTk = "floatString";
    public static final String[] mTl = new String[]{"currentColor", "red", "green", "blue", "red255", "green255", "blue255", "name", "floatString"};

    public cdl_2(bjc_1 bjc_12, arx_1 arx_12) {
        this.mTa = bjc_12;
        this.mTb = arx_12;
    }

    @Override
    public String[] bxk() {
        return mTl;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(mTc)) {
            return this.mTa;
        }
        if (string.equals(mTd)) {
            return Float.valueOf(this.mTa.aIU());
        }
        if (string.equals(mTe)) {
            return Float.valueOf(this.mTa.aIV());
        }
        if (string.equals(mTf)) {
            return Float.valueOf(this.mTa.aIW());
        }
        if (string.equals(mTg)) {
            return (int)(this.mTa.aIU() * 255.0f);
        }
        if (string.equals(mTh)) {
            return (int)(this.mTa.aIV() * 255.0f);
        }
        if (string.equals(mTi)) {
            return (int)(this.mTa.aIW() * 255.0f);
        }
        if (string.equals(mTj)) {
            return this.mTb.name();
        }
        if (string.equals(mTk)) {
            return GC.a(this.mTa.aIU(), 2) + "f, " + GC.a(this.mTa.aIV(), 2) + "f, " + GC.a(this.mTa.aIW(), 2) + "f";
        }
        return null;
    }

    public void i(float f2) {
        this.mTa = new bjc_1(f2, this.mTa.aIV(), this.mTa.aIW());
        fse_1.gFu().a((aef_2)this, mTl);
    }

    public void j(float f2) {
        this.mTa = new bjc_1(this.mTa.aIU(), f2, this.mTa.aIW());
        fse_1.gFu().a((aef_2)this, mTl);
    }

    public void k(float f2) {
        this.mTa = new bjc_1(this.mTa.aIU(), this.mTa.aIV(), f2);
        fse_1.gFu().a((aef_2)this, mTl);
    }

    public void a(fax_1 fax_12) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdj_2 bdj_22 = bgt_02.ddI();
        bjc_1.a(this.mTa, (ZC)bdj_22, this.mTb, true);
        bdj_22.bD(true);
        fse_1.gFu().a((aef_2)bgt_02, bgt_02.bxk());
    }
}

