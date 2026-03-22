/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ayu
 */
public abstract class ayu_1 {
    private static final Logger dsS = Logger.getLogger(ayu_1.class);
    protected final GD dsT = new GD(160680L);
    private static final float dsU = 1.0471976f;
    public static final byte dsV = 9;
    protected final TIntArrayList dsW = new TIntArrayList();
    protected final int[][] dsX;
    protected int dsY;
    protected final float dsZ;
    protected final float dta;
    protected final boolean dtb;
    protected ArrayList<aco_1> bXE = new ArrayList();
    private static final aco_1 dtc = new aco_1();

    public ayu_1(float f2, boolean bl) {
        this(f2, bl, true);
    }

    public ayu_1(float f2, boolean bl, boolean bl2) {
        this.dta = f2;
        this.dtb = bl;
        if (bl2) {
            this.dsY = (int)Math.ceil(2.0 / (4.0 * (double)f2));
            if (this.dsY < 2) {
                this.dsY = 2;
            }
            this.dsZ = 2.0f / (float)this.dsY;
            this.dsX = new int[this.dsY * this.dsY][9];
            for (int i = 0; i < this.dsY; ++i) {
                for (int j = 0; j < this.dsY; ++j) {
                    for (int i2 = 0; i2 < 9; ++i2) {
                        this.dsX[i * this.dsY + j][i2] = -1;
                    }
                }
            }
        } else {
            this.dsY = 0;
            this.dsZ = 0.0f;
            this.dsX = null;
        }
    }

    public ArrayList<aco_1> bSd() {
        return this.bXE;
    }

    public float a(aco_1 aco_12, aco_1 aco_13) {
        dtc.g(aco_13);
        dtc.l(aco_12);
        this.b(dtc, dtc);
        return ayu_1.dtc.aPY * ayu_1.dtc.aPY + ayu_1.dtc.aPZ * ayu_1.dtc.aPZ;
    }

    public boolean a(aco_1 aco_12) {
        return -1.0f <= aco_12.aPY && -1.0f <= aco_12.aPZ && 1.0f >= aco_12.aPY && 1.0f >= aco_12.aPZ;
    }

    public aco_1 bSe() {
        return new aco_1(2.0f * this.dsT.nextFloat() - 1.0f, 2.0f * this.dsT.nextFloat() - 1.0f);
    }

    final void b(aco_1 aco_12, aco_1 aco_13) {
        float f2 = aco_12.aPY;
        float f3 = aco_12.aPZ;
        if (this.dtb) {
            if (f2 < -1.0f) {
                f2 += 2.0f;
            } else if (f2 > 1.0f) {
                f2 -= 2.0f;
            }
            if (f3 < -1.0f) {
                f3 += 2.0f;
            } else if (f3 > 1.0f) {
                f3 -= 2.0f;
            }
        }
        aco_13.aS(f2, f3);
    }

    final aco_1 b(aco_1 aco_12) {
        aco_1 aco_13 = new aco_1();
        this.b(aco_12, aco_13);
        return aco_13;
    }

    public int c(aco_1 aco_12) {
        int n = (int)Math.floor(0.5 * (double)(aco_12.aPY + 1.0f) * (double)this.dsY);
        if (n < 0 || n >= this.dsY) {
            dsS.warn((Object)"Internal error, point outside grid was generated, ignoring.\n");
            return -1;
        }
        return n;
    }

    public int d(aco_1 aco_12) {
        int n = (int)Math.floor(0.5 * (double)(aco_12.aPZ + 1.0f) * (double)this.dsY);
        if (n < 0 || n >= this.dsY) {
            dsS.warn((Object)"Internal error, point outside grid was generated, ignoring.\n");
            return -1;
        }
        return n;
    }

    public boolean e(aco_1 aco_12) {
        if (this.dsX != null) {
            int n;
            int n2 = this.c(aco_12);
            int n3 = this.d(aco_12);
            int[] nArray = this.dsX[n3 * this.dsY + n2];
            for (n = 0; n < 9; ++n) {
                if (nArray[n] != -1) continue;
                nArray[n] = this.bXE.size();
                break;
            }
            if (n == 9) {
                dsS.warn((Object)"Internal error, overflowed max points per grid cell");
                return false;
            }
        }
        this.bXE.add(aco_12);
        return true;
    }

    public boolean f(aco_1 aco_12) {
        int n = this.bXE.indexOf(aco_12);
        if (this.dsX != null) {
            int n2;
            int n3 = this.c(aco_12);
            int n4 = this.d(aco_12);
            int[] nArray = this.dsX[n4 * this.dsY + n3];
            for (n2 = 0; n2 < 9; ++n2) {
                if (nArray[n2] != n) continue;
                System.arraycopy(nArray, n2 + 1, nArray, n2, nArray.length - n2 - 1);
                nArray[8] = -1;
                break;
            }
            if (n2 == 9) {
                return false;
            }
        }
        this.bXE.remove(n);
        return true;
    }

    public int a(aco_1 aco_12, float f2) {
        assert (this.dsX != null) : "Internal error, sampler cannot search without grid.";
        float f3 = f2 * f2;
        int n = (int)Math.ceil(f2 / this.dsZ);
        if (n > this.dsY >> 1) {
            n = this.dsY >> 1;
            dsS.warn((Object)("N = " + n));
        }
        this.dsW.clear();
        int n2 = this.c(aco_12);
        int n3 = this.d(aco_12);
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                int n4 = (n2 + j + this.dsY) % this.dsY;
                int n5 = (n3 + i + this.dsY) % this.dsY;
                int[] nArray = this.dsX[n5 * this.dsY + n4];
                for (int i2 = 0; i2 < 9 && nArray[i2] != -1; ++i2) {
                    if (!(this.a(aco_12, this.bXE.get(nArray[i2])) < f3)) continue;
                    this.dsW.add(nArray[i2]);
                }
            }
        }
        return this.dsW.size();
    }

    public float b(aco_1 aco_12, float f2) {
        assert (this.dsX != null) : "Internal error, sampler cannot search without grid.";
        float f3 = f2 * f2;
        int n = (int)Math.ceil(f2 / this.dsZ);
        if (n > this.dsY >> 1) {
            n = this.dsY >> 1;
        }
        int n2 = this.c(aco_12);
        int n3 = this.d(aco_12);
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                int n4 = (n2 + j + this.dsY) % this.dsY;
                int n5 = (n3 + i + this.dsY) % this.dsY;
                int[] nArray = this.dsX[n5 * this.dsY + n4];
                for (int i2 = 0; i2 < 9 && nArray[i2] != -1; ++i2) {
                    float f4 = this.a(aco_12, this.bXE.get(nArray[i2]));
                    if (!(f4 < f3)) continue;
                    f3 = f4;
                }
            }
        }
        return (float)Math.sqrt(f3);
    }

    public void a(int n, ayc_1 ayc_12) {
        assert (this.dsX != null) : "Internal error, sampler cannot search without grid.";
        aco_1 aco_12 = this.bXE.get(n);
        float f2 = 16.0f * this.dta * this.dta;
        int n2 = (int)Math.ceil(4.0f * this.dta / this.dsZ);
        if (n2 > this.dsY >> 1) {
            n2 = this.dsY >> 1;
        }
        int n3 = this.c(aco_12);
        int n4 = this.d(aco_12);
        int n5 = (double)(aco_12.aPY - (-1.0f + (float)n3 * this.dsZ)) > (double)this.dsZ * 0.5 ? 1 : 0;
        int n6 = (double)(aco_12.aPZ - (-1.0f + (float)n4 * this.dsZ)) > (double)this.dsZ * 0.5 ? 1 : 0;
        int n7 = 1;
        for (int i = -n2; i <= n2; ++i) {
            int n8 = 1;
            if (i == 0) {
                n7 = n6;
            } else if (i == 1) {
                n7 = 0;
            }
            for (int j = -n2; j <= n2; ++j) {
                if (j == 0) {
                    n8 = n5;
                } else if (j == 1) {
                    n8 = 0;
                }
                float f3 = aco_12.aPY - (-1.0f + (float)(n3 + j + n8) * this.dsZ);
                float f4 = aco_12.aPZ - (-1.0f + (float)(n4 + i + n7) * this.dsZ);
                if (!(f3 * f3 + f4 * f4 < f2)) continue;
                int n9 = (n3 + j + this.dsY) % this.dsY;
                int n10 = (n4 + i + this.dsY) % this.dsY;
                int[] nArray = this.dsX[n10 * this.dsY + n9];
                for (int i2 = 0; i2 < 9 && nArray[i2] != -1; ++i2) {
                    if (nArray[i2] == n) continue;
                    aco_1 aco_13 = this.bXE.get(nArray[i2]);
                    aco_1 aco_14 = this.b(aco_13.k(aco_12));
                    float f5 = aco_14.aPY * aco_14.aPY + aco_14.aPZ * aco_14.aPZ;
                    if (!(f5 < f2)) continue;
                    float f6 = GC.J(f5);
                    float f7 = GC.f(aco_14.aPZ, aco_14.aPY);
                    float f8 = GC.I(0.25f * f6 / this.dta);
                    ayc_12.bh(f7 - f8, f7 + f8);
                }
            }
        }
    }

    public void bSf() {
        ayc_1 ayc_12 = new ayc_1(0.0f, 0.0f);
        int n = this.bXE.size();
        for (int i = 0; i < n; ++i) {
            aco_1 aco_12 = this.bXE.get(i);
            ayc_12.bg(0.0f, (float)Math.PI * 2);
            this.a(i, ayc_12);
            ArrayList<ayd_1> arrayList = ayc_12.bSh();
            while (arrayList.size() != 0) {
                ayd_1 ayd_12 = arrayList.get(Math.abs(this.dsT.nextInt() >> 1) % arrayList.size());
                float f2 = ayd_12.dtq + (ayd_12.dtr - ayd_12.dtq) * this.dsT.nextFloat();
                aco_1 aco_13 = this.b(new aco_1(aco_12.aPY + GC.F(f2) * 2.0f * this.dta, aco_12.aPZ + GC.E(f2) * 2.0f * this.dta));
                this.e(aco_13);
                ayc_12.bh(f2 - 1.0471976f, f2 + 1.0471976f);
            }
        }
    }

    public void reset() {
    }

    public void b(ArrayList<aco_1> arrayList, float f2) {
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            aco_1 aco_12 = arrayList.get(i);
            this.a(aco_12, f2 * 2.0f);
            for (int j = this.dsW.size() - 1; j >= 0; --j) {
                tIntHashSet.add(this.dsW.get(j));
            }
        }
        ArrayList arrayList2 = new ArrayList(tIntHashSet.size());
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new ayv_1(this, arrayList2));
        }
        this.bXE = arrayList2;
    }

    public void a(ArrayList<aco_1> arrayList, ArrayList<aco_1> arrayList2, float f2) {
        if (arrayList2 == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                aco_1 aco_12 = arrayList.get(i);
                this.a(aco_12, f2 * 2.0f);
                for (int j = this.dsW.size() - 1; j >= 0; --j) {
                    tIntHashSet.add(this.dsW.get(j));
                }
            }
        }
        arrayList2.ensureCapacity(tIntHashSet.size());
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new ayw_1(this, arrayList2));
        }
    }

    public void c(ArrayList<aco_1> arrayList, float f2) {
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            aco_1 aco_12 = arrayList.get(i);
            this.a(aco_12, f2 * 2.0f);
            for (int j = this.dsW.size() - 1; j >= 0; --j) {
                tIntHashSet.add(this.dsW.get(j));
            }
        }
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new ayx_1(this));
        }
    }

    public void b(ArrayList<aco_1> arrayList, ArrayList<aco_1> arrayList2, float f2) {
        if (arrayList2 == null) {
            return;
        }
        int n = this.bXE.size();
        for (int i = 0; i < n; ++i) {
            arrayList2.add(this.bXE.get(i));
        }
        if (arrayList == null) {
            return;
        }
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (n = arrayList.size() - 1; n >= 0; --n) {
            aco_1 aco_12 = arrayList.get(n);
            this.a(aco_12, f2 * 2.0f);
            for (int i = this.dsW.size() - 1; i >= 0; --i) {
                tIntHashSet.add(this.dsW.get(i));
            }
        }
        if (!tIntHashSet.isEmpty()) {
            tIntHashSet.forEach((TIntProcedure)new ayy_1(this, arrayList2));
        }
    }

    public void bSg() {
        this.dsT.setSeed(160680L);
    }
}

