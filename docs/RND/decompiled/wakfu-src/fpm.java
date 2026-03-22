/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class fpm {
    public static final fpm sNJ = new fpm();
    private static final Logger sNK = Logger.getLogger(fpm.class);
    private final ArrayList<fpn> sNL = new ArrayList();

    private fpm() {
    }

    public void a(fpn fpn2) {
        if (!this.sNL.contains(fpn2)) {
            this.sNL.add(fpn2);
        }
    }

    public void b(fpn fpn2) {
        this.sNL.remove(fpn2);
    }

    public void b(fpl fpl2) {
        int n = this.sNL.size();
        for (int i = 0; i < n; ++i) {
            Object p2 = fpl2.doW();
            if (p2 == null) continue;
            fpn fpn2 = this.sNL.get(i);
            try {
                fpn2.a(fpl2);
                continue;
            }
            catch (Exception exception) {
                sNK.error((Object)("Exception lev\u00e9e lors du traitement d'un evenement de protecteur " + ((foP)p2).d() + ", par un listener : " + fpn2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
    }
}

