/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class frh {
    public static final int sXB = -1;

    public static int a(int n, @Nullable frd frd2, @NotNull exP exP2) {
        Iterable<? extends fqE> iterable = exP2.doM();
        if (iterable == null) {
            return -1;
        }
        Iterator<? extends fqE> iterator = iterable.iterator();
        fqE fqE2 = null;
        while (iterator.hasNext()) {
            fqE fqE3 = iterator.next();
            if (fqE3.avr() != n) continue;
            fqE2 = fqE3;
        }
        if (fqE2 == null) {
            return -1;
        }
        if (frd2 == null) {
            return fqE2.cmL();
        }
        if (frd2.gjR()) {
            return fqE2.cmL();
        }
        return Math.min(fqE2.cmL(), frd2.tL());
    }
}

