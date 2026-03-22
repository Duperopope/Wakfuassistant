/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfj
 */
public class bfj_2
implements Sp,
aeh_2 {
    public static final String hRG = "size";
    public static final String hRH = "inventory";
    public static final String hRI = "editable";
    private final bxJ hRJ;

    public bfj_2(bxJ bxJ2) {
        this.hRJ = bxJ2;
        this.hRJ.c(this);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hRG)) {
            return this.hRJ.dNO().bfa();
        }
        if (string.equals(hRH)) {
            bde_0 bde_02 = this.hRJ.dNO();
            Object[] objectArray = new Object[bde_02.fVb().bfa()];
            ffV[] ffVArray = (ffV[])bde_02.fVb().a(new ffV[bde_02.fVb().bfa()]);
            int n = ffVArray.length;
            for (int i = 0; i < n; ++i) {
                objectArray[i] = ffVArray[i] == null ? bEb.dRP() : ffVArray[i];
            }
            return objectArray;
        }
        if (string.equals(hRI)) {
            bDh bDh2 = this.hRJ.dNk();
            return bDh2.Xi() == aue_0.cVJ().cVK().Sn() || cpq_1.og(bDh2.Xi());
        }
        return null;
    }

    public bxJ dfO() {
        return this.hRJ;
    }

    @Override
    public void b(Sl sl) {
        fse_1.gFu().a((aef_2)this, hRH);
    }
}

