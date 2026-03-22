/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bQY
 */
public class bqy_0
implements aeh_2,
bNC {
    private static final Logger kYp = Logger.getLogger(bqy_0.class);
    public static final String kYq = "guildName";
    public static final String kYr = "buildingList";
    public static final String kYs = "evolutingBuildingList";
    public static final String kYt = "buildingsOpenned";
    public static final String kYu = "evolutingBuildingsOpenned";
    public static final String kYv = "havenWorldName";
    public static final String kYw = "numBuildings";
    public static final String kYx = "kamasTotalCost";
    public static final String kYy = "resourcesTotalCost";
    public static final String kYz = "nextBuildingText";
    public static final String kYA = "guildBlazon";
    public static final String kYB = "isSold";
    public static final String kYC = "guildId";
    public static final String kYD = "isGuildOnly";
    public static final String[] kYE = new String[]{"guildName", "buildingList", "evolutingBuildingList", "buildingsOpenned", "evolutingBuildingsOpenned", "havenWorldName", "numBuildings", "kamasTotalCost", "resourcesTotalCost", "nextBuildingText", "guildBlazon", "isSold", "guildId", "isGuildOnly"};
    private static final int kYF = 5;
    private long kYG;
    private long kYH;
    private final String kYI;
    private final long kYJ;
    private boolean kYK;
    private boolean kYL;
    private final ArrayList<bQW> kYM = new ArrayList();
    private final ArrayList<bQW> kYN = new ArrayList();
    private long ijd;
    private boolean kYO;

    @Override
    public String[] bxk() {
        return kYE;
    }

    public bqy_0(String string, long l, boolean bl, long l2, ArrayList<fas_0> arrayList) {
        this(string, l, bl, arrayList);
        this.ijd = l2;
    }

    public bqy_0(String string, long l, boolean bl, ArrayList<fas_0> arrayList) {
        this.kYI = string;
        this.kYJ = l;
        this.kYO = bl;
        this.N(arrayList);
        this.kYK = true;
        bNB.kDS.a(this);
    }

    private void N(ArrayList<fas_0> arrayList) {
        for (fas_0 fas_02 : arrayList) {
            bQW bQW2 = bRb.kYS.mc(fas_02.Lx());
            ua_0 ua_02 = bQW2.ekn();
            if (ua_02 == null || !ua_02.aYI()) {
                this.kYM.add(bQW2);
            } else {
                this.kYN.add(bQW2);
            }
            fbk_0 fbk_02 = fas_02.erN();
            fci_0 fci_02 = new fci_0(fbk_02.aIi());
            fbw_0.rSQ.T(fci_02);
            this.kYG += fci_02.fSu();
            this.kYH += fci_02.fSv();
        }
        this.kYN.sort(new bqz_0(this));
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kYq)) {
            return this.kYI != null && !this.kYI.isEmpty() ? this.kYI : aum_0.cWf().c("noOwner", new Object[0]);
        }
        if (string.equals(kYC)) {
            return this.kYJ;
        }
        if (string.equals(kYr)) {
            return this.kYM;
        }
        if (string.equals(kYt)) {
            return this.kYK && this.kYM.size() > 0;
        }
        if (string.equals(kYs)) {
            return this.kYN;
        }
        if (string.equals(kYu)) {
            return this.kYL && this.kYN.size() > 0;
        }
        if (string.equals(kYv)) {
            return aum_0.cWf().a(77, this.kYJ, new Object[0]);
        }
        if (string.equals(kYw)) {
            return this.kYN.size() + this.kYM.size();
        }
        if (string.equals(kYx)) {
            return aum_0.cWf().cQ(this.kYG);
        }
        if (string.equals(kYy)) {
            return aum_0.cWf().cQ(this.kYH);
        }
        if (string.equals(kYz)) {
            if (this.kYN.isEmpty()) {
                return aum_0.cWf().c("none", new Object[0]);
            }
            bQW bQW2 = this.kYN.get(0);
            fbk_0 fbk_02 = bQW2.eko().ejU();
            fbk_0 fbk_03 = fbo_0.e(fbk_02);
            if (fbk_03 == null) {
                kYp.error((Object)("pas de batiment pour " + fbk_02.aIi()));
                return null;
            }
            String string2 = aum_0.cWf().a(126, (long)fbk_03.aIi(), new Object[0]);
            return aum_0.cWf().c("havenWorld.nextBuildingRemainingTime", string2, bQW2.iq(false));
        }
        if (kYA.equals(string)) {
            if (this.ijd < 1L) {
                return String.format(auc_0.cVq().l("guildBlazonBackgroundPartPath", ""), 5);
            }
            return buK.dJw().a(new buJ(new ezb(this.ijd)));
        }
        if (kYB.equals(string)) {
            return this.kYI != null && !this.kYI.isEmpty();
        }
        if (kYD.equals(string)) {
            return this.kYO;
        }
        return null;
    }

    public boolean eks() {
        return this.kYK;
    }

    public boolean ekt() {
        return this.kYL;
    }

    public void ir(boolean bl) {
        this.kYK = bl;
        fse_1.gFu().a((aef_2)this, kYt);
    }

    public void is(boolean bl) {
        this.kYL = bl;
        fse_1.gFu().a((aef_2)this, kYu);
    }

    @Override
    public void daZ() {
        fse_1.gFu().a((aef_2)this, kYz);
    }

    public void eku() {
        this.kYO = !this.kYO;
        fse_1.gFu().a((aef_2)this, kYD);
    }
}

