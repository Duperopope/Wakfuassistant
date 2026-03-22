/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/*
 * Renamed from FZ
 */
public class fz_0 {
    @SerializedName(value="@index")
    private String aCz;
    @SerializedName(value="@timestamp")
    private String aCA;
    @SerializedName(value="platform")
    private String aCB;
    @SerializedName(value="service")
    private String aCC;
    @SerializedName(value="data")
    private Gb aCD;

    public void cd(String string) {
        this.aCz = string;
    }

    public void b(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.aCA = simpleDateFormat.format(date);
    }

    public String aLE() {
        return this.aCA;
    }

    public String aLF() {
        return this.aCB;
    }

    public void ce(String string) {
        this.aCB = string;
    }

    public void cf(String string) {
        this.aCC = string;
    }

    public Gb aLG() {
        return this.aCD;
    }

    public void a(Gb gb) {
        this.aCD = gb;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fz_0)) {
            return false;
        }
        fz_0 fz_02 = (fz_0)object;
        return Objects.equals(this.aCA, fz_02.aCA) && Objects.equals(this.aCB, fz_02.aCB) && Objects.equals(this.aCC, fz_02.aCC);
    }

    public int hashCode() {
        return Objects.hash(this.aCA, this.aCB, this.aCC);
    }
}

