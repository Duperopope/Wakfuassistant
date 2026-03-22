/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tO
 */
final class to_2 {
    private final xz_1 abE = new xz_1();
    final /* synthetic */ tn_1 abF;

    to_2(tn_1 tn_12) {
        this.abF = tn_12;
    }

    public void avW() {
        this.abF.abD.aka = this.abE.aka;
        this.abF.abD.akb.clear();
        this.abF.abD.akb.ensureCapacity(this.abE.akb.size());
        this.abF.abD.akb.addAll(this.abE.akb);
        this.abF.abD.akc = this.abE.akc;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 1);
        return bl;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 309);
        return bl;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 313);
        return bl;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 314);
        return bl;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 315);
        return bl;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10003);
        return bl;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10023);
        return bl;
    }

    private boolean dj(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 1027001);
        return bl;
    }

    private boolean dk(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 1027002);
        return bl;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10028000);
        return bl;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10029000);
        return bl;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10032003);
        return bl;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10035004);
        return bl;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10035007);
        return bl;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10036004);
        return bl;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10037001);
        return bl;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10037002);
        return bl;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10040005);
        return bl;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10045010);
        return bl;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10048000);
        return bl;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10055001);
        return bl;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10064001);
        return bl;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10066001);
        return bl;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        boolean bl = this.abE.b(byteBuffer, 10069001);
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

