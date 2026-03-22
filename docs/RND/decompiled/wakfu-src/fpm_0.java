/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fpM
 */
public final class fpm_0 {
    private fpm_0() {
    }

    @Nullable
    public static fpO gu(ByteBuffer byteBuffer) {
        fpl_0 fpl_02 = fpl_0.hl(byteBuffer.get());
        if (fpl_02 == null) {
            return null;
        }
        switch (fpl_02) {
            case sQG: {
                return new fpj_0(byteBuffer);
            }
            case sQH: {
                return new fpk_0(byteBuffer);
            }
        }
        return new fpi_0(byteBuffer);
    }

    public static void a(fpO fpO2, azg_1 azg_12) {
        azg_12.aF(fpO2.ghm().aJr());
        fpO2.e(azg_12);
    }
}

