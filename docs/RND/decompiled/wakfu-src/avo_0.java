/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from aVo
 */
public class avo_0
extends agb_1
implements ayz_2 {
    private Collection<bgy> hsS;
    private int bsx = -1;
    private static final ayv_2 hsT = new ayv_2(new avp_0());

    public static avo_0 a(int n, int n2, int n3, Collection<bgy> collection, int n4) {
        try {
            avo_0 avo_02 = (avo_0)hsT.borrowObject();
            avo_02.xO(n);
            avo_02.xP(n2);
            avo_02.xQ(n3);
            avo_02.hsS = collection;
            avo_02.bsx = n4;
            return avo_02;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsT.returnObject(this);
        }
        catch (Exception exception) {
            dJP.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
        this.bsx = -1;
    }

    @Override
    public void aVH() {
        this.hsS = null;
    }

    avo_0() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        bsS bsS2 = bsU.dHk().Ft(this.bsx);
        if (bsS2 == null) {
            return 250L;
        }
        for (bgy bgy2 : this.hsS) {
            byte by = bgy2.bcP();
            bgy2.ddI().bd(by);
        }
        return 250L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

