/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from uH
 */
final class uh_2 {
    private final ArrayList<ue_2> adM = new ArrayList(0);
    private final ArrayList<ug_2> adN = new ArrayList(0);
    final /* synthetic */ ud_1 adO;

    uh_2(ud_1 ud_12) {
        this.adO = ud_12;
    }

    public void avW() {
        this.adO.adD.clear();
        this.adO.adD.ensureCapacity(this.adM.size());
        this.adO.adD.addAll(this.adM);
        this.adO.adE.clear();
        this.adO.adE.ensureCapacity(this.adN.size());
        this.adO.adE.addAll(this.adN);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        return true;
    }

    private boolean dZ(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10012);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10012);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean ea(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10024001);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10024001);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean eb(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10030002);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10030002);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean ec(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10036008);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10036008);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
        }
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.adM.clear();
        this.adM.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            ue_2 ue_22 = new ue_2();
            boolean bl = ue_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.adM.add(ue_22);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        this.adN.clear();
        this.adN.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            ug_2 ug_22 = new ug_2();
            boolean bl = ug_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.adN.add(ug_22);
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
        if (n < 10012) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.dZ(byteBuffer);
            return bl;
        }
        if (n < 10024001) {
            boolean bl = this.cL(byteBuffer);
            return bl;
        }
        if (n < 10028000) {
            boolean bl = this.ea(byteBuffer);
            return bl;
        }
        if (n < 10029000) {
            boolean bl = this.cM(byteBuffer);
            return bl;
        }
        if (n < 10030002) {
            boolean bl = this.cN(byteBuffer);
            return bl;
        }
        if (n < 10032003) {
            boolean bl = this.eb(byteBuffer);
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
        if (n < 10036008) {
            boolean bl = this.cR(byteBuffer);
            return bl;
        }
        if (n < 10037001) {
            boolean bl = this.ec(byteBuffer);
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

