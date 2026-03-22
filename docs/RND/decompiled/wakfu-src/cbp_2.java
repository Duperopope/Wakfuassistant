/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;

/*
 * Renamed from cbP
 */
public abstract class cbp_2 {
    @SerializedName(value="server_id")
    private final int lKX = ewo_0.oBF.i(ewr_0.oDt);
    @SerializedName(value="character_account_id")
    private long lKY;
    @SerializedName(value="character_id")
    private long aDh;
    @SerializedName(value="date")
    private String aCA;

    protected cbp_2() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.aCA = simpleDateFormat.format(ue_0.bjV().getTime());
    }

    public static cbn_2 b(cbl_2 cbl_22, Object ... objectArray) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        cbp_2 cbp_22 = cbl_22.est();
        cbp_22.S(bgt_02);
        cbp_22.e(objectArray);
        cbn_2 cbn_22 = new cbn_2(cbl_22.d());
        cbn_22.aw(cbp_22);
        cbn_22.mM(aue_0.cVJ().cVO().fdB());
        return cbn_22;
    }

    protected void S(bgt_0 bgt_02) {
        if (bgt_02 != null) {
            this.lKY = bgt_02.Xi();
            this.aDh = bgt_02.Sn();
        } else {
            this.lKY = aue_0.cVJ().cVO().xl();
            this.aDh = -1L;
        }
    }

    protected abstract void e(Object[] var1);
}

