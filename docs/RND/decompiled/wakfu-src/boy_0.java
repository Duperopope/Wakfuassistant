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
 * Renamed from boY
 */
public class boy_0
extends bEn {
    public static final String iTB = "/";

    public boy_0(@NotNull String string) {
        super(string.trim());
    }

    @Override
    @Nullable
    protected String P(ffV ffV2) {
        if (!ffV2.dXg()) {
            return null;
        }
        int n = ffV2.eAZ().ahy();
        int n2 = ffV2.eAZ().ahA();
        if (n <= 0 && n2 <= 0) {
            return null;
        }
        return (n > 0 ? bgv_2.Dn(n) : "") + (n2 > 0 ? bgv_2.Dn(n2) : "");
    }

    @Override
    @Nullable
    public String dCm() {
        return iTB + this.dIR();
    }

    @Override
    @Nullable
    protected /* synthetic */ String am(Object object) {
        return this.P((ffV)object);
    }
}

