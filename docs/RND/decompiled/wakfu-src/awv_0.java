/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWV
 */
class awv_0
implements aaq_2<coz_0> {
    protected awt_0 hvZ;

    awv_0() {
    }

    public String toString() {
        return "AuthentificationTokenMessageRunner{}";
    }

    protected void a(awt_0 awt_02) {
        this.hvZ = awt_02;
    }

    @Override
    public boolean a(coz_0 coz_02) {
        String string = coz_02.bDO();
        if (BH.aU(string)) {
            this.hvZ.cXM();
        } else {
            this.hvZ.kQ(string);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 22522;
    }
}

