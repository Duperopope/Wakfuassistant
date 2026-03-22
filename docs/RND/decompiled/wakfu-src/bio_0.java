/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntLongHashMap
 */
import gnu.trove.map.hash.TIntLongHashMap;
import java.util.ArrayList;

/*
 * Renamed from bio
 */
public class bio_0 {
    public static final bio_0 ikq = new bio_0();
    private int ikr;
    private long iks;
    private final TIntLongHashMap ikt = new TIntLongHashMap();
    private final ArrayList<bir_0> iku = new ArrayList();
    private final alx_2 ikv = new bip(this);
    final fig_2 ikw = new biq(this);

    private void dqf() {
        if (this.iku.isEmpty()) {
            fyw_0.gqw().tl("questActivationDialog");
        } else {
            bir_0 bir_02 = this.iku.remove(this.iku.size() - 1);
            this.s(bir_02.ikz, bir_02.iky);
        }
    }

    public void dqg() {
        if (this.ikr != -1) {
            cjg_0 cjg_02 = new cjg_0(this.ikr, this.iks, true);
            aue_0.cVJ().etu().d(cjg_02);
        }
        this.dqf();
    }

    public void dqh() {
        if (this.ikr != -1) {
            cjg_0 cjg_02 = new cjg_0(this.ikr, this.iks, false);
            aue_0.cVJ().etu().d(cjg_02);
        }
        this.dqf();
    }

    public void r(int n, long l) {
        long l2 = this.ikt.get(n);
        long l3 = System.currentTimeMillis();
        if (l2 != 0L && l3 - l2 < 30000L) {
            return;
        }
        this.ikt.put(n, l3);
        if (fyw_0.gqw().to("questActivationDialog")) {
            this.iku.add(new bir_0(l, n));
        } else {
            this.s(n, l);
        }
    }

    private void s(int n, long l) {
        this.ikr = n;
        this.iks = l;
        if (!fyw_0.gqw().to("questActivationDialog")) {
            fyw_0.gqw().a(this.ikv);
            ccg_2.eJI().b(this.ikw);
            ccj_2.g("questActivationDialog", 8192L);
            fyw_0.gqw().d("wakfu.quests", cgr_1.class);
            fyw_0.gqw().d("wakfu.achievements", cdc_2.class);
        }
        bci_1 bci_12 = bcm_1.hIK.t(aue_0.cVJ().cVK().Sn(), n);
        fse_1.gFu().b("displayedAchievement", bci_12, "questActivationDialog");
    }

    public void bmX() {
        this.iku.clear();
        this.ikr = -1;
        this.iks = -1L;
        this.ikt.clear();
        ccg_2.eJI().b(this.ikw);
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tc("wakfu.quests");
        fyw_0.gqw().tc("wakfu.achievements");
    }
}

