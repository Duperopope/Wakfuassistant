/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ux
 */
final class ux_1 {
    private final ArrayList<uv_2> ado = new ArrayList(0);
    private int adj = 0;
    private final ud_1 adp = new ud_1();
    final /* synthetic */ uu_2 adq;

    ux_1(uu_2 uu_22) {
        this.adq = uu_22;
    }

    public void avW() {
        this.adq.adi.clear();
        this.adq.adi.ensureCapacity(this.ado.size());
        this.adq.adi.addAll(this.ado);
        this.adq.adj = this.adj;
        this.adq.adk.adD.clear();
        this.adq.adk.adD.ensureCapacity(this.adp.adD.size());
        this.adq.adk.adD.addAll(this.adp.adD);
        this.adq.adk.adE.clear();
        this.adq.adk.adE.ensureCapacity(this.adp.adE.size());
        this.adq.adk.adE.addAll(this.adp.adE);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 0);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 0) ? 1 : 0;
        return n != 0;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 1) ? 1 : 0;
        return n != 0;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 313) ? 1 : 0;
        return n != 0;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 314) ? 1 : 0;
        return n != 0;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 315) ? 1 : 0;
        return n != 0;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        n = this.adp.b(byteBuffer, 10003) ? 1 : 0;
        return n != 0;
    }

    private boolean dY(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10011);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10011) ? 1 : 0;
        return n != 0;
    }

    private boolean dZ(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10012);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10012) ? 1 : 0;
        return n != 0;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10023) ? 1 : 0;
        return n != 0;
    }

    private boolean ea(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10024001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10024001) ? 1 : 0;
        return n != 0;
    }

    private boolean dW(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10025000);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10025000) ? 1 : 0;
        return n != 0;
    }

    private boolean dX(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10025001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10025001) ? 1 : 0;
        return n != 0;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10028000) ? 1 : 0;
        return n != 0;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10029000) ? 1 : 0;
        return n != 0;
    }

    private boolean eb(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10030002);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10030002) ? 1 : 0;
        return n != 0;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10032003) ? 1 : 0;
        return n != 0;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10035004) ? 1 : 0;
        return n != 0;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10035007) ? 1 : 0;
        return n != 0;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10036004) ? 1 : 0;
        return n != 0;
    }

    private boolean ec(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10036008);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10036008) ? 1 : 0;
        return n != 0;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10037001) ? 1 : 0;
        return n != 0;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10040005) ? 1 : 0;
        return n != 0;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10045010) ? 1 : 0;
        return n != 0;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10048000) ? 1 : 0;
        return n != 0;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10055001) ? 1 : 0;
        return n != 0;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10064001) ? 1 : 0;
        return n != 0;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        int n;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.ado.clear();
        this.ado.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            uv_2 uv_22 = new uv_2();
            boolean bl = uv_22.b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.ado.add(uv_22);
        }
        this.adj = byteBuffer.getInt();
        n = this.adp.b(byteBuffer, 10066001) ? 1 : 0;
        return n != 0;
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
        if (n < 10011) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10012) {
            boolean bl = this.dY(byteBuffer);
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
        if (n < 10025000) {
            boolean bl = this.ea(byteBuffer);
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

