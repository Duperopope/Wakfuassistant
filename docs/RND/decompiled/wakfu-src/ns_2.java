/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from nS
 */
public final class ns_2
extends GeneratedMessageV3
implements nw_2 {
    private static final long Pw = 0L;
    public static final int Px = 1;
    MapField<String, String> Py;
    private byte Y = (byte)-1;
    private static final ns_2 Pz = new ns_2();
    @Deprecated
    public static final Parser<ns_2> PA = new nt_2();

    ns_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ns_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ns_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ns_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.Py = MapField.newMapField(nv_2.PB);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(nv_2.PB.getParserForType(), extensionRegistryLite);
                        this.Py.getMutableMap().put((String)mapEntry.getKey(), (String)mapEntry.getValue());
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor asZ() {
        return nj_2.Pg;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.ata();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Ph.ensureFieldAccessorsInitialized(ns_2.class, nu_2.class);
    }

    MapField<String, String> ata() {
        if (this.Py == null) {
            return MapField.emptyMapField(nv_2.PB);
        }
        return this.Py;
    }

    @Override
    public int atb() {
        return this.ata().getMap().size();
    }

    @Override
    public boolean ai(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        return this.ata().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> atc() {
        return this.atd();
    }

    @Override
    public Map<String, String> atd() {
        return this.ata().getMap();
    }

    @Override
    public String c(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.ata().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String aj(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.ata().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeStringMapTo((CodedOutputStream)codedOutputStream, this.ata(), nv_2.PB, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.ata().getMap().entrySet()) {
            MapEntry mapEntry = nv_2.PB.newBuilderForType().setKey((Object)((String)entry.getKey())).setValue((Object)((String)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ns_2)) {
            return super.equals(object);
        }
        ns_2 ns_22 = (ns_2)object;
        if (!this.ata().equals(ns_22.ata())) {
            return false;
        }
        return this.unknownFields.equals((Object)ns_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ns_2.asZ().hashCode();
        if (!this.ata().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.ata().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ns_2 cp(ByteBuffer byteBuffer) {
        return (ns_2)PA.parseFrom(byteBuffer);
    }

    public static ns_2 cl(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)PA.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ns_2 dM(ByteString byteString) {
        return (ns_2)PA.parseFrom(byteString);
    }

    public static ns_2 cl(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)PA.parseFrom(byteString, extensionRegistryLite);
    }

    public static ns_2 cn(byte[] byArray) {
        return (ns_2)PA.parseFrom(byArray);
    }

    public static ns_2 cl(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)PA.parseFrom(byArray, extensionRegistryLite);
    }

    public static ns_2 fw(InputStream inputStream) {
        return (ns_2)GeneratedMessageV3.parseWithIOException(PA, (InputStream)inputStream);
    }

    public static ns_2 fw(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)GeneratedMessageV3.parseWithIOException(PA, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ns_2 fx(InputStream inputStream) {
        return (ns_2)GeneratedMessageV3.parseDelimitedWithIOException(PA, (InputStream)inputStream);
    }

    public static ns_2 fx(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)GeneratedMessageV3.parseDelimitedWithIOException(PA, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ns_2 cl(CodedInputStream codedInputStream) {
        return (ns_2)GeneratedMessageV3.parseWithIOException(PA, (CodedInputStream)codedInputStream);
    }

    public static ns_2 iH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ns_2)GeneratedMessageV3.parseWithIOException(PA, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nu_2 ate() {
        return ns_2.atf();
    }

    public static nu_2 atf() {
        return Pz.atg();
    }

    public static nu_2 a(ns_2 ns_22) {
        return Pz.atg().c(ns_22);
    }

    public nu_2 atg() {
        return this == Pz ? new nu_2() : new nu_2().c(this);
    }

    protected nu_2 cl(GeneratedMessageV3.BuilderParent builderParent) {
        nu_2 nu_22 = new nu_2(builderParent);
        return nu_22;
    }

    public static ns_2 ath() {
        return Pz;
    }

    public static Parser<ns_2> z() {
        return PA;
    }

    public Parser<ns_2> getParserForType() {
        return PA;
    }

    public ns_2 ati() {
        return Pz;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cl(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.atg();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ate();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.atg();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ate();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ati();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ati();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ns_2 ns_22) {
        return ns_22.unknownFields;
    }
}

