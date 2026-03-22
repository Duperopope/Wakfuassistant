/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 */
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import lombok.Generated;

public class Gl {
    @SerializedName(value="creation_date")
    private final String aDF = DateTimeFormatter.ISO_DATE_TIME.format(OffsetDateTime.now());
    @SerializedName(value="event_type")
    private final String aDG;
    @SerializedName(value="source_id")
    private final String aDH;

    public Gl(String string, String string2) {
        this.aDG = string;
        this.aDH = string2;
    }

    @Generated
    public String aMB() {
        return this.aDF;
    }

    @Generated
    public String aMC() {
        return this.aDG;
    }

    @Generated
    public String aMD() {
        return this.aDH;
    }
}

