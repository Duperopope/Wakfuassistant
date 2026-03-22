/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from Dt
 */
public final class dt_0 {
    private dt_0() {
    }

    public static void a(el_1 el_12, byte by, do_0 do_02) {
        try {
            el_12.bq(do_02.aIC());
            el_12.mC(by == 2 ? (int)do_02.aIy() : 100);
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + String.valueOf((Object)el_12.aJd()), eOFException);
        }
    }
}

