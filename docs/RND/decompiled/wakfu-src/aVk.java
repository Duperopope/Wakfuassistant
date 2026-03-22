/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aVk
extends aUW
implements ayz_2 {
    private static final Logger hsI = Logger.getLogger(aVk.class);
    private final ArrayList<bdj_2> hsJ = new ArrayList();
    private final ArrayList<abj_2> hsK = new ArrayList();
    private final ArrayList<Boolean> hsL = new ArrayList();
    private Object bPm;
    private static final ayv_2 hsM = new ayv_2(new avl_0());

    public static aVk a(int n, int n2, int n3, bdj_2 bdj_22, abj_2 abj_22) {
        try {
            aVk aVk2 = (aVk)hsM.borrowObject();
            aVk2.xO(n);
            aVk2.xP(n2);
            aVk2.xQ(n3);
            if (abj_22.bVZ() > 0) {
                aVk2.hsJ.add(bdj_22);
                aVk2.hsK.add(abj_22);
                aVk2.hsL.add(false);
            }
            return aVk2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void aZp() {
        try {
            hsM.returnObject(this);
        }
        catch (Exception exception) {
            hsI.error((Object)("Exception dans le release de " + String.valueOf(this.getClass()) + "(normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
        this.bPm = new Object();
    }

    @Override
    public void aVH() {
        this.hsJ.clear();
        this.hsK.clear();
        this.hsL.clear();
        this.bPm = null;
    }

    aVk() {
        super(0, 0, 0);
    }

    @Override
    protected long cbk() {
        for (int i = this.hsJ.size() - 1; i >= 0; --i) {
            bdj_2 bdj_22 = this.hsJ.get(i);
            hsI.info((Object)("onRun :" + bdj_22.Sn()));
            bdj_22.b(this);
            bdj_22.b(this.hsK.get(i));
        }
        return 7000L;
    }

    @Override
    protected void caV() {
        this.aZp();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        Object object = this.bPm;
        synchronized (object) {
            ads_02.c(this);
            boolean bl = true;
            for (int i = this.hsJ.size() - 1; i >= 0; --i) {
                if (this.hsJ.get(i) == ads_02) {
                    hsI.info((Object)("pathEnded :" + this.hsJ.get(i).Sn()));
                    this.hsL.remove(i);
                    this.hsL.add(i, true);
                }
                if (this.hsL.get(i).booleanValue()) continue;
                bl = false;
                hsI.info((Object)("all finish :" + this.hsJ.get(i).Sn()));
            }
            if (bl) {
                abb_2.bUA().hk(this.dxy);
                this.caT();
            }
        }
    }

    public void a(bdj_2 bdj_22, abj_2 abj_22) {
        if (abj_22.bVZ() > 0) {
            this.hsJ.add(bdj_22);
            this.hsK.add(abj_22);
            this.hsL.add(false);
        }
    }
}

