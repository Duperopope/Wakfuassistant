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
 * Renamed from cl
 */
public final class cl_2
extends GeneratedMessageV3
implements co_1 {
    private static final long hV = 0L;
    public static final int hW = 1;
    long fG;
    public static final int hX = 2;
    be_2 hn;
    private byte Y = (byte)-1;
    private static final cl_2 hY = new cl_2();
    static final Parser<cl_2> hZ = new cm_1();

    cl_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cl_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cl_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cl_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor md() {
        return ae_1.fa;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fb.ensureFieldAccessorsInitialized(cl_2.class, cn_2.class);
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
        if (!(object instanceof cl_2)) {
            return super.equals(object);
        }
        cl_2 cl_22 = (cl_2)object;
        if (this.fD() != cl_22.fD()) {
            return false;
        }
        if (this.kg() != cl_22.kg()) {
            return false;
        }
        if (this.kg() && !this.kh().equals(cl_22.kh())) {
            return false;
        }
        return this.unknownFields.equals((Object)cl_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cl_2.md().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.kg()) {
            n = 37 * n + 2;
            n = 53 * n + this.kh().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cl_2 L(ByteBuffer byteBuffer) {
        return (cl_2)hZ.parseFrom(byteBuffer);
    }

    public static cl_2 L(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)hZ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cl_2 ar(ByteString byteString) {
        return (cl_2)hZ.parseFrom(byteString);
    }

    public static cl_2 L(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)hZ.parseFrom(byteString, extensionRegistryLite);
    }

    public static cl_2 L(byte[] byArray) {
        return (cl_2)hZ.parseFrom(byArray);
    }

    public static cl_2 L(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)hZ.parseFrom(byArray, extensionRegistryLite);
    }

    public static cl_2 aw(InputStream inputStream) {
        return (cl_2)GeneratedMessageV3.parseWithIOException(hZ, (InputStream)inputStream);
    }

    public static cl_2 aw(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)GeneratedMessageV3.parseWithIOException(hZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cl_2 ax(InputStream inputStream) {
        return (cl_2)GeneratedMessageV3.parseDelimitedWithIOException(hZ, (InputStream)inputStream);
    }

    public static cl_2 ax(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)GeneratedMessageV3.parseDelimitedWithIOException(hZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cl_2 L(CodedInputStream codedInputStream) {
        return (cl_2)GeneratedMessageV3.parseWithIOException(hZ, (CodedInputStream)codedInputStream);
    }

    public static cl_2 bh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cl_2)GeneratedMessageV3.parseWithIOException(hZ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cn_2 me() {
        return cl_2.mf();
    }

    public static cn_2 mf() {
        return hY.mg();
    }

    public static cn_2 a(cl_2 cl_22) {
        return hY.mg().c(cl_22);
    }

    public cn_2 mg() {
        return this == hY ? new cn_2() : new cn_2().c(this);
    }

    protected cn_2 L(GeneratedMessageV3.BuilderParent builderParent) {
        cn_2 cn_22 = new cn_2(builderParent);
        return cn_22;
    }

    public static cl_2 mh() {
        return hY;
    }

    public static Parser<cl_2> z() {
        return hZ;
    }

    public Parser<cl_2> getParserForType() {
        return hZ;
    }

    public cl_2 mi() {
        return hY;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.L(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.mg();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.me();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.mg();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.me();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mi();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mi();
    }

    static /* synthetic */ boolean mj() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cl_2 cl_22) {
        return cl_22.unknownFields;
    }
}

