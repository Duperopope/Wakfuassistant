/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from bdX
 */
public class bdx_1
extends beg_2<bdz_1> {
    static final Logger hMI = Logger.getLogger(bdx_1.class);
    private static final Comparator<? super bdz_1> hMJ = new bdy_1();

    public bdz_1[] deh() {
        bdz_1[] bdz_1Array = new bdz_1[this.hMX.size()];
        this.hMX.toArray(bdz_1Array);
        Arrays.sort(bdz_1Array, hMJ);
        return bdz_1Array;
    }

    @Override
    protected void a(bdj_2 bdj_22, bdz_1 bdz_12) {
    }

    @Override
    public void a(bdz_1 bdz_12, bdz_1 bdz_13, bdj_2 bdj_22) {
        bdj_22.dcP().dkr();
    }
}

