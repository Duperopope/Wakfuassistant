/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bny
 */
public class bny_2
implements aeh_2 {
    public static final String iII = "name";
    public static final String iIJ = "guildPerms";
    public static final String iIK = "anonymousPerms";
    public static final String iIL = "individualPerms";
    public static final String iIM = "iconUrl";
    private static final String[] iIN = new String[]{"name", "guildPerms", "anonymousPerms", "individualPerms", "iconUrl"};
    final int iIO;
    private int ciZ;
    final fnE iIP;
    private final ArrayList<bnz_2> iIQ = new ArrayList();

    public bny_2(int n, fnE fnE2) {
        this.iIO = n;
        Object r = fgD.fXh().Vd(this.iIO);
        if (r != null) {
            this.ciZ = ((fhc_0)r).aVt();
        }
        this.iIP = fnE2;
        this.dyp();
    }

    public boolean a(fnG fnG2) {
        fnC fnC2 = this.iIP.b(fnG2);
        return fnC2 != null && fnC2.b(fnB.Xq(this.iIO));
    }

    public int aHp() {
        return this.iIO;
    }

    @Override
    public String[] bxk() {
        return iIN;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iII)) {
            return this.getName();
        }
        if (string.equals(iIJ)) {
            return this.a(fnG.sKm);
        }
        if (string.equals(iIK)) {
            return this.a(fnG.sKl);
        }
        if (string.equals(iIL)) {
            return this.iIQ;
        }
        if (string.equals(iIM)) {
            return auc_0.cVq().a("itemsIconsPath", "defaultIconPath", this.ciZ);
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().c(String.format("%s.%s", "roomType", this.iIO), new Object[0]);
    }

    public void dyp() {
        this.iIQ.clear();
        azz_1<fnD> azz_12 = this.iIP.geI();
        int n = azz_12.size();
        for (int i = 0; i < n; ++i) {
            this.iIQ.add(new bnz_2(this, (fnD)azz_12.get(i)));
        }
        fse_1.gFu().a((aef_2)this, iIL);
    }

    public void dzo() {
        for (int i = this.iIQ.size() - 1; i >= 0; --i) {
            this.iIQ.get(i).dzp();
        }
    }

    public String toString() {
        return "RoomView{m_typeId=" + this.iIO + ", m_gfxId=" + this.ciZ + ", m_dimensionalBagPermissions=" + String.valueOf(this.iIP) + ", m_individualPermissionsView=" + String.valueOf(this.iIQ) + "}";
    }
}

