/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cZE
 */
public class cze_1
implements exr_1 {
    private final bis_1 obB;

    public cze_1(bis_1 bis_12) {
        this.obB = bis_12;
    }

    @Override
    public void a(@NotNull exp_1 exp_12, @Nullable Object object, @NotNull Object object2) {
        if (exp_12 != exp_1.rIH) {
            return;
        }
        if (!(object2 instanceof Byte)) {
            return;
        }
        this.obB.dZu();
    }
}

