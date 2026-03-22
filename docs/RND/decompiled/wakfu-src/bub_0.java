/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from buB
 */
public class bub_0
implements aeh_2,
bek_0,
buz_0 {
    private String jpN;
    private int brR;
    private short bol;
    private bgv_2 iDU;

    private bub_0() {
    }

    @Override
    public String[] bxk() {
        return jpM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("iconUrl")) {
            return auc_0.cVq().zz(this.iDU.aVt());
        }
        if (string.equals("name")) {
            return this.iDU.getName() + " x" + this.bol;
        }
        if (string.equals("quantity")) {
            return this.bol;
        }
        if (string.equals("allowControls")) {
            return true;
        }
        return this.iDU.eu(string);
    }

    @Override
    public boolean gV(boolean bl) {
        this.bol = bl ? (short)0 : (short)(this.bol - 1);
        if (this.bol == 0) {
            return true;
        }
        fse_1.gFu().a((aef_2)this, "quantity");
        return false;
    }

    @Override
    public bgv_2 duo() {
        return this.iDU;
    }

    public String dJe() {
        return this.jpN;
    }

    public static bub_0 a(ur_2 ur_22) {
        try {
            bub_0 bub_02 = new bub_0();
            bub_02.jpN = ur_22.add;
            bub_02.brR = ur_22.Th;
            bub_02.bol = ur_22.aaa;
            bub_02.iDU = (bgv_2)fgD.fXh().Vd(bub_02.brR);
            if (bub_02.iDU == null) {
                throw new IllegalArgumentException("L'item de refId=" + ur_22.Th + " n'existe pas");
            }
            return bub_02;
        }
        catch (Exception exception) {
            throw new bua_0(exception);
        }
    }
}

