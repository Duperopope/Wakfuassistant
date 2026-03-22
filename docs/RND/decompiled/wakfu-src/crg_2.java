/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRG
 */
public class crg_2
implements alz_2 {
    private static final String nor = "progress.task.name";
    private static final String nos = "progress.subtask.name";
    private static final String not = "progress.value";
    static final String nou = "progress.task.intro";
    static final String nov = "progress.task.background.visible";
    private int now = 1;

    @Override
    public void g(String string, int n) {
        this.now = n;
        fse_1.gFu().f(nor, string);
        fse_1.gFu().f(not, 0.0);
    }

    @Override
    public void bCj() {
    }

    @Override
    public void eY(String string) {
        fse_1.gFu().f(nor, string == null ? aum_0.cWf().c("loading", new Object[0]) : string);
    }

    @Override
    public void eZ(String string) {
        fse_1.gFu().f(nos, string == null ? "" : string);
    }

    @Override
    public void sX(int n) {
        if (this.now != 0) {
            fse_1.gFu().f(not, (double)n / (double)this.now);
        }
    }

    @Override
    public int bCm() {
        return this.now;
    }
}

