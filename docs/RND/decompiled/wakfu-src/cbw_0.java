/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBW
 */
public abstract class cbw_0
implements cbp_0 {
    private boolean myU = false;

    @Override
    public boolean bDL() {
        return this.myU;
    }

    public void jH(boolean bl) {
        this.myU = bl;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.myU = apl_12.bFS();
        this.D(apl_12);
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.ay(this.myU);
        this.q(fs_02);
    }

    @Override
    public boolean isValid() {
        if (this.myU) {
            return !this.eIS();
        }
        return this.eIS();
    }

    public String toString() {
        Object object = this.eIU();
        if (this.myU) {
            object = "[NON] " + (String)object;
        }
        return object;
    }

    @Override
    public abstract cbp_0 eIV();

    protected abstract boolean eIS();

    protected abstract void D(apl_1 var1);

    protected abstract void q(fs_0 var1);

    protected abstract String eIU();

    public /* synthetic */ Object clone() {
        return this.eIV();
    }
}

