/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.ssl.SslContext
 *  org.apache.log4j.Logger
 */
import io.netty.handler.ssl.SslContext;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Supplier;
import javax.net.ssl.SSLException;
import org.apache.log4j.Logger;

/*
 * Renamed from aUt
 */
class aut_0 {
    static final Logger gyL = Logger.getLogger(aut_0.class);
    private final Queue<oo_0> gyM = new LinkedList<oo_0>();
    private Runnable gyN;

    aut_0() {
    }

    void reset() {
        this.gyM.clear();
        this.gyN = null;
    }

    void A(List<oo_0> list) {
        this.gyM.addAll(list);
    }

    void l(Runnable runnable) {
        this.gyN = runnable;
    }

    void bXW() {
        boolean bl = false;
        while (!bl && !this.gyM.isEmpty()) {
            oo_0 oo_02 = this.gyM.poll();
            bl = aut_0.d(oo_02.aXp(), oo_02.aXq(), true);
        }
        if (!bl && this.gyN != null) {
            this.gyN.run();
        }
    }

    static boolean d(String string, int n, boolean bl) {
        try {
            gyL.info((Object)("Connexion au proxy :" + string + ":" + n + " / ssl : " + bl));
            SslContext sslContext = bl ? acm_2.bXS() : null;
            Supplier<adj_2> supplier = () -> new auu_0(string, n);
            aco_2 aco_22 = new aco_2(adc_2.dCN, supplier, sslContext);
            aco_22.a(ccf_0.lOl);
            acq_2 acq_22 = new acq_2(aco_22, string, n);
            return acq_22.f(true, false);
        }
        catch (InterruptedException | SSLException exception) {
            gyL.warn((Object)("Unable to connect to " + string + ":" + n), (Throwable)exception);
            return false;
        }
    }
}

