/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUj
 */
public class fuj_2 {
    private static final byte[] viH = "vorbis".getBytes();
    private static final byte[] viI = "Xiphophorus libVorbis I 20000508".getBytes();
    private static final int viJ = -130;
    public byte[][] viK;
    public int[] viL;
    public int viM;
    public byte[] viN;

    public void bkZ() {
        this.viK = null;
        this.viM = 0;
        this.viN = null;
    }

    public void wx(String string) {
        this.fc(string.getBytes());
    }

    private void fc(byte[] byArray) {
        byte[][] byArrayArray = new byte[this.viM + 2][];
        if (this.viK != null) {
            System.arraycopy(this.viK, 0, byArrayArray, 0, this.viM);
        }
        this.viK = byArrayArray;
        int[] nArray = new int[this.viM + 2];
        if (this.viL != null) {
            System.arraycopy(this.viL, 0, nArray, 0, this.viM);
        }
        this.viL = nArray;
        byte[] byArray2 = new byte[byArray.length + 1];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        this.viK[this.viM] = byArray2;
        this.viL[this.viM] = byArray.length;
        ++this.viM;
        this.viK[this.viM] = null;
    }

    public void bb(String string, String string2) {
        if (string2 == null) {
            string2 = "";
        }
        this.wx(string + "=" + string2);
    }

    static boolean a(byte[] byArray, byte[] byArray2, int n) {
        for (int i = 0; i < n; ++i) {
            byte by = byArray[i];
            byte by2 = byArray2[i];
            if (90 >= by && by >= 65) {
                by = (byte)(by - 65 + 97);
            }
            if (90 >= by2 && by2 >= 65) {
                by2 = (byte)(by2 - 65 + 97);
            }
            if (by == by2) continue;
            return false;
        }
        return true;
    }

    public String wy(String string) {
        return this.D(string, 0);
    }

    public String D(String string, int n) {
        int n2 = this.n(string.getBytes(), n);
        if (n2 == -1) {
            return null;
        }
        byte[] byArray = this.viK[n2];
        for (int i = 0; i < this.viL[n2]; ++i) {
            if (byArray[i] != 61) continue;
            return new String(byArray, i + 1, this.viL[n2] - (i + 1));
        }
        return null;
    }

    private int n(byte[] byArray, int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = byArray.length + 1;
        byte[] byArray2 = new byte[n4];
        System.arraycopy(byArray, 0, byArray2, 0, byArray.length);
        byArray2[byArray.length] = 61;
        for (n2 = 0; n2 < this.viM; ++n2) {
            if (!fuj_2.a(this.viK[n2], byArray2, n4)) continue;
            if (n == n3) {
                return n2;
            }
            ++n3;
        }
        return -1;
    }

    int b(fua_2 fua_22) {
        int n = fua_22.acn(32);
        if (n < 0) {
            this.clear();
            return -1;
        }
        this.viN = new byte[n + 1];
        fua_22.l(this.viN, n);
        this.viM = fua_22.acn(32);
        if (this.viM < 0) {
            this.clear();
            return -1;
        }
        this.viK = new byte[this.viM + 1][];
        this.viL = new int[this.viM + 1];
        for (int i = 0; i < this.viM; ++i) {
            int n2 = fua_22.acn(32);
            if (n2 < 0) {
                this.clear();
                return -1;
            }
            this.viL[i] = n2;
            this.viK[i] = new byte[n2 + 1];
            fua_22.l(this.viK[i], n2);
        }
        if (fua_22.acn(1) != 1) {
            this.clear();
            return -1;
        }
        return 0;
    }

    int c(fua_2 fua_22) {
        fua_22.hk(3, 8);
        fua_22.fb(viH);
        fua_22.hk(viI.length, 32);
        fua_22.fb(viI);
        fua_22.hk(this.viM, 32);
        if (this.viM != 0) {
            for (int i = 0; i < this.viM; ++i) {
                if (this.viK[i] != null) {
                    fua_22.hk(this.viL[i], 32);
                    fua_22.fb(this.viK[i]);
                    continue;
                }
                fua_22.hk(0, 32);
            }
        }
        fua_22.hk(1, 1);
        return 0;
    }

    public int d(fub_2 fub_22) {
        fua_2 fua_22 = new fua_2();
        fua_22.gHy();
        if (this.c(fua_22) != 0) {
            return -130;
        }
        fub_22.vhx = new byte[fua_22.gHD()];
        fub_22.vhy = 0;
        fub_22.vhz = fua_22.gHD();
        System.arraycopy(fua_22.gHF(), 0, fub_22.vhx, 0, fub_22.vhz);
        fub_22.vhA = 0;
        fub_22.vhB = 0;
        fub_22.vhC = 0L;
        return 0;
    }

    void clear() {
        for (int i = 0; i < this.viM; ++i) {
            this.viK[i] = null;
        }
        this.viK = null;
        this.viN = null;
    }

    public String gHV() {
        return new String(this.viN, 0, this.viN.length - 1);
    }

    public String acv(int n) {
        if (this.viM <= n) {
            return null;
        }
        return new String(this.viK[n], 0, this.viK[n].length - 1);
    }

    public String toString() {
        String string = "Vendor: " + new String(this.viN, 0, this.viN.length - 1);
        for (int i = 0; i < this.viM; ++i) {
            string = string + "\nComment: " + new String(this.viK[i], 0, this.viK[i].length - 1);
        }
        string = string + "\n";
        return string;
    }
}

