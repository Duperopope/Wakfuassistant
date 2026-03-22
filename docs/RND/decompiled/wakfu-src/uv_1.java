/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uV
 */
final class uv_1 {
    private long aes = 0L;
    private int acO = 0;
    private int acP = 0;
    private short acQ = 0;
    private byte WR = 0;
    private boolean aet = false;
    private final uy_1 aew = new uy_1();
    private ox_1 aev = null;
    final /* synthetic */ uu_1 aex;

    uv_1(uu_1 uu_12) {
        this.aex = uu_12;
    }

    public void avW() {
        this.aex.aes = this.aes;
        this.aex.acO = this.acO;
        this.aex.acP = this.acP;
        this.aex.acQ = this.acQ;
        this.aex.WR = this.WR;
        this.aex.aet = this.aet;
        this.aex.aeu.ZC = this.aew.ZC;
        this.aex.aeu.aaQ = this.aew.aaQ;
        this.aex.aeu.aaa = this.aew.aaa;
        this.aex.aeu.aeF = this.aew.aeF;
        this.aex.aeu.aeG = this.aew.aeG;
        this.aex.aeu.aeH = this.aew.aeH;
        this.aex.aeu.aeI = this.aew.aeI;
        this.aex.aeu.aeJ = this.aew.aeJ;
        this.aex.aeu.aeK = this.aew.aeK;
        this.aex.aeu.aeL = this.aew.aeL;
        this.aex.aeu.aeM = this.aew.aeM;
        this.aex.aev = this.aev;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 1);
        return this.aev != null;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 309);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 309);
        return this.aev != null;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 313);
        return this.aev != null;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 314);
        return this.aev != null;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 315);
        return this.aev != null;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10003);
        return this.aev != null;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10023);
        return this.aev != null;
    }

    private boolean dj(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 1027001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 1027001);
        return this.aev != null;
    }

    private boolean dk(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 1027002);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 1027002);
        return this.aev != null;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10028000);
        return this.aev != null;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10029000);
        return this.aev != null;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10032003);
        return this.aev != null;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10035004);
        return this.aev != null;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10035007);
        return this.aev != null;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10036004);
        return this.aev != null;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10037001);
        return this.aev != null;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10037002);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10037002);
        return this.aev != null;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10040005);
        return this.aev != null;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10045010);
        return this.aev != null;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10048000);
        return this.aev != null;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10055001);
        return this.aev != null;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10064001);
        return this.aev != null;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10066001);
        return this.aev != null;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        this.aes = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.WR = byteBuffer.get();
        boolean bl = this.aew.b(byteBuffer, 10069001);
        if (!bl) {
            return false;
        }
        this.aev = ox_1.c(byteBuffer, 10069001);
        return this.aev != null;
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

