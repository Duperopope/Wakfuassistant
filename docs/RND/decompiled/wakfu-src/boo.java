/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TByteShortHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TByteShortHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.TShortObjectProcedure;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

class boo
implements aeh_2 {
    static final Logger iOP = Logger.getLogger(boo.class);
    public static final String iOQ = "name";
    public static final String iOR = "isActivated";
    private final String[] iOS = new String[]{"name", "isActivated"};
    final short iOT;
    private final String iOU;
    private final TShortObjectHashMap<bos> iOV;
    final TByteShortHashMap iOW = new TByteShortHashMap();

    boo(short s, String string, TShortObjectHashMap<bos> tShortObjectHashMap) {
        this.iOT = s;
        this.iOU = string;
        this.iOV = tShortObjectHashMap;
        this.iOV.forEachEntry((TShortObjectProcedure)new bop(this));
    }

    @Override
    public String[] bxk() {
        return this.iOS;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iOQ)) {
            return aum_0.cWf().c("tooltipTutorial." + this.iOU, new Object[0]);
        }
        if (string.equals(iOR)) {
            return this.aOY();
        }
        return null;
    }

    public short aIi() {
        return this.iOT;
    }

    public String getName() {
        return this.iOU;
    }

    public boolean aOY() {
        TShortObjectIterator tShortObjectIterator = this.iOV.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (!((bos)tShortObjectIterator.value()).aOY()) continue;
            return true;
        }
        return false;
    }

    public void az(boolean bl) {
        bon bon2 = bon.dAK();
        this.iOV.forEachValue((TObjectProcedure)new boq(this, bl, bon2));
    }

    TShortObjectIterator<bos> dAP() {
        return this.iOV.iterator();
    }

    public bos bH(short s) {
        return (bos)this.iOV.get(s);
    }

    public bos by(byte by) {
        return (bos)this.iOV.get(this.iOW.get(by));
    }

    public String toString() {
        return "Tutorial{m_id=" + this.iOT + ", m_name='" + this.iOU + "', m_partsCount=" + this.iOV.size() + "}";
    }
}

