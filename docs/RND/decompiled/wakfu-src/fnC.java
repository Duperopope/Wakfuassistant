/*
 * Decompiled with CFR 0.152.
 */
public class fnC {
    private fnG sKg;
    private byte sKh;

    fnC() {
    }

    public fnC(fnG fnG2) {
        this.sKg = fnG2;
    }

    public fnG geH() {
        return this.sKg;
    }

    public boolean b(fnB fnB2) {
        return (this.sKh & fnB2.sKc) == fnB2.sKc;
    }

    public void c(fnB fnB2) {
        this.sKh = (byte)(this.sKh | fnB2.sKc);
    }

    public void d(fnB fnB2) {
        this.sKh = (byte)(this.sKh & ~fnB2.sKc);
    }

    public void a(tu_1 tu_12) {
        tu_12.abS = this.sKg.sKn;
        tu_12.abT = this.sKh;
    }

    public void b(tu_1 tu_12) {
        this.sKg = fnG.hd(tu_12.abS);
        this.sKh = tu_12.abT;
    }
}

