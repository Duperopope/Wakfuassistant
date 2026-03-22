/*
 * Decompiled with CFR 0.152.
 */
public class cCv
implements cCk {
    public static final byte mzW = 0;
    private cCw mzX;

    public cCv() {
    }

    public cCv(cCw cCw2) {
        this.mzX = cCw2;
    }

    public void a(cCw cCw2) {
        this.mzX = cCw2;
    }

    public cCw eJy() {
        return this.mzX;
    }

    @Override
    public boolean c(cCs cCs2) {
        if (cCs2.eJm() != 0) {
            return false;
        }
        cCx cCx2 = (cCx)cCs2;
        return cCx2.eJB() == this.mzX;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.mzX = cCw.dY(apl_12.aIy());
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.g(this.mzX.aJr());
    }

    @Override
    public byte eIT() {
        return 0;
    }

    @Override
    public cCk eJk() {
        return new cCv(this.mzX);
    }

    public /* synthetic */ Object clone() {
        return this.eJk();
    }
}

