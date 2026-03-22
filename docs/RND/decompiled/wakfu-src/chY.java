/*
 * Decompiled with CFR 0.152.
 */
public class chY
extends nr_0 {
    private boolean lUk;
    private boolean lUl;

    public boolean evd() {
        return this.lUk;
    }

    public boolean eve() {
        return this.lUl;
    }

    @Override
    public boolean dn(byte[] byArray) {
        this.lUk = byArray[0] == 1;
        this.lUl = byArray[1] == 1;
        return true;
    }

    @Override
    public int d() {
        return 12572;
    }
}

