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
 * Renamed from ee
 */
public final class ee_0
extends GeneratedMessageV3
implements ei_0 {
    private static final long mt = 0L;
    public static final int mu = 2;
    MapField<Integer, ea> mv;
    private byte Y = (byte)-1;
    private static final ee_0 mw = new ee_0();
    @Deprecated
    public static final Parser<ee_0> mx = new ef_0();

    ee_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ee_0() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ee_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ee_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 18: {
                        if (!(bl & true)) {
                            this.mv = MapField.newMapField(eh_0.my);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(eh_0.my.getParserForType(), extensionRegistryLite);
                        this.mv.getMutableMap().put((Integer)mapEntry.getKey(), (ea)mapEntry.getValue());
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

    public static final Descriptors.Descriptor us() {
        return dV.lX;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.ut();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.lY.ensureFieldAccessorsInitialized(ee_0.class, eg_0.class);
    }

    MapField<Integer, ea> ut() {
        if (this.mv == null) {
            return MapField.emptyMapField(eh_0.my);
        }
        return this.mv;
    }

    @Override
    public int uu() {
        return this.ut().getMap().size();
    }

    @Override
    public boolean bn(int n) {
        return this.ut().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, ea> uv() {
        return this.uw();
    }

    @Override
    public Map<Integer, ea> uw() {
        return this.ut().getMap();
    }

    @Override
    public ea a(int n, ea ea2) {
        Map map = this.ut().getMap();
        return map.containsKey(n) ? (ea)map.get(n) : ea2;
    }

    @Override
    public ea bo(int n) {
        Map map = this.ut().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ea)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (ea ea2 : this.uw().values()) {
            if (ea2.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.ut(), eh_0.my, (int)2);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.ut().getMap().entrySet()) {
            MapEntry mapEntry = eh_0.my.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((ea)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ee_0)) {
            return super.equals(object);
        }
        ee_0 ee_02 = (ee_0)object;
        if (!this.ut().equals(ee_02.ut())) {
            return false;
        }
        return this.unknownFields.equals((Object)ee_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ee_0.us().hashCode();
        if (!this.ut().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.ut().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ee_0 ag(ByteBuffer byteBuffer) {
        return (ee_0)mx.parseFrom(byteBuffer);
    }

    public static ee_0 ag(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)mx.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ee_0 aO(ByteString byteString) {
        return (ee_0)mx.parseFrom(byteString);
    }

    public static ee_0 ag(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)mx.parseFrom(byteString, extensionRegistryLite);
    }

    public static ee_0 ag(byte[] byArray) {
        return (ee_0)mx.parseFrom(byArray);
    }

    public static ee_0 ag(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)mx.parseFrom(byArray, extensionRegistryLite);
    }

    public static ee_0 bm(InputStream inputStream) {
        return (ee_0)GeneratedMessageV3.parseWithIOException(mx, (InputStream)inputStream);
    }

    public static ee_0 bm(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)GeneratedMessageV3.parseWithIOException(mx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ee_0 bn(InputStream inputStream) {
        return (ee_0)GeneratedMessageV3.parseDelimitedWithIOException(mx, (InputStream)inputStream);
    }

    public static ee_0 bn(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)GeneratedMessageV3.parseDelimitedWithIOException(mx, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ee_0 ag(CodedInputStream codedInputStream) {
        return (ee_0)GeneratedMessageV3.parseWithIOException(mx, (CodedInputStream)codedInputStream);
    }

    public static ee_0 cs(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ee_0)GeneratedMessageV3.parseWithIOException(mx, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eg_0 ux() {
        return ee_0.uy();
    }

    public static eg_0 uy() {
        return mw.uz();
    }

    public static eg_0 a(ee_0 ee_02) {
        return mw.uz().c(ee_02);
    }

    public eg_0 uz() {
        return this == mw ? new eg_0() : new eg_0().c(this);
    }

    protected eg_0 ag(GeneratedMessageV3.BuilderParent builderParent) {
        eg_0 eg_02 = new eg_0(builderParent);
        return eg_02;
    }

    public static ee_0 uA() {
        return mw;
    }

    public static Parser<ee_0> z() {
        return mx;
    }

    public Parser<ee_0> getParserForType() {
        return mx;
    }

    public ee_0 uB() {
        return mw;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ag(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.uz();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ux();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.uz();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ux();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.uB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.uB();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ee_0 ee_02) {
        return ee_02.unknownFields;
    }
}

