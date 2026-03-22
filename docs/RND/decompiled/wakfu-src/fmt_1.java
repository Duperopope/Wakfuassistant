/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLDrawable
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.glu.GLUquadric
 */
import com.jogamp.opengl.GLDrawable;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from fMT
 */
public class fmt_1 {
    private static final fmt_1 uJs = new fmt_1();
    private final GLU uJt = new GLU();
    private final GLUquadric uJu = this.uJt.gluNewQuadric();
    private int brs;
    private int brt;
    private final Point uJv = new Point();
    private axl_2 uJw;
    private final List<axl_2> uJx = new ArrayList<axl_2>();

    public static fmt_1 gEy() {
        return uJs;
    }

    private fmt_1() {
    }

    public void a(GLDrawable gLDrawable) {
        this.brs = gLDrawable.getSurfaceWidth();
        this.brt = gLDrawable.getSurfaceHeight();
    }

    public final Point gEz() {
        return this.uJv;
    }

    public axl_2 gEA() {
        return this.uJw;
    }

    public void g(axl_2 axl_22) {
        if (!this.uJx.isEmpty()) {
            axl_2 axl_23 = this.uJx.get(this.uJx.size() - 1);
            if (axl_23.d(axl_22)) {
                axl_22.a(axl_23, axl_22);
            } else {
                axl_22.h(0, 0, 0, 0);
            }
        }
        this.uJx.add(axl_22);
        this.uJw = axl_22;
    }

    public void gEB() {
        if (!this.uJx.isEmpty()) {
            this.uJx.remove(this.uJx.size() - 1).aZp();
            this.uJw = this.gEC();
        }
    }

    public axl_2 gEC() {
        if (!this.uJx.isEmpty()) {
            return this.uJx.get(this.uJx.size() - 1);
        }
        return null;
    }

    public void hg(int n, int n2) {
        this.brs = n;
        this.brt = n2;
        this.uJw = axl_2.t(0, 0, n, n2);
        this.uJv.setLocation(-n / 2, -n2 / 2);
    }

    public fsm_1 gED() {
        return new fsm_1(this.brs, this.brt);
    }
}

