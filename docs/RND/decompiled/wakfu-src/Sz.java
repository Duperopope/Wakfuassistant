/*
 * Decompiled with CFR 0.152.
 */
public class Sz
extends sb_0 {
    public Sz() {
    }

    public Sz(String string) {
        super(string);
    }

    public Sz(String string, RT rT, RT rT2) {
        super(string + Sz.b(rT, rT2));
    }

    public Sz(String string, Throwable throwable) {
        super(string, throwable);
    }

    public Sz(Throwable throwable) {
        super(throwable);
    }

    private static String b(RT rT, RT rT2) {
        return " (current item:{ " + (rT2 == null ? "null" : rT2.bfi()) + " } ; new item:{ " + (rT == null ? "null" : rT.bfi()) + " })";
    }
}

