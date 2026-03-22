/*
 * Decompiled with CFR 0.152.
 */
public class dbb
extends dae_0 {
    private final String odn;
    private final String odo;
    private final byte odp;
    private final byte odq;

    public dbb(String string, String string2, byte by, byte by2) {
        this.odn = string;
        this.odo = string2;
        this.odp = by;
        this.odq = by2;
    }

    public String bAD() {
        return this.odn;
    }

    public String getDescription() {
        return this.odo;
    }

    public byte faA() {
        return this.odp;
    }

    public byte faB() {
        return this.odq;
    }
}

