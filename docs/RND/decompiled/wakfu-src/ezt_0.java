/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ezT
 */
public class ezt_0 {
    @SerializedName(value="id")
    private int o;
    @SerializedName(value="groupId")
    @Nullable
    private Integer puU = null;
    @SerializedName(value="name")
    private String p;
    @SerializedName(value="translations")
    private Map<Mv, String> gyx;
    @SerializedName(value="community")
    private vb_0 gyX;
    @SerializedName(value="recommendedFor")
    @Nullable
    private vb_0 puV;
    @SerializedName(value="servers")
    private ezw_0 puW;
    @SerializedName(value="single_account")
    private boolean puX;
    @SerializedName(value="population")
    private vg_0 puY = vg_0.bJu;
    @SerializedName(value="server_type")
    private ezx_0 lop = ezx_0.pve;
    @SerializedName(value="illustration_id")
    private int puZ;
    private byte asH;

    public int d() {
        return this.o;
    }

    public Optional<Integer> fng() {
        return Optional.ofNullable(this.puU);
    }

    public String getName() {
        return this.p;
    }

    public Optional<String> A(Mv mv) {
        if (this.gyx == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(this.gyx.get((Object)mv));
    }

    public vb_0 cWk() {
        return this.gyX;
    }

    @Nullable
    public vb_0 fnh() {
        return this.puV;
    }

    public int aYs() {
        return this.asH;
    }

    public ezw_0 fni() {
        return this.puW;
    }

    public boolean fnj() {
        return this.puX;
    }

    public vg_0 fnk() {
        return this.puY;
    }

    public ezx_0 enC() {
        return this.lop;
    }

    public int eog() {
        return this.puZ;
    }

    public void c(byte by) {
        this.asH = by;
    }

    public byte[] fnl() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.o);
        if (this.puU == null) {
            azg_12.dz(false);
        } else {
            azg_12.dz(true);
            azg_12.vC(this.puU);
        }
        azg_12.gW(this.p);
        if (this.gyx != null) {
            azg_12.aF((byte)this.gyx.size());
            this.gyx.forEach((mv, string) -> {
                azg_12.aF(mv.aJr());
                azg_12.gW((String)string);
            });
        } else {
            azg_12.aF((byte)0);
        }
        azg_12.vC(this.gyX.d());
        if (this.puV == null) {
            azg_12.dz(false);
        } else {
            azg_12.dz(true);
            azg_12.vC(this.puV.d());
        }
        ezt_0.a(azg_12, this.puW.fnp());
        azg_12.dz(this.puX);
        azg_12.vC(this.puY.d());
        azg_12.aF(this.lop.aJr());
        azg_12.vC(this.puZ);
        azg_12.aF(this.asH);
        return azg_12.bTe();
    }

    private static void a(azg_1 azg_12, ezv_0 ezv_02) {
        byte[] byArray = BH.aP(ezv_02.fnn());
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        int[] nArray = ezv_02.fno();
        azg_12.vC(nArray.length);
        for (int n : nArray) {
            azg_12.vC(n);
        }
    }

    public static ezt_0 fn(ByteBuffer byteBuffer) {
        String string;
        int n = byteBuffer.getInt();
        boolean bl = byteBuffer.get() == 1;
        Integer n2 = bl ? Integer.valueOf(byteBuffer.getInt()) : null;
        String string2 = BH.eE(byteBuffer);
        byte by = byteBuffer.get();
        EnumMap<Mv, String> enumMap = new EnumMap<Mv, String>(Mv.class);
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            Mv mv = Mv.y(byteBuffer.get());
            string = BH.eE(byteBuffer);
            enumMap.put(mv, string);
        }
        vb_0 vb_02 = vb_0.pS(byteBuffer.getInt());
        boolean bl2 = byteBuffer.get() == 1;
        string = bl2 ? vb_0.pS(byteBuffer.getInt()) : null;
        ezv_0 ezv_02 = ezt_0.fo(byteBuffer);
        boolean bl3 = byteBuffer.get() > 0;
        vg_0 vg_02 = vg_0.pW(byteBuffer.getInt());
        ezx_0 ezx_02 = ezx_0.eL(byteBuffer.get()).orElse(ezx_0.pve);
        int n3 = byteBuffer.getInt();
        byte by3 = byteBuffer.get();
        ezt_0 ezt_02 = new ezt_0();
        ezt_02.o = n;
        ezt_02.puU = n2;
        ezt_02.p = string2;
        ezt_02.gyx = enumMap;
        ezt_02.gyX = vb_02;
        ezt_02.puV = string;
        ezt_02.puW = new ezw_0();
        ezt_02.puW.a(ezv_02);
        ezt_02.puX = bl3;
        ezt_02.puY = vg_02;
        ezt_02.lop = ezx_02;
        ezt_02.puZ = n3;
        ezt_02.asH = by3;
        return ezt_02;
    }

    @NotNull
    private static ezv_0 fo(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = BH.dc(byArray);
        int[] nArray = new int[byteBuffer.getInt()];
        int n = nArray.length;
        for (int i = 0; i < n; ++i) {
            nArray[i] = byteBuffer.getInt();
        }
        ezv_0 ezv_02 = new ezv_0();
        ezv_02.rR(string);
        ezv_02.L(nArray);
        return ezv_02;
    }

    public String toString() {
        return "Proxy{m_id=" + this.o + ", m_groupId=" + this.puU + ", m_name='" + this.p + "', m_translations=" + String.valueOf(this.gyx) + ", m_community=" + String.valueOf((Object)this.gyX) + ", m_recommendedForCommunity=" + String.valueOf((Object)this.puV) + ", m_proxyAddresses=" + String.valueOf(this.puW) + ", m_order=" + this.asH + ", m_isSingleAccount= " + this.puX + ", m_populationLevel= " + String.valueOf((Object)this.puY) + ", m_type=" + String.valueOf((Object)this.lop) + "}";
    }
}

