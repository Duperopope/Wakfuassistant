/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fjB
 */
public final class fjb_0
extends Enum<fjb_0> {
    public static final /* enum */ fjb_0 sza = new fjb_0(fjq_0.szU);
    public static final /* enum */ fjb_0 szb = new fjb_0(fjU.szZ);
    public static final /* enum */ fjb_0 szc = new fjb_0(fjS.szX);
    public static final /* enum */ fjb_0 szd = new fjb_0(fjW.sAb);
    public static final /* enum */ fjb_0 sze = new fjb_0(fjm_0.szM);
    public static final /* enum */ fjb_0 szf = new fjb_0(fjc_0.szq);
    public static final /* enum */ fjb_0 szg = new fjb_0(fje_0.szu);
    public static final /* enum */ fjb_0 szh = new fjb_0(fji_0.szF);
    public static final /* enum */ fjb_0 szi = new fjb_0(fjk_0.szH);
    public static final /* enum */ fjb_0 szj = new fjb_0(fjO.szQ);
    public static final /* enum */ fjb_0 szk = new fjb_0(fjg_0.szy);
    public static final /* enum */ fjb_0 szl = new fjb_0(fjY.sAd);
    private static final Logger szm;
    private final fja_0 szn;
    private static final /* synthetic */ fjb_0[] szo;

    public static fjb_0[] values() {
        return (fjb_0[])szo.clone();
    }

    public static fjb_0 valueOf(String string) {
        return Enum.valueOf(fjb_0.class, string);
    }

    private fjb_0(fja_0 fja_02) {
        this.szn = fja_02;
    }

    public static fjz_0 gR(byte by) {
        fjb_0[] fjb_0Array = fjb_0.values();
        if (by < 0 || by > fjb_0Array.length) {
            szm.error((Object)("Impossible de cr\u00e9er une requ\u00eate \u00e0 partir de son ordinal : rodinal en dehors des limites : " + fjb_0.values().length + " max, " + by + " demand\u00e9"));
            return null;
        }
        fjb_0 fjb_02 = fjb_0.values()[by];
        if (fjb_02.szn != null) {
            return fjb_02.szn.gbX();
        }
        return null;
    }

    private static /* synthetic */ fjb_0[] gbY() {
        return new fjb_0[]{sza, szb, szc, szd, sze, szf, szg, szh, szi, szj, szk, szl};
    }

    static {
        szo = fjb_0.gbY();
        szm = Logger.getLogger(fjb_0.class);
    }
}

