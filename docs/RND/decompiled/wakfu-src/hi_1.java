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
 * Renamed from hi
 */
public final class hi_1
extends GeneratedMessageV3
implements hq_1 {
    private static final long ue = 0L;
    public static final int uf = 1;
    MapField<Long, hm_1> ug;
    private byte Y = (byte)-1;
    private static final hi_1 uh = new hi_1();
    @Deprecated
    public static final Parser<hi_1> ui = new hj_1();

    hi_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hi_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hi_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hi_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.ug = MapField.newMapField(hl_1.uj);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(hl_1.uj.getParserForType(), extensionRegistryLite);
                        this.ug.getMutableMap().put((Long)mapEntry.getKey(), (hm_1)mapEntry.getValue());
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

    public static final Descriptors.Descriptor Ht() {
        return hh_1.tU;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Hu();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hh_1.tV.ensureFieldAccessorsInitialized(hi_1.class, hk_1.class);
    }

    MapField<Long, hm_1> Hu() {
        if (this.ug == null) {
            return MapField.emptyMapField(hl_1.uj);
        }
        return this.ug;
    }

    @Override
    public int Hv() {
        return this.Hu().getMap().size();
    }

    @Override
    public boolean V(long l) {
        return this.Hu().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, hm_1> Hw() {
        return this.Hx();
    }

    @Override
    public Map<Long, hm_1> Hx() {
        return this.Hu().getMap();
    }

    @Override
    public hm_1 a(long l, hm_1 hm_12) {
        Map map = this.Hu().getMap();
        return map.containsKey(l) ? (hm_1)map.get(l) : hm_12;
    }

    @Override
    public hm_1 W(long l) {
        Map map = this.Hu().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (hm_1)map.get(l);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (hm_1 hm_12 : this.Hx().values()) {
            if (hm_12.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeLongMapTo((CodedOutputStream)codedOutputStream, this.Hu(), hl_1.uj, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.Hu().getMap().entrySet()) {
            MapEntry mapEntry = hl_1.uj.newBuilderForType().setKey((Object)((Long)entry.getKey())).setValue((Object)((hm_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hi_1)) {
            return super.equals(object);
        }
        hi_1 hi_12 = (hi_1)object;
        if (!this.Hu().equals(hi_12.Hu())) {
            return false;
        }
        return this.unknownFields.equals((Object)hi_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hi_1.Ht().hashCode();
        if (!this.Hu().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.Hu().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hi_1 aQ(ByteBuffer byteBuffer) {
        return (hi_1)ui.parseFrom(byteBuffer);
    }

    public static hi_1 aM(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)ui.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hi_1 bF(ByteString byteString) {
        return (hi_1)ui.parseFrom(byteString);
    }

    public static hi_1 aM(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)ui.parseFrom(byteString, extensionRegistryLite);
    }

    public static hi_1 aN(byte[] byArray) {
        return (hi_1)ui.parseFrom(byArray);
    }

    public static hi_1 aM(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)ui.parseFrom(byArray, extensionRegistryLite);
    }

    public static hi_1 cy(InputStream inputStream) {
        return (hi_1)GeneratedMessageV3.parseWithIOException(ui, (InputStream)inputStream);
    }

    public static hi_1 cy(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)GeneratedMessageV3.parseWithIOException(ui, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hi_1 cz(InputStream inputStream) {
        return (hi_1)GeneratedMessageV3.parseDelimitedWithIOException(ui, (InputStream)inputStream);
    }

    public static hi_1 cz(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)GeneratedMessageV3.parseDelimitedWithIOException(ui, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hi_1 aM(CodedInputStream codedInputStream) {
        return (hi_1)GeneratedMessageV3.parseWithIOException(ui, (CodedInputStream)codedInputStream);
    }

    public static hi_1 ek(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hi_1)GeneratedMessageV3.parseWithIOException(ui, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hk_1 Hy() {
        return hi_1.Hz();
    }

    public static hk_1 Hz() {
        return uh.HA();
    }

    public static hk_1 a(hi_1 hi_12) {
        return uh.HA().c(hi_12);
    }

    public hk_1 HA() {
        return this == uh ? new hk_1() : new hk_1().c(this);
    }

    protected hk_1 aM(GeneratedMessageV3.BuilderParent builderParent) {
        hk_1 hk_12 = new hk_1(builderParent);
        return hk_12;
    }

    public static hi_1 HB() {
        return uh;
    }

    public static Parser<hi_1> z() {
        return ui;
    }

    public Parser<hi_1> getParserForType() {
        return ui;
    }

    public hi_1 HC() {
        return uh;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aM(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.HA();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Hy();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.HA();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Hy();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.HC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.HC();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hi_1 hi_12) {
        return hi_12.unknownFields;
    }
}

