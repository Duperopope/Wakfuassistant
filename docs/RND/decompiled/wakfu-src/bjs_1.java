/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjS
 */
public class bjs_1 {
    private static final Logger ipM = Logger.getLogger(bjs_1.class);

    @Nullable
    public static bjo_2 a(int n, byte by, ang_2 ang_22, boolean bl, fqy_0 fqy_02, int n2, long l, boolean bl2, boolean bl3) {
        eio_0 eio_02 = eio_0.PW(by);
        if (eio_02 == null) {
            ipM.error((Object)("Impossible de trouver l'action de monstre " + by));
            return null;
        }
        switch (eio_02) {
            case qxG: {
                return new bjr_2(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, eio_02.fwO());
            }
            case qxH: {
                return new bjv_1(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, eio_02.fwO());
            }
            case qxI: {
                return new bjp_2(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, eio_02.fwO());
            }
            case qxJ: {
                return new bjq_2(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, eio_02.fwO());
            }
            case qxK: {
                return new bju_1(n, by, ang_22, bl, fqy_02, n2, l, bl2, bl3, eio_02.fwO());
            }
        }
        return null;
    }
}

