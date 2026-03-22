/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fUR
 */
class fur_1 {
    int viu;
    int viv;
    int[] vnE;
    int vnF;
    int vnG;
    int vnH;
    int vnI;
    int vnJ;
    int[] vnK;
    static final int vnL = 10;
    static final int vnM = 21;
    static final int vnN = 768;

    fur_1() {
    }

    int c(fua_2 fua_22) {
        int n;
        int n2;
        boolean bl = false;
        fua_22.hk(5653314, 24);
        fua_22.hk(this.viu, 16);
        fua_22.hk(this.viv, 24);
        for (n2 = 1; n2 < this.viv && this.vnE[n2] >= this.vnE[n2 - 1]; ++n2) {
        }
        if (n2 == this.viv) {
            bl = true;
        }
        if (bl) {
            n = 0;
            fua_22.hk(1, 1);
            fua_22.hk(this.vnE[0] - 1, 5);
            for (n2 = 1; n2 < this.viv; ++n2) {
                int n3 = this.vnE[n2];
                int n4 = this.vnE[n2 - 1];
                if (n3 <= n4) continue;
                for (int i = n4; i < n3; ++i) {
                    fua_22.hk(n2 - n, fut_2.acp(this.viv - n));
                    n = n2;
                }
            }
            fua_22.hk(n2 - n, fut_2.acp(this.viv - n));
        } else {
            fua_22.hk(0, 1);
            for (n2 = 0; n2 < this.viv && this.vnE[n2] != 0; ++n2) {
            }
            if (n2 == this.viv) {
                fua_22.hk(0, 1);
                for (n2 = 0; n2 < this.viv; ++n2) {
                    fua_22.hk(this.vnE[n2] - 1, 5);
                }
            } else {
                fua_22.hk(1, 1);
                for (n2 = 0; n2 < this.viv; ++n2) {
                    if (this.vnE[n2] == 0) {
                        fua_22.hk(0, 1);
                        continue;
                    }
                    fua_22.hk(1, 1);
                    fua_22.hk(this.vnE[n2] - 1, 5);
                }
            }
        }
        fua_22.hk(this.vnF, 4);
        switch (this.vnF) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                if (this.vnK == null) {
                    return -1;
                }
                fua_22.hk(this.vnG, 32);
                fua_22.hk(this.vnH, 32);
                fua_22.hk(this.vnI - 1, 4);
                fua_22.hk(this.vnJ, 1);
                n = 0;
                switch (this.vnF) {
                    case 1: {
                        n = this.gHY();
                        break;
                    }
                    case 2: {
                        n = this.viv * this.viu;
                    }
                }
                for (n2 = 0; n2 < n; ++n2) {
                    fua_22.hk(Math.abs(this.vnK[n2]), this.vnI);
                }
                break;
            }
            default: {
                return -1;
            }
        }
        return 0;
    }

    int b(fua_2 fua_22) {
        int n;
        int n2;
        if (fua_22.acn(24) != 5653314) {
            this.clear();
            return -1;
        }
        this.viu = fua_22.acn(16);
        this.viv = fua_22.acn(24);
        if (this.viv == -1) {
            this.clear();
            return -1;
        }
        switch (fua_22.acn(1)) {
            case 0: {
                this.vnE = new int[this.viv];
                if (fua_22.acn(1) != 0) {
                    for (n2 = 0; n2 < this.viv; ++n2) {
                        if (fua_22.acn(1) != 0) {
                            n = fua_22.acn(5);
                            if (n == -1) {
                                this.clear();
                                return -1;
                            }
                            this.vnE[n2] = n + 1;
                            continue;
                        }
                        this.vnE[n2] = 0;
                    }
                } else {
                    for (n2 = 0; n2 < this.viv; ++n2) {
                        n = fua_22.acn(5);
                        if (n == -1) {
                            this.clear();
                            return -1;
                        }
                        this.vnE[n2] = n + 1;
                    }
                }
                break;
            }
            case 1: {
                n = fua_22.acn(5) + 1;
                this.vnE = new int[this.viv];
                n2 = 0;
                while (n2 < this.viv) {
                    int n3 = fua_22.acn(fut_2.acp(this.viv - n2));
                    if (n3 == -1) {
                        this.clear();
                        return -1;
                    }
                    int n4 = 0;
                    while (n4 < n3) {
                        this.vnE[n2] = n;
                        ++n4;
                        ++n2;
                    }
                    ++n;
                }
                break;
            }
            default: {
                return -1;
            }
        }
        this.vnF = fua_22.acn(4);
        switch (this.vnF) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                this.vnG = fua_22.acn(32);
                this.vnH = fua_22.acn(32);
                this.vnI = fua_22.acn(4) + 1;
                this.vnJ = fua_22.acn(1);
                n = 0;
                switch (this.vnF) {
                    case 1: {
                        n = this.gHY();
                        break;
                    }
                    case 2: {
                        n = this.viv * this.viu;
                    }
                }
                this.vnK = new int[n];
                for (n2 = 0; n2 < n; ++n2) {
                    this.vnK[n2] = fua_22.acn(this.vnI);
                }
                if (this.vnK[n - 1] != -1) break;
                this.clear();
                return -1;
            }
            default: {
                this.clear();
                return -1;
            }
        }
        return 0;
    }

    private int gHY() {
        int n = (int)Math.floor(Math.pow(this.viv, 1.0 / (double)this.viu));
        while (true) {
            int n2 = 1;
            int n3 = 1;
            for (int i = 0; i < this.viu; ++i) {
                n2 *= n;
                n3 *= n + 1;
            }
            if (n2 <= this.viv && n3 > this.viv) {
                return n;
            }
            if (n2 > this.viv) {
                --n;
                continue;
            }
            ++n;
        }
    }

    void clear() {
    }

    float[] gHZ() {
        if (this.vnF == 1 || this.vnF == 2) {
            float f2 = fur_1.acy(this.vnG);
            float f3 = fur_1.acy(this.vnH);
            float[] fArray = new float[this.viv * this.viu];
            switch (this.vnF) {
                case 1: {
                    int n = this.gHY();
                    for (int i = 0; i < this.viv; ++i) {
                        float f4 = 0.0f;
                        int n2 = 1;
                        for (int j = 0; j < this.viu; ++j) {
                            int n3 = i / n2 % n;
                            float f5 = this.vnK[n3];
                            f5 = Math.abs(f5) * f3 + f2 + f4;
                            if (this.vnJ != 0) {
                                f4 = f5;
                            }
                            fArray[i * this.viu + j] = f5;
                            n2 *= n;
                        }
                    }
                    break;
                }
                case 2: {
                    for (int i = 0; i < this.viv; ++i) {
                        float f6 = 0.0f;
                        for (int j = 0; j < this.viu; ++j) {
                            float f7 = this.vnK[i * this.viu + j];
                            f7 = Math.abs(f7) * f3 + f2 + f6;
                            if (this.vnJ != 0) {
                                f6 = f7;
                            }
                            fArray[i * this.viu + j] = f7;
                        }
                    }
                    break;
                }
            }
            return fArray;
        }
        return null;
    }

    static long gm(float f2) {
        int n = 0;
        if (f2 < 0.0f) {
            n = Integer.MIN_VALUE;
            f2 = -f2;
        }
        int n2 = (int)Math.floor(Math.log(f2) / Math.log(2.0));
        int n3 = (int)Math.rint(Math.pow(f2, 20 - n2));
        n2 = n2 + 768 << 21;
        return n | n2 | n3;
    }

    static float acy(int n) {
        float f2 = n & 0x1FFFFF;
        float f3 = (n & 0x7FE00000) >>> 21;
        if ((n & Integer.MIN_VALUE) != 0) {
            f2 = -f2;
        }
        return fur_1.j(f2, (int)f3 - 20 - 768);
    }

    static float j(float f2, int n) {
        return (float)((double)f2 * Math.pow(2.0, n));
    }
}

