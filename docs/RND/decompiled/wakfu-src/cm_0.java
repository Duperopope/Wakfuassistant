/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.JAXBContext
 *  jakarta.xml.bind.JAXBException
 *  jakarta.xml.bind.Unmarshaller
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlRootElement
 */
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.File;

/*
 * Renamed from CM
 */
@XmlRootElement
@XmlAccessorType(value=XmlAccessType.FIELD)
public class cm_0 {
    @XmlElement(name="metadatas")
    public final cc_0 axu = new cc_0();
    @XmlElement(name="export")
    public final cw_0 axv = new cw_0();
    @XmlElement(name="extensions")
    public final cz_0 axw = new cz_0();

    public static cm_0 b(File file) {
        try {
            if (!file.exists()) {
                return new cm_0();
            }
            JAXBContext jAXBContext = JAXBContext.newInstance((Class[])new Class[]{cm_0.class});
            Unmarshaller unmarshaller = jAXBContext.createUnmarshaller();
            return (cm_0)unmarshaller.unmarshal(file);
        }
        catch (JAXBException jAXBException) {
            throw new IllegalStateException("Unable to load " + String.valueOf(file), jAXBException);
        }
    }
}

