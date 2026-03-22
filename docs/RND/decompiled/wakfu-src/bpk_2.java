/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPK
 */
public class bpk_2
implements aeh_2 {
    public static final String kSv = "rent.type";
    public static final String kSw = "rent.duration";
    public static final String kSx = "server.id";
    public static final String kSy = "STATUS";
    public static final String kSz = "WKCHARACTERS";
    public static final String kSA = "WKVAULTUP";
    public static final String kSB = "TYPE";
    private bgv_2 iwK;
    private final int kSC;
    private final long kSD;
    private HashMap<String, String> kSE = null;
    private final bpy_2 kSF;

    public bpk_2(int n, long l, bpy_2 bpy_22) {
        this.kSC = n;
        this.kSD = l;
        if (n > -1) {
            this.iwK = (bgv_2)fgD.fXh().Vd(n);
        }
        this.kSF = bpy_22;
    }

    public bpk_2(bpy_2 bpy_22) {
        this(-1, 0L, bpy_22);
    }

    public void ai(String string, String string2) {
        if (this.kSE == null) {
            this.kSE = new HashMap();
        }
        this.kSE.put(string, string2);
    }

    public int np(String string) {
        if (this.kSE == null) {
            return 0;
        }
        return Bw.m(this.kSE.get(string));
    }

    @Nullable
    public String nq(String string) {
        if (this.kSE == null) {
            return null;
        }
        return this.kSE.get(string);
    }

    public int eiL() {
        return this.kSC;
    }

    public bgv_2 eiM() {
        return this.iwK;
    }

    public long aBF() {
        return this.kSD;
    }

    public bpy_2 eiN() {
        return this.kSF;
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (this.iwK != null) {
            return this.iwK.eu(string);
        }
        return null;
    }

    public boolean eiO() {
        return this.kSE != null && this.kSE.get(kSv) != null;
    }

    public boolean eim() {
        if (this.kSE == null) {
            return true;
        }
        String string = this.kSE.get(kSx);
        if (string == null || string.isEmpty()) {
            return true;
        }
        int n = aue_0.cVJ().vY();
        return Integer.parseInt(string) == n;
    }
}

