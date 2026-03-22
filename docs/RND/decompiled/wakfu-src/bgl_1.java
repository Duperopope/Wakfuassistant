/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bGl
 */
public class bgl_1
implements bug_0<ffV> {
    private static final Set<Short> jVd = Set.of(Short.valueOf((short)604));
    @NotNull
    private final bgk_1 jVe;

    public bgl_1(@NotNull bgk_1 bgk_12) {
        this.jVe = bgk_12;
    }

    @NotNull
    public bgk_1 dTO() {
        return this.jVe;
    }

    public boolean L(ffV ffV2) {
        boolean bl = bgl_1.g(ffV2.dOg());
        boolean bl2 = bgl_1.aV(ffV2);
        boolean bl3 = bgl_1.h(ffV2.dOg());
        return switch (this.jVe) {
            default -> throw new MatchException(null, null);
            case bgk_1.jUU -> {
                if (!bl3) {
                    yield true;
                }
                yield false;
            }
            case bgk_1.jUV -> {
                if (bl && !bl3) {
                    yield true;
                }
                yield false;
            }
            case bgk_1.jUW -> {
                if (!bl && bl2 && !bl3) {
                    yield true;
                }
                yield false;
            }
            case bgk_1.jUX -> {
                if (!(bl || bl2 || bl3)) {
                    yield true;
                }
                yield false;
            }
            case bgk_1.jUY -> bl3;
        };
    }

    public static boolean g(@NotNull fhc_0 fhc_02) {
        if (fhc_02.fbT()) {
            return true;
        }
        return fhc_02.dGh() != null && jVd.contains(fhc_02.dGh().aIi());
    }

    private static boolean aV(@NotNull ffV ffV2) {
        return ffV2.dOg().fUZ() != null || ffV2.isUsable();
    }

    public static boolean h(@NotNull fhc_0 fhc_02) {
        return fhc_02.c(fgg_0.sia);
    }

    @Override
    public boolean isValid() {
        return this.jVe != bgk_1.jUU;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joE;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

