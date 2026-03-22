/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from baU
 */
class bau_2
implements aqd_1<aoc_0> {
    bau_2(bat_2 bat_22) {
    }

    @Nullable
    public aoc_0 Az(int n) {
        try {
            aoc_0 aoc_02 = new aoc_0();
            if (aqb_1.bGD().a(n, aoc_02)) {
                return aoc_02;
            }
        }
        catch (Exception exception) {
            bat_2.hzB.error((Object)("erreur lors du chargement de l'effet " + n), (Throwable)exception);
        }
        return null;
    }

    @Override
    @Nullable
    public /* synthetic */ aqz_2 tE(int n) {
        return this.Az(n);
    }
}

