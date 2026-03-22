/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbT
 */
public class cbt_2
implements aeh_2 {
    public static final String lLr = "nameWithPosition";
    private final nz lLs;

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "nameWithPosition": {
                return this.esH();
            }
        }
        return null;
    }

    String esH() {
        return this.lLs.Lz() + 1 + ". " + this.lLs.getName();
    }

    public String getName() {
        return this.lLs.getName();
    }

    public int Lz() {
        return this.lLs.Lz();
    }

    @Override
    public String[] bxk() {
        return new String[]{lLr};
    }

    @Generated
    public cbt_2(nz nz2) {
        this.lLs = nz2;
    }
}

