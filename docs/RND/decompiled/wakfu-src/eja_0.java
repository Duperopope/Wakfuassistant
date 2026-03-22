/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eJa
 */
public class eja_0
implements exa_1<pr_0> {
    private final TIntObjectHashMap<pr_0> qyo = new TIntObjectHashMap();

    public eja_0(Iterable<pt_0> iterable) {
        for (pt_0 pt_02 : iterable) {
            this.qyo.put((int)pt_02.aJr(), (Object)eix_0.f(pt_02));
        }
    }

    public eja_0(pt_0[] pt_0Array) {
        for (pt_0 pt_02 : pt_0Array) {
            this.qyo.put((int)pt_02.aJr(), (Object)eix_0.f(pt_02));
        }
    }

    @Override
    public void aYH() {
        TIntObjectIterator tIntObjectIterator = this.qyo.iterator();
        int n = this.qyo.size();
        while (n-- > 0) {
            tIntObjectIterator.advance();
            pr_0 pr_02 = (pr_0)tIntObjectIterator.value();
            pr_02.aYH();
        }
    }

    @Override
    public boolean g(pt_0 pt_02) {
        return pt_02 != null && this.qyo.contains((int)pt_02.aJr());
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return (pr_0)this.qyo.get((int)pt_02.aJr());
    }

    @Override
    public int c(pt_0 pt_02) {
        pr_0 pr_02 = (pr_0)this.qyo.get((int)pt_02.aJr());
        if (pr_02 != null) {
            return pr_02.aYB();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante : " + pt_02.aJr());
    }

    @Override
    public int h(pt_0 pt_02) {
        pr_0 pr_02 = (pr_0)this.qyo.get((int)pt_02.aJr());
        if (pr_02 != null) {
            return pr_02.aYD();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante : " + pt_02.aJr());
    }

    public void c(pu_0 pu_02) {
        TIntObjectIterator tIntObjectIterator = this.qyo.iterator();
        int n = this.qyo.size();
        while (n-- > 0) {
            tIntObjectIterator.advance();
            pr_0 pr_02 = (pr_0)tIntObjectIterator.value();
            pr_02.a(pu_02);
        }
    }

    public void djf() {
        if (this.qyo.isEmpty()) {
            return;
        }
        this.qyo.forEachValue((TObjectProcedure)new ejb_0(this));
    }

    public TIntObjectIterator<pr_0> ekN() {
        return this.qyo.iterator();
    }

    @Override
    public boolean a(tp_1 tp_12, pt_0 ... pt_0Array) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public boolean a(tp_1 tp_12) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public boolean b(tp_1 tp_12) {
        throw new UnsupportedOperationException("On ne peut pas s\u00e9rialiser un characteristic manager d'objet");
    }

    @Override
    public void a(exh_1 exh_12) {
        throw new UnsupportedOperationException("On ne peut pas invoquer le double d'un objet ");
    }
}

