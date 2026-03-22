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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from bZ
 */
public final class bz_2
extends GeneratedMessageV3
implements cc_1 {
    private static final long hC = 0L;
    public static final int hD = 1;
    long fG;
    public static final int hE = 2;
    bw_2 hF;
    private byte Y = (byte)-1;
    private static final bz_2 hG = new bz_2();
    static final Parser<bz_2> hH = new ca_1();

    bz_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bz_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bz_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bz_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        by_1 by_12 = null;
                        if (this.hF != null) {
                            by_12 = this.hF.kO();
                        }
                        this.hF = (bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite);
                        if (by_12 == null) continue block12;
                        by_12.k(this.hF);
                        this.hF = by_12.kV();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
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

    public static final Descriptors.Descriptor la() {
        return ae_1.fk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fl.ensureFieldAccessorsInitialized(bz_2.class, cb_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public boolean lb() {
        return this.hF != null;
    }

    @Override
    public bw_2 lc() {
        return this.hF == null ? bw_2.kP() : this.hF;
    }

    @Override
    public cj_2 ld() {
        return this.lc();
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
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (this.hF != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.lc());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (this.hF != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.lc());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bz_2)) {
            return super.equals(object);
        }
        bz_2 bz_22 = (bz_2)object;
        if (this.fD() != bz_22.fD()) {
            return false;
        }
        if (this.lb() != bz_22.lb()) {
            return false;
        }
        if (this.lb() && !this.lc().equals(bz_22.lc())) {
            return false;
        }
        return this.unknownFields.equals((Object)bz_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bz_2.la().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.lb()) {
            n = 37 * n + 2;
            n = 53 * n + this.lc().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bz_2 I(ByteBuffer byteBuffer) {
        return (bz_2)hH.parseFrom(byteBuffer);
    }

    public static bz_2 I(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)hH.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bz_2 ao(ByteString byteString) {
        return (bz_2)hH.parseFrom(byteString);
    }

    public static bz_2 I(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)hH.parseFrom(byteString, extensionRegistryLite);
    }

    public static bz_2 I(byte[] byArray) {
        return (bz_2)hH.parseFrom(byArray);
    }

    public static bz_2 I(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)hH.parseFrom(byArray, extensionRegistryLite);
    }

    public static bz_2 aq(InputStream inputStream) {
        return (bz_2)GeneratedMessageV3.parseWithIOException(hH, (InputStream)inputStream);
    }

    public static bz_2 aq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)GeneratedMessageV3.parseWithIOException(hH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bz_2 ar(InputStream inputStream) {
        return (bz_2)GeneratedMessageV3.parseDelimitedWithIOException(hH, (InputStream)inputStream);
    }

    public static bz_2 ar(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)GeneratedMessageV3.parseDelimitedWithIOException(hH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bz_2 I(CodedInputStream codedInputStream) {
        return (bz_2)GeneratedMessageV3.parseWithIOException(hH, (CodedInputStream)codedInputStream);
    }

    public static bz_2 aY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bz_2)GeneratedMessageV3.parseWithIOException(hH, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cb_2 le() {
        return bz_2.lf();
    }

    public static cb_2 lf() {
        return hG.lg();
    }

    public static cb_2 a(bz_2 bz_22) {
        return hG.lg().c(bz_22);
    }

    public cb_2 lg() {
        return this == hG ? new cb_2() : new cb_2().c(this);
    }

    protected cb_2 I(GeneratedMessageV3.BuilderParent builderParent) {
        cb_2 cb_22 = new cb_2(builderParent);
        return cb_22;
    }

    public static bz_2 lh() {
        return hG;
    }

    public static Parser<bz_2> z() {
        return hH;
    }

    public Parser<bz_2> getParserForType() {
        return hH;
    }

    public bz_2 li() {
        return hG;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.I(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.lg();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.le();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.lg();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.le();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.li();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.li();
    }

    static /* synthetic */ boolean lj() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bz_2 bz_22) {
        return bz_22.unknownFields;
    }
}

