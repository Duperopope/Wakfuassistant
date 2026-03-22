/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from frP
 */
public final class frp_0
extends Enum<frp_0> {
    public static final /* enum */ frp_0 sZY = new frp_0(0, "Instance");
    public static final /* enum */ frp_0 sZZ = new frp_0(1, "Zone");
    public static final /* enum */ frp_0 taa = new frp_0(2, "Coordonn\u00e9es");
    private static final Logger tab;
    private final byte tac;
    private final String tad;
    private static final /* synthetic */ frp_0[] tae;

    public static frp_0[] values() {
        return (frp_0[])tae.clone();
    }

    public static frp_0 valueOf(String string) {
        return Enum.valueOf(frp_0.class, string);
    }

    private frp_0(byte by, String string2) {
        this.tac = by;
        this.tad = string2;
    }

    public byte aJr() {
        return this.tac;
    }

    public static frp_0 hE(byte by) {
        for (frp_0 frp_02 : frp_0.values()) {
            if (frp_02.tac != by) continue;
            return frp_02;
        }
        tab.warn((Object)("type inconnu " + by));
        return sZY;
    }

    public String getDescription() {
        return this.tad;
    }

    private static /* synthetic */ frp_0[] gkv() {
        return new frp_0[]{sZY, sZZ, taa};
    }

    static {
        tae = frp_0.gkv();
        tab = Logger.getLogger(frp_0.class);
    }
}

