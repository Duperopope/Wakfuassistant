/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bth
 */
public abstract class bth_0 {
    private static final Logger jkU = Logger.getLogger(bth_0.class);
    public static final int jkV = -1;
    public static final int jkW = 0;
    public static final int jkX = 1;
    public static final int jkY = 2;
    protected int jkZ = -1;
    private List<bti_0> aRj;

    public abstract int aeV();

    public void u(bdj_2 bdj_22) {
        bdj_22.a(aeB.bww());
    }

    public int v(bdj_2 bdj_22) {
        return this.a(bdj_22, this.dHG());
    }

    public int w(bdj_2 bdj_22) {
        return this.a(bdj_22, this.dHH());
    }

    private int a(bdj_2 bdj_22, String string) {
        int n = bdj_22.dY(string);
        if (n == Integer.MAX_VALUE) {
            if (!string.equals(bdj_22.bpT())) {
                jkU.warn((Object)("acteur gfxId=" + bdj_22.dcP().aVt() + " n'a pas une anim " + string + " valide"));
            }
            return 0;
        }
        return n;
    }

    protected abstract String dHG();

    protected abstract String dHH();

    public final void x(bdj_2 bdj_22) {
        try {
            this.z(bdj_22);
        }
        catch (Exception exception) {
            jkU.error((Object)"Exception levee", (Throwable)exception);
        }
        this.y(bdj_22);
    }

    private void y(bdj_2 bdj_22) {
        if (this.aRj == null) {
            return;
        }
        ArrayList<bti_0> arrayList = new ArrayList<bti_0>(this.aRj);
        for (bti_0 bti_02 : arrayList) {
            try {
                bti_02.a(bdj_22, this);
            }
            catch (Exception exception) {
                jkU.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public abstract void z(bdj_2 var1);

    public boolean c(bth_0 bth_02) {
        if (bth_02 == this) {
            return true;
        }
        return bth_02 != null && bth_02.aeV() == this.aeV();
    }

    public String dHI() {
        return "AnimHit";
    }

    public String[] dHJ() {
        return null;
    }

    public int dHK() {
        return this.jkZ;
    }

    public abstract void A(bdj_2 var1);

    public void b(bti_0 bti_02) {
        if (this.aRj == null) {
            this.aRj = new ArrayList<bti_0>();
        }
        if (this.aRj.contains(bti_02)) {
            return;
        }
        this.aRj.add(bti_02);
    }

    public void c(bti_0 bti_02) {
        if (this.aRj != null) {
            this.aRj.remove(bti_02);
        }
    }
}

