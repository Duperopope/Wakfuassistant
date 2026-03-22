/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ga {
    @SerializedName(value="@index")
    private String aCz;
    @SerializedName(value="@timestamp")
    private String aCA;
    @SerializedName(value="host")
    private String aCE;
    @SerializedName(value="platform")
    private String aCB;
    @SerializedName(value="service")
    private String aCC;
    @SerializedName(value="thread")
    private String aCF;
    @SerializedName(value="level")
    private String aCG;
    @SerializedName(value="file")
    private String aCH;
    @SerializedName(value="class")
    private String aCI;
    @SerializedName(value="method")
    private String aCJ;
    @SerializedName(value="line")
    private String aCK;
    @SerializedName(value="message")
    private String aCL;
    @SerializedName(value="throwable")
    private String aCM;

    public String aLH() {
        return this.aCz;
    }

    public void cd(String string) {
        this.aCz = string;
    }

    public String aLE() {
        return this.aCA;
    }

    public void b(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        this.aCA = simpleDateFormat.format(date);
    }

    public void cg(String string) {
        this.aCA = string;
    }

    public String aLI() {
        return this.aCE;
    }

    public void ch(String string) {
        this.aCE = string;
    }

    public String aLF() {
        return this.aCB;
    }

    public void ce(String string) {
        this.aCB = string;
    }

    public String aLJ() {
        return this.aCC;
    }

    public void cf(String string) {
        this.aCC = string;
    }

    public String aLK() {
        return this.aCF;
    }

    public void ci(String string) {
        this.aCF = string;
    }

    public String aLL() {
        return this.aCG;
    }

    public void cj(String string) {
        this.aCG = string;
    }

    public String aLM() {
        return this.aCH;
    }

    public void ck(String string) {
        this.aCH = string;
    }

    public String aLN() {
        return this.aCI;
    }

    public void cl(String string) {
        this.aCI = string;
    }

    public String aLO() {
        return this.aCJ;
    }

    public void cm(String string) {
        this.aCJ = string;
    }

    public String aLP() {
        return this.aCK;
    }

    public void cn(String string) {
        this.aCK = string;
    }

    public String getMessage() {
        return this.aCL;
    }

    public void co(String string) {
        this.aCL = string;
    }

    public String aLQ() {
        return this.aCM;
    }

    public void cp(String string) {
        this.aCM = string;
    }
}

