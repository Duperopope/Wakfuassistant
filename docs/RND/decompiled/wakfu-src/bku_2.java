/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKu
 */
public class bku_2
implements aeh_2 {
    public static final int koi = 10;
    public static final bku_2 koj = new bku_2();
    public static final String kok = "entries";
    public static final String kol = "pageDescription";
    public static final String kom = "canGoBack";
    public static final String kon = "canGoForward";
    public static final String koo = "currentNation";
    public static final String kop = "nations";
    public static final String koq = "currentBreed";
    public static final String kor = "breeds";
    public static final String kos = "currentFilter";
    public static final String kot = "filters";
    private final ArrayList<bkt_2> kou = new ArrayList();
    private int hQx;
    private int jwd;
    private final ArrayList<bso_2> kov = new ArrayList();
    private final ArrayList<bkv_2> kow = new ArrayList();
    private final ArrayList<bkw_2> kox = new ArrayList();
    private bso_2 koy;
    private bkv_2 koz;
    private bkw_2 koA;
    private fpO koB;

    private bku_2() {
        this.kov.add(new bso_2(30));
        this.kov.add(new bso_2(31));
        this.kov.add(new bso_2(32));
        this.kov.add(new bso_2(33));
        this.kow.add(new bkv_2(eym.phV));
        for (eym eym2 : eym.values()) {
            if (!eyn.h(eym2)) continue;
            this.kow.add(new bkv_2(eym2));
        }
        this.kox.add(new bkw_2(true));
        this.kox.add(new bkw_2(false));
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kok)) {
            return this.kou;
        }
        if (string.equals(kol)) {
            return this.dfB();
        }
        if (string.equals(kom)) {
            return this.dzY();
        }
        if (string.equals(kon)) {
            return this.dzZ();
        }
        if (string.equals(kor)) {
            return this.kow;
        }
        if (string.equals(koq)) {
            return this.koz;
        }
        if (string.equals(kop)) {
            return this.kov;
        }
        if (string.equals(koo)) {
            return this.koy;
        }
        if (string.equals(kot)) {
            return this.kox;
        }
        if (string.equals(kos)) {
            return this.koA;
        }
        return null;
    }

    private String dfB() {
        int n = Math.max(0, this.hQx);
        return n + 1 + "/" + this.jwd;
    }

    public void reset() {
        this.hO(true);
    }

    public void hO(boolean bl) {
        this.A(aue_0.cVJ().cVK().Xt(), bl);
    }

    private void A(int n, boolean bl) {
        int n2 = this.kov.size();
        for (int i = 0; i < n2; ++i) {
            bso_2 bso_22 = this.kov.get(i);
            if (bso_22.Xt() != n) continue;
            this.koy = bso_22;
            break;
        }
        this.koA = this.kox.get(0);
        this.hQx = -1;
        this.jwd = 1;
        if (bl) {
            this.koz = this.kow.get(0);
            this.koB = new fpi_0(this.hQx, 10);
        } else if (this.koB == null || this.koB.ghm() != fpl_0.sQG) {
            this.koB = new fpi_0(this.hQx, 10);
        }
        this.kou.clear();
        this.cDC();
        fse_1.gFu().a((aef_2)this, kok, kom, kon, kol, kos, koq, koo);
    }

    public void a(int n, int n2, List<fpq_0> list) {
        this.hQx = GC.a(n, 0, n2 - 1);
        this.jwd = n2;
        this.kou.clear();
        int n3 = list.size();
        for (int i = 0; i < n3; ++i) {
            this.kou.add(bkt_2.a(list.get(i), false));
        }
        fiu_1.uCW.N("nationPvpLadderLock", true);
        fse_1.gFu().a((aef_2)this, kok, kom, kon, kol);
    }

    private boolean dzY() {
        return this.hQx > 0;
    }

    private boolean dzZ() {
        return this.hQx + 1 < this.jwd;
    }

    public void mY(String string) {
        cxv_0 cxv_02 = new cxv_0(string);
        aue_0.cVJ().etu().d(cxv_02);
    }

    public void a(bso_2 bso_22) {
        if (this.koy == bso_22) {
            return;
        }
        this.A(bso_22.Xt(), false);
    }

    public void a(bkv_2 bkv_22) {
        if (this.koz == bkv_22) {
            return;
        }
        this.koz = bkv_22;
        this.hQx = 0;
        if (bkv_22 == this.kow.get(0)) {
            this.ebr();
        } else {
            this.bZ(bkv_22.dfW().aWP());
        }
        fse_1.gFu().a((aef_2)this, koq);
    }

    public void a(bkw_2 bkw_22) {
        if (this.koA == bkw_22) {
            return;
        }
        this.koA = bkw_22;
        if (bkw_22.koI) {
            this.ebr();
        } else {
            this.lE(aue_0.cVJ().cVK().Ya());
        }
        fse_1.gFu().a((aef_2)this, kos);
    }

    public void ebr() {
        if (this.koB.ghm() == fpl_0.sQF) {
            return;
        }
        this.hQx = -1;
        this.koB = new fpi_0(this.hQx, 10);
        this.cDC();
    }

    public void lE(long l) {
        fpk_0 fpk_02;
        if (this.koB.ghm() == fpl_0.sQH && (fpk_02 = (fpk_0)this.koB).Ya() == l) {
            return;
        }
        this.hQx = -1;
        this.koB = new fpk_0(this.hQx, 10, l);
        this.cDC();
    }

    public void bZ(short s) {
        fpj_0 fpj_02;
        if (this.koB.ghm() == fpl_0.sQG && (fpj_02 = (fpj_0)this.koB).aWP() == s) {
            return;
        }
        this.hQx = -1;
        this.koB = new fpj_0(this.hQx, 10, s);
        this.cDC();
    }

    public void ebs() {
        this.hQx = 0;
        this.cDC();
    }

    public void ebt() {
        if (!this.dzY()) {
            return;
        }
        --this.hQx;
        this.cDC();
    }

    public void ebu() {
        if (!this.dzZ()) {
            return;
        }
        ++this.hQx;
        this.cDC();
    }

    public void ebv() {
        this.hQx = this.jwd - 1;
        this.cDC();
    }

    private void cDC() {
        this.koB.YI(this.hQx);
        fiu_1.uCW.N("nationPvpLadderLock", false);
        aue_0.cVJ().etu().d(new cxw_0(this.koy.Xt(), this.koB));
    }
}

