/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from tM
 */
final class tm_1 {
    private final ArrayList<tn_1> abw = new ArrayList(0);
    private int abq = 0;
    private int abf = 0;
    private final yl_1 abx = new yl_1();
    private final tw_1 aby = new tw_1();
    private final te_1 abz = new te_1();
    @Deprecated
    private final ud_2 abA = new ud_2();
    @Deprecated
    private final tc_2 abB = new tc_2();
    private short abc = 0;
    private long abd = 0L;
    private boolean abi = false;
    final /* synthetic */ tl_1 abC;

    tm_1(tl_1 tl_12) {
        this.abC = tl_12;
    }

    public void avW() {
        this.abC.abs.clear();
        this.abC.abs.ensureCapacity(this.abw.size());
        this.abC.abs.addAll(this.abw);
        this.abC.abq = this.abq;
        this.abC.abf = this.abf;
        this.abC.abt.amq.clear();
        this.abC.abt.amq.ensureCapacity(this.abx.amq.size());
        this.abC.abt.amq.addAll(this.abx.amq);
        this.abC.abt.amr = this.abx.amr;
        this.abC.abt.ams = this.abx.ams;
        this.abC.abt.amt = this.abx.amt;
        this.abC.abu.abX = this.aby.abX;
        this.abC.abu.abY.clear();
        this.abC.abu.abY.ensureCapacity(this.aby.abY.size());
        this.abC.abu.abY.addAll(this.aby.abY);
        this.abC.abu.abZ.clear();
        this.abC.abu.abZ.ensureCapacity(this.aby.abZ.size());
        this.abC.abu.abZ.addAll(this.aby.abZ);
        this.abC.abv.aaX = this.abz.aaX;
        this.abC.abv.aaY.clear();
        this.abC.abv.aaY.ensureCapacity(this.abz.aaY.size());
        this.abC.abv.aaY.addAll(this.abz.aaY);
        this.abC.abc = this.abc;
        this.abC.abd = this.abd;
        this.abC.abi = this.abi;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 1) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 1);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 1);
        return bl3;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 309) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 309);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 309);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 309);
        return bl3;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 313) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 313);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 313);
        return bl3;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 314) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 314);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 314);
        return bl3;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 315) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 315);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 315);
        return bl3;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10003) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10003);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10003);
        return bl3;
    }

    private boolean di(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10014);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10014) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10014);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10014);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10014);
        return bl3;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10023) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10023);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10023);
        return bl3;
    }

    private boolean dj(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 1027001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 1027001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 1027001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 1027001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 1027001);
        return bl3;
    }

    private boolean dk(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 1027002);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 1027002) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 1027002);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 1027002);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 1027002);
        return bl3;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10028000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10028000);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10028000);
        return bl3;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10029000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10029000);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10029000);
        return bl3;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10032003) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10032003);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10032003);
        return bl3;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10035004) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10035004);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10035004);
        return bl3;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10035007) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10035007);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10035007);
        return bl3;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10036004) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10036004);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10036004);
        return bl3;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10037001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10037001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10037001);
        return bl3;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10037002);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10037002) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10037002);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10037002);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10037002);
        return bl3;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10040005) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10040005);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10040005);
        return bl3;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10045010) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10045010);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10045010);
        return bl3;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10048000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10048000);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10048000);
        return bl3;
    }

    private boolean dm(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10051000);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10051000) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10051000);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10051000);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10051000);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10051000);
        return bl4;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10055001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10055001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10055001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10055001);
        return bl4;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10064001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10064001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10064001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10064001);
        return bl4;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10066001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10066001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10066001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10066001);
        return bl4;
    }

    private boolean do(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 0x999C39);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 0x999C39) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 0x999C39);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 0x999C39);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 0x999C39);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 0x999C39);
        if (!bl4) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        return true;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10069001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10069001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10069001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10069001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10069001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10069001);
        if (!bl4) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        return true;
    }

    private boolean dp(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10085001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10085001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10085001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10085001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10085001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10085001);
        if (!bl4) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        return true;
    }

    private boolean dq(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10086001);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10086001) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10086001);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10086001);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10086001);
        if (!bl3) {
            return false;
        }
        boolean bl4 = this.abB.b(byteBuffer, 10086001);
        if (!bl4) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        this.abi = byteBuffer.get() == 1;
        return true;
    }

    private boolean dr(ByteBuffer byteBuffer) {
        boolean bl;
        int n;
        int n2 = byteBuffer.get() & 0xFF;
        this.abw.clear();
        this.abw.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            tn_1 tn_12 = new tn_1();
            bl = tn_12.b(byteBuffer, 10086002);
            if (!bl) {
                return false;
            }
            this.abw.add(tn_12);
        }
        this.abq = byteBuffer.getInt();
        this.abf = byteBuffer.getInt();
        n = this.abx.b(byteBuffer, 10086002) ? 1 : 0;
        if (n == 0) {
            return false;
        }
        boolean bl2 = this.aby.b(byteBuffer, 10086002);
        if (!bl2) {
            return false;
        }
        bl = this.abz.b(byteBuffer, 10086002);
        if (!bl) {
            return false;
        }
        boolean bl3 = this.abA.b(byteBuffer, 10086002);
        if (!bl3) {
            return false;
        }
        this.abc = byteBuffer.getShort();
        this.abd = byteBuffer.getLong();
        this.abi = byteBuffer.get() == 1;
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 309) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 313) {
            boolean bl = this.dg(byteBuffer);
            return bl;
        }
        if (n < 314) {
            boolean bl = this.cG(byteBuffer);
            return bl;
        }
        if (n < 315) {
            boolean bl = this.cH(byteBuffer);
            return bl;
        }
        if (n < 10003) {
            boolean bl = this.cI(byteBuffer);
            return bl;
        }
        if (n < 10014) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.di(byteBuffer);
            return bl;
        }
        if (n < 1027001) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 1027002) {
            boolean bl = this.dj(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.dk(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.cM(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.cN(byteBuffer);
            return bl;
        }
        if (n < 10035004) {
            boolean bl = this.cO(byteBuffer);
            return bl;
        }
        if (n < 10035007) {
            boolean bl = this.cP(byteBuffer);
            return bl;
        }
        if (n < 10036004) {
            boolean bl = this.cQ(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.cR(byteBuffer);
            return bl;
        }
        if (n < 10037002) {
            boolean bl = this.cS(byteBuffer);
            return bl;
        }
        if (n < 10040005) {
            boolean bl = this.dl(byteBuffer);
            return bl;
        }
        if (n < 10045010) {
            boolean bl = this.cT(byteBuffer);
            return bl;
        }
        if (n < 10048000) {
            boolean bl = this.cU(byteBuffer);
            return bl;
        }
        if (n < 10051000) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.dm(byteBuffer);
            return bl;
        }
        if (n < 10064001) {
            boolean bl = this.cV(byteBuffer);
            return bl;
        }
        if (n < 10066001) {
            boolean bl = this.cW(byteBuffer);
            return bl;
        }
        if (n < 0x999C39) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.do(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.cY(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.dp(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.dq(byteBuffer);
            return bl;
        }
        if (n < 0x99F9F8) {
            boolean bl = this.dr(byteBuffer);
            return bl;
        }
        return false;
    }
}

