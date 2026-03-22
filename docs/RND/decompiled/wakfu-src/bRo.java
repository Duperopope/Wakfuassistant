/*
 * Decompiled with CFR 0.152.
 */
public class bRo
implements aeh_2 {
    public static final String kZP = "name";
    public static final String kZQ = "id";
    public static final String kZR = "selected";
    public static final String kZS = "style";
    public static final String[] kZT = new String[]{"name", "id", "selected", "style"};
    private byte azt;
    private boolean bWn;

    public bRo(byte by) {
        this.azt = by;
    }

    @Override
    public String[] bxk() {
        return kZT;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kZP)) {
            return this.getName();
        }
        if (string.equals(kZQ)) {
            return this.azt;
        }
        if (string.equals(kZS)) {
            return "filter" + this.azt;
        }
        if (string.equals(kZR)) {
            return this.bWn;
        }
        return null;
    }

    private String getName() {
        return aum_0.cWf().c("landMark.type." + this.azt, new Object[0]);
    }

    public byte aJr() {
        return this.azt;
    }

    public void cL(byte by) {
        if (by == this.azt) {
            return;
        }
        this.azt = by;
        fse_1.gFu().a((aef_2)this, kZP);
    }

    public boolean bqr() {
        return this.bWn;
    }

    public boolean f(fsn_1 fsn_12) {
        return this.bWn;
    }

    public void setSelected(boolean bl) {
        if (bl == this.bWn) {
            return;
        }
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, kZR);
    }
}

