/*
 * Decompiled with CFR 0.152.
 */
class cBa
implements cBp {
    long mtr = System.currentTimeMillis();

    cBa(cAY cAY2) {
    }

    @Override
    public void hR(long l) {
        if (l > this.mtr + 10000L) {
            bgi_0.bGy();
            bLl.bGy();
            cBk.bGy();
            this.mtr = l;
        }
    }

    @Override
    public void a(cCs cCs2) {
    }
}

