/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  gnu.trove.map.hash.TObjectLongHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.procedure.TObjectIntProcedure;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import org.apache.log4j.Logger;

/*
 * Renamed from aAD
 */
public class aad_2
implements Runnable {
    private static final Logger dwL = Logger.getLogger(aad_2.class);
    private static final int dwM = 30;
    protected final LinkedBlockingQueue<aam_2> dwN = new LinkedBlockingQueue();

    @Override
    public void run() {
        boolean bl;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        BooleanSupplier booleanSupplier = () -> atomicInteger.incrementAndGet() > 30 && abg_2.bUP().bUS();
        do {
            bl = this.a(booleanSupplier);
            atomicInteger.set(0);
            abg_2.bUP().bUT();
            abg_2.bUP().aPc();
        } while (bl);
    }

    private boolean a(BooleanSupplier booleanSupplier) {
        do {
            aam_2 aam_22;
            if ((aam_22 = this.dwN.poll()) == null) continue;
            try {
                this.e(aam_22);
            }
            catch (Throwable throwable) {
                dwL.error((Object)("Error during execution of message " + String.valueOf(aam_22)), throwable);
            }
        } while (!booleanSupplier.getAsBoolean() && !this.dwN.isEmpty());
        return !this.dwN.isEmpty();
    }

    private void e(aam_2 aam_22) {
        if (aam_22.bUg() == null) {
            String string = aam_22.getClass().getSimpleName();
            dwL.error((Object)("Destinataire invalide pour un message de type " + string + ", destinataire : null"));
            return;
        }
        try {
            this.f(aam_22);
        }
        catch (RuntimeException runtimeException) {
            dwL.error((Object)("Exception lev\u00e9e lors de l'\u00e9x\u00e9cution d'un message (id=" + aam_22.d() + "): "), (Throwable)runtimeException);
        }
    }

    protected void f(aam_2 aam_22) {
        aam_22.bGy();
    }

    boolean g(aam_2 aam_22) {
        return this.dwN.offer(aam_22);
    }

    int bUf() {
        return this.dwN.size();
    }

    void clear() {
        this.dwN.clear();
    }

    public String gX(String string) {
        Object object;
        TObjectIntHashMap tObjectIntHashMap = new TObjectIntHashMap();
        TObjectLongHashMap tObjectLongHashMap = new TObjectLongHashMap();
        TObjectLongHashMap tObjectLongHashMap2 = new TObjectLongHashMap();
        TObjectLongHashMap tObjectLongHashMap3 = new TObjectLongHashMap();
        Iterator<aam_2> iterator = this.dwN.iterator();
        long l = System.currentTimeMillis();
        while (iterator.hasNext()) {
            object = iterator.next();
            String string2 = object.getClass().getSimpleName();
            long l2 = l - ((aam_2)object).bUh();
            tObjectIntHashMap.adjustOrPutValue((Object)string2, 1, 1);
            long l3 = tObjectLongHashMap.contains((Object)string2) ? tObjectLongHashMap.get((Object)string2) : l2;
            long l4 = tObjectLongHashMap2.contains((Object)string2) ? tObjectLongHashMap2.get((Object)string2) : l2;
            tObjectLongHashMap.put((Object)string2, Math.min(l3, l2));
            tObjectLongHashMap2.put((Object)string2, Math.max(l4, l2));
            tObjectLongHashMap3.adjustOrPutValue((Object)string2, l2, l2);
        }
        if (!tObjectIntHashMap.isEmpty()) {
            object = new StringBuilder();
            if (!tObjectIntHashMap.isEmpty()) {
                tObjectIntHashMap.forEachEntry((TObjectIntProcedure)new aae_2(this, (StringBuilder)object, tObjectLongHashMap, tObjectLongHashMap3, tObjectLongHashMap2, string));
            }
            return ((StringBuilder)object).toString();
        }
        return "(empty)";
    }

    public String toString() {
        return "AtomicWorker{m_messages=" + this.dwN.size() + "}";
    }
}

