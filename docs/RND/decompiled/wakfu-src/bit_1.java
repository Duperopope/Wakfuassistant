/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIT
 */
public class bit_1
implements exr_1 {
    public static final bit_1 kit = new bit_1();
    private static final Duration kiu = Duration.ofSeconds(5L);

    private bit_1() {
    }

    @Override
    public void a(@NotNull exp_1 exp_12, @Nullable Object object, @NotNull Object object2) {
        if (exp_12 != exp_1.rIH) {
            return;
        }
        if (!(object2 instanceof Byte)) {
            return;
        }
        Byte by = (Byte)object2;
        czz_1 czz_12 = czy_1.NK(by.byteValue());
        if (czz_12 == null) {
            return;
        }
        String string = bjz_1.Dm(czz_12.eZo());
        String string2 = aum_0.cWf().c("neo.boss.unlocked", string);
        aPh.czg().iY(string2);
        dgv dgv2 = new dgv(dgx.okO, string2, (int)kiu.toMillis());
        dgw.fcT().a(dgv2);
    }
}

