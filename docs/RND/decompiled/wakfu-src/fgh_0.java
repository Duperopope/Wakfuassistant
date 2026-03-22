/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fgH
 */
public class fgh_0
implements ayx_2 {
    protected static final Logger sjZ = Logger.getLogger(fgh_0.class);
    private static final ObjectPool ska = new ayv_2(new fgI());
    private boolean skb;
    private short skc;
    private short skd;
    private short ske;
    private short skf;
    private int o;
    public ang_2 bfe;

    fgh_0() {
    }

    public fgh_0(short s, short s2, int n, short s3, short s4, ang_2 ang_22) {
        this.skc = s;
        this.skd = s2;
        this.o = n;
        this.ske = s3;
        this.skf = s4;
        this.bfe = ang_22;
    }

    public static fgh_0 a(short s, short s2, int n, short s3, short s4, ang_2 ang_22) {
        fgh_0 fgh_02;
        try {
            fgh_02 = (fgh_0)ska.borrowObject();
            fgh_02.skb = true;
        }
        catch (Exception exception) {
            fgh_02 = new fgh_0();
            fgh_02.skb = false;
            sjZ.error((Object)"Impossible de sortir un WakfuLootDescriptor du pool");
        }
        fgh_02.skc = s;
        fgh_02.skd = s2;
        fgh_02.o = n;
        fgh_02.ske = s3;
        fgh_02.skf = s4;
        fgh_02.bfe = ang_22;
        return fgh_02;
    }

    @Override
    public void aVI() {
        this.skc = 0;
        this.skd = 0;
        this.o = 0;
        this.ske = 0;
        this.skf = 0;
        this.bfe = null;
    }

    @Override
    public void aVH() {
    }

    public void aZp() {
        if (this.skb) {
            try {
                ska.returnObject((Object)this);
                this.skb = false;
            }
            catch (Exception exception) {
                sjZ.error((Object)"Impossible de rentrer un WakfuLootDescriptor dans le pool");
            }
        } else {
            this.aVH();
        }
    }

    public short fXk() {
        return this.skc;
    }

    public short fXl() {
        return this.skd;
    }

    public short fXm() {
        return this.ske;
    }

    public short fXn() {
        return this.skf;
    }

    public int d() {
        return this.o;
    }
}

