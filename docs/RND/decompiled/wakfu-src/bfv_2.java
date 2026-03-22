/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfv
 */
public class bfv_2
implements aeh_2 {
    public static final String hTM = "id";
    public static final String hTN = "iconUrl";
    public static final String[] hTO = new String[]{"id", "iconUrl"};
    private final byte hTP;
    private final String hTQ;

    public bfv_2(byte by, String string) {
        this.hTP = by;
        this.hTQ = string;
    }

    public byte deO() {
        return this.hTP;
    }

    @Override
    public String[] bxk() {
        return hTO;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "id": {
                return this.hTP;
            }
            case "iconUrl": {
                return this.hTQ;
            }
        }
        return null;
    }
}

