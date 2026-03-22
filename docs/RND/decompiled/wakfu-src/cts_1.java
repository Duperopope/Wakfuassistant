/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cTs
 */
public abstract class cts_1
implements adi_1 {
    protected static final TIntObjectHashMap<bgl_0> nIT = new TIntObjectHashMap();
    protected static final TLongObjectHashMap<bgl_0> nIU = new TLongObjectHashMap();
    public static final List<cts_1> nIV = new ArrayList<cts_1>();
    protected final List<String> nIW = new ArrayList<String>();
    protected final TIntObjectHashMap<bli_1> nIX = new TIntObjectHashMap();
    private alx_2 ikv;
    byte nIY = 0;
    bgt_0 nIZ;

    public bgl_0 ePD() {
        return (bgl_0)fse_1.gFu().aW("characterSheet", this.ePj());
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (this.ePM() && string.startsWith(this.ePj())) {
                this.nIW.remove(string);
                if (!string.equals(this.ePj())) {
                    int n = Integer.parseInt(string.substring(this.ePj().length()));
                    this.b((bgl_0)nIT.get(n), true);
                }
                if (this.nIW.isEmpty()) {
                    aue_0.cVJ().b(this);
                }
            }
        };
        fyw_0.gqw().a(this.ikv);
        bgt_0 bgt_02 = this.nIZ != null ? this.nIZ : aue_0.cVJ().cVK();
        ArrayList<bli_1> arrayList = new ArrayList<bli_1>();
        ArrayList<blh_1> arrayList2 = new ArrayList<blh_1>();
        for (aeh_2 aeh_22 : bgt_02.dnf()) {
            if (aeh_22 == null || aeh_22.dtZ()) continue;
            bli_1 bli_12 = aeh_22.dtG();
            this.nIX.put(aeh_22.xT(), (Object)bli_12);
            arrayList.add(bli_12);
        }
        TLongIterator tLongIterator = fcL.rUh.sx(bgt_02.Xi()).iterator();
        while (tLongIterator.hasNext()) {
            aeh_2 aeh_22;
            bhJ bhJ2 = (bhJ)fcL.rUh.sw(tLongIterator.next());
            blh_1 blh_12 = new blh_1(bhJ2);
            aeh_22 = bwa_0.jwi.a(blh_12);
            bhJ2.dlE().dqR();
            nIU.put(bhJ2.Sn(), (Object)aeh_22);
            arrayList2.add(blh_12);
        }
        arrayList.sort(Comparator.comparingInt(bli_1::xT));
        cts_1.ePK();
        this.o((bgl_0)nIU.get(bgt_02.Sn()));
        fse_1.gFu().b("companionPartyList", arrayList, this.ePj());
        cts_1.ePH();
        fse_1.gFu().f("companionPartyListFull", !eJX.qAX.pX(bgt_02.aZj()) && !bvz_0.bS((byte)5));
        fyw_0.gqw().d("wakfu.companionsEmbedded", cdu_1.class);
        nIV.add(this);
    }

    public static void ePE() {
        for (cts_1 cts_12 : nIV) {
            fse_1.gFu().b("companionPartyList", cts_12.ePG(), cts_12.ePj());
            cts_12.ePF();
        }
        cts_1.ePH();
        cts_1.ePK();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fse_1.gFu().f("companionPartyListFull", !eJX.qAX.pX(bgt_02.aZj()) && !bvz_0.bS((byte)5));
    }

    private void ePF() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (String string : this.nIW) {
            bgl_0 bgl_02;
            if (!string.equals(this.ePj()) || nIU.get((bgl_02 = bwa_0.jwi.a(new blh_1(bgt_02))).dcP().Sn()) != null) continue;
            fse_1.gFu().b("characterSheet", nIU.get(bgt_02.Sn()), string);
        }
    }

    public static void m(bgl_0 bgl_02) {
        bgl_02.dcP().dlE().dqR();
        nIU.put(bgl_02.dcP().Sn(), (Object)bgl_02);
    }

    public static void ol(long l) {
        nIU.remove(l);
    }

    public static void n(bgl_0 bgl_02) {
        nIT.put(bgl_02.dmf().xT(), (Object)bgl_02);
    }

    public static void MA(int n) {
        nIT.remove(n);
    }

    public static boolean MB(int n) {
        return nIT.containsKey(n);
    }

    public List<bli_1> ePG() {
        this.nIX.clear();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<bli_1> arrayList = new ArrayList<bli_1>();
        for (bli_1 bli_12 : bgt_02.dnf()) {
            if (bli_12 == null) continue;
            int n = bli_12.xT();
            bli_1 bli_13 = (bli_1)this.nIX.get(n);
            if (bli_13 != null) {
                arrayList.add(bli_13);
                continue;
            }
            bli_1 bli_14 = bli_12.dtG();
            this.nIX.put(n, (Object)bli_14);
            arrayList.add(bli_14);
        }
        arrayList.sort(Comparator.comparingInt(bli_1::xT));
        return arrayList;
    }

    public static void ePH() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        ArrayList<bli_1> arrayList = new ArrayList<bli_1>();
        for (bli_1 bli_12 : bgt_02.dnf()) {
            if (bli_12 == null || bli_12.dtZ() && fcI.fSM()) continue;
            bli_1 bli_13 = bli_12.dtG();
            arrayList.add(bli_13);
            eJS eJS2 = eJN.qAF.O(bgt_02.Xi(), bli_12.xT());
            if (eJS2 == null) continue;
            bhx_0 bhx_02 = cts_1.n(eJS2);
            blp_0 blp_02 = new blp_0(bhx_02, new blt_0(eJS2));
            cts_1.n(blp_02);
        }
        arrayList.sort(Comparator.comparingInt(bli_1::xT));
        fse_1.gFu().f("companionParty", arrayList);
        fse_1.gFu().f("companionPartyExists", !arrayList.isEmpty());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().b(this.ikv);
        for (String string : this.nIW) {
            fyw_0.gqw().tl(string);
        }
        this.nIW.clear();
        nIV.remove(this);
        this.nIX.clear();
        this.nIZ = null;
    }

    public static void ePI() {
        nIT.clear();
        nIU.clear();
        nIV.clear();
        fse_1.gFu().f("companionPartyListFull", false);
    }

    public static bgl_0 MC(int n) {
        return (bgl_0)nIT.get(n);
    }

    public static TLongObjectHashMap<bgl_0> ePJ() {
        return nIU;
    }

    private static void ePK() {
        nIT.clear();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        for (bli_1 bli_12 : bgt_02.dnf()) {
            bgl_0 bgl_02;
            if (bli_12 == null) continue;
            if (bli_12.dtZ()) {
                bgl_02 = new bgl_0(bgt_02, bli_12);
            } else {
                long l = bli_12.Sn();
                eJS eJS2 = eJN.qAF.pR(-l);
                bhx_0 bhx_02 = cts_1.n(eJS2);
                bgl_02 = new blp_0(bhx_02, bli_12, eJS2);
                bhx_02.dlE().dqR();
            }
            nIT.put(bli_12.xT(), (Object)bgl_02);
        }
    }

    public static bhx_0 n(eJS eJS2) {
        return cts_1.a(eJS2, true);
    }

    public static bhx_0 a(eJS eJS2, boolean bl) {
        bhx_0 bhx_02 = bhx_0.doA();
        bhx_02.jI(eJS2.Sn());
        bhx_02.a(new eiz_0<bhx_0>(bhx_02));
        bhx_02.a((byte)5);
        bhx_02.c(bja_1.drJ().bC(eJS2.aWP()));
        bhx_02.pi(eJS2.Xi());
        bhx_02.bw(bl ? eJW.A(eJS2) : eJS2.cmL());
        bhx_02.fR(false);
        bhx_02.aPg();
        bhx_02.e(bhx_02.bdV());
        bhx_02.dll();
        return bhx_02;
    }

    public static void o(eJS eJS2) {
        cts_1.a(eJS2, List.of());
    }

    public static void a(eJS eJS2, ffV ffV2) {
        cts_1.a(eJS2, List.of(ffV2));
    }

    public static void a(eJS eJS2, @NotNull List<ffV> list) {
        if (eJS2 == null) {
            return;
        }
        bgl_0 bgl_02 = (bgl_0)nIT.get((int)eJS2.aWP());
        if (bgl_02 == null) {
            return;
        }
        bgy bgy2 = bgl_02.dcP();
        for (ffV ffV2 : list) {
            if (ffV2.dOg().dpq() != 0) {
                bEq bEq2 = bEr.dSi().bW(ffV2.dOg().dpq());
                bgy2.a(ffV2, bEq2);
                continue;
            }
            bgy2.bX(ffV2);
        }
        bgy2.dll();
        bgy2.e(exx_2.rGi).aYO();
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return aam_22.d() != 17574;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public abstract String ePj();

    public String o(bgl_0 bgl_02) {
        String string = this.ePj();
        this.a(bgl_02, string);
        fse_1.gFu().b("mainCharacterSheet", true, string);
        return string;
    }

    public String a(bgl_0 bgl_02, String string, int n, int n2) {
        String string2 = this.ePj() + bgl_02.dcP().aWP();
        if (fyw_0.gqw().to(string2)) {
            return null;
        }
        this.a(bgl_02, string2);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string2);
        fey_2 fey_22 = (fey_2)fhs_22.uH(string);
        fey_22.a(new ctt_1(this, fey_22, n, n2));
        fse_1.gFu().b("mainCharacterSheet", false, string2);
        this.b(bgl_02, false);
        return string2;
    }

    public String a(bgl_0 bgl_02, String string, String string2, int n, int n2, fey_2 fey_22) {
        String string3 = string + bgl_02.dcP().Sn();
        if (fyw_0.gqw().to(string3)) {
            return null;
        }
        this.b(bgl_02, string3);
        String string4 = My.aUV().c("inventory.of", bgl_02.dcP().getName());
        fse_1.gFu().b("mainCharacterSheet", false, string3);
        fse_1.gFu().b("inventoryWindow", fey_22, string3);
        fse_1.gFu().b("inventoryOf", (Object)string4, string3);
        return string3;
    }

    private void b(bgl_0 bgl_02, boolean bl) {
        if (bgl_02 == null) {
            return;
        }
        bli_1 bli_12 = (bli_1)this.nIX.get((int)bgl_02.dcP().aWP());
        if (bli_12 == null) {
            return;
        }
        bli_12.setDragEnabled(bl);
    }

    private void a(bgl_0 bgl_02, String string) {
        fyw_0.gqw().a(string, ccj_2.pe(this.ePj()), 32768L);
        this.nIW.add(string);
        fse_1.gFu().b("characterSheet", bgl_02, string);
    }

    private void b(bgl_0 bgl_02, String string) {
        fyw_0.gqw().a(string, ccj_2.pe("inventoryOnlyDialog"), 32768L);
        this.nIW.add(string);
        fse_1.gFu().b("characterSheet", bgl_02, string);
    }

    public List<String> ePL() {
        return this.nIW;
    }

    void ef(byte by) {
        this.nIY = by;
    }

    public void ae(bgt_0 bgt_02) {
        this.nIZ = bgt_02;
    }

    protected boolean ePM() {
        return true;
    }
}

