/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from DS
 */
public final class ds_1 {
    private ds_1() {
    }

    public static void a(fm_0 fm_02, String string, do_0 do_02) {
        try {
            short s = do_02.aIz();
            if (s != 1) {
                return;
            }
            fm_02.bv(do_02.aIC());
            fm_02.mM(do_02.aIA());
            fm_02.cn(GC.s(string.hashCode(), fm_02.aKL()));
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to load texture from " + string, iOException);
        }
    }
}

