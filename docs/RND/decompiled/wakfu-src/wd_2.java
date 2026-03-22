/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from wd
 */
final class wd_2 {
    private long adP = 0L;
    private byte agE = (byte)-1;
    private short agF = 0;
    private byte agG = 1;
    private final ArrayList<wb_1> agN = new ArrayList(0);
    private String agI = null;
    private boolean agJ = false;
    private long agO = 0L;
    final /* synthetic */ wa_2 agP;

    wd_2(wa_2 wa_22) {
        this.agP = wa_22;
    }

    public void avW() {
        this.agP.adP = this.adP;
        this.agP.agE = this.agE;
        this.agP.agF = this.agF;
        this.agP.agG = this.agG;
        this.agP.agH.clear();
        this.agP.agH.ensureCapacity(this.agN.size());
        this.agP.agH.addAll(this.agN);
        this.agP.agI = this.agI;
        this.agP.agJ = this.agJ;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 1);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        this.agO = byteBuffer.getLong();
        return true;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 309);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 313);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 314);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 315);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10003);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10023);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10028000);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10029000);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10032003);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10035004);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10035007);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10036004);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10037001);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10040005);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10045010);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10048000);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10055001);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10064001);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        Object object;
        int n;
        this.adP = byteBuffer.getLong();
        this.agE = byteBuffer.get();
        this.agF = byteBuffer.getShort();
        this.agG = byteBuffer.get();
        int n2 = byteBuffer.getShort() & 0xFFFF;
        this.agN.clear();
        this.agN.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            object = new wb_1();
            boolean bl = ((wb_1)object).b(byteBuffer, 10066001);
            if (!bl) {
                return false;
            }
            this.agN.add((wb_1)object);
        }
        n = byteBuffer.getShort() & 0xFFFF;
        object = new byte[n];
        byteBuffer.get((byte[])object);
        this.agI = new String((byte[])object, Charsets.UTF_8);
        this.agJ = byteBuffer.get() == 1;
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

