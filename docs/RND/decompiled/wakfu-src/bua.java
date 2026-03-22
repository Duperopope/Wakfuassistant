/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bua
extends ewk_1<bgy>
implements aeh_2,
cpx_2 {
    public static final String joi = "currentFighter";
    public static final String joj = "currentTableTurn";
    public static final String[] jok = new String[]{"currentFighter", "currentTableTurn"};
    private chv_2 jol;
    private chm_2 jom;

    public bua(@NotNull bsj_0 bsj_02, @NotNull ewm_1 ewm_12, @NotNull ewt_2 ewt_22, @NotNull TF tF, @NotNull TI tI) {
        super(bsj_02, ewm_12, ewt_22, tF, tI);
    }

    @Override
    public int eB(long l) {
        bsj_0 bsj_02 = (bsj_0)this.bhj();
        if (bsj_02.dGp() == etw_0.rqV || bsj_02.dGp() == etw_0.rqT) {
            return this.bia().indexOf(l);
        }
        return this.bhD().indexOf(l);
    }

    @Override
    public int bhG() {
        byte by = this.btb.bij();
        TLongArrayList tLongArrayList = this.btb.bip();
        if (by == -1 || by >= tLongArrayList.size()) {
            return -1;
        }
        return by + (this.bts ? (byte)1 : 0);
    }

    public bgy kC(long l) {
        return (bgy)this.rBh.ku(l);
    }

    @Override
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{joi, joj}, (Object)string2, n)) {
            case 0 -> this.dIA();
            case 1 -> aum_0.cWf().c("fight.turn", this.bhJ());
            default -> null;
        };
    }

    public btZ[] kD(long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dmV();
        bgy bgy2 = (bgy)bsj_02.qJ(l);
        byte by = bsj_02.aT(bgy2);
        List<enk_0> list = this.eLo().SP(by);
        List<enk_0> list2 = this.eLo().Z(l, by);
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (enk_0 enk_02 : list) {
            if (tIntObjectHashMap.containsKey(enk_02.aZH())) continue;
            tIntObjectHashMap.put(enk_02.aZH(), (Object)new btZ(enk_02));
        }
        for (enk_0 enk_02 : list2) {
            btZ btZ2 = (btZ)tIntObjectHashMap.get(enk_02.aZH());
            if (btZ2 == null) continue;
            btZ2.dIz();
        }
        btZ[] btZArray = (btZ[])tIntObjectHashMap.values((Object[])new btZ[tIntObjectHashMap.size()]);
        int n = btZArray.length;
        for (int i = 0; i < n; ++i) {
            if (i == n - 1) {
                btZArray[i].dB(48, 48);
                continue;
            }
            if (i == n - 2) {
                btZArray[i].dB(40, 40);
                continue;
            }
            btZArray[i].dB(32, 32);
        }
        return btZArray;
    }

    @Override
    public String[] bxk() {
        return jok;
    }

    @Override
    public void a(chv_2 chv_22) {
        this.jol = chv_22;
        if (this.btq) {
            this.jol.setFightStarted();
        }
    }

    @Override
    public void a(chm_2 chm_22) {
        this.jom = chm_22;
    }

    public bgy dIA() {
        return this.bhE() ? this.kC(this.bhF()) : null;
    }

    @Override
    public int dIB() {
        return this.eLo().dIB();
    }

    public int kE(long l) {
        return this.eLo().rj(l);
    }

    @Override
    public void dIC() {
        if (this.jom != null) {
            this.jom.eKJ();
        }
    }

    @Override
    public List<cpu_2> dID() {
        return this.b(this.bhD());
    }

    @Override
    public List<cpu_2> dIE() {
        return this.b(this.bia());
    }

    private List<cpu_2> b(TLongArrayList tLongArrayList) {
        ArrayList<cpu_2> arrayList = new ArrayList<cpu_2>();
        for (int i = 0; i < tLongArrayList.size(); ++i) {
            long l = tLongArrayList.get(i);
            bgy bgy2 = this.kC(l);
            if (bgy2 == null) continue;
            bsz_0 bsz_02 = bgy2.djV();
            if (bsz_02 == null && !bgy2.baM() && bgy2.baH()) {
                bgy2.a(new bsz_0(bgy2, this));
            } else if (bsz_02 != null && bsz_02.dGQ() != this) {
                bsZ.warn((Object)("(" + bgy2.getName() + " - " + l + ") a un lien vers une autre timeline que la sienne"));
                bsz_02.a(this);
            }
            arrayList.add(bgy2);
        }
        return arrayList;
    }

    @Override
    protected void bhS() {
        if (this.cWB()) {
            if (this.jol != null) {
                this.jol.bhS();
            }
            if (this.jom != null) {
                this.jom.bhS();
            }
            this.dIF();
            fse_1.gFu().a((aef_2)this, joi);
        }
    }

    @Override
    public void dIF() {
        bgy bgy2 = this.dIG();
        if (bgy2 == null || !bgy2.i(exe_1.rFi)) {
            fse_1.gFu().f("selectedFighter", bgy2);
        }
    }

    public void bA(bgy bgy2) {
        if (bgy2 == null || !bgy2.i(exe_1.rFi)) {
            fse_1.gFu().f("selectedFighter", bgy2);
        }
    }

    public bgy dIG() {
        TLongArrayList tLongArrayList;
        bgy bgy2 = this.dIA();
        if (bgy2 == null && !(tLongArrayList = this.bia()).isEmpty()) {
            bgy2 = this.kC(tLongArrayList.get(0));
        }
        return bgy2;
    }

    private static void h(bgy bgy2, boolean bl) {
        bsj_0 bsj_02 = bgy2.dkZ();
        if (bsj_02 != null && bsj_02.dGP()) {
            return;
        }
        dap dap2 = new dap();
        dap2.lK(17587);
        dap2.cC(bl);
        dap2.cq(bgy2);
        aaw_1.bUq().h(dap2);
    }

    void bB(bgy bgy2) {
        if (bgy2.djV() == null) {
            bgy2.a(new bsz_0(bgy2, this));
        } else {
            bsZ.warn((Object)("Le fighter ajout\u00e9 n'a pas \u00e9t\u00e9 bien nettoy\u00e9 \u00e0 la fin du combat pr\u00e9c\u00e9dent ! (" + bgy2.getName() + " - " + bgy2.Sn() + ")"));
            if (bgy2.djV().dGQ() != this) {
                bgy2.djV().a(this);
            }
        }
        if (this.jol != null) {
            this.jol.b(bgy2);
            bua.h(bgy2, true);
        }
        if (this.jom != null) {
            this.jom.b(bgy2);
        }
        cub_1.eSi().kn(false);
        fse_1.gFu().f("selectedFighter", bgy2);
    }

    @Override
    protected void bhT() {
        if (this.jol != null) {
            this.jol.bhT();
        }
    }

    void bC(bgy bgy2) {
        if (this.jol != null) {
            this.jol.c(bgy2);
        }
        if (this.jom != null) {
            this.jom.c(bgy2);
        }
        bdn_2.d(bgy2.ddI());
        bua.h(bgy2, false);
        cya_1.eYj().cp(bgy2);
        fsf_1 fsf_12 = fse_1.gFu().getProperty("fight.describedFighter");
        if (fsf_12 != null && fsf_12.getValue() == bgy2) {
            chn_1.unhighlightFighterInTimeline(null, bgy2);
        }
        bgy2.a((bsz_0)null);
        cub_1.eSi().kn(false);
    }

    @Override
    protected void bhR() {
        super.bhR();
        if (this.cWB()) {
            if (this.jol != null) {
                this.jol.bhR();
            }
            if (this.jom != null) {
                this.jom.bhR();
            }
        }
        fse_1.gFu().a((aef_2)this, joj);
    }

    @Override
    protected void eM(long l) {
        cub_1.eSi().kn(false);
        super.eM(l);
        if (this.cWB()) {
            bsz_0 bsz_02;
            bgy bgy2 = this.kC(l);
            if (bgy2 == null) {
                return;
            }
            if (this.jol != null) {
                this.jol.d(bgy2);
            }
            if (this.jom != null) {
                this.jom.d(bgy2);
            }
            if ((bsz_02 = bgy2.djV()) != null) {
                bsz_02.dHx();
            }
            if (this.btp.containsKey(l)) {
                long l2 = (Long)this.btp.get(l);
                aPd.g("fight.remaining.time.reported", l2 / 1000L);
            }
        }
    }

    @Override
    protected void eN(long l) {
        if (this.cWB()) {
            bgy bgy2 = this.kC(l);
            if (this.jol != null) {
                this.jol.e(bgy2);
            }
            if (this.jom != null) {
                this.jom.e(bgy2);
            }
        }
        czn_2.oaQ.reset();
    }

    @Override
    public void start() {
        super.start();
        aaj_0 aaj_02 = ahs_0.bBd().bBc();
        aaj_02.bqL().cp(false);
    }

    private boolean cWB() {
        bsj_0 bsj_02;
        bgt_0 bgt_02;
        if (this.bhj() != null && (bgt_02 = aue_0.cVJ().cVK()) != null && (bsj_02 = bgt_02.dmV()) != null) {
            return bsj_02.equals(this.bhj());
        }
        return false;
    }

    public void Aa(int n) {
        this.eLo().Aa(n);
    }

    public void i(bgy bgy2, boolean bl) {
        bsz_0 bsz_02 = bgy2.djV();
        if (bsz_02 != null) {
            bsz_02.gl(bl);
        }
    }

    public void dIH() {
        for (bgy bgy2 : this.rBh.dGs()) {
            bgy2.djV().gl(false);
        }
    }

    @Nullable
    public bgy kF(long l) {
        int n;
        TLongArrayList tLongArrayList = this.btb.bip();
        for (n = this.btb.bij() + 1; n < tLongArrayList.size(); ++n) {
            boolean bl;
            long l2 = tLongArrayList.get(n);
            bgy bgy2 = this.kC(l2);
            long l3 = bgy2.dOo();
            bgy bgy3 = this.kC(l3);
            boolean bl2 = bgy2.Xi() == l || bgy3 != null && bgy3.Xi() == l;
            boolean bl3 = bl = bgy3 != null && bgy3.Xi() == l;
            if (!bl2 && !bl || bgy2.fgk()) continue;
            return bgy2;
        }
        TLongArrayList tLongArrayList2 = this.btb.biq();
        for (n = 0; n < tLongArrayList2.size(); ++n) {
            long l4 = tLongArrayList.get(n);
            bgy bgy4 = this.kC(l4);
            if (bgy4.Xi() != l || bgy4.fgk()) continue;
            return bgy4;
        }
        return null;
    }

    @Override
    public /* synthetic */ cpu_2 dII() {
        return this.dIG();
    }
}

