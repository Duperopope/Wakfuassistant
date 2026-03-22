/*
 * Decompiled with CFR 0.152.
 */
public class fnD {
    private long aXv;
    private String p;
    private byte sKh;

    fnD() {
    }

    public fnD(long l, String string) {
        this.aXv = l;
        this.p = string;
    }

    public long Sn() {
        return this.aXv;
    }

    public String getName() {
        return this.p;
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

    public void a(tv_2 tv_22) {
        tv_22.abV = this.aXv;
        tv_22.abW = this.p;
        tv_22.abT = this.sKh;
    }

    public void b(tv_2 tv_22) {
        this.aXv = tv_22.abV;
        this.p = tv_22.abW;
        this.sKh = tv_22.abT;
    }
}

