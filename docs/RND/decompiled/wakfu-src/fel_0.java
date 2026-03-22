/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from feL
 */
class fel_0
implements fen_0 {
    private static final Logger seN = Logger.getLogger(fel_0.class);
    private ffm seO;

    fel_0() {
    }

    fel_0(ffm ffm2) {
        this.seO = ffm2;
    }

    @Override
    public byte[] apI() {
        xx_2 xx_22 = fee_0.h(this.seO);
        ByteBuffer byteBuffer = ByteBuffer.allocate(xx_22.DN());
        xx_22.aF(byteBuffer);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        xx_2 xx_22 = new xx_2();
        xx_22.aG(byteBuffer);
        try {
            this.seO = fee_0.a(xx_22, fgD.fXh());
        }
        catch (ffq ffq2) {
            seN.error((Object)("Impossible de d\u00e9-s\u00e9rialiser l'item " + String.valueOf(xx_22)), (Throwable)ffq2);
        }
    }

    @Override
    public void a(fed_0 fed_02) {
        try {
            fed_02.g(this.seO);
        }
        catch (ffq ffq2) {
            seN.error((Object)"Impossible d'ajouter l'item", (Throwable)ffq2);
        }
    }

    @Override
    public fep_0 fUJ() {
        return fep_0.seQ;
    }

    public String toString() {
        return "AddItemChange{m_item=" + String.valueOf(this.seO) + "}";
    }
}

