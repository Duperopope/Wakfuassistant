/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from feX
 */
class fex_0
implements fey_0 {
    private static final Logger sfb = Logger.getLogger(fex_0.class);
    private long lZd;
    private short bok;
    private long duS;

    fex_0() {
    }

    fex_0(long l, long l2, short s) {
        this.duS = l;
        this.lZd = l2;
        this.bok = s;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(18);
        byteBuffer.putLong(this.duS);
        byteBuffer.putLong(this.lZd);
        byteBuffer.putShort(this.bok);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.duS = byteBuffer.getLong();
        this.lZd = byteBuffer.getLong();
        this.bok = byteBuffer.getShort();
    }

    @Override
    public void a(fej_0 fej_02) {
        try {
            if (this.lZd == -1L) {
                ffV ffV2 = fej_02.sT(this.duS);
                if (ffV2 != null) {
                    ffV2.aZp();
                }
            } else {
                fej_02.a(this.duS, this.lZd, this.bok, (short)-1);
            }
        }
        catch (ffr ffr2) {
            sfb.error((Object)("Impossible de retirer l'objet : " + ffr2.getMessage()));
        }
    }

    @Override
    public ffa fUP() {
        return ffa.sfd;
    }

    public String toString() {
        return "RemoveItemChange{m_itemId=" + this.duS + "}";
    }
}

