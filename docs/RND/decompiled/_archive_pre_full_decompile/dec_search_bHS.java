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

public class bHS
extends bHI {
    private static final List<fjd> kcL = Collections.nCopies(4, fjd.swH);
    public static final String kcM = "fixedOrder";
    @NotNull
    private final List<fjd> kcN;
    private final boolean kcO;

    public bHS(@NotNull List<fjd> list, boolean bl, Runnable runnable) {
        super(runnable);
        this.kcN = list;
        this.kcO = bl;
    }

    public static bHS dWX() {
        return new bHS(kcL, false, () -> {});
    }

    @Override
    public bHH dWS() {
        return bHH.kcx;
    }

    @Override
    public void b(fiU fiU2) {
        fiU2.bh(this.kcN).nB(this.kcO);
    }

    @Override
    protected void c(fiU fiU2) {
        fiU2.gaj().clear();
        fiU2.nB(false);
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
        String string = this.kcN.stream().map(bIh::a).collect(Collectors.joining(", "));
        if (this.kcO) {
            return string + " - " + aUM.cWf().c("market.slots.fixed.order", new Object[0]);
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
        bHS bHS2 = (bHS)object;
        return this.kcO == bHS2.kcO && Objects.equals(this.kcN, bHS2.kcN);
    }
}
