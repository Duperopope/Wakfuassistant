/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from btQ
 */
public class btq_0 {
    private btr_0 jmp = btr_0.jmq;

    public boolean isEnabled() {
        return this.jmp != btr_0.jmq;
    }

    public void dIh() {
        int n = (this.jmp.ordinal() + 1) % btr_0.values().length;
        this.jmp = btr_0.values()[n];
    }

    public void a(btr_0 btr_02) {
        this.jmp = btr_02;
    }

    public btr_0 dIi() {
        return this.jmp;
    }

    public void cancel() {
        this.jmp = btr_0.jmq;
    }
}

