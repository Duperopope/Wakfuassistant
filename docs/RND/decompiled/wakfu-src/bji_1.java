/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bji
 */
public class bji_1 {
    private static final Logger inQ = Logger.getLogger(bji_1.class);
    public static final boolean inR = false;
    private final long inS;
    private int inT;
    private int inU;
    private final ArrayList<bjk_1> inV;

    public bji_1(long l) {
        this.inS = l;
        this.inT = 0;
        this.inU = 0;
        this.inV = new ArrayList();
    }

    public void b(bhx_0 bhx_02) {
        bjk_1 bjk_12 = this.jN(bhx_02.Sn());
        bjk_12.bw(bhx_02.cmL());
        bjk_12.bB(bhx_02.doG());
    }

    public void a(bhx_0 bhx_02, List<sl_2> list) {
        Object object;
        int n;
        if (this.inV.isEmpty()) {
            this.inT = list.size();
            for (n = 0; n < list.size(); ++n) {
                object = list.get(n);
                bjk_1 bjk_12 = new bjk_1(0L, ((sl_2)object).RO, ((sl_2)object).Xr);
                this.inV.add(bjk_12);
            }
        }
        if (this.inT < list.size() && this.jN(bhx_02.Sn()) == null) {
            this.inV.add(new bjk_1(bhx_02.Sn(), bhx_02.doG(), bhx_02.cmL()));
            ++this.inT;
            ++this.inU;
            return;
        }
        if (this.jN(bhx_02.Sn()) != null) {
            return;
        }
        for (n = 0; n < this.inV.size(); ++n) {
            object = this.inV.get(n);
            if (((bjk_1)object).Sn() != 0L || ((bjk_1)object).drh() != bhx_02.doG() || ((bjk_1)object).cmL() != bhx_02.cmL()) continue;
            ((bjk_1)object).dC(bhx_02.Sn());
            ++this.inU;
            return;
        }
        this.inV.add(new bjk_1(bhx_02.Sn(), bhx_02.doG(), bhx_02.cmL()));
        ++this.inT;
        ++this.inU;
    }

    public void c(bhx_0 bhx_02) {
        bjk_1 bjk_12 = this.jN(bhx_02.Sn());
        if (this.inV.remove(bjk_12)) {
            --this.inU;
            --this.inT;
        } else {
            inQ.warn((Object)("On essaye de remove plusieurs fois le monstre " + bhx_02.Sn() + " du NPCGroupInformation."));
        }
        if (this.inU <= 0) {
            bjl_1.dri().a(this);
        }
    }

    public void d(bhx_0 bhx_02) {
        bjk_1 bjk_12 = this.jN(bhx_02.Sn());
        if (bjk_12 == null) {
            return;
        }
        bjk_12.dC(0L);
        --this.inU;
        if (this.inU <= 0) {
            bjl_1.dri().a(this);
        }
    }

    public boolean drd() {
        int n = this.inV.size();
        for (int i = 0; i < n; ++i) {
            ezg_0<ezj_0> ezg_02;
            bgy bgy2 = bgg_0.dlO().ju(this.inV.get(i).Sn());
            if (bgy2 == null || (ezg_02 = bgy2.fgT()) == null || !((ps_0)ezg_02).a(ezj_0.psE)) continue;
            return true;
        }
        return false;
    }

    public List<bjk_1> dre() {
        return this.inV;
    }

    protected bjk_1 jN(long l) {
        for (bjk_1 bjk_12 : this.inV) {
            if (bjk_12.Sn() != l) continue;
            return bjk_12;
        }
        return null;
    }

    public boolean drf() {
        return this.inT != this.inV.size();
    }

    public int drg() {
        int n = 0;
        int n2 = this.inV.size();
        for (int i = 0; i < n2; ++i) {
            bjk_1 bjk_12 = this.inV.get(i);
            n += bjk_12.cmL();
        }
        return n;
    }

    public long Sn() {
        return this.inS;
    }

    public boolean e(bhx_0 bhx_02) {
        for (int i = 0; i < this.inV.size(); ++i) {
            bjk_1 bjk_12 = this.inV.get(i);
            if (bjk_12.Sn() != bhx_02.Sn()) continue;
            return true;
        }
        return false;
    }

    public void f(bhx_0 bhx_02) {
        if (this.e(bhx_02)) {
            return;
        }
        for (int i = 0; i < this.inV.size(); ++i) {
            bjk_1 bjk_12 = this.inV.get(i);
            if (bjk_12.drh() != bhx_02.aWP() || bjk_12.cmL() != bhx_02.cmL()) continue;
            bjk_12.dC(bhx_02.Sn());
            return;
        }
    }

    public static bjk_1 g(bhx_0 bhx_02) {
        return new bjk_1(bhx_02.aZj(), bhx_02.aWP(), bhx_02.cmL());
    }
}

