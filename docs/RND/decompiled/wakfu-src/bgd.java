/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bgd
implements bfZ {
    private final TIntObjectHashMap<bfU> hZf = new TIntObjectHashMap();
    private final TIntObjectHashMap<bfT> hZg = new TIntObjectHashMap();
    private static final Logger hZh = Logger.getLogger(bgd.class);
    private static final az_0 hZi = new az_0();
    private static final bgd hZj = new bgd();

    public bfT Cq(int n) {
        return this.b(n, uw_0.bju());
    }

    private bfT a(int n, ux_0 ux_02) {
        bfU bfU2 = this.Cs(n);
        if (bfU2 == null) {
            hZh.error((Object)("Le challenge " + n + " n'existe pas, impossible de le lancer."));
            return null;
        }
        bfT bfT2 = bfT.a(bfU2);
        this.hZg.put(n, (Object)bfT2);
        bfT2.E(ux_02);
        bfT2.bs((short)-1);
        return bfT2;
    }

    public bfT b(int n, ux_0 ux_02) {
        return this.a(n, ux_02);
    }

    private bgd() {
    }

    public static bgd diV() {
        return hZj;
    }

    public bfT Cr(int n) {
        return (bfT)this.hZg.get(n);
    }

    public void a(int n, bfU bfU2) {
        this.hZf.put(n, (Object)bfU2);
    }

    public bfU Cs(int n) {
        bfU bfU2 = (bfU)this.hZf.get(n);
        if (bfU2 == null) {
            apx_1 apx_12 = aqf_2.bGr().a(n, hZi);
            if (apx_12 != null) {
                this.a((az_0)apx_12);
            }
            bfU2 = (bfU)this.hZf.get(n);
        }
        return bfU2;
    }

    public bgb Ct(int n) {
        bfU bfU2 = this.Cs(n);
        bfT bfT2 = this.Cr(n);
        if (bfT2 == null) {
            return null;
        }
        ArrayList<bgb> arrayList = bfU2.dbs();
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            bgb bgb2 = arrayList.get(i);
            if (bfT2.a(bgb2) != 1) continue;
            return bgb2;
        }
        return null;
    }

    public bgb Cu(int n) {
        bfU bfU2 = this.Cs(n);
        bfT bfT2 = this.Cr(n);
        if (bfT2 == null) {
            return null;
        }
        ArrayList<bgb> arrayList = bfU2.dbs();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            bgb bgb2 = arrayList.get(i);
            if (bfT2.a(bgb2) != 2) continue;
            return bgb2;
        }
        return null;
    }

    public boolean Cv(int n) {
        bfT bfT2 = (bfT)this.hZg.remove(n);
        if (bfT2 != null) {
            bfT2.N(null);
            bgk.hZN.Cy(n);
            this.b(bfT2);
            return true;
        }
        return false;
    }

    public void clean() {
        bfP.dhT().dhU();
        bfP.dhT().dhY();
        this.hZg.clear();
    }

    @Override
    public void b(TIntArrayList tIntArrayList, int n) {
        bfT bfT2 = this.Cr(n);
        if (bfT2 == null && (bfT2 = this.Cq(n)) == null) {
            hZh.error((Object)("eRreur lors du chargemetn du challenge " + n));
            return;
        }
        bfT2.a(tIntArrayList);
        this.b(bfT2);
    }

    @Override
    public boolean a(byte by, long l, int n) {
        bfT bfT2 = this.Cr(n);
        if (bfT2 == null && (bfT2 = this.Cq(n)) == null) {
            hZh.error((Object)("eRreur lors du chargemetn du challenge " + n));
            return false;
        }
        boolean bl = bfT2.e(by, l);
        this.b(bfT2);
        return bl;
    }

    @Override
    public void b(bfT bfT2) {
        bfM bfM2 = bgk.hZN.Cx(bfT2.d());
        if (bfM2 != null) {
            bfM2.cAN();
        }
    }

    @Override
    public void c(bfT bfT2) {
        bfM bfM2 = bgk.hZN.Cx(bfT2.d());
        if (bfM2 != null) {
            bfM2.cAN();
        }
    }

    public void dj(int n, int n2) {
        bfT bfT2 = this.Cr(n);
        if (bfT2 != null && !bfT2.bVp()) {
            bfT2.Cj(n2);
        } else {
            hZh.error((Object)"On essaie de terminer un but sur un challenge pas charg\u00e9 dans le client");
        }
        this.b(bfT2);
    }

    public void a(int n, TIntArrayList tIntArrayList) {
        bfT bfT2 = (bfT)this.hZg.get(n);
        bfT2.b(tIntArrayList);
        bfT2.N(null);
        bfT2.ak(true);
        if (!bfT2.bVp()) {
            bfT2.fI(true);
        }
        fse_1.gFu().f("challengeDetailsVisible", false);
        this.b(bfT2);
    }

    public void Cw(int n) {
        bfT bfT2 = this.Cr(n);
        if (bfT2 == null) {
            bfT2 = this.Cq(n);
        }
        if (bfT2 == null) {
            return;
        }
        bfT2.fG(true);
        this.b(bfT2);
    }

    public boolean a(xs_2 xs_22) {
        if (xs_22.akH != null) {
            hZh.error((Object)"Le client ne devrait pas recevoir les infos compl\u00e8tes de scenarii.");
            return false;
        }
        if (xs_22.akI == null) {
            hZh.error((Object)"Pas d'infos de challenges \u00e0 d\u00e9s\u00e9rialiser");
            return false;
        }
        boolean bl = true;
        for (xu_1 xu_12 : xs_22.akI.akK) {
            try {
                ti_1 ti_12 = xu_12.akL;
                int n = ti_12.aac;
                uw_0 uw_02 = ti_12.aah != null ? uw_0.fn(ti_12.aah.Rj) : uw_0.bju();
                bfT bfT2 = this.a(n, uw_02);
                TIntArrayList tIntArrayList = new TIntArrayList(ti_12.aad.size());
                for (tj_2 tj_22 : ti_12.aad) {
                    tIntArrayList.add(tj_22.aai);
                }
                bfT2.a(tIntArrayList);
                for (tk_1 tk_12 : ti_12.aae) {
                    bfT2.Cj(tk_12.aai);
                }
                for (tl_2 tl_22 : ti_12.aaf) {
                    bfT2.e(tl_22.aal, tl_22.Rj);
                }
            }
            catch (Exception exception) {
                hZh.error((Object)("Exception lors de la d\u00e9s\u00e9rialisation du sc\u00e9narion id=" + xu_12.akL.aac), (Throwable)exception);
                bl = false;
            }
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public void a(az_0 az_02) {
        int n;
        if (!az_02.aGc()) {
            return;
        }
        int n2 = az_02.d();
        byte by = az_02.aFW();
        byte by2 = az_02.aFX();
        boolean bl = az_02.aGd();
        short s = az_02.aGd() ? (short)0 : az_02.aFT();
        ux_0 ux_02 = az_02.aFU();
        boolean bl2 = az_02.aGb();
        short s2 = az_02.aGe();
        short s3 = az_02.aGf();
        String string = az_02.aFZ();
        String string2 = az_02.aGa();
        String string3 = az_02.aGg();
        bfU bfU2 = new bfU(n2, by, by2, s, bl2, ux_02, s2, s3, string, string2, bl, string3);
        String[] stringArray = az_02.aFY();
        for (int i = 0; i < stringArray.length; ++i) {
            void object;
            String string4 = stringArray[i];
            if (string4.startsWith("'")) {
                String string5 = string4.substring(1, string4.length() - 1);
            }
            bfU2.k((byte)i, (String)object);
        }
        for (ba_0 ba_02 : az_02.aFQ()) {
            Object object;
            if (!ba_02.aGo()) continue;
            n = ba_02.aGk();
            String string6 = ba_02.aGn();
            acd_1 acd_12 = null;
            if (!string6.equalsIgnoreCase("null")) {
                object = null;
                try {
                    object = ehu_0.rX(string6);
                }
                catch (Exception exception) {
                    hZh.error((Object)("Erreur lors de la compilation des crit\u00e8res d'un sc\u00e9nario (sc\u00e9nario " + n2 + " actionGroupId : " + n + ")"), (Throwable)exception);
                }
                if (object != null) {
                    acd_12 = anf_2.gn(((amu_1)object).d(null, null, null, null));
                }
            }
            object = new bgb(n, n2, acd_12, ba_02.aGm(), ba_02.aGl(), ba_02.aGp());
            bfU2.b((bgb)object);
        }
        for (bb_0 bb_02 : az_02.aFV()) {
            n = bb_02.aGt();
            boolean bl3 = bb_02.aGv();
            int n3 = bb_02.azv();
            short s4 = bb_02.aGw();
            int n4 = bb_02.agN();
            int n5 = bb_02.aGx();
            byte by3 = bb_02.aGu();
            if (bl3) {
                bfU2.a(n, n3, s4, n4, n5, by3);
                continue;
            }
            bfU2.b(n, n3, s4, n4, n5, by3);
        }
        this.a(n2, bfU2);
    }
}

