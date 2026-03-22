/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPS
 */
public class aps_0
extends apz_0
implements aeh_2 {
    public static final String eBg = "name";
    public static final String eBh = "characterName";
    public static final String eBi = "displayedName";
    public static final String eBj = "online";
    public static final String[] eBk = new String[]{"name", "characterName", "displayedName", "online"};
    public static final String eBl = "#";

    public aps_0(String string, String string2, boolean bl, long l) {
        super(string, string2, bl, l);
    }

    public aps_0(long l, String string, String string2) {
        super(l, string, string2);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eBg)) {
            String string2 = this.getName();
            String[] stringArray = string2.split(eBl);
            ahv_2 ahv_22 = new ahv_2();
            if (stringArray.length > 1) {
                ahv_22.e(awx_2.dnF).ceu().c(stringArray[0]).cev().ceD().e(awx_2.dnS).c(eBl).c(stringArray[1]).ceD();
                return ahv_22;
            }
            return ahv_22.e(awx_2.dnF).ceu().c(string2).cev().ceD();
        }
        if (string.equals(eBh)) {
            return this.xO();
        }
        if (string.equals(eBi)) {
            String string3 = this.xO();
            if (string3 != null && !string3.isEmpty()) {
                return string3 + "\n(" + this.getName() + ")";
            }
            return this.getName();
        }
        if (string.equals(eBj)) {
            return this.cBt();
        }
        return null;
    }

    @Override
    public void eN(boolean bl) {
        super.eN(bl);
        aeg_2.caa().a((aef_2)this, eBj, eBi);
    }

    @Override
    public String[] bxk() {
        return eBk;
    }
}

