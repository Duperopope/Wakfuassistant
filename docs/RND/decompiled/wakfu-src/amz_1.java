/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankama.wakfu.utils.criterion.doc.VarType;
import org.apache.log4j.Logger;

/*
 * Renamed from amZ
 */
public final class amz_1
extends Enum<amz_1> {
    public static final /* enum */ amz_1 cJx = new amz_1(VarType.STRING, new anp_1());
    public static final /* enum */ amz_1 cJy = new amz_1(VarType.NUMBER, new ann_1());
    public static final /* enum */ amz_1 cJz = new amz_1(VarType.BOOLEAN, new ank_2());
    public static final /* enum */ amz_1 cJA = new amz_1(VarType.NUMBERLIST, new anl_2());
    public static final /* enum */ amz_1 cJB = new amz_1(VarType.STRINGLIST, null);
    public static final /* enum */ amz_1 cJC = new amz_1(VarType.POSITION, null);
    public static final /* enum */ amz_1 cJD = new amz_1(VarType.POSITIONLIST, null);
    public static final /* enum */ amz_1 cJE = new amz_1(VarType.PLAYERRANKING, null);
    public static final /* enum */ amz_1 cJF = new amz_1(VarType.NUMBERNUMBERMAP, new anm_2());
    public static final /* enum */ amz_1 cJG = new amz_1(VarType.GLOBALVARIABLEVALUE, null);
    private static final Logger cJH;
    public static final amz_1[] cJI;
    private final VarType cJJ;
    private final ano_1 cJK;
    private static final /* synthetic */ amz_1[] cJL;

    public static amz_1[] values() {
        return (amz_1[])cJL.clone();
    }

    public static amz_1 valueOf(String string) {
        return Enum.valueOf(amz_1.class, string);
    }

    private amz_1(VarType varType, ano_1 ano_12) {
        this.cJJ = varType;
        this.cJK = ano_12;
    }

    public ano_1 bDD() {
        if (this.cJK == null) {
            cJH.error((Object)("Acc\u00e8s \u00e0 un parser non impl\u00e9ment\u00e9 dans ParserType." + this.name()));
        }
        return this.cJK;
    }

    public static amz_1 a(VarType varType) {
        amz_1[] amz_1Array;
        for (amz_1 amz_12 : amz_1Array = amz_1.values()) {
            if (amz_12.cJJ != varType) continue;
            return amz_12;
        }
        throw new IllegalArgumentException(String.format("No %s value", new Object[]{varType}));
    }

    public VarType bDE() {
        return this.cJJ;
    }

    private static /* synthetic */ amz_1[] bDF() {
        return new amz_1[]{cJx, cJy, cJz, cJA, cJB, cJC, cJD, cJE, cJF, cJG};
    }

    static {
        cJL = amz_1.bDF();
        cJH = Logger.getLogger(amz_1.class);
        cJI = new amz_1[0];
    }
}

