/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class eIA {
    public static final int qwI = 50;
    private static final Logger qwJ = Logger.getLogger(eIA.class);

    private eIA() {
    }

    public static Collection<Short> ao(@NotNull exP exP2) {
        return evx_2.feo().a(exP2.Xi(), eva_1.owq).map(evv_22 -> (eig_0)evv_22).map(eig_0::fwK).orElseGet(() -> {
            qwJ.error((Object)("No or invalid or empty character account data for client " + exP2.aZj() + " with character " + exP2.Sn() + " (fight id: " + String.valueOf(exP2.dlK() == null ? "none" : Integer.valueOf(exP2.dlK().d())) + ")"), (Throwable)new Exception("for stacktrace"));
            return List.of(Short.valueOf(exP2.dnG()));
        });
    }

    public static Optional<Short> pG(long l) {
        return evx_2.feo().a(l, eva_1.owq).map(evv_22 -> (eig_0)evv_22).flatMap(eig_0::fwJ);
    }

    public static short ap(@NotNull exP exP2) {
        return eIA.pG(exP2.Xi()).orElse(exP2.dnG());
    }

    public static boolean aq(@NotNull exP exP2) {
        return eIA.ap(exP2) <= 50;
    }

    public static boolean pH(long l) {
        return eIA.pG(l).map(s -> s <= 50).orElse(false);
    }

    public static boolean dF(short s) {
        return s <= 50;
    }
}

