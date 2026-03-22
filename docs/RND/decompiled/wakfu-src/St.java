/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class St
implements ayx_2 {
    protected static final Logger boz = Logger.getLogger(St.class);
    protected Sv boA = null;
    protected RZ boB = null;
    protected long aZj = -1L;
    protected ObjectPool bip;
    private static final ObjectPool boC = new ayv_2(new Su());

    public static St a(RZ rZ, Sv sv) {
        St st;
        try {
            st = (St)boC.borrowObject();
            st.bip = boC;
        }
        catch (Exception exception) {
            boz.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEvent : " + exception.getMessage()));
            st = new St();
        }
        st.b(rZ, sv);
        return st;
    }

    protected St() {
    }

    protected void b(RZ rZ, Sv sv) {
        this.boB = rZ;
        this.boA = sv;
    }

    public void aZp() {
        if (this.bip != null) {
            this.bip.returnObject((Object)this);
            this.bip = null;
        } else {
            boz.error((Object)("Double release de " + this.getClass().toString()));
            this.aVH();
        }
    }

    public Sv bfI() {
        return this.boA;
    }

    public RZ bfJ() {
        return this.boB;
    }

    public void dX(long l) {
        this.aZj = l;
    }

    public long fD() {
        return this.aZj;
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
        this.boB = null;
        this.boA = null;
        this.aZj = -1L;
    }
}

