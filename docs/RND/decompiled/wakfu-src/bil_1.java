/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bIl
 */
public class bil_1
implements aeh_2 {
    public static final String kfe = "name";
    public static final String kff = "selected";
    private final fgj kfg;
    private boolean bWn;

    public static @Unmodifiable List<bil_1> a(fgj ... fgjArray) {
        return Arrays.stream(fgj.values()).filter(fgj2 -> fgj2 != fgj.siI).filter(fgj2 -> !ado_1.a(fgjArray, fgj2)).sorted(Comparator.comparing(fgj::fWK)).map(bil_1::new).toList();
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
        return bej_1.b(this.kfg);
    }

    public void gQ(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, kff);
    }

    @Override
    public String[] bxk() {
        return new String[]{kfe, kff};
    }

    @Generated
    public fgj dxF() {
        return this.kfg;
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
    public bil_1(fgj fgj2) {
        this.kfg = fgj2;
    }
}

