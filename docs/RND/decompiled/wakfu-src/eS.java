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

public final class eS
extends GeneratedMessageV3
implements eV {
    private static final long og = 0L;
    int an;
    public static final int oh = 1;
    long nW;
    public static final int oi = 2;
    volatile Object nY;
    public static final int oj = 4;
    boolean ok;
    public static final int ol = 50;
    volatile Object om;
    public static final int on = 51;
    boolean oo;
    public static final int op = 52;
    int oq;
    public static final int or = 53;
    int lM;
    public static final int os = 54;
    volatile Object ot;
    public static final int ou = 55;
    long jT;
    private byte Y = (byte)-1;
    private static final eS ov = new eS();
    @Deprecated
    public static final Parser<eS> ow = new eT();

    eS(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eS() {
        this.nY = "";
        this.om = "";
        this.oq = -1;
        this.lM = -1;
        this.ot = "";
        this.jT = -1L;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eS();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.nW = codedInputStream.readInt64();
                        continue block19;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 2;
                        this.nY = byteString;
                        continue block19;
                    }
                    case 32: {
                        this.an |= 4;
                        this.ok = codedInputStream.readBool();
                        continue block19;
                    }
                    case 402: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 8;
                        this.om = byteString;
                        continue block19;
                    }
                    case 408: {
                        this.an |= 0x10;
                        this.oo = codedInputStream.readBool();
                        continue block19;
                    }
                    case 416: {
                        this.an |= 0x20;
                        this.oq = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 424: {
                        this.an |= 0x40;
                        this.lM = codedInputStream.readInt32();
                        continue block19;
                    }
                    case 434: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x80;
                        this.ot = byteString;
                        continue block19;
                    }
                    case 440: {
                        this.an |= 0x100;
                        this.jT = codedInputStream.readInt64();
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

    public static final Descriptors.Descriptor xK() {
        return eO.nS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nT.ensureFieldAccessorsInitialized(eS.class, eU.class);
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
    public boolean xm() {
        return (this.an & 2) != 0;
    }

    @Override
    public String xn() {
        Object object = this.nY;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.nY = string;
        }
        return string;
    }

    @Override
    public ByteString xo() {
        Object object = this.nY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.nY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xL() {
        return (this.an & 4) != 0;
    }

    @Override
    public boolean xM() {
        return this.ok;
    }

    @Override
    public boolean xN() {
        return (this.an & 8) != 0;
    }

    @Override
    public String xO() {
        Object object = this.om;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.om = string;
        }
        return string;
    }

    @Override
    public ByteString xP() {
        Object object = this.om;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.om = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean xQ() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public boolean xR() {
        return this.oo;
    }

    @Override
    public boolean xS() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int xT() {
        return this.oq;
    }

    @Override
    public boolean sX() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int sY() {
        return this.lM;
    }

    @Override
    public boolean xU() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public String xV() {
        Object object = this.ot;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.ot = string;
        }
        return string;
    }

    @Override
    public ByteString xW() {
        Object object = this.ot;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.ot = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
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
        if (!this.xm()) {
            this.Y = 0;
            return false;
        }
        if (!this.xL()) {
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
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.nY);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeBool(4, this.ok);
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)50, (Object)this.om);
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeBool(51, this.oo);
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeInt32(52, this.oq);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(53, this.lM);
        }
        if ((this.an & 0x80) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)54, (Object)this.ot);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt64(55, this.jT);
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
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.nY);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.ok);
        }
        if ((this.an & 8) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)50, (Object)this.om);
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeBoolSize((int)51, (boolean)this.oo);
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeInt32Size((int)52, (int)this.oq);
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeInt32Size((int)53, (int)this.lM);
        }
        if ((this.an & 0x80) != 0) {
            n += GeneratedMessageV3.computeStringSize((int)54, (Object)this.ot);
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeInt64Size((int)55, (long)this.jT);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eS)) {
            return super.equals(object);
        }
        eS eS2 = (eS)object;
        if (this.xk() != eS2.xk()) {
            return false;
        }
        if (this.xk() && this.xl() != eS2.xl()) {
            return false;
        }
        if (this.xm() != eS2.xm()) {
            return false;
        }
        if (this.xm() && !this.xn().equals(eS2.xn())) {
            return false;
        }
        if (this.xL() != eS2.xL()) {
            return false;
        }
        if (this.xL() && this.xM() != eS2.xM()) {
            return false;
        }
        if (this.xN() != eS2.xN()) {
            return false;
        }
        if (this.xN() && !this.xO().equals(eS2.xO())) {
            return false;
        }
        if (this.xQ() != eS2.xQ()) {
            return false;
        }
        if (this.xQ() && this.xR() != eS2.xR()) {
            return false;
        }
        if (this.xS() != eS2.xS()) {
            return false;
        }
        if (this.xS() && this.xT() != eS2.xT()) {
            return false;
        }
        if (this.sX() != eS2.sX()) {
            return false;
        }
        if (this.sX() && this.sY() != eS2.sY()) {
            return false;
        }
        if (this.xU() != eS2.xU()) {
            return false;
        }
        if (this.xU() && !this.xV().equals(eS2.xV())) {
            return false;
        }
        if (this.pe() != eS2.pe()) {
            return false;
        }
        if (this.pe() && this.pf() != eS2.pf()) {
            return false;
        }
        return this.unknownFields.equals((Object)eS2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eS.xK().hashCode();
        if (this.xk()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.xl());
        }
        if (this.xm()) {
            n = 37 * n + 2;
            n = 53 * n + this.xn().hashCode();
        }
        if (this.xL()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.xM());
        }
        if (this.xN()) {
            n = 37 * n + 50;
            n = 53 * n + this.xO().hashCode();
        }
        if (this.xQ()) {
            n = 37 * n + 51;
            n = 53 * n + Internal.hashBoolean((boolean)this.xR());
        }
        if (this.xS()) {
            n = 37 * n + 52;
            n = 53 * n + this.xT();
        }
        if (this.sX()) {
            n = 37 * n + 53;
            n = 53 * n + this.sY();
        }
        if (this.xU()) {
            n = 37 * n + 54;
            n = 53 * n + this.xV().hashCode();
        }
        if (this.pe()) {
            n = 37 * n + 55;
            n = 53 * n + Internal.hashLong((long)this.pf());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eS ap(ByteBuffer byteBuffer) {
        return (eS)ow.parseFrom(byteBuffer);
    }

    public static eS ap(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)ow.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eS be(ByteString byteString) {
        return (eS)ow.parseFrom(byteString);
    }

    public static eS ap(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)ow.parseFrom(byteString, extensionRegistryLite);
    }

    public static eS ap(byte[] byArray) {
        return (eS)ow.parseFrom(byArray);
    }

    public static eS ap(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)ow.parseFrom(byArray, extensionRegistryLite);
    }

    public static eS bE(InputStream inputStream) {
        return (eS)GeneratedMessageV3.parseWithIOException(ow, (InputStream)inputStream);
    }

    public static eS bE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)GeneratedMessageV3.parseWithIOException(ow, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eS bF(InputStream inputStream) {
        return (eS)GeneratedMessageV3.parseDelimitedWithIOException(ow, (InputStream)inputStream);
    }

    public static eS bF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)GeneratedMessageV3.parseDelimitedWithIOException(ow, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eS ap(CodedInputStream codedInputStream) {
        return (eS)GeneratedMessageV3.parseWithIOException(ow, (CodedInputStream)codedInputStream);
    }

    public static eS cT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eS)GeneratedMessageV3.parseWithIOException(ow, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eU xX() {
        return eS.xY();
    }

    public static eU xY() {
        return ov.xZ();
    }

    public static eU a(eS eS2) {
        return ov.xZ().c(eS2);
    }

    public eU xZ() {
        return this == ov ? new eU() : new eU().c(this);
    }

    protected eU ap(GeneratedMessageV3.BuilderParent builderParent) {
        eU eU2 = new eU(builderParent);
        return eU2;
    }

    public static eS ya() {
        return ov;
    }

    public static Parser<eS> z() {
        return ow;
    }

    public Parser<eS> getParserForType() {
        return ow;
    }

    public eS yb() {
        return ov;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ap(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.xZ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.xX();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.xZ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.xX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yb();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eS eS2) {
        return eS2.unknownFields;
    }
}

