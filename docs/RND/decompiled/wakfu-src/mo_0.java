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
 * Renamed from mo
 */
public final class mo_0
extends GeneratedMessageV3
implements mr_0 {
    private static final long KD = 0L;
    int an;
    public static final int KE = 1;
    long nW;
    public static final int KF = 2;
    volatile Object bs;
    public static final int KG = 3;
    int KH;
    public static final int KI = 4;
    int KJ;
    private byte Y = (byte)-1;
    private static final mo_0 KK = new mo_0();
    @Deprecated
    public static final Parser<mo_0> KL = new mp_0();

    mo_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mo_0() {
        this.bs = "";
        this.KJ = -1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mo_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mo_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.bs = byteString;
                        continue block14;
                    }
                    case 24: {
                        this.an |= 4;
                        this.KH = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.KJ = codedInputStream.readInt32();
                        continue block14;
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

    public static final Descriptors.Descriptor alo() {
        return mb_0.JT;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mb_0.JU.ensureFieldAccessorsInitialized(mo_0.class, mq_0.class);
    }

    @Override
    public boolean xk() {
        return (this.an & 1) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Xw() {
        return (this.an & 4) != 0;
    }

    @Override
    public int alp() {
        return this.KH;
    }

    @Override
    public boolean Xy() {
        return (this.an & 8) != 0;
    }

    @Override
    public int alq() {
        return this.KJ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.xk()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.nW);
        }
        if ((this.an & 2) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.KH);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.KJ);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.nW);
        }
        if ((this.an & 2) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.KH);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.KJ);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mo_0)) {
            return super.equals(object);
        }
        mo_0 mo_02 = (mo_0)object;
        if (this.xk() != mo_02.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != mo_02.xl()) {
            return false;
        }
        if (this.wq() != mo_02.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(mo_02.getName())) {
            return false;
        }
        if (this.Xw() != mo_02.Xw()) {
            return false;
        }
        if (this.Xw() && this.alp() != mo_02.alp()) {
            return false;
        }
        if (this.Xy() != mo_02.Xy()) {
            return false;
        }
        if (this.Xy() && this.alq() != mo_02.alq()) {
            return false;
        }
        return this.unknownFields.equals((Object)mo_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mo_0.alo().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.wq()) {
            n = 37 * n + 2;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Xw()) {
            n = 37 * n + 3;
            n = 53 * n + this.alp();
        }
        if (this.Xy()) {
            n = 37 * n + 4;
            n = 53 * n + this.alq();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mo_0 ca(ByteBuffer byteBuffer) {
        return (mo_0)KL.parseFrom(byteBuffer);
    }

    public static mo_0 bW(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)KL.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mo_0 dj(ByteString byteString) {
        return (mo_0)KL.parseFrom(byteString);
    }

    public static mo_0 bW(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)KL.parseFrom(byteString, extensionRegistryLite);
    }

    public static mo_0 bX(byte[] byArray) {
        return (mo_0)KL.parseFrom(byArray);
    }

    public static mo_0 bW(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)KL.parseFrom(byArray, extensionRegistryLite);
    }

    public static mo_0 eS(InputStream inputStream) {
        return (mo_0)GeneratedMessageV3.parseWithIOException(KL, (InputStream)inputStream);
    }

    public static mo_0 eS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)GeneratedMessageV3.parseWithIOException(KL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mo_0 eT(InputStream inputStream) {
        return (mo_0)GeneratedMessageV3.parseDelimitedWithIOException(KL, (InputStream)inputStream);
    }

    public static mo_0 eT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)GeneratedMessageV3.parseDelimitedWithIOException(KL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mo_0 bW(CodedInputStream codedInputStream) {
        return (mo_0)GeneratedMessageV3.parseWithIOException(KL, (CodedInputStream)codedInputStream);
    }

    public static mo_0 hO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mo_0)GeneratedMessageV3.parseWithIOException(KL, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mq_0 alr() {
        return mo_0.als();
    }

    public static mq_0 als() {
        return KK.alt();
    }

    public static mq_0 c(mo_0 mo_02) {
        return KK.alt().e(mo_02);
    }

    public mq_0 alt() {
        return this == KK ? new mq_0() : new mq_0().e(this);
    }

    protected mq_0 bW(GeneratedMessageV3.BuilderParent builderParent) {
        mq_0 mq_02 = new mq_0(builderParent);
        return mq_02;
    }

    public static mo_0 alu() {
        return KK;
    }

    public static Parser<mo_0> z() {
        return KL;
    }

    public Parser<mo_0> getParserForType() {
        return KL;
    }

    public mo_0 alv() {
        return KK;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bW(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.alt();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.alr();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.alt();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.alr();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.alv();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.alv();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(mo_0 mo_02) {
        return mo_02.unknownFields;
    }
}

