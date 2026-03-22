/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from avd
 */
public class avd_2 {
    private static final Logger dgO = Logger.getLogger(avd_2.class);
    private final ave_2 dgP = new ave_2();
    private final ArrayList<ave_2> dgQ = new ArrayList(3);
    private static final avd_2 dgR = new avd_2();

    public void j(GL gL) {
        if (this.dgQ.size() > 0) {
            this.a(gL, this.dgP, this.dgQ.get(this.dgQ.size() - 1));
            this.dgQ.clear();
        }
        gL.glDisable(2960);
        gL.glStencilMask(-1);
        gL.glClearStencil(0);
        gL.glClear(17408);
    }

    public static avd_2 bMO() {
        return dgR;
    }

    private avd_2() {
    }

    public void a(GL gL, ave_2 ave_22) {
        int n = this.dgQ.size();
        if (n == 0) {
            this.a(gL, ave_22, this.dgP);
        } else {
            this.a(gL, ave_22, this.dgQ.get(n - 1));
        }
        this.dgQ.add(ave_22);
    }

    public void k(GL gL) {
        this.b(gL, 1);
    }

    public void b(GL gL, int n) {
        assert (n > 0);
        int n2 = this.dgQ.size();
        if (n2 == 0) {
            return;
        }
        ave_2 ave_22 = null;
        for (int i = 0; i < n; ++i) {
            ave_22 = this.dgQ.remove(--n2);
        }
        assert (n2 == this.dgQ.size());
        if (n2 == 0) {
            this.a(gL, this.dgP, ave_22);
        } else {
            ave_2 ave_23 = this.dgQ.get(n2 - 1);
            this.a(gL, ave_23, ave_22);
        }
    }

    private void a(GL gL, ave_2 ave_22, ave_2 ave_23) {
        if (ave_22.dgT != ave_23.dgT) {
            gL.glStencilMask(ave_22.dgT);
        }
        if (ave_22.dgY != ave_23.dgY) {
            gL.glColorMask(ave_22.dgY, ave_22.dgY, ave_22.dgY, ave_22.dgY);
        }
        if (ave_22.cgM != ave_23.cgM) {
            if (ave_22.cgM) {
                gL.glEnable(2960);
            } else {
                gL.glDisable(2960);
            }
        }
        if (ave_22.dgU != ave_23.dgU) {
            gL.glStencilOp(ave_22.dgU, 7680, 7680);
        }
        if (ave_22.dgV != ave_23.dgV || ave_22.dgW != ave_23.dgW || ave_22.dgX != ave_23.dgX) {
            gL.glStencilFunc(ave_22.dgV, ave_22.dgW, ave_22.dgX);
        }
        gL.glFlush();
    }
}

