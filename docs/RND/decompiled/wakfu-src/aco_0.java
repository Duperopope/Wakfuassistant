/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from aco
 */
class aco_0
implements acc_0 {
    private final aci_1 cfZ = new aci_1(0, 0, 0, 0);
    private final TLongObjectHashMap<float[]> cga;

    aco_0(int n) {
        this.cga = new TLongObjectHashMap(n, 0.9f);
    }

    public final void btx() {
        this.cga.clear();
    }

    public final void a(int n, int n2, int n3, float[] fArray) {
        float[] fArray2 = (float[])this.cga.get(aco_0.r(n, n2, n3));
        if (fArray2 != null) {
            fArray[0] = fArray[0] + (fArray2[0] + fArray2[3]);
            fArray[1] = fArray[1] + (fArray2[1] + fArray2[4]);
            fArray[2] = fArray[2] + (fArray2[2] + fArray2[5]);
        }
    }

    static long r(int n, int n2, int n3) {
        return GC.t(n, n2);
    }

    @Override
    public aci_1 bty() {
        return this.cfZ;
    }

    @Override
    public void h(int n, int n2, int n3, int n4) {
        this.cfZ.y(n, n + n3, n2, n2 + n4);
    }

    @Override
    public void a(int n, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        long l = aco_0.r(n, n2, n3);
        float[] fArray = (float[])this.cga.get(l);
        if (fArray != null) {
            fArray[0] = fArray[0] + f2;
            fArray[1] = fArray[1] + f3;
            fArray[2] = fArray[2] + f4;
            fArray[3] = fArray[3] + f5;
            fArray[4] = fArray[4] + f6;
            fArray[5] = fArray[5] + f7;
        } else {
            this.cga.put(l, (Object)new float[]{f2, f3, f4, f5, f6, f7});
        }
    }
}

