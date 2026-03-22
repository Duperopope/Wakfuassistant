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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eW
extends GeneratedMessageV3
implements fd_0 {
    private static final long ox = 0L;
    int an;
    public static final int oy = 1;
    List<eP> oz;
    public static final int oA = 2;
    boolean oB;
    public static final int oC = 3;
    List<eP> oD;
    private byte Y = (byte)-1;
    private static final eW oE = new eW();
    @Deprecated
    public static final Parser<eW> oF = new eX();

    eW(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eW() {
        this.oz = Collections.emptyList();
        this.oB = true;
        this.oD = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eW();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        if ((n & 1) == 0) {
                            this.oz = new ArrayList<eP>();
                            n |= 1;
                        }
                        this.oz.add((eP)codedInputStream.readMessage(eP.of, extensionRegistryLite));
                        continue block13;
                    }
                    case 16: {
                        this.an |= 1;
                        this.oB = codedInputStream.readBool();
                        continue block13;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.oD = new ArrayList<eP>();
                            n |= 4;
                        }
                        this.oD.add((eP)codedInputStream.readMessage(eP.of, extensionRegistryLite));
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if (n & true) {
                this.oz = Collections.unmodifiableList(this.oz);
            }
            if ((n & 4) != 0) {
                this.oD = Collections.unmodifiableList(this.oD);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor yq() {
        return eO.nM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nN.ensureFieldAccessorsInitialized(eW.class, eY.class);
    }

    @Override
    public List<eP> yr() {
        return this.oz;
    }

    @Override
    public List<? extends fe_0> ys() {
        return this.oz;
    }

    @Override
    public int yt() {
        return this.oz.size();
    }

    @Override
    public eP bI(int n) {
        return this.oz.get(n);
    }

    @Override
    public fe_0 bJ(int n) {
        return this.oz.get(n);
    }

    @Override
    public boolean yu() {
        return (this.an & 1) != 0;
    }

    @Override
    public boolean yv() {
        return this.oB;
    }

    @Override
    public List<eP> yw() {
        return this.oD;
    }

    @Override
    public List<? extends fe_0> yx() {
        return this.oD;
    }

    @Override
    public int yy() {
        return this.oD.size();
    }

    @Override
    public eP bK(int n) {
        return this.oD.get(n);
    }

    @Override
    public fe_0 bL(int n) {
        return this.oD.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.yt(); ++n) {
            if (this.bI(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.yy(); ++n) {
            if (this.bK(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.oz.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.oz.get(n));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeBool(2, this.oB);
        }
        for (n = 0; n < this.oD.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.oD.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.oz.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.oz.get(n)));
        }
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeBoolSize((int)2, (boolean)this.oB);
        }
        for (n = 0; n < this.oD.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.oD.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eW)) {
            return super.equals(object);
        }
        eW eW2 = (eW)object;
        if (!this.yr().equals(eW2.yr())) {
            return false;
        }
        if (this.yu() != eW2.yu()) {
            return false;
        }
        if (this.yu() && this.yv() != eW2.yv()) {
            return false;
        }
        if (!this.yw().equals(eW2.yw())) {
            return false;
        }
        return this.unknownFields.equals((Object)eW2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eW.yq().hashCode();
        if (this.yt() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.yr().hashCode();
        }
        if (this.yu()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.yv());
        }
        if (this.yy() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.yw().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eW aq(ByteBuffer byteBuffer) {
        return (eW)oF.parseFrom(byteBuffer);
    }

    public static eW aq(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)oF.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eW bi(ByteString byteString) {
        return (eW)oF.parseFrom(byteString);
    }

    public static eW aq(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)oF.parseFrom(byteString, extensionRegistryLite);
    }

    public static eW aq(byte[] byArray) {
        return (eW)oF.parseFrom(byArray);
    }

    public static eW aq(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)oF.parseFrom(byArray, extensionRegistryLite);
    }

    public static eW bG(InputStream inputStream) {
        return (eW)GeneratedMessageV3.parseWithIOException(oF, (InputStream)inputStream);
    }

    public static eW bG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)GeneratedMessageV3.parseWithIOException(oF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eW bH(InputStream inputStream) {
        return (eW)GeneratedMessageV3.parseDelimitedWithIOException(oF, (InputStream)inputStream);
    }

    public static eW bH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)GeneratedMessageV3.parseDelimitedWithIOException(oF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eW aq(CodedInputStream codedInputStream) {
        return (eW)GeneratedMessageV3.parseWithIOException(oF, (CodedInputStream)codedInputStream);
    }

    public static eW cW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eW)GeneratedMessageV3.parseWithIOException(oF, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eY yz() {
        return eW.yA();
    }

    public static eY yA() {
        return oE.yB();
    }

    public static eY a(eW eW2) {
        return oE.yB().c(eW2);
    }

    public eY yB() {
        return this == oE ? new eY() : new eY().c(this);
    }

    protected eY aq(GeneratedMessageV3.BuilderParent builderParent) {
        eY eY2 = new eY(builderParent);
        return eY2;
    }

    public static eW yC() {
        return oE;
    }

    public static Parser<eW> z() {
        return oF;
    }

    public Parser<eW> getParserForType() {
        return oF;
    }

    public eW yD() {
        return oE;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aq(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.yB();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.yz();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.yB();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.yz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yD();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eW eW2) {
        return eW2.unknownFields;
    }
}

