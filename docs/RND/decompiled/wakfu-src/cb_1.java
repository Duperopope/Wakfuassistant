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
 * Renamed from cB
 */
public final class cb_1
extends GeneratedMessageV3
implements ce_1 {
    private static final long ip = 0L;
    public static final int iq = 1;
    long fG;
    public static final int ir = 2;
    be_2 hn;
    private byte Y = (byte)-1;
    private static final cb_1 is = new cb_1();
    static final Parser<cb_1> it = new cc_2();

    cb_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cb_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cb_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cb_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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

    public static final Descriptors.Descriptor nh() {
        return ae_1.fc;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fd.ensureFieldAccessorsInitialized(cb_1.class, cd_1.class);
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
        if (!(object instanceof cb_1)) {
            return super.equals(object);
        }
        cb_1 cb_12 = (cb_1)object;
        if (this.fD() != cb_12.fD()) {
            return false;
        }
        if (this.kg() != cb_12.kg()) {
            return false;
        }
        if (this.kg() && !this.kh().equals(cb_12.kh())) {
            return false;
        }
        return this.unknownFields.equals((Object)cb_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cb_1.nh().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        if (this.kg()) {
            n = 37 * n + 2;
            n = 53 * n + this.kh().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cb_1 P(ByteBuffer byteBuffer) {
        return (cb_1)it.parseFrom(byteBuffer);
    }

    public static cb_1 P(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)it.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cb_1 ax(ByteString byteString) {
        return (cb_1)it.parseFrom(byteString);
    }

    public static cb_1 P(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)it.parseFrom(byteString, extensionRegistryLite);
    }

    public static cb_1 P(byte[] byArray) {
        return (cb_1)it.parseFrom(byArray);
    }

    public static cb_1 P(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)it.parseFrom(byArray, extensionRegistryLite);
    }

    public static cb_1 aE(InputStream inputStream) {
        return (cb_1)GeneratedMessageV3.parseWithIOException(it, (InputStream)inputStream);
    }

    public static cb_1 aE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)GeneratedMessageV3.parseWithIOException(it, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cb_1 aF(InputStream inputStream) {
        return (cb_1)GeneratedMessageV3.parseDelimitedWithIOException(it, (InputStream)inputStream);
    }

    public static cb_1 aF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)GeneratedMessageV3.parseDelimitedWithIOException(it, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cb_1 P(CodedInputStream codedInputStream) {
        return (cb_1)GeneratedMessageV3.parseWithIOException(it, (CodedInputStream)codedInputStream);
    }

    public static cb_1 bt(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cb_1)GeneratedMessageV3.parseWithIOException(it, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cd_1 ni() {
        return cb_1.nj();
    }

    public static cd_1 nj() {
        return is.nk();
    }

    public static cd_1 a(cb_1 cb_12) {
        return is.nk().c(cb_12);
    }

    public cd_1 nk() {
        return this == is ? new cd_1() : new cd_1().c(this);
    }

    protected cd_1 P(GeneratedMessageV3.BuilderParent builderParent) {
        cd_1 cd_12 = new cd_1(builderParent);
        return cd_12;
    }

    public static cb_1 nl() {
        return is;
    }

    public static Parser<cb_1> z() {
        return it;
    }

    public Parser<cb_1> getParserForType() {
        return it;
    }

    public cb_1 nm() {
        return is;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.P(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.nk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ni();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.nk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ni();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nm();
    }

    static /* synthetic */ boolean nn() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cb_1 cb_12) {
        return cb_12.unknownFields;
    }
}

