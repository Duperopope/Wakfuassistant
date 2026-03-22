/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bMF
 */
public abstract sealed class bmf_0
extends Enum<bmf_0>
permits bmg_1, bmh_0, bmi_1, bmj_0, bmk_0, bml_0, bmm_0 {
    public static final /* enum */ bmf_0 kyZ = new bmg_1();
    public static final /* enum */ bmf_0 kza = new bmh_0();
    public static final /* enum */ bmf_0 kzb = new bmi_1();
    public static final /* enum */ bmf_0 kzc = new bmj_0();
    public static final /* enum */ bmf_0 kzd = new bmk_0();
    public static final /* enum */ bmf_0 kze = new bml_0();
    public static final /* enum */ bmf_0 kzf = new bmm_0();
    private static final Logger kzg;
    private static final /* synthetic */ bmf_0[] kzh;

    public static bmf_0[] values() {
        return (bmf_0[])kzh.clone();
    }

    public static bmf_0 valueOf(String string) {
        return Enum.valueOf(bmf_0.class, string);
    }

    public abstract short aIi();

    public static bmf_0 ck(short s) {
        switch (s) {
            case 1: {
                return kza;
            }
            case 2: {
                return kzb;
            }
            case 3: {
                return kzc;
            }
            case 4: {
                return kzd;
            }
            case 5: {
                return kze;
            }
            case 6: {
                return kzf;
            }
            case 0: {
                return kyZ;
            }
        }
        kzg.warn((Object)("Mauvais type de display " + s));
        return null;
    }

    public String toString() {
        return aum_0.cWf().c(String.format("%s%s", "spellsTab.filterType.", this.aIi()), new Object[0]);
    }

    private static /* synthetic */ bmf_0[] eeZ() {
        return new bmf_0[]{kyZ, kza, kzb, kzc, kzd, kze, kzf};
    }

    static {
        kzh = bmf_0.eeZ();
        kzg = Logger.getLogger(bmf_0.class);
    }
}

