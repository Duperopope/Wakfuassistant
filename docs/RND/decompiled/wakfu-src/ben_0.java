/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEN
 */
public class ben_0
implements aeh_2 {
    public static final String jRq = "name";
    public static final String jRr = "style";
    public static final String jRs = "selected";
    @NotNull
    private final ffS jRt;
    private boolean bWn = false;

    public static List<ben_0> V(List<ffS> list) {
        return list.stream().map(ben_0::new).toList();
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jRq -> this.getName();
            case jRr -> this.jRt.shd;
            case jRs -> this.bWn;
            default -> null;
        };
    }

    @NotNull
    public String getName() {
        return aum_0.cWf().c(this.jRt.shc, new Object[0]);
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, jRs);
    }

    @Override
    public String[] bxk() {
        return new String[]{jRq, jRr, jRs};
    }

    @NotNull
    @Generated
    public ffS dSL() {
        return this.jRt;
    }

    @Generated
    public boolean bqr() {
        return this.bWn;
    }

    @Generated
    public void setSelected(boolean bl) {
        this.bWn = bl;
    }

    @Generated
    public ben_0(@NotNull ffS ffS2) {
        if (ffS2 == null) {
            throw new NullPointerException("equipmentPosition is marked non-null but is null");
        }
        this.jRt = ffS2;
    }
}

