/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bkb
 */
public abstract class bkb_0
implements eid_0 {
    @NotNull
    protected final bgt_0 iqd = Objects.requireNonNull(bvz_0.dLl());

    protected bkb_0() {
    }

    @Override
    public boolean dsg() {
        return this.k(false, true);
    }

    public boolean dsh() {
        return this.k(false, false);
    }

    protected boolean a(fqy_0 fqy_02) {
        return fqy_02.bV(this.iqd);
    }

    public abstract boolean k(boolean var1, boolean var2);

    public boolean dsi() {
        return false;
    }

    public boolean dsj() {
        return true;
    }
}

