/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bSo
 */
public class bso_2
implements aeh_2 {
    private static final Logger lfH = Logger.getLogger(bso_2.class);
    public static final String lfI = "nationId";
    public static final String lfJ = "name";
    public static final String lfK = "flagIconUrl";
    public static final String lfL = "description";
    public static final String lfM = "passportStampIconUrl";
    public static final String lfN = "nationColor";
    public static final String lfO = "isLocalNation";
    public static final String[] lfP = new String[]{"nationId", "isLocalNation", "name", "flagIconUrl", "description", "passportStampIconUrl", "nationColor"};
    protected final int lfQ;

    public bso_2(int n) {
        this.lfQ = n;
    }

    @Override
    public String[] bxk() {
        return lfP;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lfJ)) {
            return this.getName();
        }
        if (string.equals(lfI)) {
            return this.lfQ;
        }
        if (string.equals(lfO)) {
            return this.emE();
        }
        if (string.equals(lfK)) {
            return auc_0.cVq().zG(this.lfQ != 0 ? this.lfQ : -1);
        }
        if (string.equals(lfL)) {
            return this.getDescription();
        }
        if (string.equals(lfM)) {
            if (this.lfQ != 0) {
                return auc_0.cVq().a("passportStampIconsPath", "defaultIconPath", this.lfQ);
            }
            return null;
        }
        if (string.equals(lfN)) {
            return this.getColor() == null ? awx_2.dnF : this.getColor();
        }
        return null;
    }

    public boolean emE() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null && this.lfQ == bgt_02.ffF().Xt();
    }

    private axb_2 getColor() {
        String string = brx_1.elI().Jp(this.lfQ);
        return string == null || string.length() == 0 ? null : awx_2.gD(string);
    }

    public String getDescription() {
        return aum_0.cWf().a(56, (long)this.lfQ, new Object[0]);
    }

    public String getName() {
        return aum_0.cWf().a(39, (long)this.lfQ, new Object[0]);
    }

    public int Xt() {
        return this.lfQ;
    }
}

