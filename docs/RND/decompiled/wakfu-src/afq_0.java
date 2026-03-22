/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GLAutoDrawable;
import javax.swing.JComponent;

/*
 * Renamed from afq
 */
public class afq_0
implements afy_0,
axn_1 {
    private final afr_0 cqf;
    private static final int cqg = 5;
    private static final long cqh = 60000000L;
    private final long[] cqi = new long[5];
    private int cqj = -1;
    private long cqk = 0L;

    public afq_0() {
        this.cqf = new afr_0();
    }

    private int sd(int n) {
        int n2 = n % 5;
        if (n2 >= 0) {
            return n2;
        }
        return n2 + 5;
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        long l;
        int n = this.sd(++this.cqj);
        this.cqi[n] = l = System.nanoTime();
        if (l - this.cqk <= 60000000L) {
            return;
        }
        long l2 = l - this.cqi[this.sd(n + 1)];
        if (l2 == 0L) {
            return;
        }
        long l3 = Math.round(1.0E9 / (double)l2 * 4.0);
        this.cqf.cql.setText(Long.toString(l3));
        this.cqk = l;
    }

    @Override
    public void b(WL wL) {
        wL.bmE().a(this);
    }

    @Override
    public void c(WL wL) {
        wL.bmE().b(this);
    }

    @Override
    public JComponent bxL() {
        return this.cqf;
    }

    @Override
    public String getName() {
        return "FPS Viewer";
    }

    @Override
    public void b(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, boolean bl, boolean bl2) {
    }
}

