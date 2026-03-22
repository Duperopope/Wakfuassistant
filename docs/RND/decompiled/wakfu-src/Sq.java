/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class Sq
extends St
implements ayx_2 {
    protected static final Logger bon = Logger.getLogger(Sq.class);
    private Ss boo;
    private static final ObjectPool bop = new ayv_2(new Sr());

    public static Sq a(RZ rZ, Ss ss) {
        Sq sq;
        try {
            sq = (Sq)bop.borrowObject();
            sq.bip = bop;
        }
        catch (Exception exception) {
            bon.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            sq = new Sq();
        }
        sq.b(rZ, ss);
        return sq;
    }

    protected Sq() {
        this.boA = null;
        this.boB = null;
    }

    protected void b(RZ rZ, Ss ss) {
        this.b(rZ, Sv.boH);
        this.boo = ss;
    }

    @Override
    public void aZp() {
        if (this.bip != null) {
            this.bip.returnObject((Object)this);
            this.bip = null;
        } else {
            bon.error((Object)("Double release de " + this.getClass().toString()));
            this.aVH();
        }
    }

    public Ss bfF() {
        return this.boo;
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.boo = null;
    }
}

