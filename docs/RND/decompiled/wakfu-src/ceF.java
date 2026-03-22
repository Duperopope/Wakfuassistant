/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ceF<F extends bsS>
implements adi_1 {
    private static final Logger lSq = Logger.getLogger(ceF.class);
    protected final List<ceJ<? extends aam_2, F>> lSr = new ArrayList<ceJ<? extends aam_2, F>>();

    @Override
    public boolean b(aam_2 aam_22) {
        int n = aam_22.d();
        for (ceJ<aam_2, F> ceJ2 : this.lSr) {
            if (n != ceJ2.euJ()) continue;
            try {
                boolean bl = ceJ2.b(aam_22);
                if (bl) continue;
                return bl;
            }
            catch (Exception exception) {
                lSq.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        return true;
    }

    public void a(ceJ<? extends aam_2, F> ceJ2) {
        if (!this.lSr.contains(ceJ2)) {
            this.lSr.add(ceJ2);
        }
    }

    public boolean b(ceJ ceJ2) {
        return this.lSr.remove(ceJ2);
    }

    boolean c(ceJ<? extends aam_2, F> ceJ2) {
        return this.lSr.contains(ceJ2);
    }

    public void v(F f2) {
        for (ceJ<aam_2, F> ceJ2 : this.lSr) {
            ceJ2.k(f2);
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

