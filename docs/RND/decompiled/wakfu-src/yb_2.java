/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yB
 */
final class yb_2 {
    private final ArrayList<yz_1> alY = new ArrayList(0);
    final /* synthetic */ yy_1 alZ;

    yb_2(yy_1 yy_12) {
        this.alZ = yy_12;
    }

    public void avW() {
        this.alZ.alU.clear();
        this.alZ.alU.ensureCapacity(this.alY.size());
        this.alZ.alU.addAll(this.alY);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.alY.clear();
        this.alY.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            yz_1 yz_12 = new yz_1();
            boolean bl = yz_12.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.alY.add(yz_12);
        }
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
        if (n < 313) {
            boolean bl = this.cx(byteBuffer);
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
        if (n < 10028000) {
            boolean bl = this.cL(byteBuffer);
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
        if (n < 10040005) {
            boolean bl = this.cS(byteBuffer);
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
        return false;
    }
}

