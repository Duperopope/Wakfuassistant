/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uj
 */
final class uj_2 {
    private int acC = 0;
    private final uy_1 acE = new uy_1();
    final /* synthetic */ ui_1 acF;

    uj_2(ui_1 ui_12) {
        this.acF = ui_12;
    }

    public void avW() {
        this.acF.acC = this.acC;
        this.acF.acD.ZC = this.acE.ZC;
        this.acF.acD.aaQ = this.acE.aaQ;
        this.acF.acD.aaa = this.acE.aaa;
        this.acF.acD.aeF = this.acE.aeF;
        this.acF.acD.aeG = this.acE.aeG;
        this.acF.acD.aeH = this.acE.aeH;
        this.acF.acD.aeI = this.acE.aeI;
        this.acF.acD.aeJ = this.acE.aeJ;
        this.acF.acD.aeK = this.acE.aeK;
        this.acF.acD.aeL = this.acE.aeL;
        this.acF.acD.aeM = this.acE.aeM;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        return true;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10037002);
        return bl;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10040005);
        return bl;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10045010);
        return bl;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10048000);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10064001);
        return bl;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.acC = byteBuffer.getInt();
        boolean bl = this.acE.b(byteBuffer, 10066001);
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
        return false;
    }
}

