/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uC
 */
final class uc_2 {
    private int adr = -1;
    private boolean ads = true;
    private final ArrayList<ua_2> adB = new ArrayList(0);
    private uz_1 adu = null;
    final /* synthetic */ uy_2 adC;

    uc_2(uy_2 uy_22) {
        this.adC = uy_22;
    }

    public void avW() {
        this.adC.adr = this.adr;
        this.adC.ads = this.ads;
        this.adC.adt.clear();
        this.adC.adt.ensureCapacity(this.adB.size());
        this.adC.adt.addAll(this.adB);
        this.adC.adu = this.adu;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean dW(ByteBuffer byteBuffer) {
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10025000);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        return true;
    }

    private boolean dX(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
        }
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        int n;
        this.adr = byteBuffer.getInt();
        this.ads = byteBuffer.get() == 1;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adB.clear();
        this.adB.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ua_2 ua_22 = new ua_2();
            boolean bl = ua_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.adB.add(ua_22);
        }
        int n3 = n = byteBuffer.get() == 1 ? 1 : 0;
        if (n != 0) {
            this.adu = new uz_1();
            boolean bl = this.adu.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
        } else {
            this.adu = null;
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
        if (n < 10025000) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10025001) {
            boolean bl = this.dW(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.dX(byteBuffer);
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

