/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beO
 */
public class beo_2
implements aeh_2 {
    public static final String hOc = "sheetCode";
    private static final String[] hOd = new String[]{"sheetCode"};
    private final byte hOe;
    private final ehy_0 hOf;

    public beo_2(byte by, ehy_0 ehy_02) {
        this.hOe = by;
        this.hOf = ehy_02;
    }

    @Override
    public String[] bxk() {
        return hOd;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "sheetCode": {
                return ben_2.a(this.hOf);
            }
        }
        return null;
    }

    public boolean j(bgt_0 bgt_02) {
        return this.hOf.al(bgt_02);
    }

    public <T extends ehy_0> T deN() {
        return (T)this.hOf;
    }

    public byte deO() {
        return this.hOe;
    }
}

