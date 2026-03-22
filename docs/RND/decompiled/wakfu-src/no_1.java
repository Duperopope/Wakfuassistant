/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from no
 */
public final class no_1 {
    public static final int Np = 5;
    private final nn_1 Nq;

    private no_1(nn_1 nn_12) {
        this.Nq = nn_12;
    }

    public static no_1 a(nn_1 nn_12) {
        return new no_1(nn_12);
    }

    public byte[] apI() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(5);
            this.e(dataOutputStream);
            this.d(dataOutputStream);
            this.c(dataOutputStream);
            this.b(dataOutputStream);
            this.a(dataOutputStream);
            dataOutputStream.close();
        }
        catch (IOException iOException) {
            throw new nm_1(iOException);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void a(DataOutputStream dataOutputStream) {
        LinkedList<Integer> linkedList = this.Nq.apB();
        dataOutputStream.writeByte(linkedList.size());
        for (Integer n : linkedList) {
            dataOutputStream.writeInt(n);
        }
    }

    private void b(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.Nq.apE());
        this.Nq.a((Integer n) -> {
            try {
                dataOutputStream.writeInt((int)n);
            }
            catch (IOException iOException) {
                throw new nm_1(iOException);
            }
        });
    }

    private void c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.Nq.apD());
        this.Nq.a((Integer n, ne_2 ne_22) -> {
            try {
                dataOutputStream.writeInt(ne_22.d());
                dataOutputStream.writeBoolean(ne_22.apo());
                dataOutputStream.writeBoolean(ne_22.app());
                dataOutputStream.writeBoolean(ne_22.apt());
                dataOutputStream.writeBoolean(ne_22.aps());
                if (ne_22.apt()) {
                    dataOutputStream.writeLong(ne_22.apq());
                }
                if (ne_22.aps()) {
                    dataOutputStream.writeLong(ne_22.apr());
                }
                dataOutputStream.writeBoolean(ne_22.apv());
            }
            catch (IOException iOException) {
                throw new nm_1(iOException);
            }
        });
    }

    private void d(DataOutputStream dataOutputStream) {
        Map<Integer, Long> map = this.Nq.apA();
        dataOutputStream.writeInt(map.size());
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            dataOutputStream.writeInt(entry.getKey());
            dataOutputStream.writeLong(entry.getValue());
        }
    }

    private void e(DataOutputStream dataOutputStream) {
        List<ni_2> list = this.Nq.apz();
        dataOutputStream.writeByte(list.size());
        for (ni_2 ni_22 : list) {
            dataOutputStream.writeInt(ni_22.apw());
            dataOutputStream.writeLong(ni_22.apx());
        }
    }

    public void cg(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            int n = dataInputStream.readInt();
            this.c(dataInputStream);
            this.b(dataInputStream);
            this.b(dataInputStream, n);
            this.a(dataInputStream, n);
            this.a(dataInputStream);
            dataInputStream.close();
        }
        catch (IOException iOException) {
            throw new nm_1(iOException);
        }
    }

    private void a(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readInt();
            this.Nq.iS(n2);
        }
    }

    private void a(DataInputStream dataInputStream, int n) {
        int n2 = dataInputStream.readInt();
        for (int i = 0; i < n2; ++i) {
            boolean bl;
            int n3 = dataInputStream.readInt();
            if (n < 3) {
                dataInputStream.readInt();
                bl = dataInputStream.readBoolean();
            } else {
                bl = true;
            }
            if (!bl) continue;
            this.Nq.iY(n3);
        }
    }

    private void b(DataInputStream dataInputStream, int n) {
        int n2 = dataInputStream.readInt();
        for (int i = 0; i < n2; ++i) {
            int n3 = dataInputStream.readInt();
            boolean bl = dataInputStream.readBoolean();
            boolean bl2 = dataInputStream.readBoolean();
            boolean bl3 = true;
            boolean bl4 = true;
            if (n >= 4) {
                bl3 = dataInputStream.readBoolean();
                bl4 = dataInputStream.readBoolean();
            }
            Long l = null;
            if (n >= 1 && n < 4 || n >= 4 && bl3) {
                l = dataInputStream.readLong();
            }
            Long l2 = null;
            if (n >= 2 && n < 4 || n >= 4 && bl4) {
                l2 = dataInputStream.readLong();
            }
            boolean bl5 = n >= 5 ? dataInputStream.readBoolean() : l2 != null && l2 > 0L;
            this.Nq.b(new ne_2(n3, bl, bl2, l, l2, bl5));
        }
    }

    private void b(DataInputStream dataInputStream) {
        int n = dataInputStream.readInt();
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readInt();
            long l = dataInputStream.readLong();
            this.Nq.c(n2, l);
        }
    }

    private void c(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        for (int i = 0; i < n; ++i) {
            int n2 = dataInputStream.readInt();
            long l = dataInputStream.readLong();
            this.Nq.b(new ni_2(n2, l));
        }
    }

    public String toString() {
        return "ServerAchievementSerializer{m_data=" + String.valueOf(this.Nq) + "}";
    }
}

