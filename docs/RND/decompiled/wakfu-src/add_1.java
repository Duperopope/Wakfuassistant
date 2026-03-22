/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.Maps;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.sql.DataSource;
import org.apache.log4j.Logger;

/*
 * Renamed from aDD
 */
public final class add_1
extends Thread
implements ack_2,
ade_1 {
    private static final Logger dDS = Logger.getLogger(add_1.class);
    private static final int dDT = 10;
    private static final long dDU = 5000L;
    private static final long dDV = 5000L;
    private final DataSource dDW;
    private Connection dDX;
    private final Queue<adc_1> dDY;
    private final Lock dDZ = new ReentrantLock();
    private final Condition dEa = this.dDZ.newCondition();
    public volatile boolean btq;
    private int dtF;
    private String dtG;
    public int dEb;
    private long dEc;
    private long dEd;
    private boolean dEe;
    private boolean dEf = true;
    private final TIntObjectHashMap<PreparedStatement> dEg;
    private HashMap<String, Class<?>> dtN = new HashMap();
    private static final AtomicBoolean dEh = new AtomicBoolean(true);

    public void b(HashMap<String, Class<?>> hashMap) {
        this.dtN = Maps.newHashMap(hashMap);
    }

    @Override
    public boolean bYK() {
        return this.dEe;
    }

    public void dE(boolean bl) {
        this.dEe = bl;
    }

    public void dF(boolean bl) {
        this.dEf = bl;
    }

    public static void dG(boolean bl) {
        dEh.set(bl);
    }

    public add_1(DataSource dataSource, Queue<adc_1> queue) {
        this.setName("SqlRequestChannel");
        this.dDW = dataSource;
        this.dDX = null;
        this.btq = false;
        this.dEb = 0;
        this.dEg = new TIntObjectHashMap();
        this.dEe = false;
        this.dDY = queue;
    }

    @Override
    public synchronized void start() {
        this.btq = true;
        super.start();
    }

    public boolean bhl() {
        return this.btq;
    }

    public void cL(boolean bl) {
        this.btq = bl;
        this.bFY();
    }

    private void bFY() {
        this.dDZ.lock();
        this.dEa.signal();
        this.dDZ.unlock();
    }

    public void c(adc_1 adc_12) {
        if (adc_12 != null) {
            adc_12.bYG();
            this.dDY.offer(adc_12);
            this.bFY();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private adc_1 bYL() {
        adc_1 adc_12;
        long l = System.currentTimeMillis();
        if (this.dDY.isEmpty()) {
            try {
                if (this.dDX != null && l - this.dEd > 5000L) {
                    if (this.dEe) {
                        this.dDX.commit();
                    }
                    this.dEd = l;
                }
            }
            catch (SQLException sQLException) {
                dDS.error((Object)"Exception during autocommit", (Throwable)sQLException);
            }
            if (this.dDZ.tryLock()) {
                try {
                    this.dEa.await(1000L, TimeUnit.MILLISECONDS);
                }
                catch (InterruptedException interruptedException) {
                    dDS.warn((Object)"Interrupted", (Throwable)interruptedException);
                }
                finally {
                    this.dDZ.unlock();
                }
            }
        }
        if ((adc_12 = this.dDY.peek()) != null && adc_12.bYH()) {
            this.bYM();
            return this.bYL();
        }
        return adc_12;
    }

    private void bYM() {
        this.dDY.poll();
    }

    public int bYN() {
        return this.dDY.size();
    }

    @Override
    public Connection bYO() {
        return this.dDX;
    }

    @Override
    public final void a(int n, PreparedStatement preparedStatement) {
        this.dEg.put(n, (Object)preparedStatement);
    }

    @Override
    public final PreparedStatement xf(int n) {
        return (PreparedStatement)this.dEg.get(n);
    }

    private void bYP() {
        TIntObjectIterator tIntObjectIterator = this.dEg.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            try {
                ((PreparedStatement)tIntObjectIterator.value()).close();
            }
            catch (SQLException sQLException) {
                dDS.error((Object)"Exception during releaseStatements", (Throwable)sQLException);
            }
        }
        this.dEg.clear();
    }

    public void bYQ() {
        try {
            if (this.dDX == null || this.dDX.isClosed()) {
                if (this.dDX != null) {
                    if (this.dEe) {
                        this.dDX.commit();
                    }
                    this.dDX.close();
                    this.dEd = System.currentTimeMillis();
                }
                this.dDX = this.dDW.getConnection();
                this.dDX.setTypeMap(this.dtN);
                this.bYP();
                if (this.dEe) {
                    this.dDX.setAutoCommit(false);
                }
            }
        }
        catch (SQLException sQLException) {
            dDS.warn((Object)("[" + this.dtG + "] Connection error : "), (Throwable)sQLException);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public aam_2 b(adc_1 adc_12) {
        adf_1 adf_12 = adc_12.bYJ();
        adz_2 adz_22 = new adz_2();
        adc_12.a(adz_22);
        adz_22.bYy();
        try {
            this.c(adc_12);
            adz_22.bYA();
        }
        finally {
            adz_22.bYz();
        }
        adc_12.a(adf_12);
        if (adz_22.bYD()) {
            throw adz_22.bYE();
        }
        return adz_22.bYB();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        if (dEh.get()) {
            dDS.info((Object)("SqlRequestChannel [" + this.dtG + "] started "));
        }
        int n = 0;
        try {
            while (this.btq || !this.dDY.isEmpty()) {
                long l;
                block15: {
                    adc_1 adc_12 = this.bYL();
                    l = System.currentTimeMillis();
                    if (adc_12 == null) break block15;
                    this.dEc = l;
                    String string = adc_12.getClass().getSimpleName();
                    adf_1 adf_12 = adc_12.bYJ();
                    try {
                        block18: {
                            block16: {
                                block17: {
                                    if (++n >= 10) break block16;
                                    this.bYQ();
                                    if (!adc_12.bYI() && adc_12.cI()) break block17;
                                    aam_2 aam_22 = adc_12.a(this);
                                    if (aam_22 != null) {
                                        aam_22.a(adc_12.bYJ());
                                        aaw_1.bUq().h(aam_22);
                                        break block18;
                                    } else if (adf_12 != null) {
                                        adf_12.b(null);
                                    }
                                    break block18;
                                }
                                dDS.warn((Object)("[" + this.dtG + "] Le destinataire de la r\u00e9ponse \u00e0 cette requete n'est plus valide : requestType = " + adc_12.getClass().getSimpleName() + " - " + adc_12.bYI() + " - " + adc_12.cI()));
                                break block18;
                            }
                            dDS.warn((Object)("[" + this.dtG + "] Request (" + adc_12.getClass().getSimpleName() + ") canceled (too much retries) : " + String.valueOf(adc_12)));
                            if (adf_12 != null) {
                                adf_12.a(adc_12, new Exception("Request canceled (too much retries)"));
                            }
                        }
                        this.bYM();
                        adc_12.aZp();
                        n = 0;
                        continue;
                    }
                    catch (SQLException sQLException) {
                        dDS.error((Object)("[" + this.dtG + "] SQLException lev\u00e9e lors de l'\u00e9x\u00e9cution d'une requ\u00eate de type : " + adc_12.getClass().getSimpleName()), (Throwable)sQLException);
                        ++this.dEb;
                        continue;
                    }
                    catch (Throwable throwable) {
                        dDS.error((Object)("[" + this.dtG + "] Throwable capt\u00e9 lors de l'\u00e9x\u00e9cution d'une requ\u00eate de type : " + adc_12.getClass().getSimpleName()), throwable);
                        ++this.dEb;
                        continue;
                    }
                }
                if (this.dDX == null || this.dDX.isClosed() || l - this.dEc < 5000L || !this.dEf || !this.dDY.isEmpty()) continue;
                if (this.dEe) {
                    this.dDX.commit();
                }
                this.dDX.close();
                this.dDX = null;
                this.bYP();
                this.dEd = l;
            }
            if (this.dDX != null) {
                if (this.dEe) {
                    this.dDX.commit();
                }
                this.dDX.close();
                this.dDX = null;
            }
        }
        catch (Throwable throwable) {
            dDS.error((Object)("[" + this.dtG + "] Throwable capt\u00e9 lors de la connexion \u00e0 la base"), throwable);
            ++this.dEb;
        }
        if (dEh.get()) {
            dDS.info((Object)"SqlRequestChannel stopped ");
        }
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
}

