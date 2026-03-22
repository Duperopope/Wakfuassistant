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
 * Renamed from kj
 */
public final class kj_0
extends GeneratedMessageV3
implements km_0 {
    private static final long EW = 0L;
    int an;
    public static final int EX = 1;
    volatile Object EY;
    public static final int EZ = 2;
    long Fa;
    public static final int Fb = 3;
    kW Fc;
    public static final int Fd = 4;
    int Fe;
    private byte Y = (byte)-1;
    private static final kj_0 Ff = new kj_0();
    @Deprecated
    public static final Parser<kj_0> Fg = new kk_0();

    kj_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kj_0() {
        this.EY = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kj_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kj_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 1;
                        this.EY = object;
                        continue block14;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Fa = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 26: {
                        Object object = null;
                        if ((this.an & 4) != 0) {
                            object = this.Fc.aem();
                        }
                        this.Fc = (kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite);
                        if (object != null) {
                            ((kY)object).h(this.Fc);
                            this.Fc = ((kY)object).aes();
                        }
                        this.an |= 4;
                        continue block14;
                    }
                    case 32: {
                        this.an |= 8;
                        this.Fe = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor aat() {
        return kb.EB;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EC.ensureFieldAccessorsInitialized(kj_0.class, kl_0.class);
    }

    @Override
    public boolean aau() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aav() {
        Object object = this.EY;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.EY = string;
        }
        return string;
    }

    @Override
    public ByteString aaw() {
        Object object = this.EY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.EY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aax() {
        return (this.an & 2) != 0;
    }

    @Override
    public long aay() {
        return this.Fa;
    }

    @Override
    public boolean aaz() {
        return (this.an & 4) != 0;
    }

    @Override
    public kW aaA() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public lh aaB() {
        return this.Fc == null ? kW.aen() : this.Fc;
    }

    @Override
    public boolean aaC() {
        return (this.an & 8) != 0;
    }

    @Override
    public int aaD() {
        return this.Fe;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aau()) {
            this.Y = 0;
            return false;
        }
        if (!this.aax()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaz()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaC()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaA().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.EY);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Fa);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeMessage(3, (MessageLite)this.aaA());
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeInt32(4, this.Fe);
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.EY);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Fa);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.aaA());
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.Fe);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kj_0)) {
            return super.equals(object);
        }
        kj_0 kj_02 = (kj_0)object;
        if (this.aau() != kj_02.aau()) {
            return false;
        }
        if (this.aau() && !this.aav().equals(kj_02.aav())) {
            return false;
        }
        if (this.aax() != kj_02.aax()) {
            return false;
        }
        if (this.aax() && this.aay() != kj_02.aay()) {
            return false;
        }
        if (this.aaz() != kj_02.aaz()) {
            return false;
        }
        if (this.aaz() && !this.aaA().equals(kj_02.aaA())) {
            return false;
        }
        if (this.aaC() != kj_02.aaC()) {
            return false;
        }
        if (this.aaC() && this.aaD() != kj_02.aaD()) {
            return false;
        }
        return this.unknownFields.equals((Object)kj_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kj_0.aat().hashCode();
        if (this.aau()) {
            n = 37 * n + 1;
            n = 53 * n + this.aav().hashCode();
        }
        if (this.aax()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.aay());
        }
        if (this.aaz()) {
            n = 37 * n + 3;
            n = 53 * n + this.aaA().hashCode();
        }
        if (this.aaC()) {
            n = 37 * n + 4;
            n = 53 * n + this.aaD();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kj_0 bA(ByteBuffer byteBuffer) {
        return (kj_0)Fg.parseFrom(byteBuffer);
    }

    public static kj_0 bw(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)Fg.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kj_0 cC(ByteString byteString) {
        return (kj_0)Fg.parseFrom(byteString);
    }

    public static kj_0 bw(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)Fg.parseFrom(byteString, extensionRegistryLite);
    }

    public static kj_0 bx(byte[] byArray) {
        return (kj_0)Fg.parseFrom(byArray);
    }

    public static kj_0 bw(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)Fg.parseFrom(byArray, extensionRegistryLite);
    }

    public static kj_0 dS(InputStream inputStream) {
        return (kj_0)GeneratedMessageV3.parseWithIOException(Fg, (InputStream)inputStream);
    }

    public static kj_0 dS(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)GeneratedMessageV3.parseWithIOException(Fg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kj_0 dT(InputStream inputStream) {
        return (kj_0)GeneratedMessageV3.parseDelimitedWithIOException(Fg, (InputStream)inputStream);
    }

    public static kj_0 dT(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)GeneratedMessageV3.parseDelimitedWithIOException(Fg, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kj_0 bw(CodedInputStream codedInputStream) {
        return (kj_0)GeneratedMessageV3.parseWithIOException(Fg, (CodedInputStream)codedInputStream);
    }

    public static kj_0 go(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kj_0)GeneratedMessageV3.parseWithIOException(Fg, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kl_0 aaE() {
        return kj_0.aaF();
    }

    public static kl_0 aaF() {
        return Ff.aaG();
    }

    public static kl_0 b(kj_0 kj_02) {
        return Ff.aaG().d(kj_02);
    }

    public kl_0 aaG() {
        return this == Ff ? new kl_0() : new kl_0().d(this);
    }

    protected kl_0 bw(GeneratedMessageV3.BuilderParent builderParent) {
        kl_0 kl_02 = new kl_0(builderParent);
        return kl_02;
    }

    public static kj_0 aaH() {
        return Ff;
    }

    public static Parser<kj_0> z() {
        return Fg;
    }

    public Parser<kj_0> getParserForType() {
        return Fg;
    }

    public kj_0 aaI() {
        return Ff;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bw(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aaG();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aaE();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aaG();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aaE();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aaI();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aaI();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(kj_0 kj_02) {
        return kj_02.unknownFields;
    }
}

