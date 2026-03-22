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
 * Renamed from lX
 */
public final class lx_0
extends GeneratedMessageV3
implements ma_0 {
    private static final long Ju = 0L;
    int an;
    public static final int Jv = 1;
    volatile Object Jw;
    public static final int Jx = 2;
    long nW;
    public static final int Jy = 3;
    volatile Object bs;
    public static final int Jz = 4;
    volatile Object JA;
    public static final int JB = 5;
    int nt;
    public static final int JC = 6;
    int JD;
    public static final int JE = 7;
    int JF;
    public static final int JG = 8;
    boolean JH;
    public static final int JI = 9;
    ll_0 JJ;
    private byte Y = (byte)-1;
    private static final lx_0 JK = new lx_0();
    @Deprecated
    public static final Parser<lx_0> JL = new ly_0();

    lx_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lx_0() {
        this.Jw = "";
        this.bs = "";
        this.JA = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lx_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lx_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block19: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block19;
                    }
                    case 10: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 1;
                        this.Jw = object;
                        continue block19;
                    }
                    case 16: {
                        this.an |= 2;
                        this.nW = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 26: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 4;
                        this.bs = object;
                        continue block19;
                    }
                    case 34: {
                        Object object = codedInputStream.readBytes();
                        this.an |= 8;
                        this.JA = object;
                        continue block19;
                    }
                    case 40: {
                        this.an |= 0x10;
                        this.nt = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 48: {
                        this.an |= 0x20;
                        this.JD = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 56: {
                        this.an |= 0x40;
                        this.JF = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 64: {
                        this.an |= 0x80;
                        this.JH = codedInputStream.readBool();
                        continue block19;
                    }
                    case 74: {
                        Object object = null;
                        if ((this.an & 0x100) != 0) {
                            object = this.JJ.afS();
                        }
                        this.JJ = (ll_0)codedInputStream.readMessage(ll_0.HW, extensionRegistryLite);
                        if (object != null) {
                            ((ln_0)object).c(this.JJ);
                            this.JJ = ((ln_0)object).afZ();
                        }
                        this.an |= 0x100;
                        continue block19;
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

    public static final Descriptors.Descriptor ajk() {
        return ls_1.Jo;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ls_1.Jp.ensureFieldAccessorsInitialized(lx_0.class, lz_0.class);
    }

    @Override
    public boolean ajl() {
        return (this.an & 1) != 0;
    }

    @Override
    public String ajm() {
        Object object = this.Jw;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.Jw = string;
        }
        return string;
    }

    @Override
    public ByteString ajn() {
        Object object = this.Jw;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.Jw = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xk() {
        return (this.an & 2) != 0;
    }

    @Override
    public long xl() {
        return this.nW;
    }

    @Override
    public boolean wq() {
        return (this.an & 4) != 0;
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
    public boolean AL() {
        return (this.an & 8) != 0;
    }

    @Override
    public String ajo() {
        Object object = this.JA;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.JA = string;
        }
        return string;
    }

    @Override
    public ByteString ajp() {
        Object object = this.JA;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.JA = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean wo() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int wp() {
        return this.nt;
    }

    @Override
    public boolean ajq() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int ajr() {
        return this.JD;
    }

    @Override
    public boolean ajs() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int ajt() {
        return this.JF;
    }

    @Override
    public boolean aju() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public boolean ajv() {
        return this.JH;
    }

    @Override
    public boolean ajw() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public ll_0 ajx() {
        return this.JJ == null ? ll_0.afT() : this.JJ;
    }

    @Override
    public lo_0 ajy() {
        return this.JJ == null ? ll_0.afT() : this.JJ;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ajl()) {
            this.Y = 0;
            return false;
        }
        if (this.ajw() && !this.ajx().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.Jw);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.nW);
        }
        if ((this.an & 4) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.JA);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeInt32(5, this.nt);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(6, this.JD);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(7, this.JF);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeBool(8, this.JH);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeMessage(9, (MessageLite)this.ajx());
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.Jw);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.nW);
        }
        if ((this.an & 4) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.bs);
        }
        if ((this.an & 8) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.JA);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.nt);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)6, (int)this.JD);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.JF);
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeBoolSize((int)8, (boolean)this.JH);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.ajx());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lx_0)) {
            return super.equals(object);
        }
        lx_0 lx_02 = (lx_0)object;
        if (this.ajl() != lx_02.ajl()) {
            return false;
        }
        if (this.ajl() && !this.ajm().equals(lx_02.ajm())) {
            return false;
        }
        if (this.xk() != lx_02.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != lx_02.xl()) {
            return false;
        }
        if (this.wq() != lx_02.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(lx_02.getName())) {
            return false;
        }
        if (this.AL() != lx_02.AL()) {
            return false;
        }
        if (this.AL() && !this.ajo().equals(lx_02.ajo())) {
            return false;
        }
        if (this.wo() != lx_02.wo()) {
            return false;
        }
        if (this.wo() && this.wp() != lx_02.wp()) {
            return false;
        }
        if (this.ajq() != lx_02.ajq()) {
            return false;
        }
        if (this.ajq() && this.ajr() != lx_02.ajr()) {
            return false;
        }
        if (this.ajs() != lx_02.ajs()) {
            return false;
        }
        if (this.ajs() && this.ajt() != lx_02.ajt()) {
            return false;
        }
        if (this.aju() != lx_02.aju()) {
            return false;
        }
        if (this.aju() && this.ajv() != lx_02.ajv()) {
            return false;
        }
        if (this.ajw() != lx_02.ajw()) {
            return false;
        }
        if (this.ajw() && !this.ajx().equals(lx_02.ajx())) {
            return false;
        }
        return this.unknownFields.equals((Object)lx_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lx_0.ajk().hashCode();
        if (this.ajl()) {
            n = 37 * n + 1;
            n = 53 * n + this.ajm().hashCode();
        }
        if (this.xk()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.wq()) {
            n = 37 * n + 3;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.AL()) {
            n = 37 * n + 4;
            n = 53 * n + this.ajo().hashCode();
        }
        if (this.wo()) {
            n = 37 * n + 5;
            n = 53 * n + this.wp();
        }
        if (this.ajq()) {
            n = 37 * n + 6;
            n = 53 * n + this.ajr();
        }
        if (this.ajs()) {
            n = 37 * n + 7;
            n = 53 * n + this.ajt();
        }
        if (this.aju()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashBoolean((boolean)this.ajv());
        }
        if (this.ajw()) {
            n = 37 * n + 9;
            n = 53 * n + this.ajx().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lx_0 bW(ByteBuffer byteBuffer) {
        return (lx_0)JL.parseFrom(byteBuffer);
    }

    public static lx_0 bS(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)JL.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lx_0 dc(ByteString byteString) {
        return (lx_0)JL.parseFrom(byteString);
    }

    public static lx_0 bS(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)JL.parseFrom(byteString, extensionRegistryLite);
    }

    public static lx_0 bT(byte[] byArray) {
        return (lx_0)JL.parseFrom(byArray);
    }

    public static lx_0 bS(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)JL.parseFrom(byArray, extensionRegistryLite);
    }

    public static lx_0 eK(InputStream inputStream) {
        return (lx_0)GeneratedMessageV3.parseWithIOException(JL, (InputStream)inputStream);
    }

    public static lx_0 eK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)GeneratedMessageV3.parseWithIOException(JL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lx_0 eL(InputStream inputStream) {
        return (lx_0)GeneratedMessageV3.parseDelimitedWithIOException(JL, (InputStream)inputStream);
    }

    public static lx_0 eL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)GeneratedMessageV3.parseDelimitedWithIOException(JL, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lx_0 bS(CodedInputStream codedInputStream) {
        return (lx_0)GeneratedMessageV3.parseWithIOException(JL, (CodedInputStream)codedInputStream);
    }

    public static lx_0 hC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lx_0)GeneratedMessageV3.parseWithIOException(JL, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lz_0 ajz() {
        return lx_0.ajA();
    }

    public static lz_0 ajA() {
        return JK.ajB();
    }

    public static lz_0 b(lx_0 lx_02) {
        return JK.ajB().d(lx_02);
    }

    public lz_0 ajB() {
        return this == JK ? new lz_0() : new lz_0().d(this);
    }

    protected lz_0 bS(GeneratedMessageV3.BuilderParent builderParent) {
        lz_0 lz_02 = new lz_0(builderParent);
        return lz_02;
    }

    public static lx_0 ajC() {
        return JK;
    }

    public static Parser<lx_0> z() {
        return JL;
    }

    public Parser<lx_0> getParserForType() {
        return JL;
    }

    public lx_0 ajD() {
        return JK;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bS(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ajB();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ajz();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ajB();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ajz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ajD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ajD();
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(lx_0 lx_02) {
        return lx_02.unknownFields;
    }
}

