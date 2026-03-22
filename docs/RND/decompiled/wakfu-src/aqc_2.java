/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

/*
 * Renamed from aqc
 */
class aqc_2 {
    public final int cQj;
    public int Yh;
    public int cQk;
    public final File cQl;

    public aqc_2(apy_1 apy_12, int n, int n2, int n3, int n4) {
        this.cQj = n2;
        this.Yh = n3;
        this.cQk = n4;
        apy_12.cPR.setLength(0);
        String string = apy_12.cPR.append(apy_12.cPM).append("data.").append(n).append("_").append(this.cQj).append(".bdat").toString();
        File file = (File)apy_12.cPY.get(string.hashCode());
        if (file != null) {
            this.cQl = file;
        } else {
            this.cQl = new File(string);
            apy_12.cPY.put(string.hashCode(), (Object)this.cQl);
        }
    }
}

