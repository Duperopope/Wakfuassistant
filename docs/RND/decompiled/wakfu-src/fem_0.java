/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from feM
 */
class fem_0
implements fen_0 {
    private static final Logger seP = Logger.getLogger(fem_0.class);
    private int asA;
    private short bol;

    fem_0() {
    }

    fem_0(int n, short s) {
        this.asA = n;
        this.bol = s;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        byteBuffer.putInt(this.asA);
        byteBuffer.putShort(this.bol);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.asA = byteBuffer.getInt();
        this.bol = byteBuffer.getShort();
    }

    @Override
    public void a(fed_0 fed_02) {
        try {
            fed_02.L(this.asA, this.bol);
        }
        catch (ffq ffq2) {
            seP.error((Object)"Impossible d'ajouter l'item", (Throwable)ffq2);
        }
    }

    @Override
    public fep_0 fUJ() {
        return fep_0.seS;
    }

    public String toString() {
        return "ItemQuantityChange{m_itemId=" + this.asA + ", m_quantity=" + this.bol + "}";
    }
}

