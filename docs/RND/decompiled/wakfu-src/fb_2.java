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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from fB
 */
public final class fb_2
extends GeneratedMessageV3
implements fe_2 {
    private static final long qz = 0L;
    int an;
    public static final int qA = 1;
    int qB;
    public static final int qC = 2;
    int qD;
    public static final int qE = 3;
    int qF;
    private byte Y = (byte)-1;
    private static final fb_2 qG = new fb_2();
    @Deprecated
    public static final Parser<fb_2> qH = new fc_2();

    fb_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fb_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fb_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fb_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.qB = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.qD = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.qF = codedInputStream.readInt32();
                        continue block13;
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

    public static final Descriptors.Descriptor AI() {
        return fl_1.pm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pn.ensureFieldAccessorsInitialized(fb_2.class, fd_2.class);
    }

    @Override
    public boolean AJ() {
        return (this.an & 1) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    @Override
    public boolean AL() {
        return (this.an & 2) != 0;
    }

    @Override
    public int AM() {
        return this.qD;
    }

    @Override
    public boolean AN() {
        return (this.an & 4) != 0;
    }

    @Override
    public int AO() {
        return this.qF;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.AJ()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.qB);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.qD);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.qF);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.qB);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.qD);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.qF);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fb_2)) {
            return super.equals(object);
        }
        fb_2 fb_22 = (fb_2)object;
        if (this.AJ() != fb_22.AJ()) {
            return false;
        }
        if (this.AJ() && this.AK() != fb_22.AK()) {
            return false;
        }
        if (this.AL() != fb_22.AL()) {
            return false;
        }
        if (this.AL() && this.AM() != fb_22.AM()) {
            return false;
        }
        if (this.AN() != fb_22.AN()) {
            return false;
        }
        if (this.AN() && this.AO() != fb_22.AO()) {
            return false;
        }
        return this.unknownFields.equals((Object)fb_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fb_2.AI().hashCode();
        if (this.AJ()) {
            n = 37 * n + 1;
            n = 53 * n + this.AK();
        }
        if (this.AL()) {
            n = 37 * n + 2;
            n = 53 * n + this.AM();
        }
        if (this.AN()) {
            n = 37 * n + 3;
            n = 53 * n + this.AO();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fb_2 ax(ByteBuffer byteBuffer) {
        return (fb_2)qH.parseFrom(byteBuffer);
    }

    public static fb_2 av(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)qH.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fb_2 bn(ByteString byteString) {
        return (fb_2)qH.parseFrom(byteString);
    }

    public static fb_2 av(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)qH.parseFrom(byteString, extensionRegistryLite);
    }

    public static fb_2 aw(byte[] byArray) {
        return (fb_2)qH.parseFrom(byArray);
    }

    public static fb_2 av(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)qH.parseFrom(byArray, extensionRegistryLite);
    }

    public static fb_2 bQ(InputStream inputStream) {
        return (fb_2)GeneratedMessageV3.parseWithIOException(qH, (InputStream)inputStream);
    }

    public static fb_2 bQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)GeneratedMessageV3.parseWithIOException(qH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fb_2 bR(InputStream inputStream) {
        return (fb_2)GeneratedMessageV3.parseDelimitedWithIOException(qH, (InputStream)inputStream);
    }

    public static fb_2 bR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)GeneratedMessageV3.parseDelimitedWithIOException(qH, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fb_2 av(CodedInputStream codedInputStream) {
        return (fb_2)GeneratedMessageV3.parseWithIOException(qH, (CodedInputStream)codedInputStream);
    }

    public static fb_2 dl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fb_2)GeneratedMessageV3.parseWithIOException(qH, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fd_2 AP() {
        return fb_2.AQ();
    }

    public static fd_2 AQ() {
        return qG.AR();
    }

    public static fd_2 c(fb_2 fb_22) {
        return qG.AR().e(fb_22);
    }

    public fd_2 AR() {
        return this == qG ? new fd_2() : new fd_2().e(this);
    }

    protected fd_2 av(GeneratedMessageV3.BuilderParent builderParent) {
        fd_2 fd_22 = new fd_2(builderParent);
        return fd_22;
    }

    public static fb_2 AS() {
        return qG;
    }

    public static Parser<fb_2> z() {
        return qH;
    }

    public Parser<fb_2> getParserForType() {
        return qH;
    }

    public fb_2 AT() {
        return qG;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.av(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.AR();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.AP();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.AR();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.AP();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.AT();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.AT();
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(fb_2 fb_22) {
        return fb_22.unknownFields;
    }
}

