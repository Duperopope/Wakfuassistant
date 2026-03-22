/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

/*
 * Renamed from bEI
 */
class bei_0
implements Consumer<eKW> {
    private final int jRj;
    boolean jRk;

    bei_0(int n) {
        this.jRj = n;
    }

    public void h(eKW eKW2) {
        bmk_2 bmk_22 = new bmk_2(eKW2.d(), this.jRj);
        if (bmk_22.dwo()) {
            bmk_22.Ek(this.jRj);
            bmk_22.gB(true);
        }
        if (!bmk_22.dxk()) {
            return;
        }
        this.jRk = true;
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.h((eKW)object);
    }
}

