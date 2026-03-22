/*
 * Decompiled with CFR 0.152.
 */
public class dcd
extends dae_0 {
    private final String oen;
    private final String oeo;
    private final int oep;
    private final biu_1 oeq;
    private final aef_2 oer;

    public dcd(String string, String string2, biu_1 biu_12) {
        this(string, string2, biu_12, -1);
    }

    public dcd(String string, String string2, biu_1 biu_12, int n) {
        this(string, string2, biu_12, n, null);
    }

    public dcd(String string, String string2, biu_1 biu_12, int n, aef_2 aef_22) {
        this.oen = string;
        this.oeo = string2;
        this.oeq = biu_12;
        this.oep = n;
        this.oer = aef_22;
    }

    public String bAD() {
        return this.oen;
    }

    public String getText() {
        return this.oeo;
    }

    public biu_1 dZx() {
        return this.oeq;
    }

    public int getSoundId() {
        return this.oep;
    }

    public aef_2 fbo() {
        return this.oer;
    }

    @Override
    public int d() {
        return 19247;
    }
}

