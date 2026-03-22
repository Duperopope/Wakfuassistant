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
 * Renamed from bqi
 */
public class bqi_1
implements aeh_2 {
    public static final String iZe = "name";
    public static final String iZf = "selected";
    @NotNull
    private final bpT iZg;
    private boolean bWn;

    public static List<bqi_1> dDZ() {
        return Arrays.stream(bpT.values()).map(bqi_1::new).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.iZg.dDp();
            }
            case "selected": {
                return this.bWn;
            }
        }
        return null;
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, iZf);
    }

    @Override
    public String[] bxk() {
        return new String[]{iZe, iZf};
    }

    @NotNull
    @Generated
    public bpT dEa() {
        return this.iZg;
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
    public bqi_1(@NotNull bpT bpT2) {
        if (bpT2 == null) {
            throw new NullPointerException("bindType is marked non-null but is null");
        }
        this.iZg = bpT2;
    }
}

