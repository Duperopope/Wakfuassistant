/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fcS
 */
public final class fcs_0
extends Enum<fcs_0>
implements RF,
aoq_1 {
    public static final /* enum */ fcs_0 rUy = new fcs_0(0, "Element de Challenge");
    public static final /* enum */ fcs_0 rUz = new fcs_0(1, "Element d'almanach ");
    private static final Logger rUA;
    private final byte rUB;
    private final String rUC;
    private static final /* synthetic */ fcs_0[] rUD;

    public static fcs_0[] values() {
        return (fcs_0[])rUD.clone();
    }

    public static fcs_0 valueOf(String string) {
        return Enum.valueOf(fcs_0.class, string);
    }

    private fcs_0(int n2, String string2) {
        this.rUB = (byte)n2;
        this.rUC = string2;
    }

    @Nullable
    public static fcs_0 gb(byte by) {
        fcs_0[] fcs_0Array = fcs_0.values();
        for (int i = 0; i < fcs_0Array.length; ++i) {
            fcs_0 fcs_02 = fcs_0Array[i];
            if (fcs_02.rUB != by) continue;
            return fcs_02;
        }
        return null;
    }

    @Override
    public byte aJr() {
        return this.rUB;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.rUB);
    }

    @Override
    public String aXB() {
        return this.rUC;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static ArrayList<RF> fX(ByteBuffer byteBuffer) {
        int n = byteBuffer.get() & 0xFF;
        if (n == 0) {
            return null;
        }
        ArrayList<RF> arrayList = new ArrayList<RF>(n);
        for (int i = 0; i < n; ++i) {
            int n2 = byteBuffer.get() & 0xFF;
            fcs_0 fcs_02 = fcs_0.gb((byte)n2);
            if (fcs_02 != null) {
                arrayList.add(fcs_02);
                continue;
            }
            rUA.warn((Object)("propri\u00e9t\u00e9 incoonu " + n2));
        }
        return arrayList;
    }

    private static /* synthetic */ fcs_0[] fSS() {
        return new fcs_0[]{rUy, rUz};
    }

    static {
        rUD = fcs_0.fSS();
        rUA = Logger.getLogger(fcs_0.class);
    }
}

