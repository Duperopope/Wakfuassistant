/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from Ya
 */
class ya_0 {
    private final ArrayList<yn_0> bTx = new ArrayList();
    final za_0 bTy;
    private boolean bTz = false;

    ya_0(za_0 za_02) {
        this.bTy = za_02;
    }

    public final void bog() {
        this.bTy.d(this.bTx);
    }

    public final boolean boh() {
        return this.bTx.size() > 0;
    }

    public final void boi() {
        this.bTx.clear();
    }

    public final void boj() {
        if (this.boh() == this.bTz) {
            return;
        }
        if (this.bTz) {
            this.bTy.bhk();
        } else {
            this.bTy.start();
        }
        this.bTz = !this.bTz;
    }

    public final void a(yn_0 yn_02) {
        this.bTx.add(yn_02);
    }
}

