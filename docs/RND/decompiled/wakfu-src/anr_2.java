/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from anR
 */
public final class anr_2 {
    protected static final Logger cKH = Logger.getLogger(anr_2.class);
    private static final boolean cKI = false;
    private static final ArrayList<anr_2> cKJ = new ArrayList();
    private static boolean bXs;
    private static double cKK;
    private acc_2 cKL;
    private acc_2 cKM;
    private final ArrayList<anq_2> cKN = new ArrayList();

    static void bDZ() {
        for (anr_2 anr_22 : cKJ) {
            try {
                anr_22.bEd();
            }
            catch (Exception exception) {
                cKH.error((Object)"Exception during updateManagers", (Throwable)exception);
            }
        }
    }

    private static void aPg() {
        if (!bXs) {
            abg_2.bUP().a((Runnable)new ans_2(), 50L);
            bXs = true;
        }
    }

    private static void bEa() {
        cKH.trace((Object)(cKJ.size() + " manager(s) registered"));
    }

    public static boolean a(anr_2 anr_22) {
        if (!bXs) {
            anr_2.aPg();
        }
        if (!cKJ.contains(anr_22)) {
            boolean bl = cKJ.add(anr_22);
            return bl;
        }
        return false;
    }

    public static boolean b(anr_2 anr_22) {
        boolean bl = cKJ.remove(anr_22);
        if (!bl) {
            cKH.error((Object)("Impossible de retirer le manager " + String.valueOf(anr_22) + " de la liste."));
        }
        return bl;
    }

    public static double bEb() {
        return cKK;
    }

    public static void C(double d2) {
        cKK = d2;
    }

    public anr_2(boolean bl) {
        this(bl, null);
    }

    public anr_2(boolean bl, anq_2 anq_22) {
        if (bl) {
            this.cKL = new acc_2();
            this.a(anq_22);
        } else {
            anr_2.a(this);
            this.a(anq_22);
        }
    }

    public void a(anq_2 anq_22) {
        if (anq_22 != null && !this.cKN.contains(anq_22)) {
            this.cKN.add(anq_22);
        }
    }

    public void b(anq_2 anq_22) {
        if (anq_22 != null) {
            this.cKN.remove(anq_22);
        }
    }

    public void a(long l, acc_2 acc_22, boolean bl) {
        if (acc_22.bzL().bWU() == 0.0f && acc_22.bzN().bWU() == 0.0f) {
            return;
        }
        acp_1 acp_12 = acc_22.fZ(l);
        acp_1 acp_13 = this.gr(l);
        double d2 = acp_13.k(acp_12).bWV();
        if (bl || d2 >= cKK || acc_22.bzN().bWU() == 0.0f) {
            acc_2 acc_23 = new acc_2(acc_22);
            for (anq_2 anq_22 : this.cKN) {
                anq_22.a(l, this.cKL, acc_23);
            }
            this.cKL = acc_23;
        }
    }

    public acp_1 gr(long l) {
        return this.cKL.fZ(l);
    }

    public boolean bEc() {
        return this.cKM == null;
    }

    public void a(long l, acc_2 acc_22) {
        if (this.cKM == null || !acc_22.bzM().equals(this.cKM.bzM())) {
            this.cKM = new acc_2(acc_22);
        }
    }

    private void bEd() {
        if (this.cKM != null) {
            long l = System.currentTimeMillis();
            for (anq_2 anq_22 : this.cKN) {
                anq_22.a(l, new acc_2(this.cKM));
            }
            this.cKM = null;
        }
    }

    public String toString() {
        if (this.cKM != null) {
            return this.cKM.toString();
        }
        if (this.cKL != null) {
            return this.cKL.toString();
        }
        return "<undefined>";
    }

    public static void bEe() {
        if (cKJ != null) {
            int n = cKJ.size();
            cKJ.clear();
            bXs = false;
            cKH.info((Object)("Nettoyage des vecteurs de mouvement des personnages (" + cKJ.size() + " restants sur " + n + ")"));
        }
    }

    static {
        cKK = 3.0;
    }
}

