/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from axl
 */
public class axl_2
implements ayz_2 {
    protected static final Logger dpg = Logger.getLogger(axl_2.class);
    private static final ObjectPool dph = new ayv_2(new axm_2());
    private int bap;
    private int baq;
    private int brs;
    private int brt;

    public static axl_2 bQO() {
        return axl_2.t(0, 0, 0, 0);
    }

    public static axl_2 t(int n, int n2, int n3, int n4) {
        try {
            axl_2 axl_22 = (axl_2)dph.borrowObject();
            axl_22.h(n, n2, n3, n4);
            return axl_22;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut sur un Item : ", exception);
        }
    }

    axl_2(int n, int n2, int n3, int n4) {
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
    }

    @Override
    public void aZp() {
        try {
            dph.returnObject((Object)this);
        }
        catch (Exception exception) {
            dpg.error((Object)("Exception dans le release de " + this.getClass().toString() + " (normalement impossible)"));
        }
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.bap = 0;
        this.baq = 0;
        this.brs = 0;
        this.brt = 0;
    }

    public axl_2 a(axl_2 axl_22) {
        int n = Math.min(this.bap, axl_22.bap);
        int n2 = Math.min(this.baq, axl_22.baq);
        int n3 = Math.max(this.bap + this.brs, axl_22.bap + axl_22.brs);
        int n4 = Math.max(this.baq + this.brt, axl_22.baq + axl_22.brt);
        return axl_2.t(n, n2, n3 - n, n4 - n2);
    }

    public void b(axl_2 axl_22) {
        int n = Math.min(this.bap, axl_22.bap);
        int n2 = Math.min(this.baq, axl_22.baq);
        int n3 = Math.max(this.bap + this.brs, axl_22.bap + axl_22.brs);
        int n4 = Math.max(this.baq + this.brt, axl_22.baq + axl_22.brt);
        this.h(n, n2, n3 - n, n4 - n2);
    }

    public axl_2 c(axl_2 axl_22) {
        axl_2 axl_23 = axl_2.bQO();
        axl_23.a(this, axl_22);
        return axl_23;
    }

    public void a(axl_2 axl_22, axl_2 axl_23) {
        int n = axl_22.bap;
        int n2 = axl_22.baq;
        int n3 = axl_23.bap;
        int n4 = axl_23.baq;
        long l = n;
        l += (long)axl_22.brs;
        long l2 = n2;
        l2 += (long)axl_22.brt;
        long l3 = n3;
        l3 += (long)axl_23.brs;
        long l4 = n4;
        l4 += (long)axl_23.brt;
        if (n < n3) {
            n = n3;
        }
        if (n2 < n4) {
            n2 = n4;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n2;
        if ((l -= (long)n) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        this.bap = n;
        this.baq = n2;
        this.brs = (int)l;
        this.brt = (int)l2;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n;
        int n10 = n2;
        long l = n9;
        l += (long)n3;
        long l2 = n10;
        l2 += (long)n4;
        long l3 = n5;
        l3 += (long)n7;
        long l4 = n6;
        l4 += (long)n8;
        if (n9 < n5) {
            n9 = n5;
        }
        if (n10 < n6) {
            n10 = n6;
        }
        if (l > l3) {
            l = l3;
        }
        if (l2 > l4) {
            l2 = l4;
        }
        l2 -= (long)n10;
        if ((l -= (long)n9) < Integer.MIN_VALUE) {
            l = Integer.MIN_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            l2 = Integer.MIN_VALUE;
        }
        this.bap = n9;
        this.baq = n10;
        this.brs = (int)l;
        this.brt = (int)l2;
    }

    public boolean d(axl_2 axl_22) {
        int n = this.brs;
        int n2 = this.brt;
        int n3 = axl_22.brs;
        int n4 = axl_22.brt;
        if (n3 <= 0 || n4 <= 0 || n <= 0 || n2 <= 0) {
            return false;
        }
        int n5 = this.bap;
        int n6 = this.baq;
        int n7 = axl_22.bap;
        int n8 = axl_22.baq;
        n4 += n8;
        n += n5;
        n2 += n6;
        return !((n3 += n7) >= n7 && n3 <= n5 || n4 >= n8 && n4 <= n6 || n >= n5 && n <= n7 || n2 >= n6 && n2 <= n8);
    }

    public static boolean b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n3;
        int n10 = n4;
        int n11 = n7;
        int n12 = n8;
        if (n11 <= 0 || n12 <= 0 || n9 <= 0 || n10 <= 0) {
            return false;
        }
        n12 += n6;
        n9 += n;
        n10 += n2;
        return !((n11 += n5) >= n5 && n11 <= n || n12 >= n6 && n12 <= n2 || n9 >= n && n9 <= n5 || n10 >= n2 && n10 <= n6);
    }

    public void e(axl_2 axl_22) {
        this.bap = axl_22.bap;
        this.baq = axl_22.baq;
        this.brs = axl_22.brs;
        this.brt = axl_22.brt;
    }

    public void h(int n, int n2, int n3, int n4) {
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
    }

    public void bE(int n, int n2) {
        this.bap = n;
        this.baq = n2;
    }

    public void a(Dimension dimension) {
        this.setSize(dimension.width, dimension.height);
    }

    public void setSize(int n, int n2) {
        this.brs = n;
        this.brt = n2;
    }

    public int getHeight() {
        return this.brt;
    }

    public int getWidth() {
        return this.brs;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public void setY(int n) {
        this.baq = n;
    }
}

