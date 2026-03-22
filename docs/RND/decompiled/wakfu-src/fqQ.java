/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.HashFunctions
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.impl.HashFunctions;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fqQ {
    @Nullable
    private TIntIntHashMap sVQ;
    @Nullable
    private TIntIntHashMap sVR;
    @Nullable
    private TLongIntHashMap sVS;
    @Nullable
    private TByteIntHashMap sVT;
    private boolean sVU = false;

    public void gjg() {
        if (this.sVR != null) {
            this.sVR.clear();
        }
        if (this.sVS != null) {
            this.sVS.clear();
        }
    }

    public int Zh(int n) {
        if (this.sVQ == null) {
            return -1;
        }
        if (this.sVQ.containsKey(n)) {
            return this.sVQ.get(n);
        }
        return -1;
    }

    private void a(exP exP2, fqE fqE2, int n) {
        if (!this.sVU && fqQ.b(exP2, fqE2) == 0) {
            return;
        }
        this.gjh().put(fqE2.avr(), n);
    }

    private void a(exP exP2, fqE fqE2) {
        if (!this.sVU && fqE2.b(exP2, null, exP2.bdV()) <= 0) {
            return;
        }
        this.gji().adjustOrPutValue(fqE2.avr(), 1, 1);
    }

    public void i(byte by, int n) {
        this.gjk().put(by, n);
    }

    private void a(exP exP2, fqE fqE2, anu_1 anu_12) {
        if (anu_12 == null || !this.sVU && ((fqD)fqE2.giP()).a(fqE2, exP2, (Object)anu_12, exP2.bdV()) <= 0) {
            return;
        }
        if (anu_12 instanceof eSS && !((eSS)anu_12).bcU()) {
            return;
        }
        long l = fqQ.a(fqE2, anu_12);
        this.gjj().adjustOrPutValue(l, 1, 1);
    }

    public void a(exP exP2, fqE fqE2, int n, List<? extends qu_0> list) {
        this.a(exP2, fqE2, n);
        this.a(exP2, fqE2);
        for (qu_0 qu_02 : list) {
            this.a(exP2, fqE2, qu_02);
        }
    }

    public int b(exP exP2, fqE fqE2, int n) {
        if (fqQ.b(exP2, fqE2) == 0) {
            return 0;
        }
        if (this.sVQ == null) {
            return 0;
        }
        if (!this.sVQ.contains(fqE2.avr())) {
            return 0;
        }
        return fqQ.b(exP2, fqE2) - (n - this.sVQ.get(fqE2.avr()));
    }

    public fqH c(exP exP2, fqE fqE2, int n) {
        return this.a(exP2, fqE2, n, (anu_1)null);
    }

    public fqH a(exP exP2, fqE fqE2, int n, anu_1 anu_12) {
        long l;
        int n2;
        int n3;
        qm_0<enk_0> qm_02 = exP2.bdV();
        if (fqQ.b(exP2, fqE2) != 0 && this.sVQ != null && this.sVQ.contains(fqE2.avr())) {
            if (fqQ.b(exP2, fqE2) < 0 || n - this.sVQ.get(fqE2.avr()) < fqQ.b(exP2, fqE2)) {
                return fqH.sVg;
            }
            this.sVQ.remove(fqE2.avr());
        }
        if (fqE2.b(exP2, anu_12, qm_02) > 0 && this.sVR != null && this.sVR.contains(fqE2.avr()) && (n3 = this.sVR.get(fqE2.avr())) >= fqE2.b(exP2, anu_12, qm_02)) {
            return fqH.sVf;
        }
        if (anu_12 != null && ((fqD)fqE2.giP()).a(fqE2, exP2, (Object)anu_12, qm_02) > 0 && this.sVS != null && (n2 = this.sVS.get(l = fqQ.a(fqE2, anu_12))) >= ((fqD)fqE2.giP()).a(fqE2, exP2, (Object)anu_12, qm_02)) {
            return fqH.sVe;
        }
        return fqH.sUS;
    }

    public int a(exP exP2, byte by, int n) {
        if (this.sVT == null || !this.sVT.containsKey(by)) {
            return 0;
        }
        int n2 = this.sVT.get(by);
        exf_2 exf_22 = exP2.fgM().b(exx_2.rHS);
        if (exf_22 == null) {
            return 0;
        }
        return Math.max(exf_22.aYB() - (n - n2), 0);
    }

    private static byte b(exP exP2, fqE fqE2) {
        return ((fqD)fqE2.giP()).d(fqE2, exP2, null, (Object)exP2.dlK().bbh());
    }

    private static long a(fqE fqE2, anu_1 anu_12) {
        return GC.s(((fqD)fqE2.giP()).d(), HashFunctions.hash((Object)anu_12));
    }

    @NotNull
    TIntIntHashMap gjh() {
        if (this.sVQ == null) {
            this.sVQ = new TIntIntHashMap(3);
        }
        return this.sVQ;
    }

    @NotNull
    TIntIntHashMap gji() {
        if (this.sVR == null) {
            this.sVR = new TIntIntHashMap(3);
        }
        return this.sVR;
    }

    @NotNull
    TLongIntHashMap gjj() {
        if (this.sVS == null) {
            this.sVS = new TLongIntHashMap(3);
        }
        return this.sVS;
    }

    @NotNull
    TByteIntHashMap gjk() {
        if (this.sVT == null) {
            this.sVT = new TByteIntHashMap(10);
        }
        return this.sVT;
    }

    public byte[] apI() {
        return fqM.a(this);
    }

    public void eL(ByteBuffer byteBuffer) {
        fqM.a(byteBuffer, this);
    }

    public void nT(boolean bl) {
        this.sVU = bl;
    }

    public void reset() {
        if (this.sVQ != null) {
            this.sVQ.clear();
        }
        if (this.sVR != null) {
            this.sVR.clear();
        }
        if (this.sVS != null) {
            this.sVS.clear();
        }
        if (this.sVT != null) {
            this.sVT.clear();
        }
    }
}

