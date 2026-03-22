/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from Ek
 */
public class ek_0 {
    private final ey_1 ayn;

    public ek_0(ey_1 ey_12) {
        this.ayn = ey_12;
    }

    public void b(fp_0 fp_02) {
        Object object;
        fp_02.mz(this.ayn.xr());
        if (this.ayn.aJY()) {
            object = this.ayn.aKa();
            fp_02.k((short)((HashMap)object).size());
            for (Map.Entry entry : ((HashMap)object).entrySet()) {
                fp_02.mz((Integer)entry.getKey());
                fp_02.g((Byte)entry.getValue());
            }
        }
        if (this.ayn.aJZ()) {
            object = this.ayn.aJI();
            fp_02.b((float)object[0]);
            fp_02.b((float)object[1]);
            fp_02.b((float)object[2]);
        }
    }
}

