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
 * Renamed from bpD
 */
public class bpd_1
implements aeh_2 {
    public static final String iWQ = "style";
    public static final String iWR = "description";
    public static final String iWS = "enabled";
    @NotNull
    private final bpr_0 iWT;
    private boolean cHn;

    public bpd_1(@NotNull bpr_0 bpr_02) {
        this.iWT = bpr_02;
        this.cHn = false;
    }

    @NotNull
    public bpr_0 dDr() {
        return this.iWT;
    }

    public void bVd() {
        this.cHn = true;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iWQ -> this.iWT.getStyle();
            case iWR -> aum_0.cWf().c(this.iWT.dDJ(), new Object[0]);
            case iWS -> this.cHn;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iWQ, iWR, iWS};
    }
}

