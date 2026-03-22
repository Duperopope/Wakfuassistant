/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

/*
 * Renamed from ayG
 */
public abstract class ayg_2
implements ack_2 {
    protected static final Logger dtC = Logger.getLogger(ayg_2.class);
    protected final DataSource dtD;
    protected final ArrayList<add_1> dtE;
    protected int dtF;
    protected String dtG;
    protected final int dtH;
    protected final String dtI;
    protected final String dtJ;
    protected final int dtK;
    protected final String dtL;
    protected final String dtM;
    private HashMap<String, Class<?>> dtN = new HashMap();

    protected ayg_2(String string, String string2, String string3, String string4, int n, int n2) {
        this.dtI = string;
        this.dtJ = string2;
        this.dtK = n2;
        this.dtL = string3;
        this.dtM = string4;
        this.dtE = new ArrayList();
        this.dtH = n;
        this.dtD = this.a(string, string2, string3, string4, n2);
    }

    protected abstract DataSource a(String var1, String var2, String var3, String var4, int var5);

    public DataSource bSs() {
        return this.dtD;
    }

    public void aPg() {
        this.b((Integer n) -> new ConcurrentLinkedQueue());
    }

    public void b(Function<Integer, Queue<adc_1>> function) {
        for (int i = 0; i < this.dtH; ++i) {
            add_1 add_12 = new add_1(this.dtD, function.apply(i));
            add_12.gQ(this.dtG + "_" + i);
            add_12.b(this.dtN);
            this.dtE.add(add_12);
            add_12.start();
        }
    }

    public void bSt() {
        for (add_1 add_12 : this.dtE) {
            add_12.cL(false);
            try {
                add_12.join();
            }
            catch (InterruptedException interruptedException) {
                dtC.error((Object)"Thread interrupted : ", (Throwable)interruptedException);
            }
        }
    }

    public boolean bSu() {
        for (add_1 add_12 : this.dtE) {
            boolean bl = add_12.bhl();
            int n = add_12.bYN();
            if (!bl && n <= 0) continue;
            return false;
        }
        return true;
    }

    public boolean a(adc_1 adc_12) {
        add_1 add_12 = null;
        if (ms_1.aSi.cK("dispatch")) {
            int n = Integer.MAX_VALUE;
            for (add_1 add_13 : this.dtE) {
                if (add_13.bYN() > n) continue;
                add_12 = add_13;
                n = add_13.bYN();
            }
        } else {
            add_12 = (add_1)Iterables.getFirst(this.dtE, null);
        }
        if (add_12 == null) {
            dtC.error((Object)"Pas de cannal disponible pour poster la requ\u00eate");
            return false;
        }
        add_12.c(adc_12);
        return true;
    }

    public boolean a(adc_1 adc_12, int n) {
        try {
            add_1 add_12 = this.dtE.get(n);
            add_12.c(adc_12);
            return true;
        }
        catch (Exception exception) {
            dtC.error((Object)adu_1.a(exception));
            return false;
        }
    }

    public aam_2 b(adc_1 adc_12) {
        add_1 add_12 = null;
        if (ms_1.aSi.cK("dispatch")) {
            int n = Integer.MAX_VALUE;
            for (add_1 add_13 : this.dtE) {
                if (add_13.bYN() > n) continue;
                add_12 = add_13;
                n = add_13.bYN();
            }
        } else {
            add_12 = (add_1)Iterables.getFirst(this.dtE, null);
        }
        if (add_12 == null) {
            dtC.error((Object)"Pas de cannal disponible pour poster la requ\u00eate");
            return null;
        }
        return add_12.b(adc_12);
    }

    public aam_2 b(adc_1 adc_12, int n) {
        try {
            add_1 add_12 = this.dtE.get(n);
            return add_12.b(adc_12);
        }
        catch (Exception exception) {
            dtC.error((Object)"Exception during executeRequest", (Throwable)exception);
            return null;
        }
    }

    public int bSv() {
        return this.dtE.size();
    }

    @Override
    public String bSw() {
        return this.dtG;
    }

    public void gQ(String string) {
        this.dtG = string;
    }

    @Override
    public int bSx() {
        return this.dtF;
    }

    @Override
    public void vw(int n) {
        this.dtF = n;
    }

    public String bSy() {
        return this.dtI;
    }

    public String bSz() {
        return this.dtJ;
    }

    public String bSA() {
        return this.dtL;
    }

    public void b(HashMap<String, Class<?>> hashMap) {
        this.dtN = hashMap;
    }

    @Deprecated
    public int[] bSB() {
        int n = this.dtE.size();
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = this.dtE.get(i).bYN();
            for (int n2 : nArray) {
                dtC.trace((Object)(n2 + " - "));
            }
            dtC.trace((Object)"");
        }
        return nArray;
    }

    @Deprecated
    public add_1 vx(int n) {
        if (n >= 0 && n < this.dtE.size()) {
            return this.dtE.get(n);
        }
        return null;
    }
}

