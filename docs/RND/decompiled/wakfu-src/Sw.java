/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.Collections;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class Sw
extends St
implements ayx_2 {
    protected static final Logger boJ = Logger.getLogger(Sw.class);
    protected Sy boK;
    protected List<RT> boL;
    protected short boM;
    private static final ObjectPool boN = new ayv_2(new Sx());

    public static Sw a(RZ rZ, Sy sy, long l, RT rT, short s) {
        Sw sw;
        try {
            sw = (Sw)boN.borrowObject();
            sw.bip = boN;
        }
        catch (Exception exception) {
            boJ.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            sw = new Sw();
        }
        sw.b(rZ, sy, l, rT, s);
        return sw;
    }

    public static Sw a(RZ rZ, Sy sy, long l, List<RT> list) {
        Sw sw;
        try {
            sw = (Sw)boN.borrowObject();
            sw.bip = boN;
        }
        catch (Exception exception) {
            boJ.error((Object)("Error while checkOut on ItemExchangerEndEvent type message : " + exception.getMessage()));
            sw = new Sw();
        }
        sw.b(rZ, sy, l, list);
        return sw;
    }

    private void b(RZ rZ, Sy sy, long l, RT rT, short s) {
        this.b(rZ, Sv.boG);
        this.boK = sy;
        this.aZj = l;
        this.boL = Collections.singletonList(rT);
        this.boM = s;
    }

    private void b(RZ rZ, Sy sy, long l, List<RT> list) {
        this.b(rZ, Sv.boG);
        this.boK = sy;
        this.aZj = l;
        this.boL = list;
    }

    public Sy bfM() {
        return this.boK;
    }

    public RT bfN() {
        return this.boL.get(0);
    }

    public List<RT> auXX() {
        return this.boL;
    }

    public short bfO() {
        return this.boM;
    }

    public int bfP() {
        return this.boL.size();
    }
}

