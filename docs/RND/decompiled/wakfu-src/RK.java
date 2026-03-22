/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

public abstract class RK<ContentType extends RT>
implements RQ<ContentType> {
    protected boolean bmw;
    protected final TLongObjectHashMap<ContentType> bmx = new TLongObjectHashMap();
    private long bmy;
    private final List<RR> bmz = new ArrayList<RR>();

    @Override
    public ContentType dE(long l) {
        return (ContentType)((RT)this.bmx.get(l));
    }

    public boolean dF(long l) {
        return this.bmx.containsKey(l);
    }

    @Override
    public void a(long l, ContentType ContentType) {
        this.bmx.put(l, ContentType);
    }

    @Override
    public void dG(long l) {
        this.bmx.remove(l);
    }

    @Override
    public int beI() {
        return this.bmx.size();
    }

    @Override
    public boolean beJ() {
        return this.bmx.isEmpty();
    }

    @Override
    public TLongObjectIterator<ContentType> beK() {
        return this.bmx.iterator();
    }

    @Override
    public void clear() {
        this.bmy = 0L;
        this.bmx.forEachValue((TObjectProcedure)se_0.bnC);
        this.bmx.clear();
    }

    @Override
    public boolean aLB() {
        return this.bmw;
    }

    @Override
    public void bj(boolean bl) {
        this.bmw = bl;
        this.beM();
    }

    public long beL() {
        return this.bmy;
    }

    public void dH(long l) {
        this.bmy = l;
    }

    private void beM() {
        for (int i = 0; i < this.bmz.size(); ++i) {
            this.bmz.get(i).a(this);
        }
    }

    public boolean a(RR rR) {
        return !this.bmz.contains(rR) && this.bmz.add(rR);
    }

    public boolean b(RR rR) {
        return this.bmz.remove(rR);
    }
}

