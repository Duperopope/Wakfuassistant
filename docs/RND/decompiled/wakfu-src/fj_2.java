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
 * Renamed from fJ
 */
public final class fj_2
extends GeneratedMessageV3
implements fn_2 {
    private static final long qN = 0L;
    public static final int qO = 1;
    MapField<Integer, ff_2> qv;
    private byte Y = (byte)-1;
    private static final fj_2 qP = new fj_2();
    @Deprecated
    public static final Parser<fj_2> qQ = new fk_2();

    fj_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fj_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fj_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fj_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.qv = MapField.newMapField(fm_2.qR);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(fm_2.qR.getParserForType(), extensionRegistryLite);
                        this.qv.getMutableMap().put((Integer)mapEntry.getKey(), (ff_2)mapEntry.getValue());
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

    public static final Descriptors.Descriptor Bu() {
        return fl_1.pq;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.Ar();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pr.ensureFieldAccessorsInitialized(fj_2.class, fl_2.class);
    }

    MapField<Integer, ff_2> Ar() {
        if (this.qv == null) {
            return MapField.emptyMapField(fm_2.qR);
        }
        return this.qv;
    }

    @Override
    public int As() {
        return this.Ar().getMap().size();
    }

    @Override
    public boolean cs(int n) {
        return this.Ar().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, ff_2> At() {
        return this.Au();
    }

    @Override
    public Map<Integer, ff_2> Au() {
        return this.Ar().getMap();
    }

    @Override
    public ff_2 a(int n, ff_2 ff_22) {
        Map map = this.Ar().getMap();
        return map.containsKey(n) ? (ff_2)map.get(n) : ff_22;
    }

    @Override
    public ff_2 cA(int n) {
        Map map = this.Ar().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ff_2)map.get(n);
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
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.Ar(), fm_2.qR, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.Ar().getMap().entrySet()) {
            MapEntry mapEntry = fm_2.qR.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((ff_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fj_2)) {
            return super.equals(object);
        }
        fj_2 fj_22 = (fj_2)object;
        if (!this.Ar().equals(fj_22.Ar())) {
            return false;
        }
        return this.unknownFields.equals((Object)fj_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fj_2.Bu().hashCode();
        if (!this.Ar().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.Ar().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fj_2 az(ByteBuffer byteBuffer) {
        return (fj_2)qQ.parseFrom(byteBuffer);
    }

    public static fj_2 ax(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)qQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fj_2 bp(ByteString byteString) {
        return (fj_2)qQ.parseFrom(byteString);
    }

    public static fj_2 ax(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)qQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static fj_2 ay(byte[] byArray) {
        return (fj_2)qQ.parseFrom(byArray);
    }

    public static fj_2 ax(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)qQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static fj_2 bU(InputStream inputStream) {
        return (fj_2)GeneratedMessageV3.parseWithIOException(qQ, (InputStream)inputStream);
    }

    public static fj_2 bU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)GeneratedMessageV3.parseWithIOException(qQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fj_2 bV(InputStream inputStream) {
        return (fj_2)GeneratedMessageV3.parseDelimitedWithIOException(qQ, (InputStream)inputStream);
    }

    public static fj_2 bV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)GeneratedMessageV3.parseDelimitedWithIOException(qQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fj_2 ax(CodedInputStream codedInputStream) {
        return (fj_2)GeneratedMessageV3.parseWithIOException(qQ, (CodedInputStream)codedInputStream);
    }

    public static fj_2 dr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fj_2)GeneratedMessageV3.parseWithIOException(qQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fl_2 Bv() {
        return fj_2.Bw();
    }

    public static fl_2 Bw() {
        return qP.Bx();
    }

    public static fl_2 a(fj_2 fj_22) {
        return qP.Bx().c(fj_22);
    }

    public fl_2 Bx() {
        return this == qP ? new fl_2() : new fl_2().c(this);
    }

    protected fl_2 ax(GeneratedMessageV3.BuilderParent builderParent) {
        fl_2 fl_22 = new fl_2(builderParent);
        return fl_22;
    }

    public static fj_2 By() {
        return qP;
    }

    public static Parser<fj_2> z() {
        return qQ;
    }

    public Parser<fj_2> getParserForType() {
        return qQ;
    }

    public fj_2 Bz() {
        return qP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ax(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Bx();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Bv();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Bx();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Bv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Bz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Bz();
    }

    static /* synthetic */ boolean BA() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fj_2 fj_22) {
        return fj_22.unknownFields;
    }
}

