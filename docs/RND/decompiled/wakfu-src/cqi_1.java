/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cQI
 */
public class cqi_1
extends cpl_1 {
    private cqb_1 nlu;
    private bsS efA;
    private bgy htb;
    private static final int nlv = 0;
    private static final int nlw = 1;
    private static final int nlx = 2;
    private static final int nly = 3;
    private int nkj;
    private static final EnumMap<euf_0, cqb_1> nlz = new EnumMap(euf_0.class);

    @Override
    public cpm_1 eLD() {
        return new cqi_1();
    }

    @Override
    public cps_1 eLz() {
        return cps_1.niz;
    }

    @Override
    public void run() {
        btd_1 btd_12 = btb_1.d(this.efA, this.htb);
        euf_0 euf_02 = btd_12.dHT();
        if (btd_12.dHW()) {
            this.x(this.efA);
        }
        if (euf_02 != euf_0.rxi) {
            bNG.egl();
            bNG.a(euf_02.bku(), new Object[0]);
        }
    }

    private void x(bsS bsS2) {
        Collection collection = bsS2.dGs();
        for (bgy bgy2 : collection) {
            bhx_0 bhx_02;
            bJr bJr2;
            if (bgy2.aFW() != 1 || !(bgy2 instanceof bhx_0) || (bJr2 = (bhx_02 = (bhx_0)bgy2).doD()) == null) continue;
            cny cny2 = new cny(bJr2.d());
            aue_0.cVJ().etu().d(cny2);
            return;
        }
    }

    @Override
    public String getLabel() {
        String string;
        if (!(this.cqO instanceof bgy)) {
            return this.ely();
        }
        switch (this.nlu) {
            case nkm: {
                string = nim;
            }
            case nkl: {
                string = nim;
            }
        }
        string = nik;
        ahv_2 ahv_22 = new ahv_2().ceu().ih(string);
        String string2 = ((exP)this.cqO).getName();
        switch (this.nlu) {
            case nkm: {
                ahv_22.c(aum_0.cWf().c("fight.error.nopathtomonster", string2));
            }
            case nkl: {
                ahv_22.c(aum_0.cWf().c("fight.error.monstertoofar", string2));
            }
        }
        ahv_22.c(aum_0.cWf().c("fight.join", string2));
        if (this.efA.dGo().fLf()) {
            ahv_22.c(aum_0.cWf().c("mru.joinFight.pvp", new Object[0]));
        }
        ahv_22.cev();
        if (this.nkj != 0) {
            switch (this.nkj) {
                case 1: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.playerNotSubscribed", new Object[0])).ceL();
                }
                case 2: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("error.targetNotSubscribed", new Object[0])).ceL();
                }
                case 3: {
                    return ahv_22.ceH().ih(nim).c(aum_0.cWf().c("security.impossible.action.account.locked", new Object[0])).ceL();
                }
            }
        }
        return ahv_22.ceL();
    }

    @Override
    @Nullable
    public String eLv() {
        String string;
        String string2;
        ahv_2 ahv_22 = new ahv_2();
        if (this.isEnabled() && this.efA.dGo() == eUw.ruF) {
            boolean bl;
            byte by = this.efA.kp(this.htb.Sn());
            byte by2 = this.efA.dGr();
            boolean bl2 = bl = by2 == by;
            if (bl && this.efA.dGo() == eUw.ruF) {
                ahv_22.ceC().e(awx_2.dnJ).c(aum_0.cWf().c("pvp.cantGainPointsWithFight", new Object[0])).ceD();
            } else {
                ahv_22.ceC().e(awx_2.dnL).c(aum_0.cWf().c("pvp.canGainPointsWithFight", new Object[0])).ceD();
            }
        }
        if ((string2 = super.eLv()) != null) {
            if (!ahv_22.toString().isEmpty()) {
                ahv_22.ceH();
            }
            ahv_22.c(string2);
        }
        return (string = ahv_22.ceL()).isEmpty() ? null : string;
    }

    @Override
    public boolean isEnabled() {
        return this.nkj == 0 && super.isEnabled() && this.nlu == cqb_1.nkC;
    }

    @Override
    public boolean bxO() {
        if (this.nlu == null || this.nlu == cqb_1.nko) {
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = (bgy)this.cqO;
        boolean bl = evg_1.osP.a(new eve_2[]{bgt_02});
        boolean bl2 = evg_1.osQ.a(new eve_2[]{bgt_02});
        if (!bl && this.efA.dGo().fLf() || !bl2) {
            this.nkj = 1;
        }
        if (bgt_02.a(ezj_0.ptB)) {
            return false;
        }
        if (aue_0.cVJ().cVO().bfb()) {
            this.nkj = 3;
        }
        if (bgy2 instanceof bhJ) {
            bhJ bhJ2 = (bhJ)bgy2;
            boolean bl3 = evg_1.osQ.a(new eve_2[]{bhJ2});
            if (!bl3) {
                this.nkj = 2;
            }
            if (bgy2.a(ezj_0.ptB)) {
                return false;
            }
            bzq_2 bzq_22 = bzp_2.eqt().mA(bgt_02.aqZ());
            if (!bzq_22.eqw()) {
                return true;
            }
            Optional<fpv> optional = cux_0.mjE.eDE();
            if (optional.isEmpty()) {
                return true;
            }
            fpv fpv2 = optional.get();
            int n = bgt_02.Xt();
            int n2 = bgy2.Xt();
            TIntArrayList tIntArrayList = fpv2.ggK();
            TIntArrayList tIntArrayList2 = fpv2.ggL();
            if (tIntArrayList.contains(n2) && tIntArrayList2.contains(n)) {
                return false;
            }
            return !tIntArrayList2.contains(n2) || !tIntArrayList.contains(n);
        }
        return true;
    }

    @Override
    public String ely() {
        return "fightJoin";
    }

    @Override
    public void aH(Object object) {
        super.aH(object);
        if (!(this.cqO instanceof bgy)) {
            return;
        }
        this.htb = (bgy)this.cqO;
        this.efA = this.htb.dkW();
        if (this.efA == null) {
            return;
        }
        euf_0 euf_02 = btb_1.d(this.efA, this.htb).dHU();
        this.nlu = nlz.get((Object)euf_02);
    }

    @Override
    public List<flv_0> euZ() {
        Object object2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<bgy> arrayList = new ArrayList<bgy>();
        ArrayList<bgy> arrayList2 = new ArrayList<bgy>();
        bgy bgy2 = (bgy)this.cqO;
        ArrayList<flv_0> arrayList3 = new ArrayList<flv_0>();
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        eUw eUw2 = bsS2.dGo();
        for (Object object2 : bsS2.dGs()) {
            if (((bgy)object2).bcP() == bgy2.bcP()) {
                arrayList2.add((bgy)object2);
                continue;
            }
            arrayList.add((bgy)object2);
        }
        bJr bJr2 = bTj.eno().doD();
        object2 = new fmO(bgt_02, eUw2, bgt_02, (exP)arrayList.get(0), bJr2 == null ? null : bJr2.eaH(), arrayList);
        fmP fmP2 = new fmP(bgy2, eUw2, ((bsi_0)bsS2).dGB(), ((bsi_0)bsS2).dGC(), arrayList2);
        arrayList3.addAll(((flx_0)object2).gdj());
        arrayList3.addAll(fmP2.gdj());
        return arrayList3;
    }

    @Override
    public List<flv_0> eva() {
        Object object;
        Object object2;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = (bgy)this.cqO;
        fmt_0 fmt_02 = new fmt_0(bgt_02);
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
        eUw eUw2 = bsS2.dGo();
        if (cqi_1.eLw() == fkc_0.sAp) {
            object2 = bsS2.dGs().iterator();
            while (object2.hasNext()) {
                int n;
                boz_2 boz_22;
                fmQ fmQ2 = new fmQ(bgt_02, (exP)object, 0, (byte)(((bgy)(object = (bgy)object2.next())).bcP() != bgy2.bcP() ? 1 : 0), eUw2);
                arrayList.addAll(fmQ2.gdj());
                if (!(object instanceof bhx_0)) continue;
                bhx_0 bhx_02 = (bhx_0)object;
                if (fmt_02.gdJ() == fmU.sHz || (boz_22 = boc_2.eht().IE(bhx_02.doQ().cqy())) == null || !boz_22.ehc() || boz_22.ehd() || (n = boz_22.ehe()) == 0) continue;
                fmt_02.a(n > 0 ? fmU.sHz : fmU.sHy);
            }
        }
        object2 = new fmR(bgt_02, eUw2, ((bsi_0)bsS2).dGB());
        object = new fmz_0(bgt_02, eUw2);
        arrayList.addAll(((flx_0)object2).gdj());
        arrayList.addAll(((flx_0)object).gdj());
        arrayList.addAll(fmt_02.gdj());
        return arrayList;
    }

    @Override
    protected int eLB() {
        return crc_2.nnB.nnW;
    }

    static {
        nlz.put(euf_0.rxK, cqb_1.nkl);
        nlz.put(euf_0.rxx, cqb_1.nko);
        nlz.put(euf_0.rxy, cqb_1.nko);
        nlz.put(euf_0.rxi, cqb_1.nkC);
    }
}

