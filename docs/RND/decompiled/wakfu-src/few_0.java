/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from feW
 */
class few_0
implements fey_0 {
    private static final Logger seZ = Logger.getLogger(few_0.class);
    private long duS;
    private short bol;
    private short bok;
    private long sfa;

    few_0() {
    }

    few_0(long l, short s, long l2, short s2) {
        this.duS = l;
        this.bol = s;
        this.sfa = l2;
        this.bok = s2;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putLong(this.duS);
        byteBuffer.putShort(this.bol);
        byteBuffer.putLong(this.sfa);
        byteBuffer.putShort(this.bok);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.duS = byteBuffer.getLong();
        this.bol = byteBuffer.getShort();
        this.sfa = byteBuffer.getLong();
        this.bok = byteBuffer.getShort();
    }

    @Override
    public void a(fej_0 fej_02) {
        try {
            if (this.sfa == -1L || this.sfa == 0L) {
                fej_02.s(this.duS, this.bol);
            } else {
                short s = (short)(fej_02.sU(this.duS) - this.bol);
                fej_02.a(this.duS, this.sfa, this.bok, s);
            }
        }
        catch (ffr ffr2) {
            seZ.error((Object)("Impossible de modifier la quantit\u00e9. " + ffr2.getMessage()));
        }
    }

    @Override
    public ffa fUP() {
        return ffa.sfe;
    }

    public String toString() {
        return "ItemQuantityChange{m_itemId=" + this.duS + ", m_quantity=" + this.bol + "}";
    }
}

