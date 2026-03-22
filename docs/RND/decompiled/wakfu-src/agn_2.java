/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGn
 */
public abstract class agn_2
extends RuntimeException
implements agb_2 {
    public static final String dKT = "lua-exec";
    private final String dKU;
    private final String dKV;

    agn_2(String string, String string2, String string3) {
        super(string3);
        this.dKU = string;
        this.dKV = string2;
    }

    @Override
    public String[] bHQ() {
        return new String[]{dKT, this.dKU, this.dKV};
    }
}

