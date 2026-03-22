/*
 * Decompiled with CFR 0.152.
 */
public class Ub
extends Ud {
    protected Ub() {
    }

    public Ub(QD qD, long l) {
        this();
        this.u(qD);
        this.fg(l);
    }

    @Override
    protected void b(Uh uh) {
        uh.a(this);
    }

    @Override
    public void clean() {
        if (this.but != null) {
            this.but.aZp();
        }
        this.biV();
    }
}

