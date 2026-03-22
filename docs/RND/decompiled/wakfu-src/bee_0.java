/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEE
 */
public class bee_0
implements aeh_2,
ejl_0,
fgf_0 {
    public static final String jPs = "isRefItem";
    public static final String jPt = "backgroundStyle";
    public static final String jPu = "isQuestItem";
    private static final String[] jPv = new String[]{"isRefItem", "backgroundStyle", "isQuestItem"};
    private final ffV jPw;

    public bee_0(ffV ffV2) {
        this.jPw = ffV2;
    }

    @Override
    public String[] bxk() {
        return jPv;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jPs)) {
            return true;
        }
        if (string.equals(jPt)) {
            ffV ffV2 = (ffV)fse_1.gFu().aW("itemDetail", "inventoryDialog");
            if (ffV2 != null && this.jPw.avr() == ffV2.avr()) {
                return beh_1.jNF.getStyle();
            }
            return beh_1.jNH.getStyle();
        }
        if (string.equals("isActive")) {
            return false;
        }
        if (string.equals(jPu)) {
            return true;
        }
        return this.jPw.eu(string);
    }

    public ffV dSy() {
        return this.jPw;
    }

    public int dut() {
        return this.jPw.avr();
    }

    public short cmL() {
        return this.jPw.cmL();
    }

    @Override
    public ffV getItem() {
        return this.dSy();
    }

    @Override
    public ejm_0 drG() {
        return ejm_0.qyU;
    }

    @Override
    public Object drH() {
        return this.dut();
    }

    @Override
    public String drI() {
        return this.jPw.getName();
    }
}

