/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aFT
 */
public abstract class aft_2 {
    protected static final Logger dJP = Logger.getLogger(aft_2.class);
    public static final long dJQ = Long.MIN_VALUE;
    public static final int dJR = -1;
    protected final ArrayList<afv_2> dJS = new ArrayList();
    private int dJT;
    private int dJU;
    private int bfF;
    private long dJV = Long.MIN_VALUE;
    private long bhR = Long.MIN_VALUE;
    private boolean dJW = false;
    private int dJX = -1;
    private afw_2 dJY;

    public aft_2(int n, int n2, int n3) {
        this.dJT = n;
        this.dJU = n2;
        this.bfF = n3;
    }

    public abstract void run();

    public void a(afv_2 afv_22) {
        this.dJS.add(afv_22);
    }

    public void b(afv_2 afv_22) {
        this.dJS.remove(afv_22);
    }

    public int caO() {
        return this.dJT;
    }

    public void xO(int n) {
        this.dJT = n;
    }

    public int caP() {
        return this.dJU;
    }

    public void xP(int n) {
        this.dJU = n;
    }

    public int avZ() {
        return this.bfF;
    }

    public void xQ(int n) {
        this.bfF = n;
    }

    public long caQ() {
        return this.dJV;
    }

    public void hB(long l) {
        this.dJV = l;
    }

    public int caR() {
        return this.dJX;
    }

    public void xR(int n) {
        this.dJX = n;
    }

    public long Qy() {
        return this.bhR;
    }

    public void fg(long l) {
        this.bhR = l;
    }

    public void a(afw_2 afw_22) {
        this.dJY = afw_22;
    }

    public afw_2 caS() {
        return this.dJY;
    }

    protected void caT() {
        try {
            this.caV();
        }
        catch (Exception exception) {
            dJP.error((Object)"Exception levee", (Throwable)exception);
        }
        for (afv_2 afv_22 : this.dJS.toArray(new afv_2[this.dJS.size()])) {
            try {
                afv_22.a(this);
            }
            catch (Exception exception) {
                dJP.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public boolean caU() {
        return this.dJW;
    }

    public void dM(boolean bl) {
        this.dJW = bl;
    }

    protected abstract void caV();

    public String toString() {
        return "{Action UID=" + this.caO() + " id=" + this.avZ() + " type=" + this.caP() + "}";
    }

    public int caW() {
        return -1;
    }
}

