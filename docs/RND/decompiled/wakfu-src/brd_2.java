/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bRD
 */
public class brd_2
implements aeh_2 {
    public static final String laY = "id";
    public static final String laZ = "name";
    public static final String lba = "slogan";
    public static final String lbb = "ballotCount";
    public static final String lbc = "guildName";
    public static final String lbd = "rankDescription";
    public static final String lbe = "wakfuValue";
    public static final String lbf = "wakfuStasisDescription";
    public static final String lbg = "wakfuStasisColor";
    public static final String lbh = "isEnabled";
    public static final String lbi = "actorDescriptorLibrary";
    public static final String lbj = "isGovernor";
    static final String[] lbk = new String[]{"id", "name", "guildName", "rankDescription", "wakfuValue", "wakfuStasisDescription", "wakfuStasisColor", "actorDescriptorLibrary", "isGovernor"};
    static final String[] lbl = new String[]{"slogan", "ballotCount", "isEnabled"};
    private static final String[] lbm = new String[lbl.length + lbk.length];
    protected static final Logger lbn;
    private fkF lbo;
    private bdj_2 hUg;
    private static final int lbp = 10;

    public brd_2(fkF fkF2) {
        this.lbo = fkF2;
    }

    public fkF ela() {
        return this.lbo;
    }

    public void clear() {
        this.hUg.dcP().aZp();
        this.hUg = null;
    }

    @Override
    public String[] bxk() {
        return lbm;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(laZ)) {
            return this.lbo.getName();
        }
        if (string.equals(laY)) {
            return this.lbo.Sn();
        }
        if (string.equals(lba)) {
            return ((fkw)this.lbo).gbZ();
        }
        if (string.equals(lbb)) {
            fjo_0 fjo_02 = brx_1.elI().ems();
            int n = fjo_02.gbA().ekZ();
            short s = ((fkw)this.lbo).gco();
            return n == 0 ? null : aum_0.cWf().c("election.ballotDescription", s * 100 / n, s);
        }
        if (string.equals(lbf)) {
            float f2 = Math.abs(this.lbo.gca());
            return String.format(" : %d ", (int)(f2 * 100.0f)) + "%";
        }
        if (string.equals(lbg)) {
            return this.lbo.gca() < 0.0f ? aid_0.dUE : aid_0.dUD;
        }
        if (string.equals(lbe)) {
            return Float.valueOf(this.lbo.gca());
        }
        if (string.equals(lbd)) {
            return aum_0.cWf().c(fkf_0.gcc().WJ(this.lbo.elc()).clY(), new Object[0]);
        }
        if (string.equals(lbc)) {
            return this.lbo.Ya() == 0L ? null : this.lbo.HR();
        }
        if (string.equals(lbi)) {
            if (this.hUg == null) {
                this.hUg = bdh_1.a(this.lbo);
            }
            return this.hUg;
        }
        if (string.equals(lbj)) {
            return false;
        }
        if (string.equals(lbh)) {
            return this.lbo != null && !((fkw)this.lbo).gcp();
        }
        return null;
    }

    static {
        System.arraycopy(lbl, 0, lbm, 0, lbl.length);
        System.arraycopy(lbk, 0, lbm, lbl.length, lbk.length);
        lbn = Logger.getLogger(brd_2.class);
    }
}

