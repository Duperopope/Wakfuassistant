/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from boS
 */
public class bos_1
implements bug_0<ffV> {
    @NotNull
    private final bot_1 iTs;

    public bos_1(@NotNull bot_1 bot_12) {
        this.iTs = bot_12;
    }

    public boolean L(ffV ffV2) {
        return switch (this.iTs.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> true;
            case 2 -> {
                if (fcI.ae(bbs_2.xl(), ffV2.LV()) != null) {
                    yield true;
                }
                yield false;
            }
            case 1, 3 -> {
                boolean var2_2 = fcI.ad(bbs_2.xl(), ffV2.LV()) != null;
                if (this.iTs == bot_1.iTu == var2_2) {
                    yield true;
                }
                yield false;
            }
        };
    }

    @Override
    public boolean isValid() {
        return this.iTs != bot_1.iTt;
    }

    @Override
    public buh_0 dcz() {
        return buh_0.joL;
    }

    @NotNull
    public bot_1 dCi() {
        return this.iTs;
    }

    @Override
    public /* synthetic */ boolean ah(Object object) {
        return this.L((ffV)object);
    }
}

