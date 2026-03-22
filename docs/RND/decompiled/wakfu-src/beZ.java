/*
 * Decompiled with CFR 0.152.
 */
public class beZ
implements aeh_2 {
    public static final String hPK = "templateLayoutId";
    public static final String hPL = "imageUrl";
    public static final String hPM = "text1";
    public static final String hPN = "text2";
    public static final String[] hPO = new String[]{"templateLayoutId", "imageUrl", "text1", "text2"};
    private final int hPP;
    private final short hPQ;
    private final int hPR;
    private final short hPS;
    private final String hPT;
    private final String hPU;

    public beZ(int n, short s, int n2, short s2) {
        this.hPP = n;
        this.hPQ = s;
        this.hPR = n2;
        this.hPS = s2;
        String string = aum_0.cWf().a(67, (long)n, new Object[0]);
        String[] stringArray = string.split("\\#{2,}");
        this.hPT = stringArray[0];
        this.hPU = stringArray.length > 1 ? stringArray[1] : "";
    }

    @Override
    public String[] bxk() {
        return hPO;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hPK)) {
            return this.hPS;
        }
        if (string.equals(hPL)) {
            return auc_0.cVq().zP(this.hPR);
        }
        if (string.equals(hPM)) {
            return this.hPT;
        }
        if (string.equals(hPN)) {
            return this.hPU;
        }
        return null;
    }
}

