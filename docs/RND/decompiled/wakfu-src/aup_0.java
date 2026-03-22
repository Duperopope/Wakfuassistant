/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Preconditions;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aUP
 */
public class aup_0 {
    private static final AtomicReference<aup_0> hrL = new AtomicReference();
    private static final List<Runnable> hrM = new LinkedList<Runnable>();
    private final long hrN;
    private final vb_0 hrO;
    private final Optional<evk_2> hrP;
    private final ns_2 hrQ;

    private aup_0(long l, vb_0 vb_02, Optional<evk_2> optional, ns_2 ns_22) {
        this.hrN = l;
        this.hrO = vb_02;
        this.hrP = optional;
        this.hrQ = ns_22;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(long l, vb_0 vb_02, Optional<evk_2> optional, ns_2 ns_22) {
        hrL.set(new aup_0(l, vb_02, optional, ns_22));
        List<Runnable> list = hrM;
        synchronized (list) {
            for (Runnable runnable : hrM) {
                runnable.run();
            }
            hrM.clear();
        }
    }

    public static boolean cWi() {
        return hrL.get() != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void m(@NotNull Runnable runnable) {
        List<Runnable> list = hrM;
        synchronized (list) {
            if (aup_0.cWi()) {
                runnable.run();
            } else {
                hrM.add(runnable);
            }
        }
    }

    public static long cWj() {
        Preconditions.checkNotNull((Object)hrL.get());
        return aup_0.hrL.get().hrN;
    }

    public static vb_0 cWk() {
        Preconditions.checkNotNull((Object)hrL.get());
        return aup_0.hrL.get().hrO;
    }

    public static Mv cWl() {
        if (hrL.get() == null) {
            return Mv.aVy;
        }
        return aup_0.hrL.get().hrO.aUXX();
    }

    public static Optional<evk_2> cWm() {
        Preconditions.checkNotNull((Object)hrL.get());
        return aup_0.hrL.get().hrP;
    }

    public static ns_2 cWn() {
        Preconditions.checkNotNull((Object)hrL.get());
        return aup_0.hrL.get().hrQ;
    }

    public String toString() {
        return "DispatchAccountInformation{m_community=" + String.valueOf((Object)this.hrO) + ", m_admin=" + String.valueOf(this.hrP) + "}";
    }
}

