/*
 * Decompiled with CFR 0.152.
 */
import java.text.MessageFormat;

public class Ua {
    short bup;
    boolean bub;
    short buq;
    boolean bur;

    protected Ua() {
    }

    public short biP() {
        return this.buq;
    }

    public boolean biQ() {
        return this.bur;
    }

    public static Ua biR() {
        return new Ua();
    }

    public static Ua pB(int n) {
        Ua ua = new Ua();
        ua.bup = (short)n;
        return ua;
    }

    public Ua bo(boolean bl) {
        this.bub = bl;
        return this;
    }

    public Ua am(short s) {
        this.buq = s;
        return this;
    }

    public boolean biM() {
        return this.bub;
    }

    public short biS() {
        return this.bup;
    }

    public Ua bp(boolean bl) {
        this.bur = bl;
        return this;
    }

    public boolean biT() {
        return this.bup <= 0;
    }

    public String toString() {
        return MessageFormat.format("{0}T{1}{2}", this.bup, this.bub ? "+" : "-", this.bur ? "!" : "");
    }

    public void pC(int n) {
        this.bup = (short)n;
    }
}

