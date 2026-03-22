/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fi
 */
public abstract class fi_1 {
    protected static final Logger oT = Logger.getLogger(fi_1.class);
    private static final int oU = 32;
    private fh_1 oV;
    protected boolean oW = false;
    public static final fi_1 oX = new fj_1();
    private final int oY;

    public fi_1() {
        this.oY = 32;
    }

    public fi_1(int n) {
        this.oY = n;
    }

    public fh_1 zn() {
        return this.oV;
    }

    public void a(fh_1 fh_12) {
        this.oV = fh_12;
    }

    public void clear() {
        this.oW = false;
        this.oV = null;
    }

    public void zo() {
        if (this.oV != null) {
            this.oV.zl();
        }
    }

    public void zp() {
        if (this.oV != null) {
            this.oV.zm();
        }
    }

    protected void zq() {
        this.oW = false;
    }

    protected void D(String string) {
        oT.error((Object)string);
        this.oW = true;
    }

    protected void a(String string, Exception exception) {
        oT.error((Object)string, (Throwable)exception);
        this.oW = true;
    }

    public boolean zr() {
        return this.oW;
    }

    void zs() {
        this.oW = false;
    }

    public int zt() {
        return this.oY;
    }

    public abstract void as(ByteBuffer var1);

    public abstract void a(ByteBuffer var1, int var2);
}

