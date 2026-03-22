/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from up
 */
final class up_2 {
    private long aba = 0L;
    private long acM = 0L;
    private String acN = null;
    private long TL = 0L;
    private int acO = 0;
    private int acP = 0;
    private short acQ = 0;
    private long acR = 0L;
    private final tl_1 acU = new tl_1();
    private long acT = 0L;
    private String TD = null;
    private long TE = 0L;
    final /* synthetic */ uo_1 acV;

    up_2(uo_1 uo_12) {
        this.acV = uo_12;
    }

    public void avW() {
        this.acV.aba = this.aba;
        this.acV.acM = this.acM;
        this.acV.acN = this.acN;
        this.acV.TL = this.TL;
        this.acV.acO = this.acO;
        this.acV.acP = this.acP;
        this.acV.acQ = this.acQ;
        this.acV.acR = this.acR;
        this.acV.acS.abs.clear();
        this.acV.acS.abs.ensureCapacity(this.acU.abs.size());
        this.acV.acS.abs.addAll(this.acU.abs);
        this.acV.acS.abq = this.acU.abq;
        this.acV.acS.abf = this.acU.abf;
        this.acV.acS.abt.amq.clear();
        this.acV.acS.abt.amq.ensureCapacity(this.acU.abt.amq.size());
        this.acV.acS.abt.amq.addAll(this.acU.abt.amq);
        this.acV.acS.abt.amr = this.acU.abt.amr;
        this.acV.acS.abt.ams = this.acU.abt.ams;
        this.acV.acS.abt.amt = this.acU.abt.amt;
        this.acV.acS.abu.abX = this.acU.abu.abX;
        this.acV.acS.abu.abY.clear();
        this.acV.acS.abu.abY.ensureCapacity(this.acU.abu.abY.size());
        this.acV.acS.abu.abY.addAll(this.acU.abu.abY);
        this.acV.acS.abu.abZ.clear();
        this.acV.acS.abu.abZ.ensureCapacity(this.acU.abu.abZ.size());
        this.acV.acS.abu.abZ.addAll(this.acU.abu.abZ);
        this.acV.acS.abv.aaX = this.acU.abv.aaX;
        this.acV.acS.abv.aaY.clear();
        this.acV.acS.abv.aaY.ensureCapacity(this.acU.abv.aaY.size());
        this.acV.acS.abv.aaY.addAll(this.acU.abv.aaY);
        this.acV.acS.abc = this.acU.abc;
        this.acV.acS.abd = this.acU.abd;
        this.acV.acS.abi = this.acU.abi;
        this.acV.acT = this.acT;
        this.acV.TD = this.TD;
        this.acV.TE = this.TE;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 1);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dg(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 309);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cG(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 313);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cH(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 314);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cI(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 315);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cJ(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10003);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dh(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10005);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean di(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10014);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cL(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10023);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dj(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 1027001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dk(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 1027002);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cM(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10028000);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cN(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10029000);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cO(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10032003);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cP(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10035004);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cQ(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10035007);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cR(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10036004);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cS(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10037001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dl(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10037002);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cT(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10040005);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cU(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10045010);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cC(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10048000);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dm(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10051000);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cV(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10055001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cW(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10064001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cX(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10066001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean do(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 0x999C39);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean cY(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10069001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dp(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10085001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dq(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10086001);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
        return true;
    }

    private boolean dr(ByteBuffer byteBuffer) {
        this.aba = byteBuffer.getLong();
        this.acM = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        this.acN = new String(byArray, Charsets.UTF_8);
        this.TL = byteBuffer.getLong();
        this.acO = byteBuffer.getInt();
        this.acP = byteBuffer.getInt();
        this.acQ = byteBuffer.getShort();
        this.acR = byteBuffer.getLong();
        boolean bl = this.acU.b(byteBuffer, 10086002);
        if (!bl) {
            return false;
        }
        this.acT = byteBuffer.getLong();
        int n2 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n2];
        byteBuffer.get(byArray2);
        this.TD = new String(byArray2, Charsets.UTF_8);
        this.TE = byteBuffer.getLong();
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
        if (n < 10005) {
            boolean bl = this.cJ(byteBuffer);
            return bl;
        }
        if (n < 10014) {
            boolean bl = this.dh(byteBuffer);
            return bl;
        }
        if (n < 10023) {
            boolean bl = this.di(byteBuffer);
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
        if (n < 10051000) {
            boolean bl = this.cC(byteBuffer);
            return bl;
        }
        if (n < 10055001) {
            boolean bl = this.dm(byteBuffer);
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
        if (n < 0x999C39) {
            boolean bl = this.cX(byteBuffer);
            return bl;
        }
        if (n < 10069001) {
            boolean bl = this.do(byteBuffer);
            return bl;
        }
        if (n < 10085001) {
            boolean bl = this.cY(byteBuffer);
            return bl;
        }
        if (n < 10086001) {
            boolean bl = this.dp(byteBuffer);
            return bl;
        }
        if (n < 10086002) {
            boolean bl = this.dq(byteBuffer);
            return bl;
        }
        if (n < 0x99F9F8) {
            boolean bl = this.dr(byteBuffer);
            return bl;
        }
        return false;
    }
}

