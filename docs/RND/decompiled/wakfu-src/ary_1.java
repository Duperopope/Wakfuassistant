/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from arY
 */
public class ary_1
implements arw_2 {
    protected static final Logger cWs = Logger.getLogger(ary_1.class);
    public static final ary_1 cWt = new ary_1();
    private final ArrayList<arw_2> cWu = new ArrayList();

    private ary_1() {
    }

    public void a(arw_2 arw_22) {
        this.cWu.add(arw_22);
    }

    @Override
    public void aPg() {
        cWs.info((Object)"Initializing benchmarks...");
        int n = this.cWu.size();
        for (int i = 0; i < n; ++i) {
            arw_2 arw_22 = this.cWu.get(i);
            try {
                arw_22.aPg();
                continue;
            }
            catch (Exception exception) {
                cWs.error((Object)("Erreur \u00e0 l'initialisation du benchmark " + arw_22.getName()), (Throwable)exception);
            }
        }
    }

    @Override
    public void a(arx_2 arx_22) {
        cWs.info((Object)"Running benchmarks...");
        int n = this.cWu.size();
        for (int i = 0; i < n; ++i) {
            arw_2 arw_22 = this.cWu.get(i);
            cWs.info((Object)("\t* benchmarking " + arw_22.getName() + "..."));
            try {
                arw_22.a(arx_22);
                continue;
            }
            catch (Exception exception) {
                cWs.error((Object)("Erreur \u00e0 l'execution du benchmark " + arw_22.getName()), (Throwable)exception);
            }
        }
    }

    @Override
    public void bmX() {
        cWs.info((Object)"Cleaning up benchmarks...");
        int n = this.cWu.size();
        for (int i = 0; i < n; ++i) {
            arw_2 arw_22 = this.cWu.get(i);
            try {
                arw_22.bmX();
                continue;
            }
            catch (Exception exception) {
                cWs.error((Object)("Erreur au cleanup du benchmark " + arw_22.getName()), (Throwable)exception);
            }
        }
    }

    @Override
    public String getName() {
        return "Benchmark runner";
    }
}

