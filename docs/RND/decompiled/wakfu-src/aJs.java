/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TObjectByteHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectByteProcedure
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TObjectByteHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectByteProcedure;

public class aJs
extends acw_0
implements ace {
    public static final aJs eaS = new aJs();
    private final TLongObjectHashMap<bKV> eaT = new TLongObjectHashMap();
    final TByteObjectHashMap<float[]> eaU = new TByteObjectHashMap();
    private float eaV = 0.65f;
    private float eaW = 0.0f;
    private float azQ = 0.65f;
    private boolean eaX = true;
    final TObjectByteHashMap<bKV> eaY = new TObjectByteHashMap();
    boolean cSL = true;
    private boolean eaZ = true;
    final aJv eba = new aJv(512);
    private final TLongObjectProcedure<bKV> ebb = new aJt(this);
    private final TObjectByteProcedure<bKV> ebc = new aju_0(this);
    private static final float ebd = 0.09803922f;

    protected aJs() {
    }

    @Override
    public void cg(float f2) {
        this.el(f2);
    }

    @Override
    public void ch(float f2) {
    }

    private void el(float f2) {
        this.eaV = f2 < 0.0f ? 0.0f : f2;
        boolean bl = this.eaX = !arn_2.aY(this.eaW, this.eaV);
        if (this.eaX) {
            this.eaW = this.eaV;
        }
    }

    public void yJ(int n) {
        this.azQ = n;
        this.eaX = true;
    }

    @Override
    public void btl() {
        if (this.eaZ) {
            this.eaY.clear();
            this.eaY.ensureCapacity(this.eaT.size());
            this.eaZ = false;
        }
        this.eaT.forEachEntry(this.ebb);
        if (!this.cSL) {
            return;
        }
        this.cSL = false;
        this.eba.chE();
        this.eaY.forEachEntry(this.ebc);
        this.eba.bjt();
    }

    @Override
    public int bpb() {
        return 200;
    }

    @Override
    public boolean bpa() {
        return arn_2.aY(this.eaV, 0.0f);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        this.eba.a(n, n2, fArray);
    }

    @Override
    public void qF(int n) {
        if (!this.eaX && !this.eaU.isEmpty()) {
            return;
        }
        this.azQ = 0.8f;
        for (fsi_0 fsi_02 : fsi_0.values()) {
            byte by = this.a(fsi_02);
            if (by <= 0) continue;
            int n2 = by + 1;
            int n3 = 3;
            float[] fArray = new float[n2 * 3];
            this.eaU.put(by, (Object)fArray);
            for (int i = 0; i < fArray.length; ++i) {
                fArray[i] = 1.0f;
            }
            float f2 = 0.09803922f * this.eaV;
            for (int i = 0; i < n2; ++i) {
                float f3 = i == 0 || i == n2 - 1 ? f2 * 0.5f : f2;
                fArray[i + n2] = 1.0f - f3;
                float f4 = 1.0f - 0.4f * f3;
                fArray[i + 2 * n2] = f4;
                fArray[i] = f4;
            }
        }
        this.eaX = false;
        this.cSL = true;
    }

    public final void a(bKV bKV2) {
        int n = bKV2.ecn().gkS();
        if (n <= 0) {
            return;
        }
        this.eaT.put(aJs.c(bKV2), (Object)bKV2);
        this.eaZ = true;
    }

    public final void b(bKV bKV2) {
        this.eaT.remove(aJs.c(bKV2));
        this.eaZ = true;
    }

    private static long c(bKV bKV2) {
        return GC.s(bKV2.bcC(), bKV2.bcD());
    }

    byte d(bKV bKV2) {
        if (!bKV2.isVisible()) {
            return 0;
        }
        if (bKV2.ecj() == 0 || bKV2.ecj() == 16) {
            return 0;
        }
        return this.a(bKV2.ecn());
    }

    private byte a(fsi_0 fsi_02) {
        return (byte)((float)fsi_02.gkS() * this.azQ);
    }
}

