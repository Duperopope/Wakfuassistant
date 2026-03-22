/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;

public class fei
implements fec {
    public static final aza_2<fec> rZP = new fej();
    private final TIntArrayList rZQ;

    public fei(TIntArrayList tIntArrayList) {
        this.rZQ = tIntArrayList;
    }

    @Override
    public int DN() {
        return 0;
    }

    @Override
    public void fY(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre utilis\u00e9");
    }

    @Override
    public void fZ(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Ne devrait pas \u00eatre utilis\u00e9");
    }

    @Override
    public fed fUt() {
        return fed.rZK;
    }

    public TIntArrayList fUw() {
        return this.rZQ;
    }

    public String toString() {
        return "InventoryGameAddItemAction{m_itemsToAdd=" + String.valueOf(this.rZQ) + "}";
    }
}

