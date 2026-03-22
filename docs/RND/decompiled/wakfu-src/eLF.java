/*
 * Decompiled with CFR 0.152.
 */
class eLF
implements eLE {
    final int qHt;

    eLF(int n) {
        this.qHt = n;
    }

    @Override
    public boolean b(elg_0 elg_02) {
        return elg_02.fzv() >= this.qHt;
    }
}

