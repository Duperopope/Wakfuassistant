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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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

public final class hU
extends GeneratedMessageV3
implements hY {
    private static final long wc = 0L;
    int an;
    public static final int wd = 1;
    MapField<Integer, hZ> mv;
    public static final int we = 2;
    long wf;
    private byte Y = (byte)-1;
    private static final hU wg = new hU();
    @Deprecated
    public static final Parser<hU> wh = new hV();

    hU(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hU() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hU();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hU(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.mv = MapField.newMapField(hX.wi);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(hX.wi.getParserForType(), extensionRegistryLite);
                        this.mv.getMutableMap().put((Integer)mapEntry.getKey(), (hZ)mapEntry.getValue());
                        continue block12;
                    }
                    case 16: {
                        this.an |= 1;
                        this.wf = codedInputStream.readInt64();
                        continue block12;
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

    public static final Descriptors.Descriptor KS() {
        return hL.vK;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.ut();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vL.ensureFieldAccessorsInitialized(hU.class, hW.class);
    }

    MapField<Integer, hZ> ut() {
        if (this.mv == null) {
            return MapField.emptyMapField(hX.wi);
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
    public Map<Integer, hZ> uv() {
        return this.uw();
    }

    @Override
    public Map<Integer, hZ> uw() {
        return this.ut().getMap();
    }

    @Override
    public hZ a(int n, hZ hZ2) {
        Map map = this.ut().getMap();
        return map.containsKey(n) ? (hZ)map.get(n) : hZ2;
    }

    @Override
    public hZ eb(int n) {
        Map map = this.ut().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hZ)map.get(n);
    }

    @Override
    public boolean KT() {
        return (this.an & 1) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (hZ hZ2 : this.uw().values()) {
            if (hZ2.isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.ut(), hX.wi, (int)1);
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(2, this.wf);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.ut().getMap().entrySet()) {
            MapEntry mapEntry = hX.wi.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((hZ)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.wf);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hU)) {
            return super.equals(object);
        }
        hU hU2 = (hU)object;
        if (!this.ut().equals(hU2.ut())) {
            return false;
        }
        if (this.KT() != hU2.KT()) {
            return false;
        }
        if (this.KT() && this.KU() != hU2.KU()) {
            return false;
        }
        return this.unknownFields.equals((Object)hU2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hU.KS().hashCode();
        if (!this.ut().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.ut().hashCode();
        }
        if (this.KT()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.KU());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hU aY(ByteBuffer byteBuffer) {
        return (hU)wh.parseFrom(byteBuffer);
    }

    public static hU aU(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)wh.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hU bP(ByteString byteString) {
        return (hU)wh.parseFrom(byteString);
    }

    public static hU aU(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)wh.parseFrom(byteString, extensionRegistryLite);
    }

    public static hU aV(byte[] byArray) {
        return (hU)wh.parseFrom(byArray);
    }

    public static hU aU(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)wh.parseFrom(byArray, extensionRegistryLite);
    }

    public static hU cO(InputStream inputStream) {
        return (hU)GeneratedMessageV3.parseWithIOException(wh, (InputStream)inputStream);
    }

    public static hU cO(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)GeneratedMessageV3.parseWithIOException(wh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hU cP(InputStream inputStream) {
        return (hU)GeneratedMessageV3.parseDelimitedWithIOException(wh, (InputStream)inputStream);
    }

    public static hU cP(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)GeneratedMessageV3.parseDelimitedWithIOException(wh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hU aU(CodedInputStream codedInputStream) {
        return (hU)GeneratedMessageV3.parseWithIOException(wh, (CodedInputStream)codedInputStream);
    }

    public static hU eI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hU)GeneratedMessageV3.parseWithIOException(wh, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hW KV() {
        return hU.KW();
    }

    public static hW KW() {
        return wg.KX();
    }

    public static hW b(hU hU2) {
        return wg.KX().d(hU2);
    }

    public hW KX() {
        return this == wg ? new hW() : new hW().d(this);
    }

    protected hW aU(GeneratedMessageV3.BuilderParent builderParent) {
        hW hW2 = new hW(builderParent);
        return hW2;
    }

    public static hU KY() {
        return wg;
    }

    public static Parser<hU> z() {
        return wh;
    }

    public Parser<hU> getParserForType() {
        return wh;
    }

    public hU KZ() {
        return wg;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aU(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.KX();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.KV();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.KX();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.KV();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.KZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.KZ();
    }

    static /* synthetic */ boolean pT() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(hU hU2) {
        return hU2.unknownFields;
    }
}

