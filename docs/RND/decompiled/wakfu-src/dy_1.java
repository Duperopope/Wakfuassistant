/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from Dy
 */
public final class dy_1 {
    private dy_1() {
    }

    public static void a(eq_1 eq_12, do_0 do_02) {
        try {
            eq_12.cm(Long.parseLong(do_02.aIC()));
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + String.valueOf((Object)eq_12.aJd()), eOFException);
        }
    }
}

