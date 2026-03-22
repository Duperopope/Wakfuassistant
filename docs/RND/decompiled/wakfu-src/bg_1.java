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
 * Renamed from bG
 */
public final class bg_1
extends GeneratedMessageV3
implements bj_1 {
    private static final long gZ = 0L;
    public static final int ha = 1;
    long fG;
    private byte Y = (byte)-1;
    private static final bg_1 hb = new bg_1();
    static final Parser<bg_1> hc = new bh_2();

    bg_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bg_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bg_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bg_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block11;
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

    public static final Descriptors.Descriptor jB() {
        return ae_1.eA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eB.ensureFieldAccessorsInitialized(bg_1.class, bi_1.class);
    }

    @Override
    public long fD() {
        return this.fG;
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
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bg_1)) {
            return super.equals(object);
        }
        bg_1 bg_12 = (bg_1)object;
        if (this.fD() != bg_12.fD()) {
            return false;
        }
        return this.unknownFields.equals((Object)bg_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bg_1.jB().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bg_1 D(ByteBuffer byteBuffer) {
        return (bg_1)hc.parseFrom(byteBuffer);
    }

    public static bg_1 D(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)hc.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bg_1 af(ByteString byteString) {
        return (bg_1)hc.parseFrom(byteString);
    }

    public static bg_1 D(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)hc.parseFrom(byteString, extensionRegistryLite);
    }

    public static bg_1 D(byte[] byArray) {
        return (bg_1)hc.parseFrom(byArray);
    }

    public static bg_1 D(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)hc.parseFrom(byArray, extensionRegistryLite);
    }

    public static bg_1 ag(InputStream inputStream) {
        return (bg_1)GeneratedMessageV3.parseWithIOException(hc, (InputStream)inputStream);
    }

    public static bg_1 ag(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)GeneratedMessageV3.parseWithIOException(hc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_1 ah(InputStream inputStream) {
        return (bg_1)GeneratedMessageV3.parseDelimitedWithIOException(hc, (InputStream)inputStream);
    }

    public static bg_1 ah(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)GeneratedMessageV3.parseDelimitedWithIOException(hc, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_1 D(CodedInputStream codedInputStream) {
        return (bg_1)GeneratedMessageV3.parseWithIOException(hc, (CodedInputStream)codedInputStream);
    }

    public static bg_1 aJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_1)GeneratedMessageV3.parseWithIOException(hc, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bi_1 jC() {
        return bg_1.jD();
    }

    public static bi_1 jD() {
        return hb.jE();
    }

    public static bi_1 a(bg_1 bg_12) {
        return hb.jE().c(bg_12);
    }

    public bi_1 jE() {
        return this == hb ? new bi_1() : new bi_1().c(this);
    }

    protected bi_1 D(GeneratedMessageV3.BuilderParent builderParent) {
        bi_1 bi_12 = new bi_1(builderParent);
        return bi_12;
    }

    public static bg_1 jF() {
        return hb;
    }

    public static Parser<bg_1> z() {
        return hc;
    }

    public Parser<bg_1> getParserForType() {
        return hc;
    }

    public bg_1 jG() {
        return hb;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.D(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.jE();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.jC();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.jE();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.jC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jG();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bg_1 bg_12) {
        return bg_12.unknownFields;
    }
}

