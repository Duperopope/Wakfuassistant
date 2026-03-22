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
 * Renamed from bO
 */
public final class bo_2
extends GeneratedMessageV3
implements br_1 {
    private static final long hk = 0L;
    public static final int hl = 1;
    long fG;
    public static final int hm = 2;
    be_2 hn;
    private byte Y = (byte)-1;
    private static final bo_2 ho = new bo_2();
    static final Parser<bo_2> hp = new bp_2();

    bo_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bo_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bo_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bo_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        bg_2 bg_22 = null;
                        if (this.hn != null) {
                            bg_22 = this.hn.hJ();
                        }
                        this.hn = (be_2)codedInputStream.readMessage(be_2.z(), extensionRegistryLite);
                        if (bg_22 == null) continue block12;
                        bg_22.c(this.hn);
                        this.hn = bg_22.hQ();
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

    public static final Descriptors.Descriptor kf() {
        return ae_1.eC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eD.ensureFieldAccessorsInitialized(bo_2.class, bq_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public boolean kg() {
        return this.hn != null;
    }

    @Override
    public be_2 kh() {
        return this.hn == null ? be_2.hK() : this.hn;
    }

    @Override
    public bt_2 ki() {
        return this.kh();
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
        if (this.hn != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.kh());
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
        if (this.hn != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.kh());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bo_2)) {
            return super.equals(object);
        }
        bo_2 bo_22 = (bo_2)object;
        if (this.fD() != bo_22.fD()) {
            return false;
        }
        if (this.kg() != bo_22.kg()) {
            return false;
        }
        if (this.kg() && !this.kh().equals(bo_22.kh())) {
            return false;
        }
        return this.unknownFields.equals((Object)bo_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bo_2.kf().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.kg()) {
            n = 37 * n + 2;
            n = 53 * n + this.kh().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bo_2 F(ByteBuffer byteBuffer) {
        return (bo_2)hp.parseFrom(byteBuffer);
    }

    public static bo_2 F(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)hp.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bo_2 ah(ByteString byteString) {
        return (bo_2)hp.parseFrom(byteString);
    }

    public static bo_2 F(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)hp.parseFrom(byteString, extensionRegistryLite);
    }

    public static bo_2 F(byte[] byArray) {
        return (bo_2)hp.parseFrom(byArray);
    }

    public static bo_2 F(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)hp.parseFrom(byArray, extensionRegistryLite);
    }

    public static bo_2 ak(InputStream inputStream) {
        return (bo_2)GeneratedMessageV3.parseWithIOException(hp, (InputStream)inputStream);
    }

    public static bo_2 ak(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)GeneratedMessageV3.parseWithIOException(hp, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bo_2 al(InputStream inputStream) {
        return (bo_2)GeneratedMessageV3.parseDelimitedWithIOException(hp, (InputStream)inputStream);
    }

    public static bo_2 al(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)GeneratedMessageV3.parseDelimitedWithIOException(hp, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bo_2 F(CodedInputStream codedInputStream) {
        return (bo_2)GeneratedMessageV3.parseWithIOException(hp, (CodedInputStream)codedInputStream);
    }

    public static bo_2 aP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bo_2)GeneratedMessageV3.parseWithIOException(hp, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bq_2 kj() {
        return bo_2.kk();
    }

    public static bq_2 kk() {
        return ho.kl();
    }

    public static bq_2 a(bo_2 bo_22) {
        return ho.kl().c(bo_22);
    }

    public bq_2 kl() {
        return this == ho ? new bq_2() : new bq_2().c(this);
    }

    protected bq_2 F(GeneratedMessageV3.BuilderParent builderParent) {
        bq_2 bq_22 = new bq_2(builderParent);
        return bq_22;
    }

    public static bo_2 km() {
        return ho;
    }

    public static Parser<bo_2> z() {
        return hp;
    }

    public Parser<bo_2> getParserForType() {
        return hp;
    }

    public bo_2 kn() {
        return ho;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.F(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.kl();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.kj();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.kl();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.kj();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kn();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bo_2 bo_22) {
        return bo_22.unknownFields;
    }
}

