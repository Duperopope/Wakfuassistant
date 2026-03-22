/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fFx
 */
public class ffx_2
extends ffj_2<ffr_1> {
    private static final Logger uqb = Logger.getLogger(ffx_2.class);
    private ffl_2 uqc;
    private ffl_2 uqd;

    public ffx_2(ffr_1 ffr_12) {
        super(ffr_12);
    }

    public ffl_2 gN(int n, int n2) {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffo_2 ffo_22 = (ffo_2)tLongObjectIterator.value();
            ArrayList<ffl_2> arrayList = ffo_22.getChildren();
            int n3 = arrayList.size();
            for (int i = 0; i < n3; ++i) {
                ffl_2 ffl_22 = arrayList.get(i);
                if (!ffl_22.aq(n, n2)) continue;
                return ffl_22;
            }
        }
        return null;
    }

    public ffl_2 gO(int n, int n2) {
        return this.gN(Wa.qf(n), Wa.qg(n2));
    }

    @Override
    public void clear() {
        super.clear();
        this.c(null);
    }

    public ffl_2 getSelectedMapZone() {
        return this.uqc;
    }

    public void gP(int n, int n2) {
        if (this.uqc != null && this.uqc.aq(n, n2)) {
            return;
        }
        this.c(this.gN(n, n2));
    }

    public void c(ffl_2 ffl_22) {
        if (this.uqc == ffl_22) {
            return;
        }
        if (this.uqc != null) {
            this.uqc.setSelected(false);
        }
        this.uqc = ffl_22;
        if (this.uqc != null) {
            this.uqc.setSelected(true);
        }
        if (this.uoP != null) {
            ((ffr_1)this.uoP).aaO(this.uqc != null ? (int)this.uqc.gvT().gvB() : -1);
        }
    }

    public void setPlayerMapZone(int n, int n2) {
        ffl_2 ffl_22 = this.gO(n, n2);
        if (ffl_22 == this.uqd) {
            return;
        }
        if (this.uqd != null) {
            this.uqd.cN(1.0f);
            ((ffr_1)this.uoP).g(this.uqd.gvM(), 1.0f);
        }
        this.uqd = ffl_22;
        if (this.uqd != null) {
            this.uqd.cN(3.0f);
            ((ffr_1)this.uoP).g(this.uqd.gvM(), 5.0f);
        }
    }

    public void gwn() {
        if (this.uqd != null) {
            ((ffr_1)this.uoP).g(this.uqd.gvM(), 5.0f);
        }
    }

    public boolean gwo() {
        return !this.uoQ.isEmpty();
    }

    @Override
    public void gtm() {
        super.gtm();
        this.c(null);
    }

    public void a(float f2, TLongObjectHashMap<axb_2> tLongObjectHashMap, TLongByteHashMap tLongByteHashMap) {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ((ffo_2)tLongObjectIterator.value()).cz(f2);
            ArrayList<ffl_2> arrayList = ((ffo_2)tLongObjectIterator.value()).getChildren();
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                ffl_2 ffl_22 = arrayList.get(i);
                ffq_2 ffq_22 = ffl_22.gvT();
                long l = ffq_22.Sn();
                axb_2 axb_22 = ffq_22.dYq();
                byte by = ffq_22.gvB();
                tLongObjectHashMap.put(l, (Object)axb_22);
                tLongByteHashMap.put(l, by);
            }
        }
    }

    public boolean aj(int n, boolean bl) {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            ffo_2 ffo_22 = (ffo_2)tLongObjectIterator.value();
            if (this.uoR.contains(tLongObjectIterator.key())) continue;
            ArrayList<ffl_2> arrayList = ffo_22.getChildren();
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                ffl_2 ffl_22 = arrayList.get(i);
                if (ffl_22.gvT().Sn() != (long)n) continue;
                ffl_22.setVisible(bl);
                return true;
            }
        }
        return false;
    }
}

