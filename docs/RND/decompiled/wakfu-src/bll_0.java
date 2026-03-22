/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.ArrayList;

/*
 * Renamed from bll
 */
public class bll_0
extends bli_0 {
    private ArrayList<blm_0> itA;

    public bll_0(bld_0 bld_02) {
        super(bld_02);
    }

    @Override
    public Object eu(String string) {
        if (string.equals("content")) {
            return this.dtx();
        }
        if (string.equals("kama")) {
            if (this.itm == null) {
                this.itm = new bln_1(this);
            }
            return this.itm;
        }
        return super.eu(string);
    }

    @Override
    protected boolean isValid() {
        if (this.itm.dtv() > 0L) {
            return true;
        }
        for (blm_0 blm_02 : this.itA) {
            if (blm_02.dtv() <= 0L) continue;
            return true;
        }
        return false;
    }

    @Override
    public void dto() {
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        for (blm_0 blm_02 : this.itA) {
            tIntIntHashMap.put(blm_02.acs(), GC.cw(blm_02.dtv()));
        }
        ((bke_1)aue_0.cVJ().cVK().dps()).a(tIntIntHashMap, this.itm.dtv());
    }

    @Override
    public long dtp() {
        return this.itm.dtv();
    }

    private ArrayList<blm_0> dtx() {
        if (this.itA == null) {
            this.itA = new ArrayList();
            TIntIntIterator tIntIntIterator = this.dtn().djh().fTo();
            while (tIntIntIterator.hasNext()) {
                tIntIntIterator.advance();
                int n = tIntIntIterator.key();
                this.itA.add(new blm_0(this, n));
            }
        }
        return this.itA;
    }
}

