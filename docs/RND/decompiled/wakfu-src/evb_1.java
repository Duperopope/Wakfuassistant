/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evb
 */
public class evb_1 {
    @LN(aTd="subscriptions")
    private List<evc_2> oso = new ArrayList<evc_2>();

    public List<evc_2> fdu() {
        return this.oso;
    }

    public void j(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.oso.size());
        for (int i = 0; i < this.oso.size(); ++i) {
            evc_2 evc_22 = this.oso.get(i);
            dataOutputStream.writeInt(evc_22.arF());
            dataOutputStream.writeLong(evc_22.fdJ().getTime());
            dataOutputStream.writeLong(evc_22.fdK().getTime());
        }
    }

    public void g(DataInputStream dataInputStream) {
        this.oso = new ArrayList<evc_2>();
        int n = dataInputStream.readInt();
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readInt();
            Timestamp timestamp = new Timestamp(dataInputStream.readLong());
            Timestamp timestamp2 = new Timestamp(dataInputStream.readLong());
            evc_2 evc_22 = new evc_2(n2, timestamp, timestamp2);
            this.oso.add(evc_22);
        }
    }

    public String toString() {
        return "SubscriptionInformation{m_subscriptions=" + this.oso.size() + "}";
    }
}

