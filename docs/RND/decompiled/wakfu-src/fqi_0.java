/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fqi
 */
public final class fqi_0
extends Enum<fqi_0>
implements aoq_1 {
    public static final /* enum */ fqi_0 sSg = new fqi_0(0, "Ressource Auto-respawn");
    public static final /* enum */ fqi_0 sSh = new fqi_0(1, "Ressource r\u00e9serv\u00e9e aux Challenges");
    public static final /* enum */ fqi_0 sSi = new fqi_0(2, "Ressource qu'il ne faut pas sauvegarder");
    public static final /* enum */ fqi_0 sSj = new fqi_0(3, "Ressource non prisent en compte par les lois");
    public static final /* enum */ fqi_0 sSk = new fqi_0(4, "Ressource r\u00e9serv\u00e9e aux Chaos");
    private final int sSl;
    private final String sSm;
    private static final /* synthetic */ fqi_0[] sSn;

    public static fqi_0[] values() {
        return (fqi_0[])sSn.clone();
    }

    public static fqi_0 valueOf(String string) {
        return Enum.valueOf(fqi_0.class, string);
    }

    private fqi_0(int n2, String string2) {
        this.sSl = n2;
        this.sSm = string2;
    }

    @Nullable
    public static fqi_0 YT(int n) {
        fqi_0[] fqi_0Array = fqi_0.values();
        for (int i = 0; i < fqi_0Array.length; ++i) {
            fqi_0 fqi_02 = fqi_0Array[i];
            if (fqi_02.sSl != n) continue;
            return fqi_02;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sSl);
    }

    @Override
    public String aXB() {
        return this.sSm;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ fqi_0[] ghP() {
        return new fqi_0[]{sSg, sSh, sSi, sSj, sSk};
    }

    static {
        sSn = fqi_0.ghP();
    }
}

