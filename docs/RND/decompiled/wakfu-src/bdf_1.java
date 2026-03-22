/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.set.hash.THashSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bdf
 */
public abstract class bdf_1
extends ads_0
implements Sp,
bbp_2 {
    private static final Logger hJM = Logger.getLogger(bdf_1.class);
    private static final int hJN = 2000;
    public static final int hJO = 1500;
    private final bKI hJP = new bKI();
    private boolean hJQ;
    private abj_2 hJR;
    private abj_2 hJS;
    private long hJT;
    private static int hJU = 1;
    private int hJV;
    private boolean hJW;
    private final List<adp_0> hJX = new ArrayList<adp_0>();
    private final TShortObjectHashMap<Anm> hJY = new TShortObjectHashMap(bdl_1.values().length);
    static final st_0 hJZ = new st_0();
    private static final wz_0 hKa;

    protected bdf_1(long l) {
        super(l);
        this.clG = (short)4;
    }

    public void a(int n, short s, boolean bl) {
        bdl_1 bdl_12 = bdl_1.bi(s);
        if (bdl_12 == null) {
            return;
        }
        this.bg(s);
        if (!bl) {
            return;
        }
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = bdf_1.dR(String.format(string, n));
            this.a(anm, bdl_12.hKP);
            this.hJY.put(s, (Object)anm);
        }
        catch (Exception exception) {
            hJM.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void a(fhc_0 fhc_02, short s, byte by) {
        int n = by == 0 ? fhc_02.aVt() : fhc_02.cpf();
        this.a(n, s, fhc_02.dGh().cpY());
    }

    public void Bx(int n) {
        try {
            String string = auc_0.cVq().bS("ANMEquipmentPath");
            Anm anm = bdf_1.dR(String.format(string, n));
            this.a(anm, new int[0]);
        }
        catch (Exception exception) {
            hJM.error((Object)("Erreur au chargement de l'\u00e9quipment : " + n), (Throwable)exception);
        }
    }

    public void dcE() {
        if (this.bqd() == null) {
            return;
        }
        this.bqd().bHB();
        this.bpy();
    }

    @Override
    public void bvA() {
        if (this.clH == null) {
            return;
        }
        if (this.clI + 1 > this.clH.bDU()) {
            return;
        }
        anp_2 anp_22 = this.clH.bP(this.clI, this.clI + 1);
        this.clI = 0;
        this.clJ = -1;
        this.a(anp_22, true);
    }

    protected anp_2 a(bnv_2 bnv_22, anp_2 anp_22) {
        return bnv_22.a(aue_0.cVJ().cVK(), anp_22);
    }

    public boolean a(anp_2 anp_22, boolean bl) {
        return this.a(anp_22, bl, aea_0.cmC);
    }

    private boolean a(anp_2 anp_22, boolean bl, aea_0 aea_02) {
        for (adp_0 object : new ArrayList<adp_0>(this.hJX)) {
            object.pathStarted(this, anp_22);
        }
        if ((anp_22 = this.c(anp_22)) == null || !anp_22.bDV()) {
            return false;
        }
        if (anp_22.bDU() > 1) {
            this.b(anp_22, bl);
            this.a(anp_22, false, true, aea_02);
        } else if (anp_22.bDU() == 1 && this.bvF() != null && this.bvF().bDW() != null) {
            Object object = null;
            for (int[] nArray : this.bvF()) {
                if (nArray[0] == anp_22.bDW()[0] && nArray[1] == anp_22.bDW()[1] && nArray[2] == anp_22.bDW()[2]) {
                    anp_2 anp_23 = new anp_2(2);
                    if (object != null) {
                        anp_23.a(0, (int[])object);
                        anp_23.a(1, nArray);
                        this.b(anp_23, true);
                        this.a(anp_23, false, true, aea_02);
                        hJM.trace((Object)"Envoi d'un chemin 'pseudo-stop' au serveur");
                    }
                    break;
                }
                object = nArray;
            }
        } else {
            return false;
        }
        return true;
    }

    private anp_2 c(anp_2 anp_22) {
        if (anp_22 == null || !anp_22.bDV()) {
            return anp_22;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return null;
        }
        bnv_2 bnv_22 = bgt_02.dnw();
        if (bnv_22 == null) {
            return anp_22;
        }
        return this.a(bnv_22, anp_22);
    }

    public anp_2 a(acd_1 acd_12, boolean bl, boolean bl2) {
        return this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bl, bl2);
    }

    public anp_2 a(int n, int n2, short s, boolean bl, boolean bl2) {
        int n3 = this.bvI();
        int n4 = this.bvJ();
        this.h(bl, bl2);
        wa_0.a(n3, n4, n, n2, hKa);
        sr_0 sr_02 = sr_0.bgd();
        sr_02.a((int)this.aKu(), this.bcO(), this.bvy());
        sr_02.a(hJZ);
        sr_02.q(n, n2, s);
        sr_02.b(hKa);
        sr_02.p(n3, n4, this.bvK());
        sr_02.bgj();
        anp_2 anp_22 = sr_02.bgh();
        sr_02.aZp();
        return anp_22;
    }

    private anp_2 a(boolean bl, boolean bl2, List<acd_1> list) {
        if (list.isEmpty()) {
            return anp_2.cKu;
        }
        this.h(bl, bl2);
        int n = this.bvI();
        int n2 = this.bvJ();
        acd_1 acd_12 = list.get(0);
        wa_0.a(n, n2, acd_12.getX(), acd_12.getY(), hKa);
        sr_0 sr_02 = sr_0.bgd();
        THashSet tHashSet = new THashSet(list.size());
        for (int i = 0; i < list.size(); ++i) {
            acd_1 acd_13 = list.get(i);
            short s = wa_0.w(acd_13.getX(), acd_13.getY(), acd_13.bdi());
            if (s == Short.MIN_VALUE || !wa_0.x(acd_13.getX(), acd_13.getY(), acd_13.bdi())) continue;
            short s2 = Math.abs(s - acd_13.bdi()) <= 2 ? s : acd_13.bdi();
            if (!tHashSet.add((Object)new acd_1(acd_13.getX(), acd_13.getY(), s2))) continue;
            sr_02.p(acd_13.getX(), acd_13.getY(), s2);
        }
        if (tHashSet.isEmpty()) {
            sr_02.aZp();
            return anp_2.cKu;
        }
        sr_02.a((int)this.aKu(), this.bcO(), this.bvy());
        sr_02.a(hJZ);
        sr_02.q(n, n2, this.bvK());
        sr_02.b(hKa);
        sr_02.bgj();
        anp_2 anp_22 = sr_02.bgi();
        sr_02.aZp();
        return anp_22;
    }

    private void h(boolean bl, boolean bl2) {
        bdf_1.hJZ.bqR = bl;
        bdf_1.hJZ.bqM = !bl2;
        bdf_1.hJZ.bqV = true;
        bdf_1.hJZ.bqT = bdf_1.hJZ.bqM;
        bdf_1.hJZ.bqX = this.dcF();
        bdf_1.hJZ.bqY = this.dcG();
        bdf_1.hJZ.bqZ = this.dcH();
        bdf_1.hJZ.bra = this.dcI();
        bdf_1.hJZ.brb = this.dcJ();
    }

    public boolean a(anu_1 anu_12, boolean bl, boolean bl2) {
        acd_1 acd_12 = new acd_1(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
        return this.a(acd_12, (int)anu_12.bcO(), bl, bl2);
    }

    public boolean b(acd_1 acd_12, boolean bl, boolean bl2) {
        return this.a(acd_12, 0, bl, bl2);
    }

    private boolean a(acd_1 acd_12, int n, boolean bl, boolean bl2) {
        this.h(false, bl);
        bdf_1.hJZ.bqU = true;
        int n2 = this.bvI();
        int n3 = this.bvJ();
        int n4 = acd_12.getX();
        int n5 = acd_12.getY();
        short s = acd_12.bdi();
        wa_0.a(n2, n3, n4, n5, hKa);
        sr_0 sr_02 = sr_0.bgd();
        sr_02.q(n2, n3, this.bvK());
        int n6 = n4 - n - 1;
        int n7 = n4 + n + 1;
        int n8 = n5 - n - 1;
        int n9 = n5 + n + 1;
        for (int i = n6; i <= n7; ++i) {
            for (int j = n8; j <= n9; ++j) {
                ww_0 ww_02;
                if (bl2 && (i == n6 || i == n7) && (j == n8 || j == n9) || (ww_02 = hKa.aO(i, j)) == null || !wa_0.j(i, j, s) || !wa_0.x(i, j, s)) continue;
                sr_02.p(i, j, s);
            }
        }
        sr_02.a((int)this.aKu(), this.bcO(), this.bvy());
        sr_02.a(hJZ);
        sr_02.b(hKa);
        sr_02.bgj();
        anp_2 anp_22 = sr_02.bgi();
        sr_02.aZp();
        bdf_1.hJZ.bqU = false;
        return anp_22.bDV() && this.a(anp_22, true);
    }

    protected boolean dcF() {
        return true;
    }

    protected boolean dcG() {
        return false;
    }

    protected boolean dcH() {
        return false;
    }

    protected boolean dcI() {
        return false;
    }

    protected boolean dcJ() {
        return false;
    }

    public boolean c(acd_1 acd_12, boolean bl, boolean bl2) {
        return this.a(acd_12, bl, bl2, aea_0.cmC);
    }

    public boolean a(acd_1 acd_12, boolean bl, boolean bl2, aea_0 aea_02) {
        return this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bl, bl2, aea_02);
    }

    public boolean b(int n, int n2, short s, boolean bl, boolean bl2) {
        return this.a(n, n2, s, bl, bl2, aea_0.cmC);
    }

    public boolean a(int n, int n2, short s, boolean bl, boolean bl2, aea_0 aea_02) {
        anp_2 anp_22 = this.a(n, n2, s, bl, bl2);
        return anp_22.bDV() && this.a(anp_22, true, aea_02);
    }

    public boolean b(boolean bl, boolean bl2, List<acd_1> list) {
        return this.a(bl, bl2, list, aea_0.cmC);
    }

    public boolean a(boolean bl, boolean bl2, List<acd_1> list, aea_0 aea_02) {
        anp_2 anp_22 = this.a(bl, bl2, list);
        return anp_22.bDV() && this.a(anp_22, true, aea_02);
    }

    public void a(acd_1 acd_12, boolean bl, boolean bl2, boolean bl3) {
        this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bl, bl2, bl3);
    }

    private void a(int n, int n2, short s, boolean bl, boolean bl2, boolean bl3) {
        anp_2 anp_22;
        this.dcO();
        if (bl && (anp_22 = this.a(n, n2, s, bl2, bl3)) != null && anp_22.bDU() != 0) {
            this.a(anp_22, false, true);
            return;
        }
        this.e(n, n2, s);
    }

    public void dcK() {
        if (this.hJS == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (this.hJR == null || !this.hJR.a(this.hJS) || !this.hJR.bVX().equals(this.hJS.bVX())) {
            ciK ciK2 = new ciK();
            ciK2.c(this.hJS);
            aea_0 aea_02 = this.bvD().c(this, this.hJS.bVZ() + 1).bwe();
            ciK2.b(aea_02);
            aue_0.cVJ().etu().d(ciK2);
            this.hJR = this.hJS;
            this.hJT = l;
        }
        this.hJS = null;
    }

    public void lf(@NotNull String string) {
        this.B(string, false);
    }

    public void B(@NotNull String string, boolean bl) {
        try {
            if (string.equals(this.bds) && !bl) {
                return;
            }
            int n = Integer.parseInt(string);
            String string2 = bdf_1.By(n);
            this.dP(string);
            this.k(string2, true);
        }
        catch (Exception exception) {
            hJM.error((Object)"Erreur lors de la cr\u00e9ation de la DescriptorLibrary : ", (Throwable)exception);
        }
    }

    public static String By(int n) {
        String string = bdh_1.BE(n);
        String string2 = auc_0.cVq().bS(string);
        return String.format(string2, Integer.toString(n));
    }

    public static String r(String string, int n) {
        String string2;
        if (BH.aU(string)) {
            return bdf_1.By(n);
        }
        switch (string) {
            case "equipment": {
                string2 = auc_0.cVq().bS("ANMEquipmentPath");
                break;
            }
            case "npc": {
                string2 = auc_0.cVq().bS("npcGfxPath");
                break;
            }
            case "player": {
                string2 = auc_0.cVq().bS("playerGfxPath");
                break;
            }
            default: {
                return null;
            }
        }
        return String.format(string2, Integer.toString(n));
    }

    public void dcL() {
        TShortObjectIterator tShortObjectIterator = this.hJY.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            bdl_1 bdl_12 = bdl_1.bi(tShortObjectIterator.key());
            if (bdl_12 == null) continue;
            this.a(bdl_12, (Anm)tShortObjectIterator.value());
        }
        this.hJY.clear();
    }

    public void bg(short s) {
        bdl_1 bdl_12 = bdl_1.bi(s);
        if (bdl_12 == null) {
            return;
        }
        Anm anm = (Anm)this.hJY.remove(s);
        if (anm != null) {
            this.a(bdl_12, anm);
        }
    }

    private void a(bdl_1 bdl_12, Anm anm) {
        this.b(anm, bdl_12.hKP);
    }

    public void b(abj_2 abj_22) {
        anp_2 anp_22 = new anp_2(abj_22.bVZ() + 1);
        anp_22.a(0, abj_22.bVW().getX(), abj_22.bVW().getY(), abj_22.bVW().bdi());
        acd_1 acd_12 = new acd_1(abj_22.bVW());
        for (int i = 0; i < abj_22.bVZ(); ++i) {
            abk_2 abk_22 = abj_22.wK(i);
            acd_12.e(abk_22.dzJ);
            acd_12.w(0, 0, abk_22.dzK);
            anp_22.a(i + 1, acd_12.getX(), acd_12.getY(), acd_12.bdi());
        }
        this.a(anp_22, true, this.bvx() != 4);
    }

    private void b(anp_2 anp_22, boolean bl) {
        if (!this.hJQ) {
            return;
        }
        long l = System.currentTimeMillis();
        abj_2 abj_22 = abj_2.a(anp_22);
        if (abj_22 == null) {
            hJM.error((Object)"Impossible d'\u00e9mettre un chemin null en direction du serveur");
            return;
        }
        this.hJS = this.hJS == null ? abj_22 : abj_2.a(this.hJS.bVW(), this.hJS, abj_22);
        if (!bl) {
            if (l - this.hJT >= 2000L) {
                this.dcK();
            }
        } else {
            long l2 = l - this.hJT;
            long l3 = 1500L - l2;
            int n = hJU++;
            if (l3 > 0L && ewo_0.oBF.k(ewr_0.oCh)) {
                this.hJV = n;
                abg_2.bUP().a(() -> {
                    if (this.hJV == n) {
                        this.dcK();
                    }
                }, l3, 1);
            } else {
                this.dcK();
            }
        }
    }

    public bKI dcM() {
        return this.hJP;
    }

    public void fp(boolean bl) {
        this.hJQ = bl;
    }

    public boolean dcN() {
        return this.hJW;
    }

    public void fq(boolean bl) {
        this.hJW = bl;
    }

    public void a(adp_0 adp_02) {
        this.hJX.add(adp_02);
    }

    public void b(adp_0 adp_02) {
        this.hJX.remove(adp_02);
    }

    public void fr(boolean bl) {
        if (aue_0.cVJ().cVK().ddI() == this) {
            this.bA(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liL));
        } else {
            this.bA(bl);
        }
    }

    @Override
    protected void reset() {
        super.reset();
        this.hJY.clear();
    }

    public void dcO() {
        this.hJR = null;
        this.hJT = 0L;
    }

    static {
        bdf_1.hJZ.bqN = 400;
        hKa = new wz_0();
    }
}

