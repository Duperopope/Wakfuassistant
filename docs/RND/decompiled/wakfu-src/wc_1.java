/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wc
 */
final class wc_1 {
    private short adx = 0;
    private final vy_2 agL = new vy_2();
    final /* synthetic */ wb_1 agM;

    wc_1(wb_1 wb_12) {
        this.agM = wb_12;
    }

    public void avW() {
        this.agM.adx = this.adx;
        this.agM.agK.agz.ZC = this.agL.agz.ZC;
        this.agM.agK.agz.aaQ = this.agL.agz.aaQ;
        this.agM.agK.agz.aaa = this.agL.agz.aaa;
        this.agM.agK.agz.aeF = this.agL.agz.aeF;
        this.agM.agK.agz.aeG = this.agL.agz.aeG;
        this.agM.agK.agz.aeH = this.agL.agz.aeH;
        this.agM.agK.agz.aeI = this.agL.agz.aeI;
        this.agM.agK.agz.aeJ = this.agL.agz.aeJ;
        this.agM.agK.agz.aeK = this.agL.agz.aeK;
        this.agM.agK.agz.aeL = this.agL.agz.aeL;
        this.agM.agK.agz.aeM = this.agL.agz.aeM;
        this.agM.agK.agA = this.agL.agA;
        this.agM.agK.agB = this.agL.agB;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 1);
        return bl;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 313);
        return bl;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 314);
        return bl;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 315);
        return bl;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10003);
        return bl;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10023);
        return bl;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10028000);
        return bl;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10029000);
        return bl;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10032003);
        return bl;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10035004);
        return bl;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10035007);
        return bl;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10036004);
        return bl;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10037001);
        return bl;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10040005);
        return bl;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10045010);
        return bl;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10048000);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10064001);
        return bl;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.adx = byteBuffer.getShort();
        boolean bl = this.agL.b(byteBuffer, 10066001);
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

