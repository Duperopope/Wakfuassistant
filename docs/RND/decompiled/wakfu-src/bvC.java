/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.Nullable;

public class bvC
implements aeh_2 {
    public static final String juv = "label";
    public static final String juw = "id";
    public static final String[] jux = new String[]{"label", "id"};
    private final bvb_0 juy;

    public bvC(bvb_0 bvb_02) {
        this.juy = bvb_02;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (juv.equals(string)) {
            return aum_0.cWf().c("guild.emblem.category." + this.juy.d(), new Object[0]);
        }
        if (juw.equals(string)) {
            return this.juy.d();
        }
        return null;
    }

    public bvb_0 dKI() {
        return this.juy;
    }

    public ImmutableSet<Integer> dKG() {
        return this.juy.dKG();
    }

    @Override
    public String[] bxk() {
        return jux;
    }
}

