/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

class bsL
implements ewq_2 {
    @NotNull
    private final ewu_2 jjb = new ewu_2(new ayk_2(), abb_2.bUA());
    private long jiU;
    final /* synthetic */ bsj_0 jjc;

    bsL(bsj_0 bsj_02) {
        this.jjc = bsj_02;
        this.jjb.a(this);
    }

    @Override
    public void Fs(int n) {
        if (this.jiU == 0L) {
            return;
        }
        long l = this.jiU;
        this.jiU = 0L;
        bgy bgy2 = (bgy)this.jjc.qJ(l);
        if (bgy2 == null) {
            String string = "[TURNS] Tour expir\u00e9 pour le fighter #" + l + ", or celui-ci est absent";
            bsj_0.aGh().warn((Object)string);
            return;
        }
        this.jjc.bf(bgy2);
    }

    @Override
    public ewq_2 dHg() {
        return this;
    }

    public void dHh() {
        this.jiU = 0L;
        this.jjb.dHh();
    }

    public void s(long l, long l2) {
        this.jiU = l2;
        this.jjb.Y(l, 65535);
    }

    public boolean dHi() {
        return this.jjb.dHi();
    }

    public String toString() {
        return "ClockHandler{m_innerHandler=" + String.valueOf(this.jjb) + ", m_currentFighterId=" + this.jiU + "}";
    }
}

