/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from aVh
 */
public class avh_0
extends aUS {
    private final List<Long> hsC = new ArrayList<Long>();
    private final List<Long> hsD = new ArrayList<Long>();
    private final List<Long> hsE = new ArrayList<Long>();

    public avh_0(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void caV() {
    }

    @Override
    protected void cWv() {
        Object object;
        bsS bsS2 = this.cja();
        if (bsS2 == null) {
            return;
        }
        if (bsS2 instanceof bsi_0) {
            object = (bsi_0)bsS2;
            ((bsi_0)object).O(this.hsD);
            ((bsi_0)object).P(this.hsC);
        }
        object = new ArrayList(bsS2.dGs());
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            boolean bl;
            bgy bgy2 = (bgy)iterator.next();
            bgy2.djX();
            bgy2.dkS();
            boolean bl2 = bl = bgy2.aFW() == 5;
            if (bgy2.dmc() || bl) {
                dJP.info((Object)("Removing character " + bgy2.getName() + " from manager"));
                bgg_0.dlO().av(bgy2);
                continue;
            }
            if (!this.hsC.contains(bgy2.Sn()) && !bgy2.doP() || bgy2.a(exe_1.rDn) || this.hsD.contains(bgy2.Sn()) || !(bgy2 instanceof bhx_0)) continue;
            ((bhx_0)bgy2).doF();
        }
        bsS2.chN();
        if (bsS2 instanceof bsi_0) {
            bzj_2.eqi().m((bsi_0)bsS2);
        }
        bsU.dHk().r(bsS2);
        aVi.cWF().zZ(bsS2.d());
    }

    public void m(Collection<Long> collection) {
        if (collection != null) {
            this.hsC.addAll(collection);
        }
    }

    public void n(Collection<Long> collection) {
        if (collection != null) {
            this.hsD.addAll(collection);
        }
    }

    public void o(Collection<Long> collection) {
        if (collection != null) {
            this.hsE.addAll(collection);
        }
    }
}

