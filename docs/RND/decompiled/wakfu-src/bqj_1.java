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
 * Renamed from bqj
 */
public class bqj_1
implements aeh_2 {
    public static final String iZh = "name";
    public static final String iZi = "selected";
    @NotNull
    private final bpr_0 iZj;
    private boolean bWn;

    public static List<bqj_1> a(bpr_0 ... bpr_0Array) {
        return Arrays.stream(bpr_0.values()).filter(bpr_02 -> !ado_1.a((Object[])bpr_0Array, bpr_02)).map(bqj_1::new).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return this.getName();
            }
            case "selected": {
                return this.bWn;
            }
        }
        return null;
    }

    public String getName() {
        return aum_0.cWf().c(this.iZj.dDK(), new Object[0]);
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, iZi);
    }

    @Override
    public String[] bxk() {
        return new String[]{iZh, iZi};
    }

    @NotNull
    @Generated
    public bpr_0 dDr() {
        return this.iZj;
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
    public bqj_1(@NotNull bpr_0 bpr_02) {
        if (bpr_02 == null) {
            throw new NullPointerException("acquisitionType is marked non-null but is null");
        }
        this.iZj = bpr_02;
    }
}

