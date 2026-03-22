/*
 * Decompiled with CFR 0.152.
 */
class aIM
implements Yf<aIL> {
    aIM() {
    }

    public aIL iA(String string) {
        return aIL.valueOf(string);
    }

    public aIL yF(int n) {
        for (aIL aIL2 : aIL.values()) {
            if (aIL2.aHp() != n) continue;
            return aIL2;
        }
        return null;
    }

    @Override
    public String qP(int n) {
        aIL aIL2 = this.yF(n);
        return aIL2 == null ? "<unknow " + n + ">" : aIL2.name();
    }

    @Override
    public YY a(aIL aIL2) {
        int n = aIL2.aHp();
        switch (aIL2.ordinal()) {
            case 0: {
                return new zx_1(n, yq_0.bTR);
            }
            case 1: {
                return new zx_1(n, yq_0.bTT);
            }
            case 2: {
                return new zy_1(n, yu_0.bUa);
            }
            case 3: {
                return new zy_1(n, yu_0.bUb);
            }
            case 4: {
                return new zy_1(n, yu_0.bUc);
            }
            case 5: {
                return new zy_1(n, yu_0.bUd);
            }
            case 6: {
                return new zy_1(n, yu_0.bUe);
            }
            case 7: {
                return new zy_1(n, yu_0.bUf);
            }
            case 8: {
                return new zw_1(n);
            }
            case 10: {
                return new zy_1(n, yu_0.bTY);
            }
            case 12: {
                return new zy_1(n, yu_0.bTX);
            }
            case 11: {
                return new zy_1(n, yu_0.bTW);
            }
            case 13: {
                return new zy_1(n, yu_0.bTV);
            }
            case 14: {
                return new zy_1(n, yu_0.bTZ);
            }
            case 15: {
                return new zx_1(n, yq_0.bTS);
            }
            case 16: {
                return new YK(n);
            }
            case 17: {
                return null;
            }
            case 18: {
                return new YV(n);
            }
            case 19: {
                return null;
            }
            case 20: {
                return null;
            }
            case 21: {
                return null;
            }
            case 22: {
                return null;
            }
            case 23: {
                return null;
            }
            case 24: {
                return new YR(n);
            }
            case 25: {
                return new YT(n);
            }
            case 26: {
                return new YP(n);
            }
            case 27: {
                return null;
            }
            case 28: {
                return new zm_0(n);
            }
            case 29: {
                return new zq_0(n);
            }
            case 30: {
                return new zs_1(n);
            }
            case 31: {
                return new zk_0(n);
            }
            case 32: {
                return new zo_0(n);
            }
            case 33: {
                return new zi_0(n);
            }
        }
        return null;
    }

    @Override
    public /* synthetic */ Ye dM(String string) {
        return this.iA(string);
    }

    @Override
    public /* synthetic */ Ye qO(int n) {
        return this.yF(n);
    }
}

