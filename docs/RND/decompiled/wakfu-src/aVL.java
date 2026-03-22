/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public class aVL
extends agb_1
implements ayz_2 {
    private ArrayList<bgy> htw;
    private bgy htx;
    private static final ayv_2 hty = new ayv_2(new avm_0());

    public static aVL a(int n, int n2, int n3, Collection<bgy> collection) {
        try {
            aVL aVL2 = (aVL)hty.borrowObject();
            aVL2.xO(n);
            aVL2.xP(n2);
            aVL2.xQ(n3);
            aVL2.htw = new ArrayList<bgy>(collection);
            return aVL2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    public static aVL a(int n, int n2, int n3, bgy bgy2) {
        try {
            aVL aVL2 = (aVL)hty.borrowObject();
            aVL2.xO(n);
            aVL2.xP(n2);
            aVL2.xQ(n3);
            aVL2.htx = bgy2;
            return aVL2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hty.returnObject(this);
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
        this.htw = null;
        this.htx = null;
    }

    aVL() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        int n;
        int n2 = 75;
        if (this.htw != null && this.htw.size() > 0) {
            for (n = this.htw.size() - 1; n >= 0; --n) {
                bgy bgy2 = this.htw.get(n);
                int n3 = this.N(bgy2);
                if (n3 <= n2) continue;
                n2 = n3;
            }
        }
        if (this.htx != null && (n = this.N(this.htx)) > n2) {
            n2 = n;
        }
        return n2;
    }

    private int N(bgy bgy2) {
        if (bgy2 instanceof bhx_0) {
            bhx_0 bhx_02 = (bhx_0)bgy2;
            bdj_2 bdj_22 = bhx_02.ddI();
            bdj_22.bf((byte)-1);
            return btn_0.bx(bgy2);
        }
        if (bgy2 instanceof bhJ) {
            if (bgy2 == aue_0.cVJ().cVK()) {
                cAY.eHc().eHw();
            }
            bgy2.ddI().ddi();
            bgy2.dkL();
            return 0;
        }
        return 0;
    }

    @Override
    protected void caV() {
        this.aZp();
    }
}

