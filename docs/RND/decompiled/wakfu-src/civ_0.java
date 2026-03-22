/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.util.Optional;

/*
 * Renamed from civ
 */
class civ_0 {
    private final long lUM;
    private final long lUN;
    private final vb_0 lUO;
    private final Optional<evk_2> lUP;
    private final ns_2 lUQ;
    private final String lUR;

    civ_0(long l, long l2, vb_0 vb_02, Optional<evk_2> optional, ns_2 ns_22, String string) {
        this.lUM = l;
        this.lUN = l2;
        this.lUO = vb_02;
        this.lUP = optional;
        this.lUQ = ns_22;
        this.lUR = string;
    }

    public long xl() {
        return this.lUM;
    }

    public long cWj() {
        return this.lUN;
    }

    public vb_0 cWk() {
        return this.lUO;
    }

    public Optional<evk_2> evl() {
        return this.lUP;
    }

    public ns_2 cWn() {
        return this.lUQ;
    }

    public String etm() {
        return this.lUR;
    }

    public static civ_0 f(DataInputStream dataInputStream) {
        Optional<evk_2> optional;
        Object object;
        long l = dataInputStream.readLong();
        long l2 = dataInputStream.readLong();
        vb_0 vb_02 = vb_0.pS(dataInputStream.readInt());
        String string = dataInputStream.readUTF();
        if (dataInputStream.readBoolean()) {
            object = new byte[dataInputStream.readInt()];
            dataInputStream.readFully((byte[])object);
            optional = Optional.of(evq_2.eq(object));
        } else {
            optional = Optional.empty();
        }
        object = ns_2.fw(dataInputStream);
        return new civ_0(l, l2, vb_02, optional, (ns_2)object, string);
    }

    public String toString() {
        return "AccountInformation{m_community=" + String.valueOf((Object)this.lUO) + ", m_adminInformation=" + String.valueOf(this.lUP) + "}";
    }
}

