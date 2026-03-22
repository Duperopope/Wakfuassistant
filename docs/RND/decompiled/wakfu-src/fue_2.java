/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUe
 */
public class fue_2 {
    public byte[] SY;
    int vhw;
    int vhZ;
    int via;
    int vib;
    int vic;
    int vid;
    private final fuc_2 vie = new fuc_2();
    private final byte[] vif = new byte[4];

    public int gHR() {
        this.SY = null;
        return 0;
    }

    public void eIm() {
        this.SY = null;
        this.vhw = 0;
        this.vhZ = 0;
        this.via = 0;
        this.vib = 0;
        this.vic = 0;
        this.vid = 0;
    }

    public int act(int n) {
        if (this.via != 0) {
            this.vhZ -= this.via;
            if (this.vhZ > 0) {
                System.arraycopy(this.SY, this.via, this.SY, 0, this.vhZ);
            }
            this.via = 0;
        }
        if (n > this.vhw - this.vhZ) {
            int n2 = n + this.vhZ + 4096;
            if (this.SY != null) {
                byte[] byArray = new byte[n2];
                System.arraycopy(this.SY, 0, byArray, 0, this.SY.length);
                this.SY = byArray;
            } else {
                this.SY = new byte[n2];
            }
            this.vhw = n2;
        }
        return this.vhZ;
    }

    public int acu(int n) {
        if (this.vhZ + n > this.vhw) {
            return -1;
        }
        this.vhZ += n;
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int f(fuc_2 fuc_22) {
        int n = this.via;
        int n2 = this.vhZ - this.via;
        if (this.vic == 0) {
            if (n2 < 27) {
                return 0;
            }
            if (this.SY[n] != 79 || this.SY[n + 1] != 103 || this.SY[n + 2] != 103 || this.SY[n + 3] != 83) {
                this.vic = 0;
                this.vid = 0;
                int n3 = 0;
                for (int i = 0; i < n2 - 1; ++i) {
                    if (this.SY[n + 1 + i] != 79) continue;
                    n3 = n + 1 + i;
                    break;
                }
                if (n3 == 0) {
                    n3 = this.vhZ;
                }
                this.via = n3;
                return -(n3 - n);
            }
            int n4 = (this.SY[n + 26] & 0xFF) + 27;
            if (n2 < n4) {
                return 0;
            }
            for (int i = 0; i < (this.SY[n + 26] & 0xFF); ++i) {
                this.vid += this.SY[n + 27 + i] & 0xFF;
            }
            this.vic = n4;
        }
        if (this.vid + this.vic > n2) {
            return 0;
        }
        byte[] byArray = this.vif;
        synchronized (this.vif) {
            System.arraycopy(this.SY, n + 22, this.vif, 0, 4);
            this.SY[n + 22] = 0;
            this.SY[n + 23] = 0;
            this.SY[n + 24] = 0;
            this.SY[n + 25] = 0;
            fuc_2 fuc_23 = this.vie;
            fuc_23.vhF = this.SY;
            fuc_23.vhG = n;
            fuc_23.vhH = this.vic;
            fuc_23.vhI = this.SY;
            fuc_23.vhJ = n + this.vic;
            fuc_23.vhK = this.vid;
            fuc_23.gHN();
            if (this.vif[0] != this.SY[n + 22] || this.vif[1] != this.SY[n + 23] || this.vif[2] != this.SY[n + 24] || this.vif[3] != this.SY[n + 25]) {
                System.arraycopy(this.vif, 0, this.SY, n + 22, 4);
                this.vic = 0;
                this.vid = 0;
                int n5 = 0;
                for (int i = 0; i < n2 - 1; ++i) {
                    if (this.SY[n + 1 + i] != 79) continue;
                    n5 = n + 1 + i;
                    break;
                }
                if (n5 == 0) {
                    n5 = this.vhZ;
                }
                this.via = n5;
                // ** MonitorExit[var5_9] (shouldn't be in output)
                return -(n5 - n);
            }
            // ** MonitorExit[var5_9] (shouldn't be in output)
            n = this.via;
            if (fuc_22 != null) {
                fuc_22.vhF = this.SY;
                fuc_22.vhG = n;
                fuc_22.vhH = this.vic;
                fuc_22.vhI = this.SY;
                fuc_22.vhJ = n + this.vic;
                fuc_22.vhK = this.vid;
            }
            this.vib = 0;
            n2 = this.vic + this.vid;
            this.via += n2;
            this.vic = 0;
            this.vid = 0;
            return n2;
        }
    }

    public int e(fuc_2 fuc_22) {
        do {
            int n;
            if ((n = this.f(fuc_22)) > 0) {
                return 1;
            }
            if (n != 0) continue;
            return 0;
        } while (this.vib != 0);
        this.vib = 1;
        return -1;
    }

    public int gHQ() {
        this.vhZ = 0;
        this.via = 0;
        this.vib = 0;
        this.vic = 0;
        this.vid = 0;
        return 0;
    }

    public void bkZ() {
    }

    public int gHS() {
        return this.via;
    }

    public int gHT() {
        return this.vhZ;
    }
}

