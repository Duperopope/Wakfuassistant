/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

public final class eKi {
    public static eKg pZ(long l) {
        Collection<eKg> collection = eKh.qBm.fxO();
        for (eKg eKg2 : collection) {
            if ((long)eKg2.aVf() > l || (long)eKg2.aVe() < l) continue;
            return eKg2;
        }
        return eKh.qBm.fxP();
    }
}

