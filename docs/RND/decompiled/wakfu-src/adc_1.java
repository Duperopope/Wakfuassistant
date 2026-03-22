/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aDC
 */
public abstract class adc_1
implements ayx_2 {
    protected static final Logger dDP = Logger.getLogger(adc_1.class);
    protected ObjectPool bip = null;
    protected adg_1 dDQ = null;
    private HashMap<String, Object> bIh;
    private long dDR;

    protected adc_1() {
    }

    void bYG() {
        this.dDR = System.currentTimeMillis();
    }

    boolean bYH() {
        if (ms_1.aSi.cK("dispatch")) {
            return System.currentTimeMillis() - this.dDR > TimeUnit.MINUTES.toMillis(2L);
        }
        return false;
    }

    @Override
    public void aVI() {
        this.bIh = null;
        this.dDQ = null;
    }

    @Override
    public void aVH() {
        this.bIh = null;
        this.dDQ = null;
    }

    public void a(ObjectPool objectPool) {
        this.bip = objectPool;
    }

    public void a(adf_1 adf_12) {
        this.dDQ = new adg_1();
        this.dDQ.a(adf_12);
    }

    public boolean cI() {
        return this.dDQ != null;
    }

    public boolean bYI() {
        return this.dDQ != null && this.dDQ.bSH();
    }

    public adf_1 bYJ() {
        if (this.dDQ == null) {
            return null;
        }
        return (adf_1)this.dDQ.bSY();
    }

    public void aZp() {
        if (this.bip != null) {
            try {
                this.dDQ = null;
                this.bIh = null;
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                dDP.error((Object)("Exception lev\u00e9e lors du release d'une SqlRequest (" + this.getClass().getSimpleName() + "): "), (Throwable)exception);
            }
        }
    }

    public abstract aam_2 a(ade_1 var1);

    public abstract int d();

    public void b(String string, Object object) {
        if (this.bIh == null) {
            this.bIh = new HashMap();
        }
        this.bIh.put(string, object);
    }

    public int dq(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return (Integer)this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    public long dr(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return (Long)this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    public float ds(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return ((Float)this.bIh.get(string)).floatValue();
        }
        throw new ada_1(string);
    }

    public double dt(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return (Double)this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    public String du(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return (String)this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    public Timestamp dv(String string) {
        if (this.bIh != null && this.bIh.containsKey(string)) {
            return (Timestamp)this.bIh.get(string);
        }
        throw new ada_1(string);
    }

    public String toString() {
        return "SqlRequest{" + this.getClass().getSimpleName() + "}";
    }
}

