/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aVm
extends agb_1
implements ayz_2 {
    private static final Logger hsN = Logger.getLogger(aVm.class);
    private final ArrayList<bgy> hsO = new ArrayList();
    private final ArrayList<acd_1> hsP = new ArrayList();
    private boolean hsQ = true;
    private static final ayv_2 hsR = new ayv_2(new aVn());

    public static aVm a(int n, int n2, int n3, bgy bgy2, acd_1 acd_12, boolean bl) {
        aVm aVm2 = aVm.a(n, n2, n3, bgy2, acd_12);
        aVm2.hsQ = bl;
        return aVm2;
    }

    public static aVm a(int n, int n2, int n3, bgy bgy2, acd_1 acd_12) {
        try {
            aVm aVm2 = (aVm)hsR.borrowObject();
            aVm2.xO(n);
            aVm2.xP(n2);
            aVm2.xQ(n3);
            aVm2.hsO.add(bgy2);
            aVm2.hsP.add(acd_12);
            aVm2.hsQ = false;
            return aVm2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsR.returnObject(this);
        }
        catch (Exception exception) {
            hsN.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
        this.hsQ = true;
    }

    @Override
    public void aVH() {
        this.hsO.clear();
        this.hsP.clear();
    }

    aVm() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        int n = 0;
        for (bgy bgy2 : this.hsO) {
            acd_1 acd_12 = this.hsP.get(n);
            boolean bl = false;
            if (this.hsQ) {
                bl = bgy2.ddI().c(acd_12, false, false);
            }
            if (!bl) {
                bgy2.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), false);
            }
            ++n;
        }
        return 0L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    public void a(bgy bgy2, acd_1 acd_12) {
        this.hsO.add(bgy2);
        this.hsP.add(acd_12);
    }
}

