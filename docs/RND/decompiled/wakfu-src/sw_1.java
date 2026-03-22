/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sW
 */
final class sw_1 {
    private long ZC = 0L;
    private int Th = 0;
    private byte Tg = 0;
    private byte Us = 0;
    private short ZD = 0;
    private byte ZE = 0;
    private final vu_1 ZG = new vu_1();
    final /* synthetic */ sv_2 ZH;

    sw_1(sv_2 sv_22) {
        this.ZH = sv_22;
    }

    public void avW() {
        this.ZH.ZC = this.ZC;
        this.ZH.Th = this.Th;
        this.ZH.Tg = this.Tg;
        this.ZH.ZD = this.ZD;
        this.ZH.ZE = this.ZE;
        this.ZH.ZF.afs.clear();
        this.ZH.ZF.afs.ensureCapacity(this.ZG.afs.size());
        this.ZH.ZF.afs.addAll(this.ZG.afs);
        this.ZH.ZF.aft = this.ZG.aft;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.Us = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 1);
        return bl;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.Us = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 313);
        return bl;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.Us = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 314);
        return bl;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.Us = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 315);
        return bl;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.Us = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10003);
        return bl;
    }

    private boolean cK(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10020);
        return bl;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10023);
        return bl;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10028000);
        return bl;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10029000);
        return bl;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10032003);
        return bl;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10035004);
        return bl;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10035007);
        return bl;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10036004);
        return bl;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10037001);
        return bl;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10040005);
        return bl;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10045010);
        return bl;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10048000);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10064001);
        return bl;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10066001);
        return bl;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10069001);
        return bl;
    }

    private boolean cZ(ByteBuffer byteBuffer) {
        this.ZC = byteBuffer.getLong();
        this.Th = byteBuffer.getInt();
        this.Tg = byteBuffer.get();
        this.ZD = byteBuffer.getShort();
        boolean bl = this.ZG.b(byteBuffer, 10090001);
        return bl;
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
        if (n < 10020) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.cK(byteBuffer);
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
        if (n < 10090001) {
            boolean bl = this.cY(byteBuffer);
            return bl;
        }
        if (n < 10090003) {
            boolean bl = this.cZ(byteBuffer);
            return bl;
        }
        return false;
    }
}

