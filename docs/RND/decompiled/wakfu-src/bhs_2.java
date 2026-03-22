/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bHS
 */
public class bhs_2
extends bhi_1 {
    private static final List<fjd> kcL = Collections.nCopies(4, fjd.swH);
    public static final String kcM = "fixedOrder";
    @NotNull
    private final List<fjd> kcN;
    private final boolean kcO;

    public bhs_2(@NotNull List<fjd> list, boolean bl, Runnable runnable) {
        super(runnable);
        this.kcN = list;
        this.kcO = bl;
    }

    public static bhs_2 dWX() {
        return new bhs_2(kcL, false, () -> {});
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcx;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        fiu_02.bh(this.kcN).nB(this.kcO);
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        fiu_02.gaj().clear();
        fiu_02.nB(false);
    }

    @Override
    public boolean isValid() {
        if (this.kcN.isEmpty()) {
            return false;
        }
        return !this.kcN.equals(kcL);
    }

    @Override
    public String dDG() {
        String string = this.kcN.stream().map(bih_1::a).collect(Collectors.joining(", "));
        if (this.kcO) {
            return string + " - " + aum_0.cWf().c("market.slots.fixed.order", new Object[0]);
        }
        return string;
    }

    public boolean dWY() {
        return this.kcO;
    }

    @Override
    public Object eu(String string) {
        if (kcM.equals(string)) {
            return this.kcO;
        }
        return super.eu(string);
    }

    @Override
    public String[] bxk() {
        return (String[])ArrayUtils.addAll((Object[])super.bxk(), (Object[])new String[]{kcM});
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bhs_2 bhs_22 = (bhs_2)object;
        return this.kcO == bhs_22.kcO && Objects.equals(this.kcN, bhs_22.kcN);
    }
}

