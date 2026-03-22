/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class ffa
extends Enum<ffa> {
    public static final /* enum */ ffa sfc = new ffa(new ffb());
    public static final /* enum */ ffa sfd = new ffa(new ffe());
    public static final /* enum */ ffa sfe = new ffa(new ffd());
    public static final /* enum */ ffa sff = new ffa(new ffc());
    public final byte sfg = (byte)this.ordinal();
    private final aza_2<? extends fey_0> sfh;
    private static final /* synthetic */ ffa[] sfi;

    public static ffa[] values() {
        return (ffa[])sfi.clone();
    }

    public static ffa valueOf(String string) {
        return Enum.valueOf(ffa.class, string);
    }

    private ffa(aza_2<? extends fey_0> aza_22) {
        this.sfh = aza_22;
    }

    public fey_0 fUR() {
        return this.sfh.createNew();
    }

    @Nullable
    public static ffa gf(byte by) {
        for (ffa ffa2 : ffa.values()) {
            if (ffa2.sfg != by) continue;
            return ffa2;
        }
        return null;
    }

    public String toString() {
        return "TemporaryInventoryChangeType{idx=" + this.sfg + ", factory=" + String.valueOf(this.sfh) + "}";
    }

    private static /* synthetic */ ffa[] fUS() {
        return new ffa[]{sfc, sfd, sfe, sff};
    }

    static {
        sfi = ffa.fUS();
    }
}

