/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from El
 */
public final class el_0 {
    private final ex_1 ayo;

    public el_0(ex_1 ex_12) {
        this.ayo = ex_12;
    }

    public void b(fp_0 fp_02) {
        Object[] objectArray;
        fp_02.g(this.ayo.aIl());
        if (this.ayo.aJN()) {
            fp_02.b(this.ayo.getScale());
        }
        if (this.ayo.aJP()) {
            fp_02.b(this.ayo.aJM());
        }
        if (this.ayo.aJO()) {
            objectArray = this.ayo.aJK();
            fp_02.k((short)objectArray.length);
            for (Object object : objectArray) {
                fp_02.bo((String)object);
            }
        }
        if (this.ayo.aJQ()) {
            objectArray = this.ayo.aJV();
            fp_02.g((byte)objectArray.length);
            for (Object object : objectArray) {
                fp_02.mz(((fa_1)object).aAg);
                fp_02.mz(((fa_1)object).aAh);
            }
        }
        if (this.ayo.aJS()) {
            objectArray = this.ayo.aJU();
            fp_02.g((byte)objectArray.length);
            for (Object object : objectArray) {
                fp_02.bo(((ez_1)object).aAe);
                fp_02.mz(((ez_1)object).aAf);
            }
        }
        if (this.ayo.aJT()) {
            new ek_0(this.ayo.aJX()).b(fp_02);
        }
        if ((objectArray = this.ayo.aJJ()) == null) {
            fp_02.k((short)0);
        } else {
            fp_02.k((short)objectArray.length);
            for (Object object : objectArray) {
                new ej_0((ew_1)object).c(fp_02);
            }
        }
    }
}

