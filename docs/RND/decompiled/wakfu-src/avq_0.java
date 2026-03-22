/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from aVq
 */
public class avq_0
extends agb_1
implements ayz_2 {
    private Collection<bgy> hsS;
    private byte hsU;
    private static final ayv_2 hsV = new ayv_2(new aVr());

    public static avq_0 a(int n, int n2, int n3, Collection<bgy> collection, byte by) {
        try {
            avq_0 avq_02 = (avq_0)hsV.borrowObject();
            avq_02.xO(n);
            avq_02.xP(n2);
            avq_02.xQ(n3);
            avq_02.hsS = collection;
            avq_02.hsU = by;
            return avq_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsV.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.hsS = null;
        this.hsU = 0;
    }

    avq_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        for (bgy bgy2 : this.hsS) {
            bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
            if (bsS2 == null || !(bgy2 instanceof bhJ) || bsS2.dGp() != etw_0.rqT && bsS2.dGp() != etw_0.rqV) continue;
            bgy2.ddI().bf(this.hsU);
        }
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

