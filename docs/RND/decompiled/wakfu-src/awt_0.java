/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aWT
 */
public class awt_0
extends adj_1 {
    private static final Logger hvU = Logger.getLogger(awt_0.class);
    private final Object hvV = new Object();
    public static final awt_0 hvW = new awt_0();
    private final ArrayList<aww_0> hvX = new ArrayList();

    private awt_0() {
        super(new awv_0());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(aww_0 aww_02) {
        Object object = this.hvV;
        synchronized (object) {
            hvU.info((Object)("[" + this.getClass().getSimpleName() + "] Demande de token Haapi"));
            this.hvX.add(aww_02);
            if (!aue_0.cVJ().c(this)) {
                aue_0.cVJ().a(this);
            }
            awt_0.cXN();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void kQ(String string) {
        Object object = this.hvV;
        synchronized (object) {
            hvU.info((Object)("[" + this.getClass().getSimpleName() + "] R\u00e9ception de token Haapi : " + string));
            int n = this.hvX.size();
            for (int i = 0; i < n; ++i) {
                aww_0 aww_02 = this.hvX.get(i);
                aww_02.kR(string);
            }
            this.hvX.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void cXM() {
        Object object = this.hvV;
        synchronized (object) {
            hvU.info((Object)("[" + this.getClass().getSimpleName() + "] R\u00e9ception d'un token Haapi vide."));
            int n = this.hvX.size();
            for (int i = 0; i < n; ++i) {
                aww_0 aww_02 = this.hvX.get(i);
                aww_02.cXM();
            }
            this.hvX.clear();
        }
    }

    private static void cXN() {
        long l = acm_2.dJ(aue_0.cVJ().etv());
        String string = aum_0.cWf().aUXX().aUR();
        aue_0.cVJ().etu().d(new cjk_0(l, string));
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.j(new awu_0(this));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            Object object = this.hvV;
            synchronized (object) {
                this.hvX.clear();
            }
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public String toString() {
        return "HaapiTokenAuthFrame{}";
    }
}

