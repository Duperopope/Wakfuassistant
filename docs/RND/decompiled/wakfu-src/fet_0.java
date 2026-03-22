/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from feT
 */
class fet_0
implements fen_0 {
    private static final Logger seW = Logger.getLogger(fet_0.class);
    private int asA;

    fet_0() {
    }

    fet_0(int n) {
        this.asA = n;
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.asA);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.asA = byteBuffer.getInt();
    }

    @Override
    public void a(fed_0 fed_02) {
        try {
            fed_02.UC(this.asA);
        }
        catch (ffq ffq2) {
            seW.error((Object)"Impossible d'ajouter l'item", (Throwable)ffq2);
        }
    }

    @Override
    public fep_0 fUJ() {
        return fep_0.seR;
    }

    public String toString() {
        return "RemoveItemChange{m_itemId=" + this.asA + "}";
    }
}

