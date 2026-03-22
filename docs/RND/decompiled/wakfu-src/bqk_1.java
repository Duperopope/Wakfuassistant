/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqk
 */
public class bqk_1
implements aeh_2 {
    private static final int iZk = 1;
    public static final String iZl = "name";
    public static final String iZm = "selected";
    @NotNull
    private final bqe_0 iZn;
    private boolean bWn;

    public static List<bqk_1> dDZ() {
        return Arrays.stream(bqe_0.values()).map(bqk_1::new).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.iZn.gP(true);
            }
            case "selected": {
                return this.bWn;
            }
        }
        return null;
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, iZm);
    }

    @Override
    public String[] bxk() {
        return new String[]{iZl, iZm};
    }

    @NotNull
    @Generated
    public bqe_0 dEb() {
        return this.iZn;
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
    public bqk_1(@NotNull bqe_0 bqe_02) {
        if (bqe_02 == null) {
            throw new NullPointerException("monsterType is marked non-null but is null");
        }
        this.iZn = bqe_02;
    }
}

