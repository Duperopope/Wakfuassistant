/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSp
 */
public class bsp_2
implements aeh_2 {
    public static final String lfR = "name";
    public static final String lfS = "description";
    public static final String lfT = "ownerName";
    public static final String lfU = "localPlayerHasRightToNominate";
    public static final String lfV = "localPlayerHasRightToRevoke";
    public static final String lfW = "iconUrl";
    public static final String lfX = "isSelf";
    private fkL lfY;
    private String lfZ;
    static final String[] lga = new String[]{"name", "ownerName"};
    static final String[] lgb = new String[]{"localPlayerHasRightToNominate", "localPlayerHasRightToRevoke", "iconUrl", "description"};
    private static final String[] lgc = new String[lgb.length + lga.length];

    public bsp_2(fkL fkL2) {
        this.lfY = fkL2;
    }

    public fkL emF() {
        return this.lfY;
    }

    public long emG() {
        return this.lfY.Sn();
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lfR)) {
            return this.getName();
        }
        if (string.equals(lfV)) {
            fkJ fkJ2 = brx_1.elI().ems().gbB();
            fkH fkH2 = fkJ2.uc(aue_0.cVJ().cVK().Sn());
            if (fkH2 == null) {
                return false;
            }
            return fkM.b(fkH2.emF(), this.lfY);
        }
        if (string.equals(lfU)) {
            fkJ fkJ3 = brx_1.elI().ems().gbB();
            fkH fkH3 = fkJ3.uc(aue_0.cVJ().cVK().Sn());
            if (fkH3 == null) {
                return false;
            }
            return fkM.a(fkH3.emF(), this.lfY);
        }
        if (string.equals(lfW)) {
            return auc_0.cVq().a("governmentRankIconPath", "defaultIconPath", this.lfY.gcC());
        }
        if (string.equals(lfS)) {
            return aum_0.cWf().a(40, (long)((short)this.lfY.Sn()), new Object[0]);
        }
        if (string.equals(lfT)) {
            return this.lfZ;
        }
        if (string.equals(lfX)) {
            return aue_0.cVJ().cVK().getName().equals(this.lfZ);
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().a(57, (long)((int)this.lfY.Sn()), new Object[0]);
    }

    public void ny(String string) {
        this.lfZ = string;
        fse_1.gFu().a((aef_2)this, lfT);
    }

    @Override
    public String[] bxk() {
        return lgc;
    }

    static {
        System.arraycopy(lgb, 0, lgc, 0, lgb.length);
        System.arraycopy(lga, 0, lgc, lgb.length, lga.length);
    }
}

