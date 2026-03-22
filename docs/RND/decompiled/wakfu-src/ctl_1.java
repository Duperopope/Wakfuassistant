/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cTL
 */
public class ctl_1
implements adi_1 {
    private static final ctl_1 nKn = new ctl_1();
    private alx_2 ikv;
    protected static final Logger nKo = Logger.getLogger(ctl_1.class);
    private ArrayList<ctn_2> aXX = new ArrayList();
    private int bUj = 0;
    private int nKp;

    public static ctl_1 eQV() {
        return nKn;
    }

    public void ebu() {
        if (this.aXX.size() != 0) {
            this.bUj = (this.bUj + 1) % this.aXX.size();
            this.dhZ();
        }
    }

    public void ebt() {
        if (this.aXX.size() != 0) {
            this.bUj = (this.bUj - 1 + this.aXX.size()) % this.aXX.size();
            this.dhZ();
        }
    }

    public void eQW() {
        ctn_2 ctn_22 = this.aXX.get(this.bUj);
        this.aXX = this.eQX();
        this.bUj = this.aXX.indexOf(ctn_22);
        this.dhZ();
    }

    private void dhZ() {
        if (!this.aXX.isEmpty()) {
            ctn_2 ctn_22 = this.aXX.get(this.bUj);
            String string = this.bUj + 1 + "/" + this.aXX.size();
            fse_1.gFu().b("currentPage", (Object)string, "dimensionalBagAppearanceManagerDialog");
            fse_1.gFu().f("dimensionalBag.selected.appearance", ctn_22);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18800: {
                daw_0 daw_02 = (daw_0)aam_22;
                fse_1.gFu().f("dimensionalBag.selected.appearance", daw_02.fas());
                return false;
            }
        }
        return true;
    }

    private void eKx() {
        ctn_2 ctn_22;
        int n;
        if (this.aXX.size() != 0 && (n = (ctn_22 = this.aXX.get(this.bUj)).aVB()) != this.nKp) {
            this.nKp = n;
            cnd_0 cnd_02 = new cnd_0();
            cnd_02.nT(n);
            aue_0.cVJ().etu().d(cnd_02);
        }
    }

    private ArrayList<ctn_2> eQX() {
        this.bUj = -1;
        boolean bl = false;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bnv_2 bnv_22 = bgt_02.dnx();
        if (bnv_22 != null) {
            bl = bnv_22.dyO();
            this.nKp = bnv_22.dyL();
        }
        int n = ctl_1.ah(bgt_02);
        int n2 = 0;
        ArrayList<ctn_2> arrayList = new ArrayList<ctn_2>();
        TIntIntHashMap tIntIntHashMap = ((bcx_0)bcw_0.dQn().beg()).P(bcz_0.jJe.aVE());
        TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
        while (tIntIntIterator.hasNext()) {
            tIntIntIterator.advance();
            int n3 = tIntIntIterator.key();
            boolean bl2 = bjf_1.a(n3, fm_1.pI);
            if (!bl2 || !fny.gh(n, n3) || !(bl2 = bl ? fnt.sJb.Xj(n3) : fnt.sJb.Xi(n3))) continue;
            if (n3 == this.nKp) {
                this.bUj = n2;
            }
            arrayList.add(new ctn_2(n3, tIntIntIterator.value()));
            ++n2;
        }
        if (this.bUj == -1) {
            this.bUj = 0;
            this.nKp = arrayList.get(this.bUj).aVB();
        }
        return arrayList;
    }

    private static int ah(bgt_0 bgt_02) {
        fjn_0 fjn_02 = bgt_02.ffF();
        return fjn_02 == null ? 0 : fjn_02.Xt();
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new ctm_1(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("dimensionalBagAppearanceManagerDialog", 32768L);
            this.bUj = 0;
            this.aXX = this.eQX();
            this.dhZ();
            fyw_0.gqw().d("wakfu.appearanceManager", cel_2.class);
            cAY.eHc().eHq();
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.eKx();
            bnv_2 bnv_22 = aue_0.cVJ().cVK().dnx();
            if (bnv_22 != null) {
                bnv_22.Ey(this.nKp);
            }
            this.aXX = null;
            fyw_0.gqw().b(this.ikv);
            fse_1.gFu().vX("editableDimensionalBag");
            fyw_0.gqw().tl("dimensionalBagAppearanceManagerDialog");
            fyw_0.gqw().tc("wakfu.appearanceManager");
            cAY.eHc().eHr();
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

