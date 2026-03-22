/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xC
 */
final class xc_1 {
    private byte aka = 0;
    private final ArrayList<xa_2> akg = new ArrayList(0);
    private yl_2 akc = null;
    final /* synthetic */ xz_1 akh;

    xc_1(xz_1 xz_12) {
        this.akh = xz_12;
    }

    public void avW() {
        this.akh.aka = this.aka;
        this.akh.akb.clear();
        this.akh.akb.ensureCapacity(this.akg.size());
        this.akh.akb.addAll(this.akg);
        this.akh.akc = this.akc;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 1);
        return this.akc != null;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 309);
        return this.akc != null;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 313);
        return this.akc != null;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 314);
        return this.akc != null;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 315);
        return this.akc != null;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10003);
        return this.akc != null;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10023);
        return this.akc != null;
    }

    private boolean dj(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 1027001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 1027001);
        return this.akc != null;
    }

    private boolean dk(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 1027002);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 1027002);
        return this.akc != null;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10028000);
        return this.akc != null;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10029000);
        return this.akc != null;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10032003);
        return this.akc != null;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10035004);
        return this.akc != null;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10035007);
        return this.akc != null;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10036004);
        return this.akc != null;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10037001);
        return this.akc != null;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10037002);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10037002);
        return this.akc != null;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10040005);
        return this.akc != null;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10045010);
        return this.akc != null;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10048000);
        return this.akc != null;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10055001);
        return this.akc != null;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10064001);
        return this.akc != null;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10066001);
        return this.akc != null;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        this.aka = byteBuffer.get();
        int n = byteBuffer.getShort() & 0xFFFF;
        this.akg.clear();
        this.akg.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            xa_2 xa_22 = new xa_2();
            boolean bl = xa_22.b(byteBuffer, 10069001);
            if (!bl) {
                return false;
            }
            this.akg.add(xa_22);
        }
        this.akc = yl_2.d(byteBuffer, 10069001);
        return this.akc != null;
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
        if (n < 10023) {
            boolean bl = this.cJ(byteBuffer);
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
        if (n < 10055001) {
            boolean bl = this.cC(byteBuffer);
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
        if (n < 10069001) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.cY(byteBuffer);
            return bl;
        }
        return false;
    }
}

