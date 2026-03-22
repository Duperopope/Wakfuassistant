/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aPT
 */
public class apt_0
extends aps_0
implements aef_2 {
    public static final String eBm = "notify";
    public static final String[] eBn = new String[]{"notify"};
    public static final String[] eBo = new String[eBn.length + aps_0.eBk.length];
    private boolean ezA;

    public apt_0(String string, String string2, boolean bl, long l, boolean bl2) {
        super(string, string2, bl, l);
        this.ezA = bl2;
    }

    public boolean cAK() {
        return this.ezA;
    }

    public void eJ(boolean bl) {
        this.ezA = bl;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eBm)) {
            return this.cAK();
        }
        return super.eu(string);
    }

    @Override
    public String[] bxk() {
        return eBo;
    }

    static {
        System.arraycopy(eBn, 0, eBo, 0, eBn.length);
        System.arraycopy(aps_0.eBk, 0, eBo, eBn.length, aps_0.eBk.length);
    }
}

